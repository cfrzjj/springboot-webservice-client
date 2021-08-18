package com.example.test.config;


import com.example.test.utils.WsConst;
import mypackage.AuthorPortType;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * 
 * @author oKong
 *
 */
@Configuration
public class CxfClientConfig {

    
    /**
     *  以接口代理方式进行调用 AuthorPortType接口
     */
    @Bean("cxfProxy")
    public AuthorPortType createAuthorPortTypeProxy() {
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setServiceClass(AuthorPortType.class);
        jaxWsProxyFactoryBean.setAddress(WsConst.SERVICE_ADDRESS);//服务地址：http://127.0.0.1:8080/ws/autho

        return (AuthorPortType) jaxWsProxyFactoryBean.create();
    }
    
    /*
     * 采用动态工厂方式 不需要指定服务接口
     */
    @Bean
    public Client createDynamicClient() {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient(WsConst.SERVICE_ADDRESS);
        return client;
    } 
}
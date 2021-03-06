
package mypackage;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "authorService", targetNamespace = "http://www.lqdev.cn/webservice", wsdlLocation = "file:/D:/WSDL/author.wsdl")
public class AuthorService
    extends Service
{

    private final static URL AUTHORSERVICE_WSDL_LOCATION;
    private final static WebServiceException AUTHORSERVICE_EXCEPTION;
    private final static QName AUTHORSERVICE_QNAME = new QName("http://www.lqdev.cn/webservice", "authorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/WSDL/author.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AUTHORSERVICE_WSDL_LOCATION = url;
        AUTHORSERVICE_EXCEPTION = e;
    }

    public AuthorService() {
        super(__getWsdlLocation(), AUTHORSERVICE_QNAME);
    }

    public AuthorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AUTHORSERVICE_QNAME, features);
    }

    public AuthorService(URL wsdlLocation) {
        super(wsdlLocation, AUTHORSERVICE_QNAME);
    }

    public AuthorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AUTHORSERVICE_QNAME, features);
    }

    public AuthorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AuthorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns AuthorPortType
     */
    @WebEndpoint(name = "authorPortName")
    public AuthorPortType getAuthorPortName() {
        return super.getPort(new QName("http://www.lqdev.cn/webservice", "authorPortName"), AuthorPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AuthorPortType
     */
    @WebEndpoint(name = "authorPortName")
    public AuthorPortType getAuthorPortName(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.lqdev.cn/webservice", "authorPortName"), AuthorPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AUTHORSERVICE_EXCEPTION!= null) {
            throw AUTHORSERVICE_EXCEPTION;
        }
        return AUTHORSERVICE_WSDL_LOCATION;
    }

}


package mypackage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getAuthorByNameResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getAuthorByNameResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://www.lqdev.cn/webservice}authorDto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAuthorByNameResponse", propOrder = {
    "_return"
})
public class GetAuthorByNameResponse {

    @XmlElement(name = "return")
    protected AuthorDto _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AuthorDto }
     *     
     */
    public AuthorDto getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorDto }
     *     
     */
    public void setReturn(AuthorDto value) {
        this._return = value;
    }

}

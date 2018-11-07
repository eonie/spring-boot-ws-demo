
package net.parim.ws.user.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ImportUserRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImportUserRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MsgHeader" type="{http://localhost:8088/MsgHeader}MsgHeader"/>
 *         &lt;element name="ImportUserInputCollection" type="{http://localhost:8088/ImportUser}ImportUserInputCollection"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportUserRequest", propOrder = {
    "msgHeader",
    "importUserInputCollection"
})
public class ImportUserRequest {

    @XmlElement(name = "MsgHeader", required = true)
    protected MsgHeader msgHeader;
    @XmlElement(name = "ImportUserInputCollection", required = true)
    protected ImportUserInputCollection importUserInputCollection;

    /**
     * 获取msgHeader属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MsgHeader }
     *     
     */
    public MsgHeader getMsgHeader() {
        return msgHeader;
    }

    /**
     * 设置msgHeader属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MsgHeader }
     *     
     */
    public void setMsgHeader(MsgHeader value) {
        this.msgHeader = value;
    }

    /**
     * 获取importUserInputCollection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ImportUserInputCollection }
     *     
     */
    public ImportUserInputCollection getImportUserInputCollection() {
        return importUserInputCollection;
    }

    /**
     * 设置importUserInputCollection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ImportUserInputCollection }
     *     
     */
    public void setImportUserInputCollection(ImportUserInputCollection value) {
        this.importUserInputCollection = value;
    }

}

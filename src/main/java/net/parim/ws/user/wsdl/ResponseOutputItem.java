
package net.parim.ws.user.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseOutputItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResponseOutputItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PRI_KEY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MDM_EMP_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ERROR_MESSAGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ERP_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseOutputItem", propOrder = {
    "flag",
    "prikey",
    "mdmempcode",
    "batchid",
    "errormessage",
    "erpid"
})
public class ResponseOutputItem {

    @XmlElement(name = "FLAG", required = true, nillable = true)
    protected String flag;
    @XmlElement(name = "PRI_KEY", required = true, nillable = true)
    protected String prikey;
    @XmlElement(name = "MDM_EMP_CODE", required = true, nillable = true)
    protected String mdmempcode;
    @XmlElement(name = "BATCH_ID", required = true, nillable = true)
    protected String batchid;
    @XmlElement(name = "ERROR_MESSAGE", required = true, nillable = true)
    protected String errormessage;
    @XmlElement(name = "ERP_ID", required = true, nillable = true)
    protected String erpid;

    /**
     * 获取flag属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAG() {
        return flag;
    }

    /**
     * 设置flag属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAG(String value) {
        this.flag = value;
    }

    /**
     * 获取prikey属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRIKEY() {
        return prikey;
    }

    /**
     * 设置prikey属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRIKEY(String value) {
        this.prikey = value;
    }

    /**
     * 获取mdmempcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMDMEMPCODE() {
        return mdmempcode;
    }

    /**
     * 设置mdmempcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMDMEMPCODE(String value) {
        this.mdmempcode = value;
    }

    /**
     * 获取batchid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBATCHID() {
        return batchid;
    }

    /**
     * 设置batchid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBATCHID(String value) {
        this.batchid = value;
    }

    /**
     * 获取errormessage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERRORMESSAGE() {
        return errormessage;
    }

    /**
     * 设置errormessage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERRORMESSAGE(String value) {
        this.errormessage = value;
    }

    /**
     * 获取erpid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERPID() {
        return erpid;
    }

    /**
     * 设置erpid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERPID(String value) {
        this.erpid = value;
    }

}

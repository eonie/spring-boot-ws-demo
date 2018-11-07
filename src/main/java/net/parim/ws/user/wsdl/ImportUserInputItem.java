
package net.parim.ws.user.wsdl;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ImportUserInputItem complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ImportUserInputItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRI_KEY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HEADER_ID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="COMMANDTYPE" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="MDM_EMP_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="HR_EMP_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CUNC_PERSON_TYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMP_CODE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EMP_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FIRST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LAST_NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SEX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DATE_OF_BIRTH" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportUserInputItem", propOrder = {
    "prikey",
    "batchid",
    "headerid",
    "commandtype",
    "mdmempcode",
    "hrempcode",
    "cuncpersontype",
    "empcode",
    "empname",
    "firstname",
    "lastname",
    "sex",
    "dateofbirth"
})
public class ImportUserInputItem {

    @XmlElement(name = "PRI_KEY", required = true, nillable = true)
    protected String prikey;
    @XmlElement(name = "BATCH_ID", required = true, nillable = true)
    protected String batchid;
    @XmlElement(name = "HEADER_ID", required = true, nillable = true)
    protected String headerid;
    @XmlElement(name = "COMMANDTYPE", required = true, nillable = true)
    protected BigDecimal commandtype;
    @XmlElement(name = "MDM_EMP_CODE", required = true, nillable = true)
    protected String mdmempcode;
    @XmlElement(name = "HR_EMP_CODE", required = true, nillable = true)
    protected String hrempcode;
    @XmlElement(name = "CUNC_PERSON_TYPE", required = true, nillable = true)
    protected String cuncpersontype;
    @XmlElement(name = "EMP_CODE", required = true, nillable = true)
    protected String empcode;
    @XmlElement(name = "EMP_NAME", required = true, nillable = true)
    protected String empname;
    @XmlElement(name = "FIRST_NAME", required = true, nillable = true)
    protected String firstname;
    @XmlElement(name = "LAST_NAME", required = true, nillable = true)
    protected String lastname;
    @XmlElement(name = "SEX", required = true, nillable = true)
    protected String sex;
    @XmlElement(name = "DATE_OF_BIRTH", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateofbirth;

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
     * 获取headerid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHEADERID() {
        return headerid;
    }

    /**
     * 设置headerid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHEADERID(String value) {
        this.headerid = value;
    }

    /**
     * 获取commandtype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCOMMANDTYPE() {
        return commandtype;
    }

    /**
     * 设置commandtype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCOMMANDTYPE(BigDecimal value) {
        this.commandtype = value;
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
     * 获取hrempcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHREMPCODE() {
        return hrempcode;
    }

    /**
     * 设置hrempcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHREMPCODE(String value) {
        this.hrempcode = value;
    }

    /**
     * 获取cuncpersontype属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCUNCPERSONTYPE() {
        return cuncpersontype;
    }

    /**
     * 设置cuncpersontype属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCUNCPERSONTYPE(String value) {
        this.cuncpersontype = value;
    }

    /**
     * 获取empcode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPCODE() {
        return empcode;
    }

    /**
     * 设置empcode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPCODE(String value) {
        this.empcode = value;
    }

    /**
     * 获取empname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMPNAME() {
        return empname;
    }

    /**
     * 设置empname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMPNAME(String value) {
        this.empname = value;
    }

    /**
     * 获取firstname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFIRSTNAME() {
        return firstname;
    }

    /**
     * 设置firstname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFIRSTNAME(String value) {
        this.firstname = value;
    }

    /**
     * 获取lastname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLASTNAME() {
        return lastname;
    }

    /**
     * 设置lastname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLASTNAME(String value) {
        this.lastname = value;
    }

    /**
     * 获取sex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEX() {
        return sex;
    }

    /**
     * 设置sex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEX(String value) {
        this.sex = value;
    }

    /**
     * 获取dateofbirth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDATEOFBIRTH() {
        return dateofbirth;
    }

    /**
     * 设置dateofbirth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDATEOFBIRTH(XMLGregorianCalendar value) {
        this.dateofbirth = value;
    }

}

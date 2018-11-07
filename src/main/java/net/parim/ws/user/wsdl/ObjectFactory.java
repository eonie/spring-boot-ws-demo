
package net.parim.ws.user.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the net.parim.ws.user.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ImportUserRequest_QNAME = new QName("http://localhost:8088/ImportUser", "ImportUserRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: net.parim.ws.user.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ImportUserResponse }
     * 
     */
    public ImportUserResponse createImportUserResponse() {
        return new ImportUserResponse();
    }

    /**
     * Create an instance of {@link ResponseOutputCollection }
     * 
     */
    public ResponseOutputCollection createResponseOutputCollection() {
        return new ResponseOutputCollection();
    }

    /**
     * Create an instance of {@link ImportUserRequest }
     * 
     */
    public ImportUserRequest createImportUserRequest() {
        return new ImportUserRequest();
    }

    /**
     * Create an instance of {@link ImportUserInputCollection }
     * 
     */
    public ImportUserInputCollection createImportUserInputCollection() {
        return new ImportUserInputCollection();
    }

    /**
     * Create an instance of {@link ResponseOutputItem }
     * 
     */
    public ResponseOutputItem createResponseOutputItem() {
        return new ResponseOutputItem();
    }

    /**
     * Create an instance of {@link ImportUserInputItem }
     * 
     */
    public ImportUserInputItem createImportUserInputItem() {
        return new ImportUserInputItem();
    }

    /**
     * Create an instance of {@link MsgHeader }
     * 
     */
    public MsgHeader createMsgHeader() {
        return new MsgHeader();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportUserRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://localhost:8088/ImportUser", name = "ImportUserRequest")
    public JAXBElement<ImportUserRequest> createImportUserRequest(ImportUserRequest value) {
        return new JAXBElement<ImportUserRequest>(_ImportUserRequest_QNAME, ImportUserRequest.class, null, value);
    }

}

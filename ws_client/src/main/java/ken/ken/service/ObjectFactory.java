
package ken.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ken.service package. 
 * &lt;p&gt;An ObjectFactory allows you to programatically 
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

    private final static QName _FindAllUser_QNAME = new QName("http://service.ken/", "findAllUser");
    private final static QName _FindAllUserResponse_QNAME = new QName("http://service.ken/", "findAllUserResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ken.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllUser }
     * 
     */
    public FindAllUser createFindAllUser() {
        return new FindAllUser();
    }

    /**
     * Create an instance of {@link FindAllUserResponse }
     * 
     */
    public FindAllUserResponse createFindAllUserResponse() {
        return new FindAllUserResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ken/", name = "findAllUser")
    public JAXBElement<FindAllUser> createFindAllUser(FindAllUser value) {
        return new JAXBElement<FindAllUser>(_FindAllUser_QNAME, FindAllUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FindAllUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.ken/", name = "findAllUserResponse")
    public JAXBElement<FindAllUserResponse> createFindAllUserResponse(FindAllUserResponse value) {
        return new JAXBElement<FindAllUserResponse>(_FindAllUserResponse_QNAME, FindAllUserResponse.class, null, value);
    }

}

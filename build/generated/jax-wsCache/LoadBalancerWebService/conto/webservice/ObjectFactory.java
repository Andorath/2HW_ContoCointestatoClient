
package conto.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the conto.webservice package. 
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

    private final static QName _GetCoordinator_QNAME = new QName("http://webservice.conto/", "getCoordinator");
    private final static QName _GetCoordinatorResponse_QNAME = new QName("http://webservice.conto/", "getCoordinatorResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: conto.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCoordinatorResponse }
     * 
     */
    public GetCoordinatorResponse createGetCoordinatorResponse() {
        return new GetCoordinatorResponse();
    }

    /**
     * Create an instance of {@link GetCoordinator }
     * 
     */
    public GetCoordinator createGetCoordinator() {
        return new GetCoordinator();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoordinator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.conto/", name = "getCoordinator")
    public JAXBElement<GetCoordinator> createGetCoordinator(GetCoordinator value) {
        return new JAXBElement<GetCoordinator>(_GetCoordinator_QNAME, GetCoordinator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoordinatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.conto/", name = "getCoordinatorResponse")
    public JAXBElement<GetCoordinatorResponse> createGetCoordinatorResponse(GetCoordinatorResponse value) {
        return new JAXBElement<GetCoordinatorResponse>(_GetCoordinatorResponse_QNAME, GetCoordinatorResponse.class, null, value);
    }

}

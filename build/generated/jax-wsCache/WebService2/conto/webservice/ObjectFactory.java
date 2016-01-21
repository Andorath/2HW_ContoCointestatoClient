
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

    private final static QName _GetReadResult_QNAME = new QName("http://webservice.conto/", "getReadResult");
    private final static QName _GetReadResultResponse_QNAME = new QName("http://webservice.conto/", "getReadResultResponse");
    private final static QName _Deposit_QNAME = new QName("http://webservice.conto/", "deposit");
    private final static QName _GetWriteResultResponse_QNAME = new QName("http://webservice.conto/", "getWriteResultResponse");
    private final static QName _GetWriteResult_QNAME = new QName("http://webservice.conto/", "getWriteResult");
    private final static QName _Withdraw_QNAME = new QName("http://webservice.conto/", "withdraw");
    private final static QName _Read_QNAME = new QName("http://webservice.conto/", "read");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: conto.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReadResultResponse }
     * 
     */
    public GetReadResultResponse createGetReadResultResponse() {
        return new GetReadResultResponse();
    }

    /**
     * Create an instance of {@link GetReadResult }
     * 
     */
    public GetReadResult createGetReadResult() {
        return new GetReadResult();
    }

    /**
     * Create an instance of {@link GetWriteResult }
     * 
     */
    public GetWriteResult createGetWriteResult() {
        return new GetWriteResult();
    }

    /**
     * Create an instance of {@link GetWriteResultResponse }
     * 
     */
    public GetWriteResultResponse createGetWriteResultResponse() {
        return new GetWriteResultResponse();
    }

    /**
     * Create an instance of {@link Deposit }
     * 
     */
    public Deposit createDeposit() {
        return new Deposit();
    }

    /**
     * Create an instance of {@link Withdraw }
     * 
     */
    public Withdraw createWithdraw() {
        return new Withdraw();
    }

    /**
     * Create an instance of {@link Read }
     * 
     */
    public Read createRead() {
        return new Read();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReadResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.conto/", name = "getReadResult")
    public JAXBElement<GetReadResult> createGetReadResult(GetReadResult value) {
        return new JAXBElement<GetReadResult>(_GetReadResult_QNAME, GetReadResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetReadResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.conto/", name = "getReadResultResponse")
    public JAXBElement<GetReadResultResponse> createGetReadResultResponse(GetReadResultResponse value) {
        return new JAXBElement<GetReadResultResponse>(_GetReadResultResponse_QNAME, GetReadResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Deposit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.conto/", name = "deposit")
    public JAXBElement<Deposit> createDeposit(Deposit value) {
        return new JAXBElement<Deposit>(_Deposit_QNAME, Deposit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWriteResultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.conto/", name = "getWriteResultResponse")
    public JAXBElement<GetWriteResultResponse> createGetWriteResultResponse(GetWriteResultResponse value) {
        return new JAXBElement<GetWriteResultResponse>(_GetWriteResultResponse_QNAME, GetWriteResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWriteResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.conto/", name = "getWriteResult")
    public JAXBElement<GetWriteResult> createGetWriteResult(GetWriteResult value) {
        return new JAXBElement<GetWriteResult>(_GetWriteResult_QNAME, GetWriteResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Withdraw }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.conto/", name = "withdraw")
    public JAXBElement<Withdraw> createWithdraw(Withdraw value) {
        return new JAXBElement<Withdraw>(_Withdraw_QNAME, Withdraw.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Read }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.conto/", name = "read")
    public JAXBElement<Read> createRead(Read value) {
        return new JAXBElement<Read>(_Read_QNAME, Read.class, null, value);
    }

}

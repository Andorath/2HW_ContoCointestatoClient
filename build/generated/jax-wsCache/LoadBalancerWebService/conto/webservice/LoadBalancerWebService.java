
package conto.webservice;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "LoadBalancerWebService", targetNamespace = "http://webservice.conto/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface LoadBalancerWebService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCoordinator", targetNamespace = "http://webservice.conto/", className = "conto.webservice.GetCoordinator")
    @ResponseWrapper(localName = "getCoordinatorResponse", targetNamespace = "http://webservice.conto/", className = "conto.webservice.GetCoordinatorResponse")
    @Action(input = "http://webservice.conto/LoadBalancerWebService/getCoordinatorRequest", output = "http://webservice.conto/LoadBalancerWebService/getCoordinatorResponse")
    public String getCoordinator();

}

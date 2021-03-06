
package inventory.ws;

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
@WebServiceClient(name = "DALServiceService", targetNamespace = "http://ws.inventory/", wsdlLocation = "http://172.16.254.44:9080/inventory/ws?wsdl")
public class DALServiceService
    extends Service
{

    private final static URL DALSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException DALSERVICESERVICE_EXCEPTION;
    private final static QName DALSERVICESERVICE_QNAME = new QName("http://ws.inventory/", "DALServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://172.16.254.44:9080/inventory/ws?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        DALSERVICESERVICE_WSDL_LOCATION = url;
        DALSERVICESERVICE_EXCEPTION = e;
    }

    public DALServiceService() {
        super(__getWsdlLocation(), DALSERVICESERVICE_QNAME);
    }

    public DALServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), DALSERVICESERVICE_QNAME, features);
    }

    public DALServiceService(URL wsdlLocation) {
        super(wsdlLocation, DALSERVICESERVICE_QNAME);
    }

    public DALServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, DALSERVICESERVICE_QNAME, features);
    }

    public DALServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DALServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns DALService
     */
    @WebEndpoint(name = "DALServicePort")
    public DALService getDALServicePort() {
        return super.getPort(new QName("http://ws.inventory/", "DALServicePort"), DALService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DALService
     */
    @WebEndpoint(name = "DALServicePort")
    public DALService getDALServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.inventory/", "DALServicePort"), DALService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (DALSERVICESERVICE_EXCEPTION!= null) {
            throw DALSERVICESERVICE_EXCEPTION;
        }
        return DALSERVICESERVICE_WSDL_LOCATION;
    }

}

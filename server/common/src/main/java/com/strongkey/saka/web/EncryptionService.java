
package com.strongkey.saka.web;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EncryptionService", targetNamespace = "http://web.strongkeylite.strongauth.com/", wsdlLocation = "https://saka207.strongauth.com:8181/strongkeyliteWAR/EncryptionService?wsdl")
public class EncryptionService
    extends Service
{

    private final static URL ENCRYPTIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException ENCRYPTIONSERVICE_EXCEPTION;
    private final static QName ENCRYPTIONSERVICE_QNAME = new QName("http://web.strongkeylite.strongauth.com/", "EncryptionService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://saka207.strongauth.com:8181/strongkeyliteWAR/EncryptionService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ENCRYPTIONSERVICE_WSDL_LOCATION = url;
        ENCRYPTIONSERVICE_EXCEPTION = e;
    }

    public EncryptionService() {
        super(__getWsdlLocation(), ENCRYPTIONSERVICE_QNAME);
    }

    public EncryptionService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ENCRYPTIONSERVICE_QNAME, features);
    }

    public EncryptionService(URL wsdlLocation) {
        super(wsdlLocation, ENCRYPTIONSERVICE_QNAME);
    }

    public EncryptionService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ENCRYPTIONSERVICE_QNAME, features);
    }

    public EncryptionService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EncryptionService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Encryption
     */
    @WebEndpoint(name = "EncryptionPort")
    public Encryption getEncryptionPort() {
        return super.getPort(new QName("http://web.strongkeylite.strongauth.com/", "EncryptionPort"), Encryption.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Encryption
     */
    @WebEndpoint(name = "EncryptionPort")
    public Encryption getEncryptionPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://web.strongkeylite.strongauth.com/", "EncryptionPort"), Encryption.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ENCRYPTIONSERVICE_EXCEPTION!= null) {
            throw ENCRYPTIONSERVICE_EXCEPTION;
        }
        return ENCRYPTIONSERVICE_WSDL_LOCATION;
    }

}

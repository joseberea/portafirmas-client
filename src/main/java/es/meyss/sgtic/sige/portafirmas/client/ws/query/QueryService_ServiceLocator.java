/**
 * QueryService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.query;

public class QueryService_ServiceLocator extends org.apache.axis.client.Service implements es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryService_Service {

    public QueryService_ServiceLocator() {
    }


    public QueryService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QueryService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QueryServicePort
    private java.lang.String QueryServicePort_address = "https://preintraweb.trabajo.dom/pf/servicesv2/QueryService";

    public java.lang.String getQueryServicePortAddress() {
        return QueryServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QueryServicePortWSDDServiceName = "QueryServicePort";

    public java.lang.String getQueryServicePortWSDDServiceName() {
        return QueryServicePortWSDDServiceName;
    }

    public void setQueryServicePortWSDDServiceName(java.lang.String name) {
        QueryServicePortWSDDServiceName = name;
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryService_PortType getQueryServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QueryServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQueryServicePort(endpoint);
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryService_PortType getQueryServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryServiceSoapBindingStub _stub = new es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getQueryServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQueryServicePortEndpointAddress(java.lang.String address) {
        QueryServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryServiceSoapBindingStub _stub = new es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryServiceSoapBindingStub(new java.net.URL(QueryServicePort_address), this);
                _stub.setPortName(getQueryServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("QueryServicePort".equals(inputPortName)) {
            return getQueryServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:v2.0", "QueryService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:v2.0", "QueryServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QueryServicePort".equals(portName)) {
            setQueryServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}

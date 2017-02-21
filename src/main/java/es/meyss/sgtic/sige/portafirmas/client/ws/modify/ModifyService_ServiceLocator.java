/**
 * ModifyService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.modify;

public class ModifyService_ServiceLocator extends org.apache.axis.client.Service implements es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyService_Service {

    public ModifyService_ServiceLocator() {
    }


    public ModifyService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ModifyService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ModifyServicePort
    private java.lang.String ModifyServicePort_address = "https://preintraweb.trabajo.dom/pf/servicesv2/ModifyService";

    public java.lang.String getModifyServicePortAddress() {
        return ModifyServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ModifyServicePortWSDDServiceName = "ModifyServicePort";

    public java.lang.String getModifyServicePortWSDDServiceName() {
        return ModifyServicePortWSDDServiceName;
    }

    public void setModifyServicePortWSDDServiceName(java.lang.String name) {
        ModifyServicePortWSDDServiceName = name;
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyService_PortType getModifyServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ModifyServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getModifyServicePort(endpoint);
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyService_PortType getModifyServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyServiceSoapBindingStub _stub = new es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getModifyServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setModifyServicePortEndpointAddress(java.lang.String address) {
        ModifyServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyServiceSoapBindingStub _stub = new es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyServiceSoapBindingStub(new java.net.URL(ModifyServicePort_address), this);
                _stub.setPortName(getModifyServicePortWSDDServiceName());
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
        if ("ModifyServicePort".equals(inputPortName)) {
            return getModifyServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:modify:v2.0", "ModifyService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:modify:v2.0", "ModifyServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ModifyServicePort".equals(portName)) {
            setModifyServicePortEndpointAddress(address);
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

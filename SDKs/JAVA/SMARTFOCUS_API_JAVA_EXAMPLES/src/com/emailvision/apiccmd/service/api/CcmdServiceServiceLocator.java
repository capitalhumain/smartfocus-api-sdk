/**
 * CcmdServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class CcmdServiceServiceLocator extends org.apache.axis.client.Service implements com.emailvision.apiccmd.service.api.CcmdServiceService {

    public CcmdServiceServiceLocator() {
    }


    public CcmdServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CcmdServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CcmdServicePort
    private java.lang.String CcmdServicePort_address = "http://p5apie.emv3.com/apiccmd/services/CcmdService";

    public java.lang.String getCcmdServicePortAddress() {
        return CcmdServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CcmdServicePortWSDDServiceName = "CcmdServicePort";

    public java.lang.String getCcmdServicePortWSDDServiceName() {
        return CcmdServicePortWSDDServiceName;
    }

    public void setCcmdServicePortWSDDServiceName(java.lang.String name) {
        CcmdServicePortWSDDServiceName = name;
    }

    public com.emailvision.apiccmd.service.api.CcmdService getCcmdServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CcmdServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCcmdServicePort(endpoint);
    }

    public com.emailvision.apiccmd.service.api.CcmdService getCcmdServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.emailvision.apiccmd.service.api.CcmdServiceServiceSoapBindingStub _stub = new com.emailvision.apiccmd.service.api.CcmdServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCcmdServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCcmdServicePortEndpointAddress(java.lang.String address) {
        CcmdServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.emailvision.apiccmd.service.api.CcmdService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.emailvision.apiccmd.service.api.CcmdServiceServiceSoapBindingStub _stub = new com.emailvision.apiccmd.service.api.CcmdServiceServiceSoapBindingStub(new java.net.URL(CcmdServicePort_address), this);
                _stub.setPortName(getCcmdServicePortWSDDServiceName());
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
        if ("CcmdServicePort".equals(inputPortName)) {
            return getCcmdServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "CcmdServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "CcmdServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CcmdServicePort".equals(portName)) {
            setCcmdServicePortEndpointAddress(address);
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

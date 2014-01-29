/**
 * BatchMemberServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public class BatchMemberServiceServiceLocator extends org.apache.axis.client.Service implements com.emailvision.apibatchmember.service.api.BatchMemberServiceService {

    public BatchMemberServiceServiceLocator() {
    }


    public BatchMemberServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BatchMemberServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BatchMemberServicePort
    private java.lang.String BatchMemberServicePort_address = "http://p5apie.emv3.com/apibatchmember/services/BatchMemberService";

    public java.lang.String getBatchMemberServicePortAddress() {
        return BatchMemberServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BatchMemberServicePortWSDDServiceName = "BatchMemberServicePort";

    public java.lang.String getBatchMemberServicePortWSDDServiceName() {
        return BatchMemberServicePortWSDDServiceName;
    }

    public void setBatchMemberServicePortWSDDServiceName(java.lang.String name) {
        BatchMemberServicePortWSDDServiceName = name;
    }

    public com.emailvision.apibatchmember.service.api.BatchMemberService getBatchMemberServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BatchMemberServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBatchMemberServicePort(endpoint);
    }

    public com.emailvision.apibatchmember.service.api.BatchMemberService getBatchMemberServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.emailvision.apibatchmember.service.api.BatchMemberServiceServiceSoapBindingStub _stub = new com.emailvision.apibatchmember.service.api.BatchMemberServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getBatchMemberServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBatchMemberServicePortEndpointAddress(java.lang.String address) {
        BatchMemberServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.emailvision.apibatchmember.service.api.BatchMemberService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.emailvision.apibatchmember.service.api.BatchMemberServiceServiceSoapBindingStub _stub = new com.emailvision.apibatchmember.service.api.BatchMemberServiceServiceSoapBindingStub(new java.net.URL(BatchMemberServicePort_address), this);
                _stub.setPortName(getBatchMemberServicePortWSDDServiceName());
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
        if ("BatchMemberServicePort".equals(inputPortName)) {
            return getBatchMemberServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "BatchMemberServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "BatchMemberServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BatchMemberServicePort".equals(portName)) {
            setBatchMemberServicePortEndpointAddress(address);
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

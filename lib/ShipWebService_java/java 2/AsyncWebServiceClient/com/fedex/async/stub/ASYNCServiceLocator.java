/**
 * ASYNCServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.async.stub;

public class ASYNCServiceLocator extends org.apache.axis.client.Service implements com.fedex.async.stub.ASYNCService {

    public ASYNCServiceLocator() {
    }


    public ASYNCServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ASYNCServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ASYNCServicePort
    private java.lang.String ASYNCServicePort_address = "https://wsbeta.fedex.com:443/web-services/async";

    public java.lang.String getASYNCServicePortAddress() {
        return ASYNCServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ASYNCServicePortWSDDServiceName = "ASYNCServicePort";

    public java.lang.String getASYNCServicePortWSDDServiceName() {
        return ASYNCServicePortWSDDServiceName;
    }

    public void setASYNCServicePortWSDDServiceName(java.lang.String name) {
        ASYNCServicePortWSDDServiceName = name;
    }

    public com.fedex.async.stub.ASYNCPortType getASYNCServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ASYNCServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getASYNCServicePort(endpoint);
    }

    public com.fedex.async.stub.ASYNCPortType getASYNCServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.fedex.async.stub.ASYNCServiceSoapBindingStub _stub = new com.fedex.async.stub.ASYNCServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getASYNCServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setASYNCServicePortEndpointAddress(java.lang.String address) {
        ASYNCServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.fedex.async.stub.ASYNCPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.fedex.async.stub.ASYNCServiceSoapBindingStub _stub = new com.fedex.async.stub.ASYNCServiceSoapBindingStub(new java.net.URL(ASYNCServicePort_address), this);
                _stub.setPortName(getASYNCServicePortWSDDServiceName());
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
        if ("ASYNCServicePort".equals(inputPortName)) {
            return getASYNCServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ASYNCService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ASYNCServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ASYNCServicePort".equals(portName)) {
            setASYNCServicePortEndpointAddress(address);
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

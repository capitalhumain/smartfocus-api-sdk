/**
 * APIWebformIntegration.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIWebformIntegration  implements java.io.Serializable {
    private java.lang.String sourceCode;

    private java.lang.String httpCallMethod;

    private java.lang.String emvTag;

    private java.lang.String emvRef;

    public APIWebformIntegration() {
    }

    public APIWebformIntegration(
           java.lang.String sourceCode,
           java.lang.String httpCallMethod,
           java.lang.String emvTag,
           java.lang.String emvRef) {
           this.sourceCode = sourceCode;
           this.httpCallMethod = httpCallMethod;
           this.emvTag = emvTag;
           this.emvRef = emvRef;
    }


    /**
     * Gets the sourceCode value for this APIWebformIntegration.
     * 
     * @return sourceCode
     */
    public java.lang.String getSourceCode() {
        return sourceCode;
    }


    /**
     * Sets the sourceCode value for this APIWebformIntegration.
     * 
     * @param sourceCode
     */
    public void setSourceCode(java.lang.String sourceCode) {
        this.sourceCode = sourceCode;
    }


    /**
     * Gets the httpCallMethod value for this APIWebformIntegration.
     * 
     * @return httpCallMethod
     */
    public java.lang.String getHttpCallMethod() {
        return httpCallMethod;
    }


    /**
     * Sets the httpCallMethod value for this APIWebformIntegration.
     * 
     * @param httpCallMethod
     */
    public void setHttpCallMethod(java.lang.String httpCallMethod) {
        this.httpCallMethod = httpCallMethod;
    }


    /**
     * Gets the emvTag value for this APIWebformIntegration.
     * 
     * @return emvTag
     */
    public java.lang.String getEmvTag() {
        return emvTag;
    }


    /**
     * Sets the emvTag value for this APIWebformIntegration.
     * 
     * @param emvTag
     */
    public void setEmvTag(java.lang.String emvTag) {
        this.emvTag = emvTag;
    }


    /**
     * Gets the emvRef value for this APIWebformIntegration.
     * 
     * @return emvRef
     */
    public java.lang.String getEmvRef() {
        return emvRef;
    }


    /**
     * Sets the emvRef value for this APIWebformIntegration.
     * 
     * @param emvRef
     */
    public void setEmvRef(java.lang.String emvRef) {
        this.emvRef = emvRef;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIWebformIntegration)) return false;
        APIWebformIntegration other = (APIWebformIntegration) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sourceCode==null && other.getSourceCode()==null) || 
             (this.sourceCode!=null &&
              this.sourceCode.equals(other.getSourceCode()))) &&
            ((this.httpCallMethod==null && other.getHttpCallMethod()==null) || 
             (this.httpCallMethod!=null &&
              this.httpCallMethod.equals(other.getHttpCallMethod()))) &&
            ((this.emvTag==null && other.getEmvTag()==null) || 
             (this.emvTag!=null &&
              this.emvTag.equals(other.getEmvTag()))) &&
            ((this.emvRef==null && other.getEmvRef()==null) || 
             (this.emvRef!=null &&
              this.emvRef.equals(other.getEmvRef())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSourceCode() != null) {
            _hashCode += getSourceCode().hashCode();
        }
        if (getHttpCallMethod() != null) {
            _hashCode += getHttpCallMethod().hashCode();
        }
        if (getEmvTag() != null) {
            _hashCode += getEmvTag().hashCode();
        }
        if (getEmvRef() != null) {
            _hashCode += getEmvRef().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIWebformIntegration.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformIntegration"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpCallMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpCallMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvTag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emvTag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvRef");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emvRef"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

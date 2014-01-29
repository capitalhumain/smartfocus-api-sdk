/**
 * InsertUpload.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public class InsertUpload  extends com.emailvision.apibatchmember.service.api.Upload  implements java.io.Serializable {
    private boolean autoMapping;

    private com.emailvision.apibatchmember.service.api.Dedup dedup;

    public InsertUpload() {
    }

    public InsertUpload(
           java.lang.String dateFormat,
           java.lang.String fileEncoding,
           java.lang.String fileName,
           com.emailvision.apibatchmember.service.api.Column[] mapping,
           java.lang.String separator,
           boolean skipFirstLine,
           boolean autoMapping,
           com.emailvision.apibatchmember.service.api.Dedup dedup) {
        super(
            dateFormat,
            fileEncoding,
            fileName,
            mapping,
            separator,
            skipFirstLine);
        this.autoMapping = autoMapping;
        this.dedup = dedup;
    }


    /**
     * Gets the autoMapping value for this InsertUpload.
     * 
     * @return autoMapping
     */
    public boolean isAutoMapping() {
        return autoMapping;
    }


    /**
     * Sets the autoMapping value for this InsertUpload.
     * 
     * @param autoMapping
     */
    public void setAutoMapping(boolean autoMapping) {
        this.autoMapping = autoMapping;
    }


    /**
     * Gets the dedup value for this InsertUpload.
     * 
     * @return dedup
     */
    public com.emailvision.apibatchmember.service.api.Dedup getDedup() {
        return dedup;
    }


    /**
     * Sets the dedup value for this InsertUpload.
     * 
     * @param dedup
     */
    public void setDedup(com.emailvision.apibatchmember.service.api.Dedup dedup) {
        this.dedup = dedup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertUpload)) return false;
        InsertUpload other = (InsertUpload) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.autoMapping == other.isAutoMapping() &&
            ((this.dedup==null && other.getDedup()==null) || 
             (this.dedup!=null &&
              this.dedup.equals(other.getDedup())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += (isAutoMapping() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDedup() != null) {
            _hashCode += getDedup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertUpload.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "insertUpload"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoMapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoMapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dedup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "dedup"));
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

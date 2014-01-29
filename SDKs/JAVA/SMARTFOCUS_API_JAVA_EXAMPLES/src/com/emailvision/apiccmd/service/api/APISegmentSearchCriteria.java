/**
 * APISegmentSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APISegmentSearchCriteria  implements java.io.Serializable {
    private java.lang.Long segmentId;

    private java.lang.String name;

    private java.lang.String minCreatedDate;

    private java.lang.String maxCreatedDate;

    public APISegmentSearchCriteria() {
    }

    public APISegmentSearchCriteria(
           java.lang.Long segmentId,
           java.lang.String name,
           java.lang.String minCreatedDate,
           java.lang.String maxCreatedDate) {
           this.segmentId = segmentId;
           this.name = name;
           this.minCreatedDate = minCreatedDate;
           this.maxCreatedDate = maxCreatedDate;
    }


    /**
     * Gets the segmentId value for this APISegmentSearchCriteria.
     * 
     * @return segmentId
     */
    public java.lang.Long getSegmentId() {
        return segmentId;
    }


    /**
     * Sets the segmentId value for this APISegmentSearchCriteria.
     * 
     * @param segmentId
     */
    public void setSegmentId(java.lang.Long segmentId) {
        this.segmentId = segmentId;
    }


    /**
     * Gets the name value for this APISegmentSearchCriteria.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this APISegmentSearchCriteria.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the minCreatedDate value for this APISegmentSearchCriteria.
     * 
     * @return minCreatedDate
     */
    public java.lang.String getMinCreatedDate() {
        return minCreatedDate;
    }


    /**
     * Sets the minCreatedDate value for this APISegmentSearchCriteria.
     * 
     * @param minCreatedDate
     */
    public void setMinCreatedDate(java.lang.String minCreatedDate) {
        this.minCreatedDate = minCreatedDate;
    }


    /**
     * Gets the maxCreatedDate value for this APISegmentSearchCriteria.
     * 
     * @return maxCreatedDate
     */
    public java.lang.String getMaxCreatedDate() {
        return maxCreatedDate;
    }


    /**
     * Sets the maxCreatedDate value for this APISegmentSearchCriteria.
     * 
     * @param maxCreatedDate
     */
    public void setMaxCreatedDate(java.lang.String maxCreatedDate) {
        this.maxCreatedDate = maxCreatedDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APISegmentSearchCriteria)) return false;
        APISegmentSearchCriteria other = (APISegmentSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.segmentId==null && other.getSegmentId()==null) || 
             (this.segmentId!=null &&
              this.segmentId.equals(other.getSegmentId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.minCreatedDate==null && other.getMinCreatedDate()==null) || 
             (this.minCreatedDate!=null &&
              this.minCreatedDate.equals(other.getMinCreatedDate()))) &&
            ((this.maxCreatedDate==null && other.getMaxCreatedDate()==null) || 
             (this.maxCreatedDate!=null &&
              this.maxCreatedDate.equals(other.getMaxCreatedDate())));
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
        if (getSegmentId() != null) {
            _hashCode += getSegmentId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getMinCreatedDate() != null) {
            _hashCode += getMinCreatedDate().hashCode();
        }
        if (getMaxCreatedDate() != null) {
            _hashCode += getMaxCreatedDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APISegmentSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minCreatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minCreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCreatedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxCreatedDate"));
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

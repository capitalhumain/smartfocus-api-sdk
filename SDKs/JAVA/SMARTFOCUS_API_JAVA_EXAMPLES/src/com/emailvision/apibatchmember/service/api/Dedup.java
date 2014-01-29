/**
 * Dedup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public class Dedup  implements java.io.Serializable {
    private java.lang.String criteria;

    private java.lang.String order;

    private boolean skipUnsubAndHBQ;

    public Dedup() {
    }

    public Dedup(
           java.lang.String criteria,
           java.lang.String order,
           boolean skipUnsubAndHBQ) {
           this.criteria = criteria;
           this.order = order;
           this.skipUnsubAndHBQ = skipUnsubAndHBQ;
    }


    /**
     * Gets the criteria value for this Dedup.
     * 
     * @return criteria
     */
    public java.lang.String getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this Dedup.
     * 
     * @param criteria
     */
    public void setCriteria(java.lang.String criteria) {
        this.criteria = criteria;
    }


    /**
     * Gets the order value for this Dedup.
     * 
     * @return order
     */
    public java.lang.String getOrder() {
        return order;
    }


    /**
     * Sets the order value for this Dedup.
     * 
     * @param order
     */
    public void setOrder(java.lang.String order) {
        this.order = order;
    }


    /**
     * Gets the skipUnsubAndHBQ value for this Dedup.
     * 
     * @return skipUnsubAndHBQ
     */
    public boolean isSkipUnsubAndHBQ() {
        return skipUnsubAndHBQ;
    }


    /**
     * Sets the skipUnsubAndHBQ value for this Dedup.
     * 
     * @param skipUnsubAndHBQ
     */
    public void setSkipUnsubAndHBQ(boolean skipUnsubAndHBQ) {
        this.skipUnsubAndHBQ = skipUnsubAndHBQ;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dedup)) return false;
        Dedup other = (Dedup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              this.criteria.equals(other.getCriteria()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            this.skipUnsubAndHBQ == other.isSkipUnsubAndHBQ();
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
        if (getCriteria() != null) {
            _hashCode += getCriteria().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        _hashCode += (isSkipUnsubAndHBQ() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dedup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "dedup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipUnsubAndHBQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skipUnsubAndHBQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

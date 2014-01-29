/**
 * ApiPersoFragCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiPersoFragCriteria  implements java.io.Serializable {
    private java.lang.String persoName;

    private java.lang.String persoDesc;

    private java.lang.String persoSQL;

    private long persoFragId;  // attribute

    public ApiPersoFragCriteria() {
    }

    public ApiPersoFragCriteria(
           java.lang.String persoName,
           java.lang.String persoDesc,
           java.lang.String persoSQL,
           long persoFragId) {
           this.persoName = persoName;
           this.persoDesc = persoDesc;
           this.persoSQL = persoSQL;
           this.persoFragId = persoFragId;
    }


    /**
     * Gets the persoName value for this ApiPersoFragCriteria.
     * 
     * @return persoName
     */
    public java.lang.String getPersoName() {
        return persoName;
    }


    /**
     * Sets the persoName value for this ApiPersoFragCriteria.
     * 
     * @param persoName
     */
    public void setPersoName(java.lang.String persoName) {
        this.persoName = persoName;
    }


    /**
     * Gets the persoDesc value for this ApiPersoFragCriteria.
     * 
     * @return persoDesc
     */
    public java.lang.String getPersoDesc() {
        return persoDesc;
    }


    /**
     * Sets the persoDesc value for this ApiPersoFragCriteria.
     * 
     * @param persoDesc
     */
    public void setPersoDesc(java.lang.String persoDesc) {
        this.persoDesc = persoDesc;
    }


    /**
     * Gets the persoSQL value for this ApiPersoFragCriteria.
     * 
     * @return persoSQL
     */
    public java.lang.String getPersoSQL() {
        return persoSQL;
    }


    /**
     * Sets the persoSQL value for this ApiPersoFragCriteria.
     * 
     * @param persoSQL
     */
    public void setPersoSQL(java.lang.String persoSQL) {
        this.persoSQL = persoSQL;
    }


    /**
     * Gets the persoFragId value for this ApiPersoFragCriteria.
     * 
     * @return persoFragId
     */
    public long getPersoFragId() {
        return persoFragId;
    }


    /**
     * Sets the persoFragId value for this ApiPersoFragCriteria.
     * 
     * @param persoFragId
     */
    public void setPersoFragId(long persoFragId) {
        this.persoFragId = persoFragId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiPersoFragCriteria)) return false;
        ApiPersoFragCriteria other = (ApiPersoFragCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.persoName==null && other.getPersoName()==null) || 
             (this.persoName!=null &&
              this.persoName.equals(other.getPersoName()))) &&
            ((this.persoDesc==null && other.getPersoDesc()==null) || 
             (this.persoDesc!=null &&
              this.persoDesc.equals(other.getPersoDesc()))) &&
            ((this.persoSQL==null && other.getPersoSQL()==null) || 
             (this.persoSQL!=null &&
              this.persoSQL.equals(other.getPersoSQL()))) &&
            this.persoFragId == other.getPersoFragId();
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
        if (getPersoName() != null) {
            _hashCode += getPersoName().hashCode();
        }
        if (getPersoDesc() != null) {
            _hashCode += getPersoDesc().hashCode();
        }
        if (getPersoSQL() != null) {
            _hashCode += getPersoSQL().hashCode();
        }
        _hashCode += new Long(getPersoFragId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiPersoFragCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiPersoFragCriteria"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("persoFragId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "persoFragId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persoName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persoName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persoDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persoDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persoSQL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persoSQL"));
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

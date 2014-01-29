/**
 * APIBannerSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIBannerSearchCriteria  implements java.io.Serializable {
    private java.lang.Long bannerId;

    private java.lang.String name;

    private java.lang.String minCreatedDate;

    private java.lang.String maxCreatedDate;

    private java.lang.String minModifiedDate;

    private java.lang.String maxModifiedDate;

    private com.emailvision.apiccmd.service.api.ApiBannerType contentType;

    public APIBannerSearchCriteria() {
    }

    public APIBannerSearchCriteria(
           java.lang.Long bannerId,
           java.lang.String name,
           java.lang.String minCreatedDate,
           java.lang.String maxCreatedDate,
           java.lang.String minModifiedDate,
           java.lang.String maxModifiedDate,
           com.emailvision.apiccmd.service.api.ApiBannerType contentType) {
           this.bannerId = bannerId;
           this.name = name;
           this.minCreatedDate = minCreatedDate;
           this.maxCreatedDate = maxCreatedDate;
           this.minModifiedDate = minModifiedDate;
           this.maxModifiedDate = maxModifiedDate;
           this.contentType = contentType;
    }


    /**
     * Gets the bannerId value for this APIBannerSearchCriteria.
     * 
     * @return bannerId
     */
    public java.lang.Long getBannerId() {
        return bannerId;
    }


    /**
     * Sets the bannerId value for this APIBannerSearchCriteria.
     * 
     * @param bannerId
     */
    public void setBannerId(java.lang.Long bannerId) {
        this.bannerId = bannerId;
    }


    /**
     * Gets the name value for this APIBannerSearchCriteria.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this APIBannerSearchCriteria.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the minCreatedDate value for this APIBannerSearchCriteria.
     * 
     * @return minCreatedDate
     */
    public java.lang.String getMinCreatedDate() {
        return minCreatedDate;
    }


    /**
     * Sets the minCreatedDate value for this APIBannerSearchCriteria.
     * 
     * @param minCreatedDate
     */
    public void setMinCreatedDate(java.lang.String minCreatedDate) {
        this.minCreatedDate = minCreatedDate;
    }


    /**
     * Gets the maxCreatedDate value for this APIBannerSearchCriteria.
     * 
     * @return maxCreatedDate
     */
    public java.lang.String getMaxCreatedDate() {
        return maxCreatedDate;
    }


    /**
     * Sets the maxCreatedDate value for this APIBannerSearchCriteria.
     * 
     * @param maxCreatedDate
     */
    public void setMaxCreatedDate(java.lang.String maxCreatedDate) {
        this.maxCreatedDate = maxCreatedDate;
    }


    /**
     * Gets the minModifiedDate value for this APIBannerSearchCriteria.
     * 
     * @return minModifiedDate
     */
    public java.lang.String getMinModifiedDate() {
        return minModifiedDate;
    }


    /**
     * Sets the minModifiedDate value for this APIBannerSearchCriteria.
     * 
     * @param minModifiedDate
     */
    public void setMinModifiedDate(java.lang.String minModifiedDate) {
        this.minModifiedDate = minModifiedDate;
    }


    /**
     * Gets the maxModifiedDate value for this APIBannerSearchCriteria.
     * 
     * @return maxModifiedDate
     */
    public java.lang.String getMaxModifiedDate() {
        return maxModifiedDate;
    }


    /**
     * Sets the maxModifiedDate value for this APIBannerSearchCriteria.
     * 
     * @param maxModifiedDate
     */
    public void setMaxModifiedDate(java.lang.String maxModifiedDate) {
        this.maxModifiedDate = maxModifiedDate;
    }


    /**
     * Gets the contentType value for this APIBannerSearchCriteria.
     * 
     * @return contentType
     */
    public com.emailvision.apiccmd.service.api.ApiBannerType getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this APIBannerSearchCriteria.
     * 
     * @param contentType
     */
    public void setContentType(com.emailvision.apiccmd.service.api.ApiBannerType contentType) {
        this.contentType = contentType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIBannerSearchCriteria)) return false;
        APIBannerSearchCriteria other = (APIBannerSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bannerId==null && other.getBannerId()==null) || 
             (this.bannerId!=null &&
              this.bannerId.equals(other.getBannerId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.minCreatedDate==null && other.getMinCreatedDate()==null) || 
             (this.minCreatedDate!=null &&
              this.minCreatedDate.equals(other.getMinCreatedDate()))) &&
            ((this.maxCreatedDate==null && other.getMaxCreatedDate()==null) || 
             (this.maxCreatedDate!=null &&
              this.maxCreatedDate.equals(other.getMaxCreatedDate()))) &&
            ((this.minModifiedDate==null && other.getMinModifiedDate()==null) || 
             (this.minModifiedDate!=null &&
              this.minModifiedDate.equals(other.getMinModifiedDate()))) &&
            ((this.maxModifiedDate==null && other.getMaxModifiedDate()==null) || 
             (this.maxModifiedDate!=null &&
              this.maxModifiedDate.equals(other.getMaxModifiedDate()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType())));
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
        if (getBannerId() != null) {
            _hashCode += getBannerId().hashCode();
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
        if (getMinModifiedDate() != null) {
            _hashCode += getMinModifiedDate().hashCode();
        }
        if (getMaxModifiedDate() != null) {
            _hashCode += getMaxModifiedDate().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIBannerSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bannerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bannerId"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBannerType"));
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

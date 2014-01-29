/**
 * APIWebformSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIWebformSearchCriteria  implements java.io.Serializable {
    private java.lang.Long webformId;

    private java.lang.String name;

    private com.emailvision.apiccmd.service.api.ApiWebformType type;

    private com.emailvision.apiccmd.service.api.ApiWebformStatus status;

    private java.lang.String minCreationDate;

    private java.lang.String maxCreationDate;

    private java.lang.String minExpirationDate;

    private java.lang.String maxExpirationDate;

    private com.emailvision.apiccmd.service.api.ApiWebformBouncebackType bouncebackType;

    public APIWebformSearchCriteria() {
    }

    public APIWebformSearchCriteria(
           java.lang.Long webformId,
           java.lang.String name,
           com.emailvision.apiccmd.service.api.ApiWebformType type,
           com.emailvision.apiccmd.service.api.ApiWebformStatus status,
           java.lang.String minCreationDate,
           java.lang.String maxCreationDate,
           java.lang.String minExpirationDate,
           java.lang.String maxExpirationDate,
           com.emailvision.apiccmd.service.api.ApiWebformBouncebackType bouncebackType) {
           this.webformId = webformId;
           this.name = name;
           this.type = type;
           this.status = status;
           this.minCreationDate = minCreationDate;
           this.maxCreationDate = maxCreationDate;
           this.minExpirationDate = minExpirationDate;
           this.maxExpirationDate = maxExpirationDate;
           this.bouncebackType = bouncebackType;
    }


    /**
     * Gets the webformId value for this APIWebformSearchCriteria.
     * 
     * @return webformId
     */
    public java.lang.Long getWebformId() {
        return webformId;
    }


    /**
     * Sets the webformId value for this APIWebformSearchCriteria.
     * 
     * @param webformId
     */
    public void setWebformId(java.lang.Long webformId) {
        this.webformId = webformId;
    }


    /**
     * Gets the name value for this APIWebformSearchCriteria.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this APIWebformSearchCriteria.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this APIWebformSearchCriteria.
     * 
     * @return type
     */
    public com.emailvision.apiccmd.service.api.ApiWebformType getType() {
        return type;
    }


    /**
     * Sets the type value for this APIWebformSearchCriteria.
     * 
     * @param type
     */
    public void setType(com.emailvision.apiccmd.service.api.ApiWebformType type) {
        this.type = type;
    }


    /**
     * Gets the status value for this APIWebformSearchCriteria.
     * 
     * @return status
     */
    public com.emailvision.apiccmd.service.api.ApiWebformStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this APIWebformSearchCriteria.
     * 
     * @param status
     */
    public void setStatus(com.emailvision.apiccmd.service.api.ApiWebformStatus status) {
        this.status = status;
    }


    /**
     * Gets the minCreationDate value for this APIWebformSearchCriteria.
     * 
     * @return minCreationDate
     */
    public java.lang.String getMinCreationDate() {
        return minCreationDate;
    }


    /**
     * Sets the minCreationDate value for this APIWebformSearchCriteria.
     * 
     * @param minCreationDate
     */
    public void setMinCreationDate(java.lang.String minCreationDate) {
        this.minCreationDate = minCreationDate;
    }


    /**
     * Gets the maxCreationDate value for this APIWebformSearchCriteria.
     * 
     * @return maxCreationDate
     */
    public java.lang.String getMaxCreationDate() {
        return maxCreationDate;
    }


    /**
     * Sets the maxCreationDate value for this APIWebformSearchCriteria.
     * 
     * @param maxCreationDate
     */
    public void setMaxCreationDate(java.lang.String maxCreationDate) {
        this.maxCreationDate = maxCreationDate;
    }


    /**
     * Gets the minExpirationDate value for this APIWebformSearchCriteria.
     * 
     * @return minExpirationDate
     */
    public java.lang.String getMinExpirationDate() {
        return minExpirationDate;
    }


    /**
     * Sets the minExpirationDate value for this APIWebformSearchCriteria.
     * 
     * @param minExpirationDate
     */
    public void setMinExpirationDate(java.lang.String minExpirationDate) {
        this.minExpirationDate = minExpirationDate;
    }


    /**
     * Gets the maxExpirationDate value for this APIWebformSearchCriteria.
     * 
     * @return maxExpirationDate
     */
    public java.lang.String getMaxExpirationDate() {
        return maxExpirationDate;
    }


    /**
     * Sets the maxExpirationDate value for this APIWebformSearchCriteria.
     * 
     * @param maxExpirationDate
     */
    public void setMaxExpirationDate(java.lang.String maxExpirationDate) {
        this.maxExpirationDate = maxExpirationDate;
    }


    /**
     * Gets the bouncebackType value for this APIWebformSearchCriteria.
     * 
     * @return bouncebackType
     */
    public com.emailvision.apiccmd.service.api.ApiWebformBouncebackType getBouncebackType() {
        return bouncebackType;
    }


    /**
     * Sets the bouncebackType value for this APIWebformSearchCriteria.
     * 
     * @param bouncebackType
     */
    public void setBouncebackType(com.emailvision.apiccmd.service.api.ApiWebformBouncebackType bouncebackType) {
        this.bouncebackType = bouncebackType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIWebformSearchCriteria)) return false;
        APIWebformSearchCriteria other = (APIWebformSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webformId==null && other.getWebformId()==null) || 
             (this.webformId!=null &&
              this.webformId.equals(other.getWebformId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.minCreationDate==null && other.getMinCreationDate()==null) || 
             (this.minCreationDate!=null &&
              this.minCreationDate.equals(other.getMinCreationDate()))) &&
            ((this.maxCreationDate==null && other.getMaxCreationDate()==null) || 
             (this.maxCreationDate!=null &&
              this.maxCreationDate.equals(other.getMaxCreationDate()))) &&
            ((this.minExpirationDate==null && other.getMinExpirationDate()==null) || 
             (this.minExpirationDate!=null &&
              this.minExpirationDate.equals(other.getMinExpirationDate()))) &&
            ((this.maxExpirationDate==null && other.getMaxExpirationDate()==null) || 
             (this.maxExpirationDate!=null &&
              this.maxExpirationDate.equals(other.getMaxExpirationDate()))) &&
            ((this.bouncebackType==null && other.getBouncebackType()==null) || 
             (this.bouncebackType!=null &&
              this.bouncebackType.equals(other.getBouncebackType())));
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
        if (getWebformId() != null) {
            _hashCode += getWebformId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMinCreationDate() != null) {
            _hashCode += getMinCreationDate().hashCode();
        }
        if (getMaxCreationDate() != null) {
            _hashCode += getMaxCreationDate().hashCode();
        }
        if (getMinExpirationDate() != null) {
            _hashCode += getMinExpirationDate().hashCode();
        }
        if (getMaxExpirationDate() != null) {
            _hashCode += getMaxExpirationDate().hashCode();
        }
        if (getBouncebackType() != null) {
            _hashCode += getBouncebackType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIWebformSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webformId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "webformId"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouncebackType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bouncebackType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformBouncebackType"));
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

/**
 * APIWebformSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIWebformSummary  implements java.io.Serializable {
    private long webformId;

    private java.lang.String name;

    private com.emailvision.apiccmd.service.api.ApiWebformType type;

    private java.lang.String manager;

    private com.emailvision.apiccmd.service.api.ApiWebformStatus status;

    private java.util.Calendar creationDate;

    private java.util.Calendar expirationDate;

    private com.emailvision.apiccmd.service.api.ApiWebformBouncebackType bouncebackType;

    public APIWebformSummary() {
    }

    public APIWebformSummary(
           long webformId,
           java.lang.String name,
           com.emailvision.apiccmd.service.api.ApiWebformType type,
           java.lang.String manager,
           com.emailvision.apiccmd.service.api.ApiWebformStatus status,
           java.util.Calendar creationDate,
           java.util.Calendar expirationDate,
           com.emailvision.apiccmd.service.api.ApiWebformBouncebackType bouncebackType) {
           this.webformId = webformId;
           this.name = name;
           this.type = type;
           this.manager = manager;
           this.status = status;
           this.creationDate = creationDate;
           this.expirationDate = expirationDate;
           this.bouncebackType = bouncebackType;
    }


    /**
     * Gets the webformId value for this APIWebformSummary.
     * 
     * @return webformId
     */
    public long getWebformId() {
        return webformId;
    }


    /**
     * Sets the webformId value for this APIWebformSummary.
     * 
     * @param webformId
     */
    public void setWebformId(long webformId) {
        this.webformId = webformId;
    }


    /**
     * Gets the name value for this APIWebformSummary.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this APIWebformSummary.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this APIWebformSummary.
     * 
     * @return type
     */
    public com.emailvision.apiccmd.service.api.ApiWebformType getType() {
        return type;
    }


    /**
     * Sets the type value for this APIWebformSummary.
     * 
     * @param type
     */
    public void setType(com.emailvision.apiccmd.service.api.ApiWebformType type) {
        this.type = type;
    }


    /**
     * Gets the manager value for this APIWebformSummary.
     * 
     * @return manager
     */
    public java.lang.String getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this APIWebformSummary.
     * 
     * @param manager
     */
    public void setManager(java.lang.String manager) {
        this.manager = manager;
    }


    /**
     * Gets the status value for this APIWebformSummary.
     * 
     * @return status
     */
    public com.emailvision.apiccmd.service.api.ApiWebformStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this APIWebformSummary.
     * 
     * @param status
     */
    public void setStatus(com.emailvision.apiccmd.service.api.ApiWebformStatus status) {
        this.status = status;
    }


    /**
     * Gets the creationDate value for this APIWebformSummary.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this APIWebformSummary.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the expirationDate value for this APIWebformSummary.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this APIWebformSummary.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the bouncebackType value for this APIWebformSummary.
     * 
     * @return bouncebackType
     */
    public com.emailvision.apiccmd.service.api.ApiWebformBouncebackType getBouncebackType() {
        return bouncebackType;
    }


    /**
     * Sets the bouncebackType value for this APIWebformSummary.
     * 
     * @param bouncebackType
     */
    public void setBouncebackType(com.emailvision.apiccmd.service.api.ApiWebformBouncebackType bouncebackType) {
        this.bouncebackType = bouncebackType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIWebformSummary)) return false;
        APIWebformSummary other = (APIWebformSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.webformId == other.getWebformId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
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
        _hashCode += new Long(getWebformId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getBouncebackType() != null) {
            _hashCode += getBouncebackType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIWebformSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webformId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "webformId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

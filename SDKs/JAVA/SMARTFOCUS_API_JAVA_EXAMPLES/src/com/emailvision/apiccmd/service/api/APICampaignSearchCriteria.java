/**
 * APICampaignSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APICampaignSearchCriteria  implements java.io.Serializable {
    private java.lang.Long campaignId;

    private java.lang.String name;

    private com.emailvision.apiccmd.service.api.ApiCampaignStatus status;

    private java.lang.String minSendDate;

    private java.lang.String maxSendDate;

    private java.lang.Long messageId;

    public APICampaignSearchCriteria() {
    }

    public APICampaignSearchCriteria(
           java.lang.Long campaignId,
           java.lang.String name,
           com.emailvision.apiccmd.service.api.ApiCampaignStatus status,
           java.lang.String minSendDate,
           java.lang.String maxSendDate,
           java.lang.Long messageId) {
           this.campaignId = campaignId;
           this.name = name;
           this.status = status;
           this.minSendDate = minSendDate;
           this.maxSendDate = maxSendDate;
           this.messageId = messageId;
    }


    /**
     * Gets the campaignId value for this APICampaignSearchCriteria.
     * 
     * @return campaignId
     */
    public java.lang.Long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this APICampaignSearchCriteria.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.Long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the name value for this APICampaignSearchCriteria.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this APICampaignSearchCriteria.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the status value for this APICampaignSearchCriteria.
     * 
     * @return status
     */
    public com.emailvision.apiccmd.service.api.ApiCampaignStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this APICampaignSearchCriteria.
     * 
     * @param status
     */
    public void setStatus(com.emailvision.apiccmd.service.api.ApiCampaignStatus status) {
        this.status = status;
    }


    /**
     * Gets the minSendDate value for this APICampaignSearchCriteria.
     * 
     * @return minSendDate
     */
    public java.lang.String getMinSendDate() {
        return minSendDate;
    }


    /**
     * Sets the minSendDate value for this APICampaignSearchCriteria.
     * 
     * @param minSendDate
     */
    public void setMinSendDate(java.lang.String minSendDate) {
        this.minSendDate = minSendDate;
    }


    /**
     * Gets the maxSendDate value for this APICampaignSearchCriteria.
     * 
     * @return maxSendDate
     */
    public java.lang.String getMaxSendDate() {
        return maxSendDate;
    }


    /**
     * Sets the maxSendDate value for this APICampaignSearchCriteria.
     * 
     * @param maxSendDate
     */
    public void setMaxSendDate(java.lang.String maxSendDate) {
        this.maxSendDate = maxSendDate;
    }


    /**
     * Gets the messageId value for this APICampaignSearchCriteria.
     * 
     * @return messageId
     */
    public java.lang.Long getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this APICampaignSearchCriteria.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Long messageId) {
        this.messageId = messageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APICampaignSearchCriteria)) return false;
        APICampaignSearchCriteria other = (APICampaignSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.minSendDate==null && other.getMinSendDate()==null) || 
             (this.minSendDate!=null &&
              this.minSendDate.equals(other.getMinSendDate()))) &&
            ((this.maxSendDate==null && other.getMaxSendDate()==null) || 
             (this.maxSendDate!=null &&
              this.maxSendDate.equals(other.getMaxSendDate()))) &&
            ((this.messageId==null && other.getMessageId()==null) || 
             (this.messageId!=null &&
              this.messageId.equals(other.getMessageId())));
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
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMinSendDate() != null) {
            _hashCode += getMinSendDate().hashCode();
        }
        if (getMaxSendDate() != null) {
            _hashCode += getMaxSendDate().hashCode();
        }
        if (getMessageId() != null) {
            _hashCode += getMessageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APICampaignSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minSendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minSendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxSendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxSendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

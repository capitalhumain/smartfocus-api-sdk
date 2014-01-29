/**
 * APIMessageSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIMessageSearchCriteria  implements java.io.Serializable {
    private java.lang.Long messageId;

    private java.lang.String name;

    private java.lang.String minCreatedDate;

    private java.lang.String maxCreatedDate;

    private java.lang.String from;

    private com.emailvision.apiccmd.service.api.ApiMessageType messageType;

    private java.lang.String subject;

    private java.lang.String to;

    private java.lang.Boolean isBounceBack;

    public APIMessageSearchCriteria() {
    }

    public APIMessageSearchCriteria(
           java.lang.Long messageId,
           java.lang.String name,
           java.lang.String minCreatedDate,
           java.lang.String maxCreatedDate,
           java.lang.String from,
           com.emailvision.apiccmd.service.api.ApiMessageType messageType,
           java.lang.String subject,
           java.lang.String to,
           java.lang.Boolean isBounceBack) {
           this.messageId = messageId;
           this.name = name;
           this.minCreatedDate = minCreatedDate;
           this.maxCreatedDate = maxCreatedDate;
           this.from = from;
           this.messageType = messageType;
           this.subject = subject;
           this.to = to;
           this.isBounceBack = isBounceBack;
    }


    /**
     * Gets the messageId value for this APIMessageSearchCriteria.
     * 
     * @return messageId
     */
    public java.lang.Long getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this APIMessageSearchCriteria.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Long messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the name value for this APIMessageSearchCriteria.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this APIMessageSearchCriteria.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the minCreatedDate value for this APIMessageSearchCriteria.
     * 
     * @return minCreatedDate
     */
    public java.lang.String getMinCreatedDate() {
        return minCreatedDate;
    }


    /**
     * Sets the minCreatedDate value for this APIMessageSearchCriteria.
     * 
     * @param minCreatedDate
     */
    public void setMinCreatedDate(java.lang.String minCreatedDate) {
        this.minCreatedDate = minCreatedDate;
    }


    /**
     * Gets the maxCreatedDate value for this APIMessageSearchCriteria.
     * 
     * @return maxCreatedDate
     */
    public java.lang.String getMaxCreatedDate() {
        return maxCreatedDate;
    }


    /**
     * Sets the maxCreatedDate value for this APIMessageSearchCriteria.
     * 
     * @param maxCreatedDate
     */
    public void setMaxCreatedDate(java.lang.String maxCreatedDate) {
        this.maxCreatedDate = maxCreatedDate;
    }


    /**
     * Gets the from value for this APIMessageSearchCriteria.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this APIMessageSearchCriteria.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the messageType value for this APIMessageSearchCriteria.
     * 
     * @return messageType
     */
    public com.emailvision.apiccmd.service.api.ApiMessageType getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this APIMessageSearchCriteria.
     * 
     * @param messageType
     */
    public void setMessageType(com.emailvision.apiccmd.service.api.ApiMessageType messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the subject value for this APIMessageSearchCriteria.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this APIMessageSearchCriteria.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the to value for this APIMessageSearchCriteria.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this APIMessageSearchCriteria.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the isBounceBack value for this APIMessageSearchCriteria.
     * 
     * @return isBounceBack
     */
    public java.lang.Boolean getIsBounceBack() {
        return isBounceBack;
    }


    /**
     * Sets the isBounceBack value for this APIMessageSearchCriteria.
     * 
     * @param isBounceBack
     */
    public void setIsBounceBack(java.lang.Boolean isBounceBack) {
        this.isBounceBack = isBounceBack;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIMessageSearchCriteria)) return false;
        APIMessageSearchCriteria other = (APIMessageSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageId==null && other.getMessageId()==null) || 
             (this.messageId!=null &&
              this.messageId.equals(other.getMessageId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.minCreatedDate==null && other.getMinCreatedDate()==null) || 
             (this.minCreatedDate!=null &&
              this.minCreatedDate.equals(other.getMinCreatedDate()))) &&
            ((this.maxCreatedDate==null && other.getMaxCreatedDate()==null) || 
             (this.maxCreatedDate!=null &&
              this.maxCreatedDate.equals(other.getMaxCreatedDate()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.isBounceBack==null && other.getIsBounceBack()==null) || 
             (this.isBounceBack!=null &&
              this.isBounceBack.equals(other.getIsBounceBack())));
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
        if (getMessageId() != null) {
            _hashCode += getMessageId().hashCode();
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
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getIsBounceBack() != null) {
            _hashCode += getIsBounceBack().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIMessageSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
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
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBounceBack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isBounceBack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

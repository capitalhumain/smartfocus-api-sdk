/**
 * APIMessageSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIMessageSummary  implements java.io.Serializable {
    private long messageId;

    private java.lang.String name;

    private java.lang.String manager;

    private java.util.Calendar createdDate;

    private java.lang.String from;

    private java.lang.String fromEmail;

    private com.emailvision.apiccmd.service.api.ApiMessageType messageType;

    private java.lang.String subject;

    private java.lang.String to;

    private java.lang.String replyTo;

    private java.lang.String replyToEmail;

    private java.lang.Boolean isBounceBack;

    public APIMessageSummary() {
    }

    public APIMessageSummary(
           long messageId,
           java.lang.String name,
           java.lang.String manager,
           java.util.Calendar createdDate,
           java.lang.String from,
           java.lang.String fromEmail,
           com.emailvision.apiccmd.service.api.ApiMessageType messageType,
           java.lang.String subject,
           java.lang.String to,
           java.lang.String replyTo,
           java.lang.String replyToEmail,
           java.lang.Boolean isBounceBack) {
           this.messageId = messageId;
           this.name = name;
           this.manager = manager;
           this.createdDate = createdDate;
           this.from = from;
           this.fromEmail = fromEmail;
           this.messageType = messageType;
           this.subject = subject;
           this.to = to;
           this.replyTo = replyTo;
           this.replyToEmail = replyToEmail;
           this.isBounceBack = isBounceBack;
    }


    /**
     * Gets the messageId value for this APIMessageSummary.
     * 
     * @return messageId
     */
    public long getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this APIMessageSummary.
     * 
     * @param messageId
     */
    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the name value for this APIMessageSummary.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this APIMessageSummary.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the manager value for this APIMessageSummary.
     * 
     * @return manager
     */
    public java.lang.String getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this APIMessageSummary.
     * 
     * @param manager
     */
    public void setManager(java.lang.String manager) {
        this.manager = manager;
    }


    /**
     * Gets the createdDate value for this APIMessageSummary.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this APIMessageSummary.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the from value for this APIMessageSummary.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this APIMessageSummary.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the fromEmail value for this APIMessageSummary.
     * 
     * @return fromEmail
     */
    public java.lang.String getFromEmail() {
        return fromEmail;
    }


    /**
     * Sets the fromEmail value for this APIMessageSummary.
     * 
     * @param fromEmail
     */
    public void setFromEmail(java.lang.String fromEmail) {
        this.fromEmail = fromEmail;
    }


    /**
     * Gets the messageType value for this APIMessageSummary.
     * 
     * @return messageType
     */
    public com.emailvision.apiccmd.service.api.ApiMessageType getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this APIMessageSummary.
     * 
     * @param messageType
     */
    public void setMessageType(com.emailvision.apiccmd.service.api.ApiMessageType messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the subject value for this APIMessageSummary.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this APIMessageSummary.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the to value for this APIMessageSummary.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this APIMessageSummary.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the replyTo value for this APIMessageSummary.
     * 
     * @return replyTo
     */
    public java.lang.String getReplyTo() {
        return replyTo;
    }


    /**
     * Sets the replyTo value for this APIMessageSummary.
     * 
     * @param replyTo
     */
    public void setReplyTo(java.lang.String replyTo) {
        this.replyTo = replyTo;
    }


    /**
     * Gets the replyToEmail value for this APIMessageSummary.
     * 
     * @return replyToEmail
     */
    public java.lang.String getReplyToEmail() {
        return replyToEmail;
    }


    /**
     * Sets the replyToEmail value for this APIMessageSummary.
     * 
     * @param replyToEmail
     */
    public void setReplyToEmail(java.lang.String replyToEmail) {
        this.replyToEmail = replyToEmail;
    }


    /**
     * Gets the isBounceBack value for this APIMessageSummary.
     * 
     * @return isBounceBack
     */
    public java.lang.Boolean getIsBounceBack() {
        return isBounceBack;
    }


    /**
     * Sets the isBounceBack value for this APIMessageSummary.
     * 
     * @param isBounceBack
     */
    public void setIsBounceBack(java.lang.Boolean isBounceBack) {
        this.isBounceBack = isBounceBack;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIMessageSummary)) return false;
        APIMessageSummary other = (APIMessageSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.messageId == other.getMessageId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.fromEmail==null && other.getFromEmail()==null) || 
             (this.fromEmail!=null &&
              this.fromEmail.equals(other.getFromEmail()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.replyTo==null && other.getReplyTo()==null) || 
             (this.replyTo!=null &&
              this.replyTo.equals(other.getReplyTo()))) &&
            ((this.replyToEmail==null && other.getReplyToEmail()==null) || 
             (this.replyToEmail!=null &&
              this.replyToEmail.equals(other.getReplyToEmail()))) &&
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
        _hashCode += new Long(getMessageId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getFromEmail() != null) {
            _hashCode += getFromEmail().hashCode();
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
        if (getReplyTo() != null) {
            _hashCode += getReplyTo().hashCode();
        }
        if (getReplyToEmail() != null) {
            _hashCode += getReplyToEmail().hashCode();
        }
        if (getIsBounceBack() != null) {
            _hashCode += getIsBounceBack().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIMessageSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
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
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("fromEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromEmail"));
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
        elemField.setFieldName("replyTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replyTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyToEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replyToEmail"));
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

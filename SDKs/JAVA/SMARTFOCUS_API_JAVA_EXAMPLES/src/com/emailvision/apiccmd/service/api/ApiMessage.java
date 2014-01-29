/**
 * ApiMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiMessage  implements java.io.Serializable {
    private java.lang.String body;

    private java.util.Calendar createDate;

    private java.lang.String description;

    private java.lang.String encoding;

    private java.lang.String from;

    private java.lang.String fromEmail;

    private boolean hotmailUnsubFlg;

    private java.lang.String hotmailUnsubUrl;

    private long id;

    private boolean isBounceback;

    private java.lang.String name;

    private java.lang.String replyTo;

    private java.lang.String replyToEmail;

    private java.lang.String subject;

    private java.lang.String to;

    private com.emailvision.apiccmd.service.api.ApiMessageType type;

    public ApiMessage() {
    }

    public ApiMessage(
           java.lang.String body,
           java.util.Calendar createDate,
           java.lang.String description,
           java.lang.String encoding,
           java.lang.String from,
           java.lang.String fromEmail,
           boolean hotmailUnsubFlg,
           java.lang.String hotmailUnsubUrl,
           long id,
           boolean isBounceback,
           java.lang.String name,
           java.lang.String replyTo,
           java.lang.String replyToEmail,
           java.lang.String subject,
           java.lang.String to,
           com.emailvision.apiccmd.service.api.ApiMessageType type) {
           this.body = body;
           this.createDate = createDate;
           this.description = description;
           this.encoding = encoding;
           this.from = from;
           this.fromEmail = fromEmail;
           this.hotmailUnsubFlg = hotmailUnsubFlg;
           this.hotmailUnsubUrl = hotmailUnsubUrl;
           this.id = id;
           this.isBounceback = isBounceback;
           this.name = name;
           this.replyTo = replyTo;
           this.replyToEmail = replyToEmail;
           this.subject = subject;
           this.to = to;
           this.type = type;
    }


    /**
     * Gets the body value for this ApiMessage.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this ApiMessage.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the createDate value for this ApiMessage.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this ApiMessage.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the description value for this ApiMessage.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ApiMessage.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the encoding value for this ApiMessage.
     * 
     * @return encoding
     */
    public java.lang.String getEncoding() {
        return encoding;
    }


    /**
     * Sets the encoding value for this ApiMessage.
     * 
     * @param encoding
     */
    public void setEncoding(java.lang.String encoding) {
        this.encoding = encoding;
    }


    /**
     * Gets the from value for this ApiMessage.
     * 
     * @return from
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this ApiMessage.
     * 
     * @param from
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the fromEmail value for this ApiMessage.
     * 
     * @return fromEmail
     */
    public java.lang.String getFromEmail() {
        return fromEmail;
    }


    /**
     * Sets the fromEmail value for this ApiMessage.
     * 
     * @param fromEmail
     */
    public void setFromEmail(java.lang.String fromEmail) {
        this.fromEmail = fromEmail;
    }


    /**
     * Gets the hotmailUnsubFlg value for this ApiMessage.
     * 
     * @return hotmailUnsubFlg
     */
    public boolean isHotmailUnsubFlg() {
        return hotmailUnsubFlg;
    }


    /**
     * Sets the hotmailUnsubFlg value for this ApiMessage.
     * 
     * @param hotmailUnsubFlg
     */
    public void setHotmailUnsubFlg(boolean hotmailUnsubFlg) {
        this.hotmailUnsubFlg = hotmailUnsubFlg;
    }


    /**
     * Gets the hotmailUnsubUrl value for this ApiMessage.
     * 
     * @return hotmailUnsubUrl
     */
    public java.lang.String getHotmailUnsubUrl() {
        return hotmailUnsubUrl;
    }


    /**
     * Sets the hotmailUnsubUrl value for this ApiMessage.
     * 
     * @param hotmailUnsubUrl
     */
    public void setHotmailUnsubUrl(java.lang.String hotmailUnsubUrl) {
        this.hotmailUnsubUrl = hotmailUnsubUrl;
    }


    /**
     * Gets the id value for this ApiMessage.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this ApiMessage.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the isBounceback value for this ApiMessage.
     * 
     * @return isBounceback
     */
    public boolean isIsBounceback() {
        return isBounceback;
    }


    /**
     * Sets the isBounceback value for this ApiMessage.
     * 
     * @param isBounceback
     */
    public void setIsBounceback(boolean isBounceback) {
        this.isBounceback = isBounceback;
    }


    /**
     * Gets the name value for this ApiMessage.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ApiMessage.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the replyTo value for this ApiMessage.
     * 
     * @return replyTo
     */
    public java.lang.String getReplyTo() {
        return replyTo;
    }


    /**
     * Sets the replyTo value for this ApiMessage.
     * 
     * @param replyTo
     */
    public void setReplyTo(java.lang.String replyTo) {
        this.replyTo = replyTo;
    }


    /**
     * Gets the replyToEmail value for this ApiMessage.
     * 
     * @return replyToEmail
     */
    public java.lang.String getReplyToEmail() {
        return replyToEmail;
    }


    /**
     * Sets the replyToEmail value for this ApiMessage.
     * 
     * @param replyToEmail
     */
    public void setReplyToEmail(java.lang.String replyToEmail) {
        this.replyToEmail = replyToEmail;
    }


    /**
     * Gets the subject value for this ApiMessage.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this ApiMessage.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the to value for this ApiMessage.
     * 
     * @return to
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this ApiMessage.
     * 
     * @param to
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }


    /**
     * Gets the type value for this ApiMessage.
     * 
     * @return type
     */
    public com.emailvision.apiccmd.service.api.ApiMessageType getType() {
        return type;
    }


    /**
     * Sets the type value for this ApiMessage.
     * 
     * @param type
     */
    public void setType(com.emailvision.apiccmd.service.api.ApiMessageType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiMessage)) return false;
        ApiMessage other = (ApiMessage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.encoding==null && other.getEncoding()==null) || 
             (this.encoding!=null &&
              this.encoding.equals(other.getEncoding()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.fromEmail==null && other.getFromEmail()==null) || 
             (this.fromEmail!=null &&
              this.fromEmail.equals(other.getFromEmail()))) &&
            this.hotmailUnsubFlg == other.isHotmailUnsubFlg() &&
            ((this.hotmailUnsubUrl==null && other.getHotmailUnsubUrl()==null) || 
             (this.hotmailUnsubUrl!=null &&
              this.hotmailUnsubUrl.equals(other.getHotmailUnsubUrl()))) &&
            this.id == other.getId() &&
            this.isBounceback == other.isIsBounceback() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.replyTo==null && other.getReplyTo()==null) || 
             (this.replyTo!=null &&
              this.replyTo.equals(other.getReplyTo()))) &&
            ((this.replyToEmail==null && other.getReplyToEmail()==null) || 
             (this.replyToEmail!=null &&
              this.replyToEmail.equals(other.getReplyToEmail()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEncoding() != null) {
            _hashCode += getEncoding().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getFromEmail() != null) {
            _hashCode += getFromEmail().hashCode();
        }
        _hashCode += (isHotmailUnsubFlg() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHotmailUnsubUrl() != null) {
            _hashCode += getHotmailUnsubUrl().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        _hashCode += (isIsBounceback() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getReplyTo() != null) {
            _hashCode += getReplyTo().hashCode();
        }
        if (getReplyToEmail() != null) {
            _hashCode += getReplyToEmail().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiMessage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encoding"));
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
        elemField.setFieldName("fromEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotmailUnsubFlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hotmailUnsubFlg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotmailUnsubUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hotmailUnsubUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBounceback");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isBounceback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessageType"));
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

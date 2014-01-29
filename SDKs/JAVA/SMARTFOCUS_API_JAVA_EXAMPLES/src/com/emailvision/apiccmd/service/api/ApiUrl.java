/**
 * ApiUrl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiUrl  implements java.io.Serializable {
    private java.lang.String action;

    private long messageId;

    private java.lang.Long messageIdKO;

    private java.lang.Long messageIdOK;

    private java.lang.String name;

    private long order;

    private java.lang.String pageKO;

    private java.lang.String pageOK;

    private java.lang.String parameters;

    private com.emailvision.apiccmd.service.api.ApiUrlType type;

    private java.lang.String url;

    public ApiUrl() {
    }

    public ApiUrl(
           java.lang.String action,
           long messageId,
           java.lang.Long messageIdKO,
           java.lang.Long messageIdOK,
           java.lang.String name,
           long order,
           java.lang.String pageKO,
           java.lang.String pageOK,
           java.lang.String parameters,
           com.emailvision.apiccmd.service.api.ApiUrlType type,
           java.lang.String url) {
           this.action = action;
           this.messageId = messageId;
           this.messageIdKO = messageIdKO;
           this.messageIdOK = messageIdOK;
           this.name = name;
           this.order = order;
           this.pageKO = pageKO;
           this.pageOK = pageOK;
           this.parameters = parameters;
           this.type = type;
           this.url = url;
    }


    /**
     * Gets the action value for this ApiUrl.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this ApiUrl.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the messageId value for this ApiUrl.
     * 
     * @return messageId
     */
    public long getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this ApiUrl.
     * 
     * @param messageId
     */
    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the messageIdKO value for this ApiUrl.
     * 
     * @return messageIdKO
     */
    public java.lang.Long getMessageIdKO() {
        return messageIdKO;
    }


    /**
     * Sets the messageIdKO value for this ApiUrl.
     * 
     * @param messageIdKO
     */
    public void setMessageIdKO(java.lang.Long messageIdKO) {
        this.messageIdKO = messageIdKO;
    }


    /**
     * Gets the messageIdOK value for this ApiUrl.
     * 
     * @return messageIdOK
     */
    public java.lang.Long getMessageIdOK() {
        return messageIdOK;
    }


    /**
     * Sets the messageIdOK value for this ApiUrl.
     * 
     * @param messageIdOK
     */
    public void setMessageIdOK(java.lang.Long messageIdOK) {
        this.messageIdOK = messageIdOK;
    }


    /**
     * Gets the name value for this ApiUrl.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ApiUrl.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the order value for this ApiUrl.
     * 
     * @return order
     */
    public long getOrder() {
        return order;
    }


    /**
     * Sets the order value for this ApiUrl.
     * 
     * @param order
     */
    public void setOrder(long order) {
        this.order = order;
    }


    /**
     * Gets the pageKO value for this ApiUrl.
     * 
     * @return pageKO
     */
    public java.lang.String getPageKO() {
        return pageKO;
    }


    /**
     * Sets the pageKO value for this ApiUrl.
     * 
     * @param pageKO
     */
    public void setPageKO(java.lang.String pageKO) {
        this.pageKO = pageKO;
    }


    /**
     * Gets the pageOK value for this ApiUrl.
     * 
     * @return pageOK
     */
    public java.lang.String getPageOK() {
        return pageOK;
    }


    /**
     * Sets the pageOK value for this ApiUrl.
     * 
     * @param pageOK
     */
    public void setPageOK(java.lang.String pageOK) {
        this.pageOK = pageOK;
    }


    /**
     * Gets the parameters value for this ApiUrl.
     * 
     * @return parameters
     */
    public java.lang.String getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this ApiUrl.
     * 
     * @param parameters
     */
    public void setParameters(java.lang.String parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the type value for this ApiUrl.
     * 
     * @return type
     */
    public com.emailvision.apiccmd.service.api.ApiUrlType getType() {
        return type;
    }


    /**
     * Sets the type value for this ApiUrl.
     * 
     * @param type
     */
    public void setType(com.emailvision.apiccmd.service.api.ApiUrlType type) {
        this.type = type;
    }


    /**
     * Gets the url value for this ApiUrl.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this ApiUrl.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiUrl)) return false;
        ApiUrl other = (ApiUrl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            this.messageId == other.getMessageId() &&
            ((this.messageIdKO==null && other.getMessageIdKO()==null) || 
             (this.messageIdKO!=null &&
              this.messageIdKO.equals(other.getMessageIdKO()))) &&
            ((this.messageIdOK==null && other.getMessageIdOK()==null) || 
             (this.messageIdOK!=null &&
              this.messageIdOK.equals(other.getMessageIdOK()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.order == other.getOrder() &&
            ((this.pageKO==null && other.getPageKO()==null) || 
             (this.pageKO!=null &&
              this.pageKO.equals(other.getPageKO()))) &&
            ((this.pageOK==null && other.getPageOK()==null) || 
             (this.pageOK!=null &&
              this.pageOK.equals(other.getPageOK()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              this.parameters.equals(other.getParameters()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        _hashCode += new Long(getMessageId()).hashCode();
        if (getMessageIdKO() != null) {
            _hashCode += getMessageIdKO().hashCode();
        }
        if (getMessageIdOK() != null) {
            _hashCode += getMessageIdOK().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Long(getOrder()).hashCode();
        if (getPageKO() != null) {
            _hashCode += getPageKO().hashCode();
        }
        if (getPageOK() != null) {
            _hashCode += getPageOK().hashCode();
        }
        if (getParameters() != null) {
            _hashCode += getParameters().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiUrl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiUrl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageIdKO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageIdKO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageIdOK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageIdOK"));
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
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageKO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageKO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageOK");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageOK"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiUrlType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
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

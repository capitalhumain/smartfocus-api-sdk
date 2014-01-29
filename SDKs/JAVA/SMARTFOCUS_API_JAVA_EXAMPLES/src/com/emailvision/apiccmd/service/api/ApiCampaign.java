/**
 * ApiCampaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiCampaign  implements java.io.Serializable {
    private boolean analytics;

    private int deliverySpeed;

    private java.lang.String description;

    private boolean emaildedupflg;

    private java.lang.String format;

    private long id;

    private com.emailvision.apiccmd.service.api.ApiLifeStatus lifeStatus;

    private long mailinglistId;

    private java.lang.Long messageId;

    private java.lang.String name;

    private boolean notification;

    private boolean postClickTracking;

    private java.lang.Long[] segmentIds;

    private java.util.Calendar sendDate;

    private com.emailvision.apiccmd.service.api.ApiCampaignStatus status;

    private java.lang.String strategy;

    private java.lang.String target;

    private java.lang.String urlEndCampaign;

    private java.lang.String urlHost;

    private com.emailvision.apiccmd.service.api.ApiValidStatus valid;

    public ApiCampaign() {
    }

    public ApiCampaign(
           boolean analytics,
           int deliverySpeed,
           java.lang.String description,
           boolean emaildedupflg,
           java.lang.String format,
           long id,
           com.emailvision.apiccmd.service.api.ApiLifeStatus lifeStatus,
           long mailinglistId,
           java.lang.Long messageId,
           java.lang.String name,
           boolean notification,
           boolean postClickTracking,
           java.lang.Long[] segmentIds,
           java.util.Calendar sendDate,
           com.emailvision.apiccmd.service.api.ApiCampaignStatus status,
           java.lang.String strategy,
           java.lang.String target,
           java.lang.String urlEndCampaign,
           java.lang.String urlHost,
           com.emailvision.apiccmd.service.api.ApiValidStatus valid) {
           this.analytics = analytics;
           this.deliverySpeed = deliverySpeed;
           this.description = description;
           this.emaildedupflg = emaildedupflg;
           this.format = format;
           this.id = id;
           this.lifeStatus = lifeStatus;
           this.mailinglistId = mailinglistId;
           this.messageId = messageId;
           this.name = name;
           this.notification = notification;
           this.postClickTracking = postClickTracking;
           this.segmentIds = segmentIds;
           this.sendDate = sendDate;
           this.status = status;
           this.strategy = strategy;
           this.target = target;
           this.urlEndCampaign = urlEndCampaign;
           this.urlHost = urlHost;
           this.valid = valid;
    }


    /**
     * Gets the analytics value for this ApiCampaign.
     * 
     * @return analytics
     */
    public boolean isAnalytics() {
        return analytics;
    }


    /**
     * Sets the analytics value for this ApiCampaign.
     * 
     * @param analytics
     */
    public void setAnalytics(boolean analytics) {
        this.analytics = analytics;
    }


    /**
     * Gets the deliverySpeed value for this ApiCampaign.
     * 
     * @return deliverySpeed
     */
    public int getDeliverySpeed() {
        return deliverySpeed;
    }


    /**
     * Sets the deliverySpeed value for this ApiCampaign.
     * 
     * @param deliverySpeed
     */
    public void setDeliverySpeed(int deliverySpeed) {
        this.deliverySpeed = deliverySpeed;
    }


    /**
     * Gets the description value for this ApiCampaign.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ApiCampaign.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the emaildedupflg value for this ApiCampaign.
     * 
     * @return emaildedupflg
     */
    public boolean isEmaildedupflg() {
        return emaildedupflg;
    }


    /**
     * Sets the emaildedupflg value for this ApiCampaign.
     * 
     * @param emaildedupflg
     */
    public void setEmaildedupflg(boolean emaildedupflg) {
        this.emaildedupflg = emaildedupflg;
    }


    /**
     * Gets the format value for this ApiCampaign.
     * 
     * @return format
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this ApiCampaign.
     * 
     * @param format
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the id value for this ApiCampaign.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this ApiCampaign.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the lifeStatus value for this ApiCampaign.
     * 
     * @return lifeStatus
     */
    public com.emailvision.apiccmd.service.api.ApiLifeStatus getLifeStatus() {
        return lifeStatus;
    }


    /**
     * Sets the lifeStatus value for this ApiCampaign.
     * 
     * @param lifeStatus
     */
    public void setLifeStatus(com.emailvision.apiccmd.service.api.ApiLifeStatus lifeStatus) {
        this.lifeStatus = lifeStatus;
    }


    /**
     * Gets the mailinglistId value for this ApiCampaign.
     * 
     * @return mailinglistId
     */
    public long getMailinglistId() {
        return mailinglistId;
    }


    /**
     * Sets the mailinglistId value for this ApiCampaign.
     * 
     * @param mailinglistId
     */
    public void setMailinglistId(long mailinglistId) {
        this.mailinglistId = mailinglistId;
    }


    /**
     * Gets the messageId value for this ApiCampaign.
     * 
     * @return messageId
     */
    public java.lang.Long getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this ApiCampaign.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Long messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the name value for this ApiCampaign.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ApiCampaign.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the notification value for this ApiCampaign.
     * 
     * @return notification
     */
    public boolean isNotification() {
        return notification;
    }


    /**
     * Sets the notification value for this ApiCampaign.
     * 
     * @param notification
     */
    public void setNotification(boolean notification) {
        this.notification = notification;
    }


    /**
     * Gets the postClickTracking value for this ApiCampaign.
     * 
     * @return postClickTracking
     */
    public boolean isPostClickTracking() {
        return postClickTracking;
    }


    /**
     * Sets the postClickTracking value for this ApiCampaign.
     * 
     * @param postClickTracking
     */
    public void setPostClickTracking(boolean postClickTracking) {
        this.postClickTracking = postClickTracking;
    }


    /**
     * Gets the segmentIds value for this ApiCampaign.
     * 
     * @return segmentIds
     */
    public java.lang.Long[] getSegmentIds() {
        return segmentIds;
    }


    /**
     * Sets the segmentIds value for this ApiCampaign.
     * 
     * @param segmentIds
     */
    public void setSegmentIds(java.lang.Long[] segmentIds) {
        this.segmentIds = segmentIds;
    }

    public java.lang.Long getSegmentIds(int i) {
        return this.segmentIds[i];
    }

    public void setSegmentIds(int i, java.lang.Long _value) {
        this.segmentIds[i] = _value;
    }


    /**
     * Gets the sendDate value for this ApiCampaign.
     * 
     * @return sendDate
     */
    public java.util.Calendar getSendDate() {
        return sendDate;
    }


    /**
     * Sets the sendDate value for this ApiCampaign.
     * 
     * @param sendDate
     */
    public void setSendDate(java.util.Calendar sendDate) {
        this.sendDate = sendDate;
    }


    /**
     * Gets the status value for this ApiCampaign.
     * 
     * @return status
     */
    public com.emailvision.apiccmd.service.api.ApiCampaignStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ApiCampaign.
     * 
     * @param status
     */
    public void setStatus(com.emailvision.apiccmd.service.api.ApiCampaignStatus status) {
        this.status = status;
    }


    /**
     * Gets the strategy value for this ApiCampaign.
     * 
     * @return strategy
     */
    public java.lang.String getStrategy() {
        return strategy;
    }


    /**
     * Sets the strategy value for this ApiCampaign.
     * 
     * @param strategy
     */
    public void setStrategy(java.lang.String strategy) {
        this.strategy = strategy;
    }


    /**
     * Gets the target value for this ApiCampaign.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this ApiCampaign.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the urlEndCampaign value for this ApiCampaign.
     * 
     * @return urlEndCampaign
     */
    public java.lang.String getUrlEndCampaign() {
        return urlEndCampaign;
    }


    /**
     * Sets the urlEndCampaign value for this ApiCampaign.
     * 
     * @param urlEndCampaign
     */
    public void setUrlEndCampaign(java.lang.String urlEndCampaign) {
        this.urlEndCampaign = urlEndCampaign;
    }


    /**
     * Gets the urlHost value for this ApiCampaign.
     * 
     * @return urlHost
     */
    public java.lang.String getUrlHost() {
        return urlHost;
    }


    /**
     * Sets the urlHost value for this ApiCampaign.
     * 
     * @param urlHost
     */
    public void setUrlHost(java.lang.String urlHost) {
        this.urlHost = urlHost;
    }


    /**
     * Gets the valid value for this ApiCampaign.
     * 
     * @return valid
     */
    public com.emailvision.apiccmd.service.api.ApiValidStatus getValid() {
        return valid;
    }


    /**
     * Sets the valid value for this ApiCampaign.
     * 
     * @param valid
     */
    public void setValid(com.emailvision.apiccmd.service.api.ApiValidStatus valid) {
        this.valid = valid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiCampaign)) return false;
        ApiCampaign other = (ApiCampaign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.analytics == other.isAnalytics() &&
            this.deliverySpeed == other.getDeliverySpeed() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.emaildedupflg == other.isEmaildedupflg() &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            this.id == other.getId() &&
            ((this.lifeStatus==null && other.getLifeStatus()==null) || 
             (this.lifeStatus!=null &&
              this.lifeStatus.equals(other.getLifeStatus()))) &&
            this.mailinglistId == other.getMailinglistId() &&
            ((this.messageId==null && other.getMessageId()==null) || 
             (this.messageId!=null &&
              this.messageId.equals(other.getMessageId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.notification == other.isNotification() &&
            this.postClickTracking == other.isPostClickTracking() &&
            ((this.segmentIds==null && other.getSegmentIds()==null) || 
             (this.segmentIds!=null &&
              java.util.Arrays.equals(this.segmentIds, other.getSegmentIds()))) &&
            ((this.sendDate==null && other.getSendDate()==null) || 
             (this.sendDate!=null &&
              this.sendDate.equals(other.getSendDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.strategy==null && other.getStrategy()==null) || 
             (this.strategy!=null &&
              this.strategy.equals(other.getStrategy()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.urlEndCampaign==null && other.getUrlEndCampaign()==null) || 
             (this.urlEndCampaign!=null &&
              this.urlEndCampaign.equals(other.getUrlEndCampaign()))) &&
            ((this.urlHost==null && other.getUrlHost()==null) || 
             (this.urlHost!=null &&
              this.urlHost.equals(other.getUrlHost()))) &&
            ((this.valid==null && other.getValid()==null) || 
             (this.valid!=null &&
              this.valid.equals(other.getValid())));
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
        _hashCode += (isAnalytics() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getDeliverySpeed();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isEmaildedupflg() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getLifeStatus() != null) {
            _hashCode += getLifeStatus().hashCode();
        }
        _hashCode += new Long(getMailinglistId()).hashCode();
        if (getMessageId() != null) {
            _hashCode += getMessageId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isNotification() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPostClickTracking() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSegmentIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegmentIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegmentIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSendDate() != null) {
            _hashCode += getSendDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getStrategy() != null) {
            _hashCode += getStrategy().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getUrlEndCampaign() != null) {
            _hashCode += getUrlEndCampaign().hashCode();
        }
        if (getUrlHost() != null) {
            _hashCode += getUrlHost().hashCode();
        }
        if (getValid() != null) {
            _hashCode += getValid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiCampaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaign"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("analytics");
        elemField.setXmlName(new javax.xml.namespace.QName("", "analytics"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deliverySpeed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deliverySpeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("emaildedupflg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emaildedupflg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "format"));
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
        elemField.setFieldName("lifeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiLifeStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailinglistId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailinglistId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("notification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postClickTracking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postClickTracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("strategy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strategy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlEndCampaign");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlEndCampaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlHost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlHost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiValidStatus"));
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

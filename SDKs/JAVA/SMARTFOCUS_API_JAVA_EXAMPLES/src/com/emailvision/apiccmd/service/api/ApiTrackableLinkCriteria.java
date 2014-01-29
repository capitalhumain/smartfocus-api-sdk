/**
 * ApiTrackableLinkCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiTrackableLinkCriteria  extends com.emailvision.apiccmd.service.api.ApiSegmentationCriteria  implements java.io.Serializable {
    private long campaignId;

    private long linkOrder;

    private int messageOrder;

    private com.emailvision.apiccmd.service.api.ApiTrackableLinkOperator operator;

    private int periodDayBegin;

    private int periodDayEnd;

    private long serieId;

    public ApiTrackableLinkCriteria() {
    }

    public ApiTrackableLinkCriteria(
           java.lang.String groupName,
           int groupNumber,
           long id,
           int orderFrag,
           long campaignId,
           long linkOrder,
           int messageOrder,
           com.emailvision.apiccmd.service.api.ApiTrackableLinkOperator operator,
           int periodDayBegin,
           int periodDayEnd,
           long serieId) {
        super(
            groupName,
            groupNumber,
            id,
            orderFrag);
        this.campaignId = campaignId;
        this.linkOrder = linkOrder;
        this.messageOrder = messageOrder;
        this.operator = operator;
        this.periodDayBegin = periodDayBegin;
        this.periodDayEnd = periodDayEnd;
        this.serieId = serieId;
    }


    /**
     * Gets the campaignId value for this ApiTrackableLinkCriteria.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this ApiTrackableLinkCriteria.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the linkOrder value for this ApiTrackableLinkCriteria.
     * 
     * @return linkOrder
     */
    public long getLinkOrder() {
        return linkOrder;
    }


    /**
     * Sets the linkOrder value for this ApiTrackableLinkCriteria.
     * 
     * @param linkOrder
     */
    public void setLinkOrder(long linkOrder) {
        this.linkOrder = linkOrder;
    }


    /**
     * Gets the messageOrder value for this ApiTrackableLinkCriteria.
     * 
     * @return messageOrder
     */
    public int getMessageOrder() {
        return messageOrder;
    }


    /**
     * Sets the messageOrder value for this ApiTrackableLinkCriteria.
     * 
     * @param messageOrder
     */
    public void setMessageOrder(int messageOrder) {
        this.messageOrder = messageOrder;
    }


    /**
     * Gets the operator value for this ApiTrackableLinkCriteria.
     * 
     * @return operator
     */
    public com.emailvision.apiccmd.service.api.ApiTrackableLinkOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ApiTrackableLinkCriteria.
     * 
     * @param operator
     */
    public void setOperator(com.emailvision.apiccmd.service.api.ApiTrackableLinkOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the periodDayBegin value for this ApiTrackableLinkCriteria.
     * 
     * @return periodDayBegin
     */
    public int getPeriodDayBegin() {
        return periodDayBegin;
    }


    /**
     * Sets the periodDayBegin value for this ApiTrackableLinkCriteria.
     * 
     * @param periodDayBegin
     */
    public void setPeriodDayBegin(int periodDayBegin) {
        this.periodDayBegin = periodDayBegin;
    }


    /**
     * Gets the periodDayEnd value for this ApiTrackableLinkCriteria.
     * 
     * @return periodDayEnd
     */
    public int getPeriodDayEnd() {
        return periodDayEnd;
    }


    /**
     * Sets the periodDayEnd value for this ApiTrackableLinkCriteria.
     * 
     * @param periodDayEnd
     */
    public void setPeriodDayEnd(int periodDayEnd) {
        this.periodDayEnd = periodDayEnd;
    }


    /**
     * Gets the serieId value for this ApiTrackableLinkCriteria.
     * 
     * @return serieId
     */
    public long getSerieId() {
        return serieId;
    }


    /**
     * Sets the serieId value for this ApiTrackableLinkCriteria.
     * 
     * @param serieId
     */
    public void setSerieId(long serieId) {
        this.serieId = serieId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiTrackableLinkCriteria)) return false;
        ApiTrackableLinkCriteria other = (ApiTrackableLinkCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.campaignId == other.getCampaignId() &&
            this.linkOrder == other.getLinkOrder() &&
            this.messageOrder == other.getMessageOrder() &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            this.periodDayBegin == other.getPeriodDayBegin() &&
            this.periodDayEnd == other.getPeriodDayEnd() &&
            this.serieId == other.getSerieId();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        _hashCode += new Long(getCampaignId()).hashCode();
        _hashCode += new Long(getLinkOrder()).hashCode();
        _hashCode += getMessageOrder();
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        _hashCode += getPeriodDayBegin();
        _hashCode += getPeriodDayEnd();
        _hashCode += new Long(getSerieId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiTrackableLinkCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTrackableLinkCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTrackableLinkOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodDayBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodDayBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodDayEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodDayEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serieId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serieId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

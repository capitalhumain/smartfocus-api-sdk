/**
 * ApiSocialNetworkCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiSocialNetworkCriteria  extends com.emailvision.apiccmd.service.api.ApiSegmentationCriteria  implements java.io.Serializable {
    private long campaignId;

    private com.emailvision.apiccmd.service.api.ApiSocialNetworkColumn columnName;

    private int messageOrder;

    private com.emailvision.apiccmd.service.api.ApiSocialNetworkOperator operator;

    private long serieId;

    private java.lang.String snIds;

    private long value1;

    private long value2;

    public ApiSocialNetworkCriteria() {
    }

    public ApiSocialNetworkCriteria(
           java.lang.String groupName,
           int groupNumber,
           long id,
           int orderFrag,
           long campaignId,
           com.emailvision.apiccmd.service.api.ApiSocialNetworkColumn columnName,
           int messageOrder,
           com.emailvision.apiccmd.service.api.ApiSocialNetworkOperator operator,
           long serieId,
           java.lang.String snIds,
           long value1,
           long value2) {
        super(
            groupName,
            groupNumber,
            id,
            orderFrag);
        this.campaignId = campaignId;
        this.columnName = columnName;
        this.messageOrder = messageOrder;
        this.operator = operator;
        this.serieId = serieId;
        this.snIds = snIds;
        this.value1 = value1;
        this.value2 = value2;
    }


    /**
     * Gets the campaignId value for this ApiSocialNetworkCriteria.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this ApiSocialNetworkCriteria.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the columnName value for this ApiSocialNetworkCriteria.
     * 
     * @return columnName
     */
    public com.emailvision.apiccmd.service.api.ApiSocialNetworkColumn getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this ApiSocialNetworkCriteria.
     * 
     * @param columnName
     */
    public void setColumnName(com.emailvision.apiccmd.service.api.ApiSocialNetworkColumn columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the messageOrder value for this ApiSocialNetworkCriteria.
     * 
     * @return messageOrder
     */
    public int getMessageOrder() {
        return messageOrder;
    }


    /**
     * Sets the messageOrder value for this ApiSocialNetworkCriteria.
     * 
     * @param messageOrder
     */
    public void setMessageOrder(int messageOrder) {
        this.messageOrder = messageOrder;
    }


    /**
     * Gets the operator value for this ApiSocialNetworkCriteria.
     * 
     * @return operator
     */
    public com.emailvision.apiccmd.service.api.ApiSocialNetworkOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ApiSocialNetworkCriteria.
     * 
     * @param operator
     */
    public void setOperator(com.emailvision.apiccmd.service.api.ApiSocialNetworkOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the serieId value for this ApiSocialNetworkCriteria.
     * 
     * @return serieId
     */
    public long getSerieId() {
        return serieId;
    }


    /**
     * Sets the serieId value for this ApiSocialNetworkCriteria.
     * 
     * @param serieId
     */
    public void setSerieId(long serieId) {
        this.serieId = serieId;
    }


    /**
     * Gets the snIds value for this ApiSocialNetworkCriteria.
     * 
     * @return snIds
     */
    public java.lang.String getSnIds() {
        return snIds;
    }


    /**
     * Sets the snIds value for this ApiSocialNetworkCriteria.
     * 
     * @param snIds
     */
    public void setSnIds(java.lang.String snIds) {
        this.snIds = snIds;
    }


    /**
     * Gets the value1 value for this ApiSocialNetworkCriteria.
     * 
     * @return value1
     */
    public long getValue1() {
        return value1;
    }


    /**
     * Sets the value1 value for this ApiSocialNetworkCriteria.
     * 
     * @param value1
     */
    public void setValue1(long value1) {
        this.value1 = value1;
    }


    /**
     * Gets the value2 value for this ApiSocialNetworkCriteria.
     * 
     * @return value2
     */
    public long getValue2() {
        return value2;
    }


    /**
     * Sets the value2 value for this ApiSocialNetworkCriteria.
     * 
     * @param value2
     */
    public void setValue2(long value2) {
        this.value2 = value2;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiSocialNetworkCriteria)) return false;
        ApiSocialNetworkCriteria other = (ApiSocialNetworkCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.campaignId == other.getCampaignId() &&
            ((this.columnName==null && other.getColumnName()==null) || 
             (this.columnName!=null &&
              this.columnName.equals(other.getColumnName()))) &&
            this.messageOrder == other.getMessageOrder() &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            this.serieId == other.getSerieId() &&
            ((this.snIds==null && other.getSnIds()==null) || 
             (this.snIds!=null &&
              this.snIds.equals(other.getSnIds()))) &&
            this.value1 == other.getValue1() &&
            this.value2 == other.getValue2();
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
        if (getColumnName() != null) {
            _hashCode += getColumnName().hashCode();
        }
        _hashCode += getMessageOrder();
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        _hashCode += new Long(getSerieId()).hashCode();
        if (getSnIds() != null) {
            _hashCode += getSnIds().hashCode();
        }
        _hashCode += new Long(getValue1()).hashCode();
        _hashCode += new Long(getValue2()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiSocialNetworkCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSocialNetworkCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSocialNetworkColumn"));
        elemField.setMinOccurs(0);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSocialNetworkOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serieId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serieId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snIds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value2"));
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

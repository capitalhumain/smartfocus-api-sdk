/**
 * ApiCampaignCriteriaColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiCampaignCriteriaColumn implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiCampaignCriteriaColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _campaignId = "campaignId";
    public static final java.lang.String _name = "name";
    public static final java.lang.String _status = "status";
    public static final java.lang.String _sendDate = "sendDate";
    public static final java.lang.String _messageId = "messageId";
    public static final ApiCampaignCriteriaColumn campaignId = new ApiCampaignCriteriaColumn(_campaignId);
    public static final ApiCampaignCriteriaColumn name = new ApiCampaignCriteriaColumn(_name);
    public static final ApiCampaignCriteriaColumn status = new ApiCampaignCriteriaColumn(_status);
    public static final ApiCampaignCriteriaColumn sendDate = new ApiCampaignCriteriaColumn(_sendDate);
    public static final ApiCampaignCriteriaColumn messageId = new ApiCampaignCriteriaColumn(_messageId);
    public java.lang.String getValue() { return _value_;}
    public static ApiCampaignCriteriaColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiCampaignCriteriaColumn enumeration = (ApiCampaignCriteriaColumn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiCampaignCriteriaColumn fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiCampaignCriteriaColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignCriteriaColumn"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

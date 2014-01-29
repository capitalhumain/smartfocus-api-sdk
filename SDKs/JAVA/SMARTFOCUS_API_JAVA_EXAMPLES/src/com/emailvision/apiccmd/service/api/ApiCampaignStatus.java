/**
 * ApiCampaignStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiCampaignStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiCampaignStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EDITABLE = "EDITABLE";
    public static final java.lang.String _QUEUED = "QUEUED";
    public static final java.lang.String _RUNNING = "RUNNING";
    public static final java.lang.String _PAUSED = "PAUSED";
    public static final java.lang.String _COMPLETED = "COMPLETED";
    public static final java.lang.String _FAILED = "FAILED";
    public static final java.lang.String _KILLED = "KILLED";
    public static final ApiCampaignStatus EDITABLE = new ApiCampaignStatus(_EDITABLE);
    public static final ApiCampaignStatus QUEUED = new ApiCampaignStatus(_QUEUED);
    public static final ApiCampaignStatus RUNNING = new ApiCampaignStatus(_RUNNING);
    public static final ApiCampaignStatus PAUSED = new ApiCampaignStatus(_PAUSED);
    public static final ApiCampaignStatus COMPLETED = new ApiCampaignStatus(_COMPLETED);
    public static final ApiCampaignStatus FAILED = new ApiCampaignStatus(_FAILED);
    public static final ApiCampaignStatus KILLED = new ApiCampaignStatus(_KILLED);
    public java.lang.String getValue() { return _value_;}
    public static ApiCampaignStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiCampaignStatus enumeration = (ApiCampaignStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiCampaignStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiCampaignStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

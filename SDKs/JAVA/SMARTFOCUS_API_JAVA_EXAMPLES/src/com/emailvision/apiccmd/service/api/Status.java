/**
 * Status.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class Status implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Status(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _INVALID_CELLPHONE = "INVALID_CELLPHONE";
    public static final java.lang.String _SMS_HTTP_ERROR = "SMS_HTTP_ERROR";
    public static final java.lang.String _SMTP_ERROR = "SMTP_ERROR";
    public static final java.lang.String _INVALID_EMAIL = "INVALID_EMAIL";
    public static final java.lang.String _FORMAT_FAILURE = "FORMAT_FAILURE";
    public static final java.lang.String _FILTERED_MARKPRES = "FILTERED_MARKPRES";
    public static final java.lang.String _FILTERED_EMAILDEDUP = "FILTERED_EMAILDEDUP";
    public static final java.lang.String _SOFT_BOUNCE = "SOFT_BOUNCE";
    public static final java.lang.String _HARD_BOUNCE = "HARD_BOUNCE";
    public static final java.lang.String _SENT = "SENT";
    public static final java.lang.String _OPEN = "OPEN";
    public static final java.lang.String _REGULAR = "REGULAR";
    public static final java.lang.String _CONVERT = "CONVERT";
    public static final java.lang.String _SMS_SENT_TO_OPERATOR = "SMS_SENT_TO_OPERATOR";
    public static final java.lang.String _SMS_DELIVERED = "SMS_DELIVERED";
    public static final Status INVALID_CELLPHONE = new Status(_INVALID_CELLPHONE);
    public static final Status SMS_HTTP_ERROR = new Status(_SMS_HTTP_ERROR);
    public static final Status SMTP_ERROR = new Status(_SMTP_ERROR);
    public static final Status INVALID_EMAIL = new Status(_INVALID_EMAIL);
    public static final Status FORMAT_FAILURE = new Status(_FORMAT_FAILURE);
    public static final Status FILTERED_MARKPRES = new Status(_FILTERED_MARKPRES);
    public static final Status FILTERED_EMAILDEDUP = new Status(_FILTERED_EMAILDEDUP);
    public static final Status SOFT_BOUNCE = new Status(_SOFT_BOUNCE);
    public static final Status HARD_BOUNCE = new Status(_HARD_BOUNCE);
    public static final Status SENT = new Status(_SENT);
    public static final Status OPEN = new Status(_OPEN);
    public static final Status REGULAR = new Status(_REGULAR);
    public static final Status CONVERT = new Status(_CONVERT);
    public static final Status SMS_SENT_TO_OPERATOR = new Status(_SMS_SENT_TO_OPERATOR);
    public static final Status SMS_DELIVERED = new Status(_SMS_DELIVERED);
    public java.lang.String getValue() { return _value_;}
    public static Status fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Status enumeration = (Status)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Status fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Status.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "status"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

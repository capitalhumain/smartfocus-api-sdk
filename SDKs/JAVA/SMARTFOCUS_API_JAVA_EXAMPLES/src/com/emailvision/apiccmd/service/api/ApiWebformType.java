/**
 * ApiWebformType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiWebformType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiWebformType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SUBSCRIBE = "SUBSCRIBE";
    public static final java.lang.String _SUBSCRIBE_WITH_DUPLICATE_EMAILS = "SUBSCRIBE_WITH_DUPLICATE_EMAILS";
    public static final java.lang.String _SUBSCRIBE_OR_UPDATE = "SUBSCRIBE_OR_UPDATE";
    public static final java.lang.String _UPDATE = "UPDATE";
    public static final java.lang.String _UPDATE_WITH_MULTIPLE_KEYS = "UPDATE_WITH_MULTIPLE_KEYS";
    public static final java.lang.String _UNSUBSCRIBE = "UNSUBSCRIBE";
    public static final ApiWebformType SUBSCRIBE = new ApiWebformType(_SUBSCRIBE);
    public static final ApiWebformType SUBSCRIBE_WITH_DUPLICATE_EMAILS = new ApiWebformType(_SUBSCRIBE_WITH_DUPLICATE_EMAILS);
    public static final ApiWebformType SUBSCRIBE_OR_UPDATE = new ApiWebformType(_SUBSCRIBE_OR_UPDATE);
    public static final ApiWebformType UPDATE = new ApiWebformType(_UPDATE);
    public static final ApiWebformType UPDATE_WITH_MULTIPLE_KEYS = new ApiWebformType(_UPDATE_WITH_MULTIPLE_KEYS);
    public static final ApiWebformType UNSUBSCRIBE = new ApiWebformType(_UNSUBSCRIBE);
    public java.lang.String getValue() { return _value_;}
    public static ApiWebformType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiWebformType enumeration = (ApiWebformType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiWebformType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiWebformType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

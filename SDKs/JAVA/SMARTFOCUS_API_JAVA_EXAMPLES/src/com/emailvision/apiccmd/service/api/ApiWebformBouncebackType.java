/**
 * ApiWebformBouncebackType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiWebformBouncebackType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiWebformBouncebackType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO_CONFIRMATION = "NO_CONFIRMATION";
    public static final java.lang.String _USER = "USER";
    public static final java.lang.String _CUSTOMER_SERVICE = "CUSTOMER_SERVICE";
    public static final java.lang.String _USER_AND_CUSTOMER_SERVICE = "USER_AND_CUSTOMER_SERVICE";
    public static final ApiWebformBouncebackType NO_CONFIRMATION = new ApiWebformBouncebackType(_NO_CONFIRMATION);
    public static final ApiWebformBouncebackType USER = new ApiWebformBouncebackType(_USER);
    public static final ApiWebformBouncebackType CUSTOMER_SERVICE = new ApiWebformBouncebackType(_CUSTOMER_SERVICE);
    public static final ApiWebformBouncebackType USER_AND_CUSTOMER_SERVICE = new ApiWebformBouncebackType(_USER_AND_CUSTOMER_SERVICE);
    public java.lang.String getValue() { return _value_;}
    public static ApiWebformBouncebackType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiWebformBouncebackType enumeration = (ApiWebformBouncebackType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiWebformBouncebackType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiWebformBouncebackType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformBouncebackType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * ApiSegmentationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiSegmentationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiSegmentationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COMBINED = "COMBINED";
    public static final java.lang.String _BASIC = "BASIC";
    public static final java.lang.String _MESSAGE = "MESSAGE";
    public static final java.lang.String _TRACKED_URL = "TRACKED_URL";
    public static final java.lang.String _SQL = "SQL";
    public static final ApiSegmentationType COMBINED = new ApiSegmentationType(_COMBINED);
    public static final ApiSegmentationType BASIC = new ApiSegmentationType(_BASIC);
    public static final ApiSegmentationType MESSAGE = new ApiSegmentationType(_MESSAGE);
    public static final ApiSegmentationType TRACKED_URL = new ApiSegmentationType(_TRACKED_URL);
    public static final ApiSegmentationType SQL = new ApiSegmentationType(_SQL);
    public java.lang.String getValue() { return _value_;}
    public static ApiSegmentationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiSegmentationType enumeration = (ApiSegmentationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiSegmentationType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiSegmentationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegmentationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * ApiRecencyColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiRecencyColumn implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiRecencyColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LAST_DATE_PURCHASE = "LAST_DATE_PURCHASE";
    public static final java.lang.String _LAST_DATE_CLICK = "LAST_DATE_CLICK";
    public static final java.lang.String _LAST_DATE_OPEN = "LAST_DATE_OPEN";
    public static final ApiRecencyColumn LAST_DATE_PURCHASE = new ApiRecencyColumn(_LAST_DATE_PURCHASE);
    public static final ApiRecencyColumn LAST_DATE_CLICK = new ApiRecencyColumn(_LAST_DATE_CLICK);
    public static final ApiRecencyColumn LAST_DATE_OPEN = new ApiRecencyColumn(_LAST_DATE_OPEN);
    public java.lang.String getValue() { return _value_;}
    public static ApiRecencyColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiRecencyColumn enumeration = (ApiRecencyColumn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiRecencyColumn fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiRecencyColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyColumn"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

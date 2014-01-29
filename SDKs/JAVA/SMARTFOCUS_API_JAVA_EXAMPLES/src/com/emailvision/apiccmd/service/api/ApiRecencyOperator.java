/**
 * ApiRecencyOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiRecencyOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiRecencyOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ISBETWEEN_RELATIVE = "ISBETWEEN_RELATIVE";
    public static final java.lang.String _ISNOTBETWEEN_RELATIVE = "ISNOTBETWEEN_RELATIVE";
    public static final java.lang.String _ON_RELATIVE = "ON_RELATIVE";
    public static final java.lang.String _NOTON_RELATIVE = "NOTON_RELATIVE";
    public static final java.lang.String _ISBETWEEN_STATIC = "ISBETWEEN_STATIC";
    public static final java.lang.String _ISNOTBETWEEN_STATIC = "ISNOTBETWEEN_STATIC";
    public static final java.lang.String _ON_STATIC = "ON_STATIC";
    public static final java.lang.String _NOTON_STATIC = "NOTON_STATIC";
    public static final java.lang.String _BEFORE_STATIC = "BEFORE_STATIC";
    public static final java.lang.String _BEFOREORON_STATIC = "BEFOREORON_STATIC";
    public static final java.lang.String _AFTER_STATIC = "AFTER_STATIC";
    public static final java.lang.String _AFTERORON_STATIC = "AFTERORON_STATIC";
    public static final java.lang.String _EMPTY = "EMPTY";
    public static final java.lang.String _NOT_EMPTY = "NOT_EMPTY";
    public static final ApiRecencyOperator ISBETWEEN_RELATIVE = new ApiRecencyOperator(_ISBETWEEN_RELATIVE);
    public static final ApiRecencyOperator ISNOTBETWEEN_RELATIVE = new ApiRecencyOperator(_ISNOTBETWEEN_RELATIVE);
    public static final ApiRecencyOperator ON_RELATIVE = new ApiRecencyOperator(_ON_RELATIVE);
    public static final ApiRecencyOperator NOTON_RELATIVE = new ApiRecencyOperator(_NOTON_RELATIVE);
    public static final ApiRecencyOperator ISBETWEEN_STATIC = new ApiRecencyOperator(_ISBETWEEN_STATIC);
    public static final ApiRecencyOperator ISNOTBETWEEN_STATIC = new ApiRecencyOperator(_ISNOTBETWEEN_STATIC);
    public static final ApiRecencyOperator ON_STATIC = new ApiRecencyOperator(_ON_STATIC);
    public static final ApiRecencyOperator NOTON_STATIC = new ApiRecencyOperator(_NOTON_STATIC);
    public static final ApiRecencyOperator BEFORE_STATIC = new ApiRecencyOperator(_BEFORE_STATIC);
    public static final ApiRecencyOperator BEFOREORON_STATIC = new ApiRecencyOperator(_BEFOREORON_STATIC);
    public static final ApiRecencyOperator AFTER_STATIC = new ApiRecencyOperator(_AFTER_STATIC);
    public static final ApiRecencyOperator AFTERORON_STATIC = new ApiRecencyOperator(_AFTERORON_STATIC);
    public static final ApiRecencyOperator EMPTY = new ApiRecencyOperator(_EMPTY);
    public static final ApiRecencyOperator NOT_EMPTY = new ApiRecencyOperator(_NOT_EMPTY);
    public java.lang.String getValue() { return _value_;}
    public static ApiRecencyOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiRecencyOperator enumeration = (ApiRecencyOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiRecencyOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiRecencyOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

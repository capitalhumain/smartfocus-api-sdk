/**
 * ApiWebformLanguage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiWebformLanguage implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiWebformLanguage(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ENGLISH = "ENGLISH";
    public static final java.lang.String _DUTCH = "DUTCH";
    public static final java.lang.String _FRENCH = "FRENCH";
    public static final java.lang.String _GERMAN = "GERMAN";
    public static final java.lang.String _ITALIAN = "ITALIAN";
    public static final java.lang.String _SPANISH = "SPANISH";
    public static final java.lang.String _DANISH = "DANISH";
    public static final java.lang.String _SWEDISH = "SWEDISH";
    public static final java.lang.String _JAPAN = "JAPAN";
    public static final java.lang.String _CHINESE_SIMPLIFIED = "CHINESE_SIMPLIFIED";
    public static final java.lang.String _CHINESE_TRADITIONAL = "CHINESE_TRADITIONAL";
    public static final java.lang.String _PORTUGUESE_BRAZIL = "PORTUGUESE_BRAZIL";
    public static final java.lang.String _PORTUGUESE_PORTUGAL = "PORTUGUESE_PORTUGAL";
    public static final java.lang.String _RUSSIAN = "RUSSIAN";
    public static final java.lang.String _KOREAN = "KOREAN";
    public static final ApiWebformLanguage ENGLISH = new ApiWebformLanguage(_ENGLISH);
    public static final ApiWebformLanguage DUTCH = new ApiWebformLanguage(_DUTCH);
    public static final ApiWebformLanguage FRENCH = new ApiWebformLanguage(_FRENCH);
    public static final ApiWebformLanguage GERMAN = new ApiWebformLanguage(_GERMAN);
    public static final ApiWebformLanguage ITALIAN = new ApiWebformLanguage(_ITALIAN);
    public static final ApiWebformLanguage SPANISH = new ApiWebformLanguage(_SPANISH);
    public static final ApiWebformLanguage DANISH = new ApiWebformLanguage(_DANISH);
    public static final ApiWebformLanguage SWEDISH = new ApiWebformLanguage(_SWEDISH);
    public static final ApiWebformLanguage JAPAN = new ApiWebformLanguage(_JAPAN);
    public static final ApiWebformLanguage CHINESE_SIMPLIFIED = new ApiWebformLanguage(_CHINESE_SIMPLIFIED);
    public static final ApiWebformLanguage CHINESE_TRADITIONAL = new ApiWebformLanguage(_CHINESE_TRADITIONAL);
    public static final ApiWebformLanguage PORTUGUESE_BRAZIL = new ApiWebformLanguage(_PORTUGUESE_BRAZIL);
    public static final ApiWebformLanguage PORTUGUESE_PORTUGAL = new ApiWebformLanguage(_PORTUGUESE_PORTUGAL);
    public static final ApiWebformLanguage RUSSIAN = new ApiWebformLanguage(_RUSSIAN);
    public static final ApiWebformLanguage KOREAN = new ApiWebformLanguage(_KOREAN);
    public java.lang.String getValue() { return _value_;}
    public static ApiWebformLanguage fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiWebformLanguage enumeration = (ApiWebformLanguage)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiWebformLanguage fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiWebformLanguage.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformLanguage"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

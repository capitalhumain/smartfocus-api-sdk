/**
 * ApiNumericDemographicOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiNumericDemographicOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiNumericDemographicOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EQUALS = "EQUALS";
    public static final java.lang.String _NOT_EQUALS = "NOT_EQUALS";
    public static final java.lang.String _IS_EMPTY = "IS_EMPTY";
    public static final java.lang.String _IS_NOT_EMPTY = "IS_NOT_EMPTY";
    public static final java.lang.String _SUPERIOR = "SUPERIOR";
    public static final java.lang.String _SUPERIOR_OR_EQUAL = "SUPERIOR_OR_EQUAL";
    public static final java.lang.String _INFERIOR = "INFERIOR";
    public static final java.lang.String _INFERIOR_OR_EQUAL = "INFERIOR_OR_EQUAL";
    public static final java.lang.String _IS_BETWEEN = "IS_BETWEEN";
    public static final java.lang.String _NOT_BETWEEN = "NOT_BETWEEN";
    public static final ApiNumericDemographicOperator EQUALS = new ApiNumericDemographicOperator(_EQUALS);
    public static final ApiNumericDemographicOperator NOT_EQUALS = new ApiNumericDemographicOperator(_NOT_EQUALS);
    public static final ApiNumericDemographicOperator IS_EMPTY = new ApiNumericDemographicOperator(_IS_EMPTY);
    public static final ApiNumericDemographicOperator IS_NOT_EMPTY = new ApiNumericDemographicOperator(_IS_NOT_EMPTY);
    public static final ApiNumericDemographicOperator SUPERIOR = new ApiNumericDemographicOperator(_SUPERIOR);
    public static final ApiNumericDemographicOperator SUPERIOR_OR_EQUAL = new ApiNumericDemographicOperator(_SUPERIOR_OR_EQUAL);
    public static final ApiNumericDemographicOperator INFERIOR = new ApiNumericDemographicOperator(_INFERIOR);
    public static final ApiNumericDemographicOperator INFERIOR_OR_EQUAL = new ApiNumericDemographicOperator(_INFERIOR_OR_EQUAL);
    public static final ApiNumericDemographicOperator IS_BETWEEN = new ApiNumericDemographicOperator(_IS_BETWEEN);
    public static final ApiNumericDemographicOperator NOT_BETWEEN = new ApiNumericDemographicOperator(_NOT_BETWEEN);
    public java.lang.String getValue() { return _value_;}
    public static ApiNumericDemographicOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiNumericDemographicOperator enumeration = (ApiNumericDemographicOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiNumericDemographicOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiNumericDemographicOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiNumericDemographicOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

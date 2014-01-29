/**
 * ApiStringDemographicOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiStringDemographicOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiStringDemographicOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EQUALS = "EQUALS";
    public static final java.lang.String _CONTAINS = "CONTAINS";
    public static final java.lang.String _DOES_NOT_CONTAINS = "DOES_NOT_CONTAINS";
    public static final java.lang.String _BEGINS_WITH = "BEGINS_WITH";
    public static final java.lang.String _ENDS_WITH = "ENDS_WITH";
    public static final java.lang.String _IS_EMPTY = "IS_EMPTY";
    public static final java.lang.String _IS_NOT_EMPTY = "IS_NOT_EMPTY";
    public static final java.lang.String _EQUALS_CASE_SENSITIVE = "EQUALS_CASE_SENSITIVE";
    public static final java.lang.String _CONTAINS_CASE_SENSITIVE = "CONTAINS_CASE_SENSITIVE";
    public static final java.lang.String _DOES_NOT_CONTAINS_CASE_SENSITIVE = "DOES_NOT_CONTAINS_CASE_SENSITIVE";
    public static final java.lang.String _BEGINS_WITH_CASE_SENSITIVE = "BEGINS_WITH_CASE_SENSITIVE";
    public static final java.lang.String _ENDS_WITH_CASE_SENSITIVE = "ENDS_WITH_CASE_SENSITIVE";
    public static final ApiStringDemographicOperator EQUALS = new ApiStringDemographicOperator(_EQUALS);
    public static final ApiStringDemographicOperator CONTAINS = new ApiStringDemographicOperator(_CONTAINS);
    public static final ApiStringDemographicOperator DOES_NOT_CONTAINS = new ApiStringDemographicOperator(_DOES_NOT_CONTAINS);
    public static final ApiStringDemographicOperator BEGINS_WITH = new ApiStringDemographicOperator(_BEGINS_WITH);
    public static final ApiStringDemographicOperator ENDS_WITH = new ApiStringDemographicOperator(_ENDS_WITH);
    public static final ApiStringDemographicOperator IS_EMPTY = new ApiStringDemographicOperator(_IS_EMPTY);
    public static final ApiStringDemographicOperator IS_NOT_EMPTY = new ApiStringDemographicOperator(_IS_NOT_EMPTY);
    public static final ApiStringDemographicOperator EQUALS_CASE_SENSITIVE = new ApiStringDemographicOperator(_EQUALS_CASE_SENSITIVE);
    public static final ApiStringDemographicOperator CONTAINS_CASE_SENSITIVE = new ApiStringDemographicOperator(_CONTAINS_CASE_SENSITIVE);
    public static final ApiStringDemographicOperator DOES_NOT_CONTAINS_CASE_SENSITIVE = new ApiStringDemographicOperator(_DOES_NOT_CONTAINS_CASE_SENSITIVE);
    public static final ApiStringDemographicOperator BEGINS_WITH_CASE_SENSITIVE = new ApiStringDemographicOperator(_BEGINS_WITH_CASE_SENSITIVE);
    public static final ApiStringDemographicOperator ENDS_WITH_CASE_SENSITIVE = new ApiStringDemographicOperator(_ENDS_WITH_CASE_SENSITIVE);
    public java.lang.String getValue() { return _value_;}
    public static ApiStringDemographicOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiStringDemographicOperator enumeration = (ApiStringDemographicOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiStringDemographicOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiStringDemographicOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiStringDemographicOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

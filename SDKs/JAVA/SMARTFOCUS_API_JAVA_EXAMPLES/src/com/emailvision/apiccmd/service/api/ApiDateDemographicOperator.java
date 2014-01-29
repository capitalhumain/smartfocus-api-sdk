/**
 * ApiDateDemographicOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiDateDemographicOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiDateDemographicOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ABSOLUTE_AFTER_TIME_SENSITIVE = "ABSOLUTE_AFTER_TIME_SENSITIVE";
    public static final java.lang.String _ABSOLUTE_AFTER_OR_ON_TIME_SENSITIVE = "ABSOLUTE_AFTER_OR_ON_TIME_SENSITIVE";
    public static final java.lang.String _ABSOLUTE_BEFORE_TIME_SENSITIVE = "ABSOLUTE_BEFORE_TIME_SENSITIVE";
    public static final java.lang.String _ABSOLUTE_BEFORE_OR_ON_TIME_SENSITIVE = "ABSOLUTE_BEFORE_OR_ON_TIME_SENSITIVE";
    public static final java.lang.String _ABSOLUTE_IS_BETWEEN_TIME_SENSITIVE = "ABSOLUTE_IS_BETWEEN_TIME_SENSITIVE";
    public static final java.lang.String _ABSOLUTE_IS_NOT_BETWEEN_TIME_SENSITIVE = "ABSOLUTE_IS_NOT_BETWEEN_TIME_SENSITIVE";
    public static final java.lang.String _ABSOLUTE_NOT_ON_TIME_SENSITIVE = "ABSOLUTE_NOT_ON_TIME_SENSITIVE";
    public static final java.lang.String _ABSOLUTE_ON_TIME_SENSITIVE = "ABSOLUTE_ON_TIME_SENSITIVE";
    public static final java.lang.String _ABSOLUTE_AFTER = "ABSOLUTE_AFTER";
    public static final java.lang.String _ABSOLUTE_AFTER_OR_ON = "ABSOLUTE_AFTER_OR_ON";
    public static final java.lang.String _ABSOLUTE_BEFORE = "ABSOLUTE_BEFORE";
    public static final java.lang.String _ABSOLUTE_BEFORE_OR_ON = "ABSOLUTE_BEFORE_OR_ON";
    public static final java.lang.String _ABSOLUTE_IS_BETWEEN = "ABSOLUTE_IS_BETWEEN";
    public static final java.lang.String _ABSOLUTE_IS_NOT_BETWEEN = "ABSOLUTE_IS_NOT_BETWEEN";
    public static final java.lang.String _ABSOLUTE_NOT_ON = "ABSOLUTE_NOT_ON";
    public static final java.lang.String _ABSOLUTE_ON = "ABSOLUTE_ON";
    public static final java.lang.String _IS_EMPTY = "IS_EMPTY";
    public static final java.lang.String _IS_NOT_EMPTY = "IS_NOT_EMPTY";
    public static final java.lang.String _RELATIVE_AFTER_AFTER = "RELATIVE_AFTER_AFTER";
    public static final java.lang.String _RELATIVE_AFTER_BEFORE = "RELATIVE_AFTER_BEFORE";
    public static final java.lang.String _RELATIVE_AFTER_OR_ON_AFTER = "RELATIVE_AFTER_OR_ON_AFTER";
    public static final java.lang.String _RELATIVE_AFTER_OR_ON_BEFORE = "RELATIVE_AFTER_OR_ON_BEFORE";
    public static final java.lang.String _RELATIVE_BEFORE_AFTER = "RELATIVE_BEFORE_AFTER";
    public static final java.lang.String _RELATIVE_BEFORE_BEFORE = "RELATIVE_BEFORE_BEFORE";
    public static final java.lang.String _RELATIVE_BEFORE_OR_ON_AFTER = "RELATIVE_BEFORE_OR_ON_AFTER";
    public static final java.lang.String _RELATIVE_BEFORE_OR_ON_BEFORE = "RELATIVE_BEFORE_OR_ON_BEFORE";
    public static final java.lang.String _RELATIVE_NOT_ON_AFTER = "RELATIVE_NOT_ON_AFTER";
    public static final java.lang.String _RELATIVE_NOT_ON_BEFORE = "RELATIVE_NOT_ON_BEFORE";
    public static final java.lang.String _RELATIVE_ON_AFTER = "RELATIVE_ON_AFTER";
    public static final java.lang.String _RELATIVE_ON_BEFORE = "RELATIVE_ON_BEFORE";
    public static final ApiDateDemographicOperator ABSOLUTE_AFTER_TIME_SENSITIVE = new ApiDateDemographicOperator(_ABSOLUTE_AFTER_TIME_SENSITIVE);
    public static final ApiDateDemographicOperator ABSOLUTE_AFTER_OR_ON_TIME_SENSITIVE = new ApiDateDemographicOperator(_ABSOLUTE_AFTER_OR_ON_TIME_SENSITIVE);
    public static final ApiDateDemographicOperator ABSOLUTE_BEFORE_TIME_SENSITIVE = new ApiDateDemographicOperator(_ABSOLUTE_BEFORE_TIME_SENSITIVE);
    public static final ApiDateDemographicOperator ABSOLUTE_BEFORE_OR_ON_TIME_SENSITIVE = new ApiDateDemographicOperator(_ABSOLUTE_BEFORE_OR_ON_TIME_SENSITIVE);
    public static final ApiDateDemographicOperator ABSOLUTE_IS_BETWEEN_TIME_SENSITIVE = new ApiDateDemographicOperator(_ABSOLUTE_IS_BETWEEN_TIME_SENSITIVE);
    public static final ApiDateDemographicOperator ABSOLUTE_IS_NOT_BETWEEN_TIME_SENSITIVE = new ApiDateDemographicOperator(_ABSOLUTE_IS_NOT_BETWEEN_TIME_SENSITIVE);
    public static final ApiDateDemographicOperator ABSOLUTE_NOT_ON_TIME_SENSITIVE = new ApiDateDemographicOperator(_ABSOLUTE_NOT_ON_TIME_SENSITIVE);
    public static final ApiDateDemographicOperator ABSOLUTE_ON_TIME_SENSITIVE = new ApiDateDemographicOperator(_ABSOLUTE_ON_TIME_SENSITIVE);
    public static final ApiDateDemographicOperator ABSOLUTE_AFTER = new ApiDateDemographicOperator(_ABSOLUTE_AFTER);
    public static final ApiDateDemographicOperator ABSOLUTE_AFTER_OR_ON = new ApiDateDemographicOperator(_ABSOLUTE_AFTER_OR_ON);
    public static final ApiDateDemographicOperator ABSOLUTE_BEFORE = new ApiDateDemographicOperator(_ABSOLUTE_BEFORE);
    public static final ApiDateDemographicOperator ABSOLUTE_BEFORE_OR_ON = new ApiDateDemographicOperator(_ABSOLUTE_BEFORE_OR_ON);
    public static final ApiDateDemographicOperator ABSOLUTE_IS_BETWEEN = new ApiDateDemographicOperator(_ABSOLUTE_IS_BETWEEN);
    public static final ApiDateDemographicOperator ABSOLUTE_IS_NOT_BETWEEN = new ApiDateDemographicOperator(_ABSOLUTE_IS_NOT_BETWEEN);
    public static final ApiDateDemographicOperator ABSOLUTE_NOT_ON = new ApiDateDemographicOperator(_ABSOLUTE_NOT_ON);
    public static final ApiDateDemographicOperator ABSOLUTE_ON = new ApiDateDemographicOperator(_ABSOLUTE_ON);
    public static final ApiDateDemographicOperator IS_EMPTY = new ApiDateDemographicOperator(_IS_EMPTY);
    public static final ApiDateDemographicOperator IS_NOT_EMPTY = new ApiDateDemographicOperator(_IS_NOT_EMPTY);
    public static final ApiDateDemographicOperator RELATIVE_AFTER_AFTER = new ApiDateDemographicOperator(_RELATIVE_AFTER_AFTER);
    public static final ApiDateDemographicOperator RELATIVE_AFTER_BEFORE = new ApiDateDemographicOperator(_RELATIVE_AFTER_BEFORE);
    public static final ApiDateDemographicOperator RELATIVE_AFTER_OR_ON_AFTER = new ApiDateDemographicOperator(_RELATIVE_AFTER_OR_ON_AFTER);
    public static final ApiDateDemographicOperator RELATIVE_AFTER_OR_ON_BEFORE = new ApiDateDemographicOperator(_RELATIVE_AFTER_OR_ON_BEFORE);
    public static final ApiDateDemographicOperator RELATIVE_BEFORE_AFTER = new ApiDateDemographicOperator(_RELATIVE_BEFORE_AFTER);
    public static final ApiDateDemographicOperator RELATIVE_BEFORE_BEFORE = new ApiDateDemographicOperator(_RELATIVE_BEFORE_BEFORE);
    public static final ApiDateDemographicOperator RELATIVE_BEFORE_OR_ON_AFTER = new ApiDateDemographicOperator(_RELATIVE_BEFORE_OR_ON_AFTER);
    public static final ApiDateDemographicOperator RELATIVE_BEFORE_OR_ON_BEFORE = new ApiDateDemographicOperator(_RELATIVE_BEFORE_OR_ON_BEFORE);
    public static final ApiDateDemographicOperator RELATIVE_NOT_ON_AFTER = new ApiDateDemographicOperator(_RELATIVE_NOT_ON_AFTER);
    public static final ApiDateDemographicOperator RELATIVE_NOT_ON_BEFORE = new ApiDateDemographicOperator(_RELATIVE_NOT_ON_BEFORE);
    public static final ApiDateDemographicOperator RELATIVE_ON_AFTER = new ApiDateDemographicOperator(_RELATIVE_ON_AFTER);
    public static final ApiDateDemographicOperator RELATIVE_ON_BEFORE = new ApiDateDemographicOperator(_RELATIVE_ON_BEFORE);
    public java.lang.String getValue() { return _value_;}
    public static ApiDateDemographicOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiDateDemographicOperator enumeration = (ApiDateDemographicOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiDateDemographicOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiDateDemographicOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDateDemographicOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

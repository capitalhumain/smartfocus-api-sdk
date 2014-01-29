/**
 * ApiWebformCriteriaColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiWebformCriteriaColumn implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiWebformCriteriaColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _webformId = "webformId";
    public static final java.lang.String _name = "name";
    public static final java.lang.String _type = "type";
    public static final java.lang.String _status = "status";
    public static final java.lang.String _creationDate = "creationDate";
    public static final java.lang.String _expirationDate = "expirationDate";
    public static final java.lang.String _bouncebackType = "bouncebackType";
    public static final ApiWebformCriteriaColumn webformId = new ApiWebformCriteriaColumn(_webformId);
    public static final ApiWebformCriteriaColumn name = new ApiWebformCriteriaColumn(_name);
    public static final ApiWebformCriteriaColumn type = new ApiWebformCriteriaColumn(_type);
    public static final ApiWebformCriteriaColumn status = new ApiWebformCriteriaColumn(_status);
    public static final ApiWebformCriteriaColumn creationDate = new ApiWebformCriteriaColumn(_creationDate);
    public static final ApiWebformCriteriaColumn expirationDate = new ApiWebformCriteriaColumn(_expirationDate);
    public static final ApiWebformCriteriaColumn bouncebackType = new ApiWebformCriteriaColumn(_bouncebackType);
    public java.lang.String getValue() { return _value_;}
    public static ApiWebformCriteriaColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiWebformCriteriaColumn enumeration = (ApiWebformCriteriaColumn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiWebformCriteriaColumn fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiWebformCriteriaColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformCriteriaColumn"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

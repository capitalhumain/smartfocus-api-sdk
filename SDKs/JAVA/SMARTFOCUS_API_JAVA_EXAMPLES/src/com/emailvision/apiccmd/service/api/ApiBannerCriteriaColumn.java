/**
 * ApiBannerCriteriaColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiBannerCriteriaColumn implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiBannerCriteriaColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _bannerId = "bannerId";
    public static final java.lang.String _name = "name";
    public static final java.lang.String _createdDate = "createdDate";
    public static final java.lang.String _modifiedDate = "modifiedDate";
    public static final java.lang.String _contentType = "contentType";
    public static final ApiBannerCriteriaColumn bannerId = new ApiBannerCriteriaColumn(_bannerId);
    public static final ApiBannerCriteriaColumn name = new ApiBannerCriteriaColumn(_name);
    public static final ApiBannerCriteriaColumn createdDate = new ApiBannerCriteriaColumn(_createdDate);
    public static final ApiBannerCriteriaColumn modifiedDate = new ApiBannerCriteriaColumn(_modifiedDate);
    public static final ApiBannerCriteriaColumn contentType = new ApiBannerCriteriaColumn(_contentType);
    public java.lang.String getValue() { return _value_;}
    public static ApiBannerCriteriaColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiBannerCriteriaColumn enumeration = (ApiBannerCriteriaColumn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiBannerCriteriaColumn fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiBannerCriteriaColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBannerCriteriaColumn"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

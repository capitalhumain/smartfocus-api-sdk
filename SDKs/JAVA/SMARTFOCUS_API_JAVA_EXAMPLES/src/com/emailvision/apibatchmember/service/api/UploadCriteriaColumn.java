/**
 * UploadCriteriaColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public class UploadCriteriaColumn implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UploadCriteriaColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _uploadId = "uploadId";
    public static final java.lang.String _source = "source";
    public static final java.lang.String _type = "type";
    public static final java.lang.String _date = "date";
    public static final java.lang.String _name = "name";
    public static final java.lang.String _status = "status";
    public static final UploadCriteriaColumn uploadId = new UploadCriteriaColumn(_uploadId);
    public static final UploadCriteriaColumn source = new UploadCriteriaColumn(_source);
    public static final UploadCriteriaColumn type = new UploadCriteriaColumn(_type);
    public static final UploadCriteriaColumn date = new UploadCriteriaColumn(_date);
    public static final UploadCriteriaColumn name = new UploadCriteriaColumn(_name);
    public static final UploadCriteriaColumn status = new UploadCriteriaColumn(_status);
    public java.lang.String getValue() { return _value_;}
    public static UploadCriteriaColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UploadCriteriaColumn enumeration = (UploadCriteriaColumn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UploadCriteriaColumn fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UploadCriteriaColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadCriteriaColumn"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * ApiMessageCriteriaColumn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiMessageCriteriaColumn implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiMessageCriteriaColumn(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _messageId = "messageId";
    public static final java.lang.String _name = "name";
    public static final java.lang.String _createdDate = "createdDate";
    public static final java.lang.String _from = "from";
    public static final java.lang.String _messageType = "messageType";
    public static final java.lang.String _subject = "subject";
    public static final java.lang.String _to = "to";
    public static final java.lang.String _isBounceBack = "isBounceBack";
    public static final ApiMessageCriteriaColumn messageId = new ApiMessageCriteriaColumn(_messageId);
    public static final ApiMessageCriteriaColumn name = new ApiMessageCriteriaColumn(_name);
    public static final ApiMessageCriteriaColumn createdDate = new ApiMessageCriteriaColumn(_createdDate);
    public static final ApiMessageCriteriaColumn from = new ApiMessageCriteriaColumn(_from);
    public static final ApiMessageCriteriaColumn messageType = new ApiMessageCriteriaColumn(_messageType);
    public static final ApiMessageCriteriaColumn subject = new ApiMessageCriteriaColumn(_subject);
    public static final ApiMessageCriteriaColumn to = new ApiMessageCriteriaColumn(_to);
    public static final ApiMessageCriteriaColumn isBounceBack = new ApiMessageCriteriaColumn(_isBounceBack);
    public java.lang.String getValue() { return _value_;}
    public static ApiMessageCriteriaColumn fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiMessageCriteriaColumn enumeration = (ApiMessageCriteriaColumn)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiMessageCriteriaColumn fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiMessageCriteriaColumn.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessageCriteriaColumn"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

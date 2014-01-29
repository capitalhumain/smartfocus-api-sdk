/**
 * ApiValidStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiValidStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiValidStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOT_SET = "NOT_SET";
    public static final java.lang.String _EDITABLE = "EDITABLE";
    public static final java.lang.String _QUEUED = "QUEUED";
    public static final java.lang.String _REFUSED = "REFUSED";
    public static final java.lang.String _RUNNING = "RUNNING";
    public static final java.lang.String _STOPPED = "STOPPED";
    public static final java.lang.String _ARCHIVED = "ARCHIVED";
    public static final java.lang.String _PLANNED = "PLANNED";
    public static final java.lang.String _PAUSED = "PAUSED";
    public static final ApiValidStatus NOT_SET = new ApiValidStatus(_NOT_SET);
    public static final ApiValidStatus EDITABLE = new ApiValidStatus(_EDITABLE);
    public static final ApiValidStatus QUEUED = new ApiValidStatus(_QUEUED);
    public static final ApiValidStatus REFUSED = new ApiValidStatus(_REFUSED);
    public static final ApiValidStatus RUNNING = new ApiValidStatus(_RUNNING);
    public static final ApiValidStatus STOPPED = new ApiValidStatus(_STOPPED);
    public static final ApiValidStatus ARCHIVED = new ApiValidStatus(_ARCHIVED);
    public static final ApiValidStatus PLANNED = new ApiValidStatus(_PLANNED);
    public static final ApiValidStatus PAUSED = new ApiValidStatus(_PAUSED);
    public java.lang.String getValue() { return _value_;}
    public static ApiValidStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiValidStatus enumeration = (ApiValidStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiValidStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiValidStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiValidStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

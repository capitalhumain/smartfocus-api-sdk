/**
 * ApiLifeStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiLifeStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiLifeStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ERR_PURGE = "ERR_PURGE";
    public static final java.lang.String _ERR_BACKUP = "ERR_BACKUP";
    public static final java.lang.String _HIDDEN = "HIDDEN";
    public static final java.lang.String _TRACKING = "TRACKING";
    public static final java.lang.String _TRACKING_FINISHED = "TRACKING_FINISHED";
    public static final java.lang.String _BACKUPED = "BACKUPED";
    public static final java.lang.String _PURGED = "PURGED";
    public static final ApiLifeStatus ERR_PURGE = new ApiLifeStatus(_ERR_PURGE);
    public static final ApiLifeStatus ERR_BACKUP = new ApiLifeStatus(_ERR_BACKUP);
    public static final ApiLifeStatus HIDDEN = new ApiLifeStatus(_HIDDEN);
    public static final ApiLifeStatus TRACKING = new ApiLifeStatus(_TRACKING);
    public static final ApiLifeStatus TRACKING_FINISHED = new ApiLifeStatus(_TRACKING_FINISHED);
    public static final ApiLifeStatus BACKUPED = new ApiLifeStatus(_BACKUPED);
    public static final ApiLifeStatus PURGED = new ApiLifeStatus(_PURGED);
    public java.lang.String getValue() { return _value_;}
    public static ApiLifeStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiLifeStatus enumeration = (ApiLifeStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiLifeStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiLifeStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiLifeStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * HbqReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class HbqReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected HbqReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _QUARANTINE_SCRIPT = "QUARANTINE_SCRIPT";
    public static final java.lang.String _SCHEDULER = "SCHEDULER";
    public static final java.lang.String _SANITY = "SANITY";
    public static final java.lang.String _LHE_EMAIL_CLEANER = "LHE_EMAIL_CLEANER";
    public static final java.lang.String _LHE_BLACKLIST = "LHE_BLACKLIST";
    public static final HbqReason QUARANTINE_SCRIPT = new HbqReason(_QUARANTINE_SCRIPT);
    public static final HbqReason SCHEDULER = new HbqReason(_SCHEDULER);
    public static final HbqReason SANITY = new HbqReason(_SANITY);
    public static final HbqReason LHE_EMAIL_CLEANER = new HbqReason(_LHE_EMAIL_CLEANER);
    public static final HbqReason LHE_BLACKLIST = new HbqReason(_LHE_BLACKLIST);
    public java.lang.String getValue() { return _value_;}
    public static HbqReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        HbqReason enumeration = (HbqReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static HbqReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(HbqReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "hbqReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

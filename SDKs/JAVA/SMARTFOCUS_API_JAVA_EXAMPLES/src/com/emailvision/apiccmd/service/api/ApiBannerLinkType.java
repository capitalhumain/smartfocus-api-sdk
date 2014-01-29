/**
 * ApiBannerLinkType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiBannerLinkType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiBannerLinkType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _STANDARD = "STANDARD";
    public static final java.lang.String _PERSONALIZABLE = "PERSONALIZABLE";
    public static final java.lang.String _UPDATE = "UPDATE";
    public static final java.lang.String _ACTION = "ACTION";
    public static final java.lang.String _UNJOIN = "UNJOIN";
    public static final java.lang.String _MIRROR = "MIRROR";
    public static final ApiBannerLinkType STANDARD = new ApiBannerLinkType(_STANDARD);
    public static final ApiBannerLinkType PERSONALIZABLE = new ApiBannerLinkType(_PERSONALIZABLE);
    public static final ApiBannerLinkType UPDATE = new ApiBannerLinkType(_UPDATE);
    public static final ApiBannerLinkType ACTION = new ApiBannerLinkType(_ACTION);
    public static final ApiBannerLinkType UNJOIN = new ApiBannerLinkType(_UNJOIN);
    public static final ApiBannerLinkType MIRROR = new ApiBannerLinkType(_MIRROR);
    public java.lang.String getValue() { return _value_;}
    public static ApiBannerLinkType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiBannerLinkType enumeration = (ApiBannerLinkType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiBannerLinkType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiBannerLinkType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBannerLinkType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

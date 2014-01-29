/**
 * ApiTrackableLinkOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiTrackableLinkOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiTrackableLinkOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CLASSIC_ANYLINK_CLICKED_NOTIME = "CLASSIC_ANYLINK_CLICKED_NOTIME";
    public static final java.lang.String _CLASSIC_ANYLINK_UNCLICKED_NOTIME = "CLASSIC_ANYLINK_UNCLICKED_NOTIME";
    public static final java.lang.String _CLASSIC_LINK_CLICKED_NOTIME = "CLASSIC_LINK_CLICKED_NOTIME";
    public static final java.lang.String _CLASSIC_LINK_UNCLICKED_NOTIME = "CLASSIC_LINK_UNCLICKED_NOTIME";
    public static final java.lang.String _CLASSIC_LINK_CLICKED_TIME = "CLASSIC_LINK_CLICKED_TIME";
    public static final java.lang.String _CLASSIC_LINK_UNCLICKED_TIME = "CLASSIC_LINK_UNCLICKED_TIME";
    public static final java.lang.String _CLASSIC_ANYLINK_CLICKED_TIME = "CLASSIC_ANYLINK_CLICKED_TIME";
    public static final java.lang.String _CLASSIC_ANYLINK_UNCLICKED_TIME = "CLASSIC_ANYLINK_UNCLICKED_TIME";
    public static final java.lang.String _REFLEX_ANYLINK_CLICKED_NOTIME = "REFLEX_ANYLINK_CLICKED_NOTIME";
    public static final java.lang.String _REFLEX_ANYLINK_UNCLICKED_NOTIME = "REFLEX_ANYLINK_UNCLICKED_NOTIME";
    public static final java.lang.String _REFLEX_LINK_CLICKED_NOTIME = "REFLEX_LINK_CLICKED_NOTIME";
    public static final java.lang.String _REFLEX_LINK_UNCLICKED_NOTIME = "REFLEX_LINK_UNCLICKED_NOTIME";
    public static final java.lang.String _REFLEX_LINK_CLICKED_TIME = "REFLEX_LINK_CLICKED_TIME";
    public static final java.lang.String _REFLEX_LINK_UNCLICKED_TIME = "REFLEX_LINK_UNCLICKED_TIME";
    public static final java.lang.String _REFLEX_ANYLINK_CLICKED_TIME = "REFLEX_ANYLINK_CLICKED_TIME";
    public static final java.lang.String _REFLEX_ANYLINK_UNCLICKED_TIME = "REFLEX_ANYLINK_UNCLICKED_TIME";
    public static final ApiTrackableLinkOperator CLASSIC_ANYLINK_CLICKED_NOTIME = new ApiTrackableLinkOperator(_CLASSIC_ANYLINK_CLICKED_NOTIME);
    public static final ApiTrackableLinkOperator CLASSIC_ANYLINK_UNCLICKED_NOTIME = new ApiTrackableLinkOperator(_CLASSIC_ANYLINK_UNCLICKED_NOTIME);
    public static final ApiTrackableLinkOperator CLASSIC_LINK_CLICKED_NOTIME = new ApiTrackableLinkOperator(_CLASSIC_LINK_CLICKED_NOTIME);
    public static final ApiTrackableLinkOperator CLASSIC_LINK_UNCLICKED_NOTIME = new ApiTrackableLinkOperator(_CLASSIC_LINK_UNCLICKED_NOTIME);
    public static final ApiTrackableLinkOperator CLASSIC_LINK_CLICKED_TIME = new ApiTrackableLinkOperator(_CLASSIC_LINK_CLICKED_TIME);
    public static final ApiTrackableLinkOperator CLASSIC_LINK_UNCLICKED_TIME = new ApiTrackableLinkOperator(_CLASSIC_LINK_UNCLICKED_TIME);
    public static final ApiTrackableLinkOperator CLASSIC_ANYLINK_CLICKED_TIME = new ApiTrackableLinkOperator(_CLASSIC_ANYLINK_CLICKED_TIME);
    public static final ApiTrackableLinkOperator CLASSIC_ANYLINK_UNCLICKED_TIME = new ApiTrackableLinkOperator(_CLASSIC_ANYLINK_UNCLICKED_TIME);
    public static final ApiTrackableLinkOperator REFLEX_ANYLINK_CLICKED_NOTIME = new ApiTrackableLinkOperator(_REFLEX_ANYLINK_CLICKED_NOTIME);
    public static final ApiTrackableLinkOperator REFLEX_ANYLINK_UNCLICKED_NOTIME = new ApiTrackableLinkOperator(_REFLEX_ANYLINK_UNCLICKED_NOTIME);
    public static final ApiTrackableLinkOperator REFLEX_LINK_CLICKED_NOTIME = new ApiTrackableLinkOperator(_REFLEX_LINK_CLICKED_NOTIME);
    public static final ApiTrackableLinkOperator REFLEX_LINK_UNCLICKED_NOTIME = new ApiTrackableLinkOperator(_REFLEX_LINK_UNCLICKED_NOTIME);
    public static final ApiTrackableLinkOperator REFLEX_LINK_CLICKED_TIME = new ApiTrackableLinkOperator(_REFLEX_LINK_CLICKED_TIME);
    public static final ApiTrackableLinkOperator REFLEX_LINK_UNCLICKED_TIME = new ApiTrackableLinkOperator(_REFLEX_LINK_UNCLICKED_TIME);
    public static final ApiTrackableLinkOperator REFLEX_ANYLINK_CLICKED_TIME = new ApiTrackableLinkOperator(_REFLEX_ANYLINK_CLICKED_TIME);
    public static final ApiTrackableLinkOperator REFLEX_ANYLINK_UNCLICKED_TIME = new ApiTrackableLinkOperator(_REFLEX_ANYLINK_UNCLICKED_TIME);
    public java.lang.String getValue() { return _value_;}
    public static ApiTrackableLinkOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiTrackableLinkOperator enumeration = (ApiTrackableLinkOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiTrackableLinkOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiTrackableLinkOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTrackableLinkOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

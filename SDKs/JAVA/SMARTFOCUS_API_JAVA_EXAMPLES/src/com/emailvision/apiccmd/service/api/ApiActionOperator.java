/**
 * ApiActionOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiActionOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ApiActionOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SENT_CAMP = "SENT_CAMP";
    public static final java.lang.String _WERENOTSENT_CAMP = "WERENOTSENT_CAMP";
    public static final java.lang.String _RECEIVEDMESSAGE_CAMP = "RECEIVEDMESSAGE_CAMP";
    public static final java.lang.String _DIDNOTRECEIVEDMESSAGE_CAMP = "DIDNOTRECEIVEDMESSAGE_CAMP";
    public static final java.lang.String _CLICKED_CAMP = "CLICKED_CAMP";
    public static final java.lang.String _DIDNOTCLICKED_CAMP = "DIDNOTCLICKED_CAMP";
    public static final java.lang.String _OPENEDMESSAGE_CAMP = "OPENEDMESSAGE_CAMP";
    public static final java.lang.String _DIDNOTOPENEDMESSAGE_CAMP = "DIDNOTOPENEDMESSAGE_CAMP";
    public static final java.lang.String _SOFTBOUNCE_CAMP = "SOFTBOUNCE_CAMP";
    public static final java.lang.String _SENT_SERIE = "SENT_SERIE";
    public static final java.lang.String _WERENOTSENT_SERIE = "WERENOTSENT_SERIE";
    public static final java.lang.String _RECEIVEDMESSAGE_SERIE = "RECEIVEDMESSAGE_SERIE";
    public static final java.lang.String _DIDNOTRECEIVEDMESSAGE_SERIE = "DIDNOTRECEIVEDMESSAGE_SERIE";
    public static final java.lang.String _CLICKED_SERIE = "CLICKED_SERIE";
    public static final java.lang.String _DIDNOTCLICKED_SERIE = "DIDNOTCLICKED_SERIE";
    public static final java.lang.String _OPENEDMESSAGE_SERIE = "OPENEDMESSAGE_SERIE";
    public static final java.lang.String _DIDNOTOPENEDMESSAGE_SERIE = "DIDNOTOPENEDMESSAGE_SERIE";
    public static final java.lang.String _SOFTBOUNCE_SERIE = "SOFTBOUNCE_SERIE";
    public static final ApiActionOperator SENT_CAMP = new ApiActionOperator(_SENT_CAMP);
    public static final ApiActionOperator WERENOTSENT_CAMP = new ApiActionOperator(_WERENOTSENT_CAMP);
    public static final ApiActionOperator RECEIVEDMESSAGE_CAMP = new ApiActionOperator(_RECEIVEDMESSAGE_CAMP);
    public static final ApiActionOperator DIDNOTRECEIVEDMESSAGE_CAMP = new ApiActionOperator(_DIDNOTRECEIVEDMESSAGE_CAMP);
    public static final ApiActionOperator CLICKED_CAMP = new ApiActionOperator(_CLICKED_CAMP);
    public static final ApiActionOperator DIDNOTCLICKED_CAMP = new ApiActionOperator(_DIDNOTCLICKED_CAMP);
    public static final ApiActionOperator OPENEDMESSAGE_CAMP = new ApiActionOperator(_OPENEDMESSAGE_CAMP);
    public static final ApiActionOperator DIDNOTOPENEDMESSAGE_CAMP = new ApiActionOperator(_DIDNOTOPENEDMESSAGE_CAMP);
    public static final ApiActionOperator SOFTBOUNCE_CAMP = new ApiActionOperator(_SOFTBOUNCE_CAMP);
    public static final ApiActionOperator SENT_SERIE = new ApiActionOperator(_SENT_SERIE);
    public static final ApiActionOperator WERENOTSENT_SERIE = new ApiActionOperator(_WERENOTSENT_SERIE);
    public static final ApiActionOperator RECEIVEDMESSAGE_SERIE = new ApiActionOperator(_RECEIVEDMESSAGE_SERIE);
    public static final ApiActionOperator DIDNOTRECEIVEDMESSAGE_SERIE = new ApiActionOperator(_DIDNOTRECEIVEDMESSAGE_SERIE);
    public static final ApiActionOperator CLICKED_SERIE = new ApiActionOperator(_CLICKED_SERIE);
    public static final ApiActionOperator DIDNOTCLICKED_SERIE = new ApiActionOperator(_DIDNOTCLICKED_SERIE);
    public static final ApiActionOperator OPENEDMESSAGE_SERIE = new ApiActionOperator(_OPENEDMESSAGE_SERIE);
    public static final ApiActionOperator DIDNOTOPENEDMESSAGE_SERIE = new ApiActionOperator(_DIDNOTOPENEDMESSAGE_SERIE);
    public static final ApiActionOperator SOFTBOUNCE_SERIE = new ApiActionOperator(_SOFTBOUNCE_SERIE);
    public java.lang.String getValue() { return _value_;}
    public static ApiActionOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ApiActionOperator enumeration = (ApiActionOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ApiActionOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ApiActionOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiActionOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

/**
 * APIWebformSortOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIWebformSortOption  implements java.io.Serializable {
    private com.emailvision.apiccmd.service.api.ApiWebformCriteriaColumn column;

    private com.emailvision.apiccmd.service.api.SortOrder order;

    public APIWebformSortOption() {
    }

    public APIWebformSortOption(
           com.emailvision.apiccmd.service.api.ApiWebformCriteriaColumn column,
           com.emailvision.apiccmd.service.api.SortOrder order) {
           this.column = column;
           this.order = order;
    }


    /**
     * Gets the column value for this APIWebformSortOption.
     * 
     * @return column
     */
    public com.emailvision.apiccmd.service.api.ApiWebformCriteriaColumn getColumn() {
        return column;
    }


    /**
     * Sets the column value for this APIWebformSortOption.
     * 
     * @param column
     */
    public void setColumn(com.emailvision.apiccmd.service.api.ApiWebformCriteriaColumn column) {
        this.column = column;
    }


    /**
     * Gets the order value for this APIWebformSortOption.
     * 
     * @return order
     */
    public com.emailvision.apiccmd.service.api.SortOrder getOrder() {
        return order;
    }


    /**
     * Sets the order value for this APIWebformSortOption.
     * 
     * @param order
     */
    public void setOrder(com.emailvision.apiccmd.service.api.SortOrder order) {
        this.order = order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIWebformSortOption)) return false;
        APIWebformSortOption other = (APIWebformSortOption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              this.column.equals(other.getColumn()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getColumn() != null) {
            _hashCode += getColumn().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIWebformSortOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSortOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformCriteriaColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "sortOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

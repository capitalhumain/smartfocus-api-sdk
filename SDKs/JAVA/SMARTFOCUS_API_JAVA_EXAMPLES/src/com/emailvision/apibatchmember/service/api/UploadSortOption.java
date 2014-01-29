/**
 * UploadSortOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public class UploadSortOption  implements java.io.Serializable {
    private com.emailvision.apibatchmember.service.api.UploadCriteriaColumn column;

    private com.emailvision.apibatchmember.service.api.SortOrder order;

    public UploadSortOption() {
    }

    public UploadSortOption(
           com.emailvision.apibatchmember.service.api.UploadCriteriaColumn column,
           com.emailvision.apibatchmember.service.api.SortOrder order) {
           this.column = column;
           this.order = order;
    }


    /**
     * Gets the column value for this UploadSortOption.
     * 
     * @return column
     */
    public com.emailvision.apibatchmember.service.api.UploadCriteriaColumn getColumn() {
        return column;
    }


    /**
     * Sets the column value for this UploadSortOption.
     * 
     * @param column
     */
    public void setColumn(com.emailvision.apibatchmember.service.api.UploadCriteriaColumn column) {
        this.column = column;
    }


    /**
     * Gets the order value for this UploadSortOption.
     * 
     * @return order
     */
    public com.emailvision.apibatchmember.service.api.SortOrder getOrder() {
        return order;
    }


    /**
     * Sets the order value for this UploadSortOption.
     * 
     * @param order
     */
    public void setOrder(com.emailvision.apibatchmember.service.api.SortOrder order) {
        this.order = order;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadSortOption)) return false;
        UploadSortOption other = (UploadSortOption) obj;
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
        new org.apache.axis.description.TypeDesc(UploadSortOption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSortOption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("", "column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadCriteriaColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "sortOrder"));
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

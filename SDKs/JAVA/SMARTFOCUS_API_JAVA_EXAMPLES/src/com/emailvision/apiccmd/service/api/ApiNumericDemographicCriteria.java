/**
 * ApiNumericDemographicCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiNumericDemographicCriteria  extends com.emailvision.apiccmd.service.api.ApiSegmentationCriteria  implements java.io.Serializable {
    private java.lang.String columnName;

    private java.lang.Long[] firstValue;

    private com.emailvision.apiccmd.service.api.ApiNumericDemographicOperator operator;

    private java.lang.Long[] secondValue;

    public ApiNumericDemographicCriteria() {
    }

    public ApiNumericDemographicCriteria(
           java.lang.String groupName,
           int groupNumber,
           long id,
           int orderFrag,
           java.lang.String columnName,
           java.lang.Long[] firstValue,
           com.emailvision.apiccmd.service.api.ApiNumericDemographicOperator operator,
           java.lang.Long[] secondValue) {
        super(
            groupName,
            groupNumber,
            id,
            orderFrag);
        this.columnName = columnName;
        this.firstValue = firstValue;
        this.operator = operator;
        this.secondValue = secondValue;
    }


    /**
     * Gets the columnName value for this ApiNumericDemographicCriteria.
     * 
     * @return columnName
     */
    public java.lang.String getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this ApiNumericDemographicCriteria.
     * 
     * @param columnName
     */
    public void setColumnName(java.lang.String columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the firstValue value for this ApiNumericDemographicCriteria.
     * 
     * @return firstValue
     */
    public java.lang.Long[] getFirstValue() {
        return firstValue;
    }


    /**
     * Sets the firstValue value for this ApiNumericDemographicCriteria.
     * 
     * @param firstValue
     */
    public void setFirstValue(java.lang.Long[] firstValue) {
        this.firstValue = firstValue;
    }

    public java.lang.Long getFirstValue(int i) {
        return this.firstValue[i];
    }

    public void setFirstValue(int i, java.lang.Long _value) {
        this.firstValue[i] = _value;
    }


    /**
     * Gets the operator value for this ApiNumericDemographicCriteria.
     * 
     * @return operator
     */
    public com.emailvision.apiccmd.service.api.ApiNumericDemographicOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ApiNumericDemographicCriteria.
     * 
     * @param operator
     */
    public void setOperator(com.emailvision.apiccmd.service.api.ApiNumericDemographicOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the secondValue value for this ApiNumericDemographicCriteria.
     * 
     * @return secondValue
     */
    public java.lang.Long[] getSecondValue() {
        return secondValue;
    }


    /**
     * Sets the secondValue value for this ApiNumericDemographicCriteria.
     * 
     * @param secondValue
     */
    public void setSecondValue(java.lang.Long[] secondValue) {
        this.secondValue = secondValue;
    }

    public java.lang.Long getSecondValue(int i) {
        return this.secondValue[i];
    }

    public void setSecondValue(int i, java.lang.Long _value) {
        this.secondValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiNumericDemographicCriteria)) return false;
        ApiNumericDemographicCriteria other = (ApiNumericDemographicCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.columnName==null && other.getColumnName()==null) || 
             (this.columnName!=null &&
              this.columnName.equals(other.getColumnName()))) &&
            ((this.firstValue==null && other.getFirstValue()==null) || 
             (this.firstValue!=null &&
              java.util.Arrays.equals(this.firstValue, other.getFirstValue()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.secondValue==null && other.getSecondValue()==null) || 
             (this.secondValue!=null &&
              java.util.Arrays.equals(this.secondValue, other.getSecondValue())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getColumnName() != null) {
            _hashCode += getColumnName().hashCode();
        }
        if (getFirstValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getSecondValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiNumericDemographicCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiNumericDemographicCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiNumericDemographicOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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

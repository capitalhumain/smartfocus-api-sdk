/**
 * ApiRecencyCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiRecencyCriteria  extends com.emailvision.apiccmd.service.api.ApiSegmentationCriteria  implements java.io.Serializable {
    private com.emailvision.apiccmd.service.api.ApiRecencyColumn columnName;

    private java.util.Calendar[] firstStaticValue;

    private com.emailvision.apiccmd.service.api.ApiRecencyOperator operator;

    private java.lang.Integer[] periodDayBeginList;

    private java.lang.Integer[] periodDayEndList;

    private java.util.Calendar[] secondStaticValue;

    public ApiRecencyCriteria() {
    }

    public ApiRecencyCriteria(
           java.lang.String groupName,
           int groupNumber,
           long id,
           int orderFrag,
           com.emailvision.apiccmd.service.api.ApiRecencyColumn columnName,
           java.util.Calendar[] firstStaticValue,
           com.emailvision.apiccmd.service.api.ApiRecencyOperator operator,
           java.lang.Integer[] periodDayBeginList,
           java.lang.Integer[] periodDayEndList,
           java.util.Calendar[] secondStaticValue) {
        super(
            groupName,
            groupNumber,
            id,
            orderFrag);
        this.columnName = columnName;
        this.firstStaticValue = firstStaticValue;
        this.operator = operator;
        this.periodDayBeginList = periodDayBeginList;
        this.periodDayEndList = periodDayEndList;
        this.secondStaticValue = secondStaticValue;
    }


    /**
     * Gets the columnName value for this ApiRecencyCriteria.
     * 
     * @return columnName
     */
    public com.emailvision.apiccmd.service.api.ApiRecencyColumn getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this ApiRecencyCriteria.
     * 
     * @param columnName
     */
    public void setColumnName(com.emailvision.apiccmd.service.api.ApiRecencyColumn columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the firstStaticValue value for this ApiRecencyCriteria.
     * 
     * @return firstStaticValue
     */
    public java.util.Calendar[] getFirstStaticValue() {
        return firstStaticValue;
    }


    /**
     * Sets the firstStaticValue value for this ApiRecencyCriteria.
     * 
     * @param firstStaticValue
     */
    public void setFirstStaticValue(java.util.Calendar[] firstStaticValue) {
        this.firstStaticValue = firstStaticValue;
    }

    public java.util.Calendar getFirstStaticValue(int i) {
        return this.firstStaticValue[i];
    }

    public void setFirstStaticValue(int i, java.util.Calendar _value) {
        this.firstStaticValue[i] = _value;
    }


    /**
     * Gets the operator value for this ApiRecencyCriteria.
     * 
     * @return operator
     */
    public com.emailvision.apiccmd.service.api.ApiRecencyOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ApiRecencyCriteria.
     * 
     * @param operator
     */
    public void setOperator(com.emailvision.apiccmd.service.api.ApiRecencyOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the periodDayBeginList value for this ApiRecencyCriteria.
     * 
     * @return periodDayBeginList
     */
    public java.lang.Integer[] getPeriodDayBeginList() {
        return periodDayBeginList;
    }


    /**
     * Sets the periodDayBeginList value for this ApiRecencyCriteria.
     * 
     * @param periodDayBeginList
     */
    public void setPeriodDayBeginList(java.lang.Integer[] periodDayBeginList) {
        this.periodDayBeginList = periodDayBeginList;
    }

    public java.lang.Integer getPeriodDayBeginList(int i) {
        return this.periodDayBeginList[i];
    }

    public void setPeriodDayBeginList(int i, java.lang.Integer _value) {
        this.periodDayBeginList[i] = _value;
    }


    /**
     * Gets the periodDayEndList value for this ApiRecencyCriteria.
     * 
     * @return periodDayEndList
     */
    public java.lang.Integer[] getPeriodDayEndList() {
        return periodDayEndList;
    }


    /**
     * Sets the periodDayEndList value for this ApiRecencyCriteria.
     * 
     * @param periodDayEndList
     */
    public void setPeriodDayEndList(java.lang.Integer[] periodDayEndList) {
        this.periodDayEndList = periodDayEndList;
    }

    public java.lang.Integer getPeriodDayEndList(int i) {
        return this.periodDayEndList[i];
    }

    public void setPeriodDayEndList(int i, java.lang.Integer _value) {
        this.periodDayEndList[i] = _value;
    }


    /**
     * Gets the secondStaticValue value for this ApiRecencyCriteria.
     * 
     * @return secondStaticValue
     */
    public java.util.Calendar[] getSecondStaticValue() {
        return secondStaticValue;
    }


    /**
     * Sets the secondStaticValue value for this ApiRecencyCriteria.
     * 
     * @param secondStaticValue
     */
    public void setSecondStaticValue(java.util.Calendar[] secondStaticValue) {
        this.secondStaticValue = secondStaticValue;
    }

    public java.util.Calendar getSecondStaticValue(int i) {
        return this.secondStaticValue[i];
    }

    public void setSecondStaticValue(int i, java.util.Calendar _value) {
        this.secondStaticValue[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiRecencyCriteria)) return false;
        ApiRecencyCriteria other = (ApiRecencyCriteria) obj;
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
            ((this.firstStaticValue==null && other.getFirstStaticValue()==null) || 
             (this.firstStaticValue!=null &&
              java.util.Arrays.equals(this.firstStaticValue, other.getFirstStaticValue()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.periodDayBeginList==null && other.getPeriodDayBeginList()==null) || 
             (this.periodDayBeginList!=null &&
              java.util.Arrays.equals(this.periodDayBeginList, other.getPeriodDayBeginList()))) &&
            ((this.periodDayEndList==null && other.getPeriodDayEndList()==null) || 
             (this.periodDayEndList!=null &&
              java.util.Arrays.equals(this.periodDayEndList, other.getPeriodDayEndList()))) &&
            ((this.secondStaticValue==null && other.getSecondStaticValue()==null) || 
             (this.secondStaticValue!=null &&
              java.util.Arrays.equals(this.secondStaticValue, other.getSecondStaticValue())));
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
        if (getFirstStaticValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstStaticValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstStaticValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getPeriodDayBeginList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodDayBeginList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodDayBeginList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPeriodDayEndList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodDayEndList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPeriodDayEndList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecondStaticValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondStaticValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondStaticValue(), i);
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
        new org.apache.axis.description.TypeDesc(ApiRecencyCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyColumn"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstStaticValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstStaticValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodDayBeginList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodDayBeginList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodDayEndList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodDayEndList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondStaticValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondStaticValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

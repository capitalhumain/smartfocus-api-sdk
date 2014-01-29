/**
 * ApiDateDemographicCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiDateDemographicCriteria  extends com.emailvision.apiccmd.service.api.ApiSegmentationCriteria  implements java.io.Serializable {
    private boolean absoluteDate;

    private java.lang.String columnName;

    private java.util.Calendar[] firstAbsoluteDate;

    private java.lang.Long[] numberDaysBeforeOrAfter;

    private com.emailvision.apiccmd.service.api.ApiDateDemographicOperator operator;

    private java.lang.String[] relativeColumnNameBeforeOrAfter;

    private java.util.Calendar[] secondAbsoluteDate;

    public ApiDateDemographicCriteria() {
    }

    public ApiDateDemographicCriteria(
           java.lang.String groupName,
           int groupNumber,
           long id,
           int orderFrag,
           boolean absoluteDate,
           java.lang.String columnName,
           java.util.Calendar[] firstAbsoluteDate,
           java.lang.Long[] numberDaysBeforeOrAfter,
           com.emailvision.apiccmd.service.api.ApiDateDemographicOperator operator,
           java.lang.String[] relativeColumnNameBeforeOrAfter,
           java.util.Calendar[] secondAbsoluteDate) {
        super(
            groupName,
            groupNumber,
            id,
            orderFrag);
        this.absoluteDate = absoluteDate;
        this.columnName = columnName;
        this.firstAbsoluteDate = firstAbsoluteDate;
        this.numberDaysBeforeOrAfter = numberDaysBeforeOrAfter;
        this.operator = operator;
        this.relativeColumnNameBeforeOrAfter = relativeColumnNameBeforeOrAfter;
        this.secondAbsoluteDate = secondAbsoluteDate;
    }


    /**
     * Gets the absoluteDate value for this ApiDateDemographicCriteria.
     * 
     * @return absoluteDate
     */
    public boolean isAbsoluteDate() {
        return absoluteDate;
    }


    /**
     * Sets the absoluteDate value for this ApiDateDemographicCriteria.
     * 
     * @param absoluteDate
     */
    public void setAbsoluteDate(boolean absoluteDate) {
        this.absoluteDate = absoluteDate;
    }


    /**
     * Gets the columnName value for this ApiDateDemographicCriteria.
     * 
     * @return columnName
     */
    public java.lang.String getColumnName() {
        return columnName;
    }


    /**
     * Sets the columnName value for this ApiDateDemographicCriteria.
     * 
     * @param columnName
     */
    public void setColumnName(java.lang.String columnName) {
        this.columnName = columnName;
    }


    /**
     * Gets the firstAbsoluteDate value for this ApiDateDemographicCriteria.
     * 
     * @return firstAbsoluteDate
     */
    public java.util.Calendar[] getFirstAbsoluteDate() {
        return firstAbsoluteDate;
    }


    /**
     * Sets the firstAbsoluteDate value for this ApiDateDemographicCriteria.
     * 
     * @param firstAbsoluteDate
     */
    public void setFirstAbsoluteDate(java.util.Calendar[] firstAbsoluteDate) {
        this.firstAbsoluteDate = firstAbsoluteDate;
    }

    public java.util.Calendar getFirstAbsoluteDate(int i) {
        return this.firstAbsoluteDate[i];
    }

    public void setFirstAbsoluteDate(int i, java.util.Calendar _value) {
        this.firstAbsoluteDate[i] = _value;
    }


    /**
     * Gets the numberDaysBeforeOrAfter value for this ApiDateDemographicCriteria.
     * 
     * @return numberDaysBeforeOrAfter
     */
    public java.lang.Long[] getNumberDaysBeforeOrAfter() {
        return numberDaysBeforeOrAfter;
    }


    /**
     * Sets the numberDaysBeforeOrAfter value for this ApiDateDemographicCriteria.
     * 
     * @param numberDaysBeforeOrAfter
     */
    public void setNumberDaysBeforeOrAfter(java.lang.Long[] numberDaysBeforeOrAfter) {
        this.numberDaysBeforeOrAfter = numberDaysBeforeOrAfter;
    }

    public java.lang.Long getNumberDaysBeforeOrAfter(int i) {
        return this.numberDaysBeforeOrAfter[i];
    }

    public void setNumberDaysBeforeOrAfter(int i, java.lang.Long _value) {
        this.numberDaysBeforeOrAfter[i] = _value;
    }


    /**
     * Gets the operator value for this ApiDateDemographicCriteria.
     * 
     * @return operator
     */
    public com.emailvision.apiccmd.service.api.ApiDateDemographicOperator getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this ApiDateDemographicCriteria.
     * 
     * @param operator
     */
    public void setOperator(com.emailvision.apiccmd.service.api.ApiDateDemographicOperator operator) {
        this.operator = operator;
    }


    /**
     * Gets the relativeColumnNameBeforeOrAfter value for this ApiDateDemographicCriteria.
     * 
     * @return relativeColumnNameBeforeOrAfter
     */
    public java.lang.String[] getRelativeColumnNameBeforeOrAfter() {
        return relativeColumnNameBeforeOrAfter;
    }


    /**
     * Sets the relativeColumnNameBeforeOrAfter value for this ApiDateDemographicCriteria.
     * 
     * @param relativeColumnNameBeforeOrAfter
     */
    public void setRelativeColumnNameBeforeOrAfter(java.lang.String[] relativeColumnNameBeforeOrAfter) {
        this.relativeColumnNameBeforeOrAfter = relativeColumnNameBeforeOrAfter;
    }

    public java.lang.String getRelativeColumnNameBeforeOrAfter(int i) {
        return this.relativeColumnNameBeforeOrAfter[i];
    }

    public void setRelativeColumnNameBeforeOrAfter(int i, java.lang.String _value) {
        this.relativeColumnNameBeforeOrAfter[i] = _value;
    }


    /**
     * Gets the secondAbsoluteDate value for this ApiDateDemographicCriteria.
     * 
     * @return secondAbsoluteDate
     */
    public java.util.Calendar[] getSecondAbsoluteDate() {
        return secondAbsoluteDate;
    }


    /**
     * Sets the secondAbsoluteDate value for this ApiDateDemographicCriteria.
     * 
     * @param secondAbsoluteDate
     */
    public void setSecondAbsoluteDate(java.util.Calendar[] secondAbsoluteDate) {
        this.secondAbsoluteDate = secondAbsoluteDate;
    }

    public java.util.Calendar getSecondAbsoluteDate(int i) {
        return this.secondAbsoluteDate[i];
    }

    public void setSecondAbsoluteDate(int i, java.util.Calendar _value) {
        this.secondAbsoluteDate[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiDateDemographicCriteria)) return false;
        ApiDateDemographicCriteria other = (ApiDateDemographicCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.absoluteDate == other.isAbsoluteDate() &&
            ((this.columnName==null && other.getColumnName()==null) || 
             (this.columnName!=null &&
              this.columnName.equals(other.getColumnName()))) &&
            ((this.firstAbsoluteDate==null && other.getFirstAbsoluteDate()==null) || 
             (this.firstAbsoluteDate!=null &&
              java.util.Arrays.equals(this.firstAbsoluteDate, other.getFirstAbsoluteDate()))) &&
            ((this.numberDaysBeforeOrAfter==null && other.getNumberDaysBeforeOrAfter()==null) || 
             (this.numberDaysBeforeOrAfter!=null &&
              java.util.Arrays.equals(this.numberDaysBeforeOrAfter, other.getNumberDaysBeforeOrAfter()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.relativeColumnNameBeforeOrAfter==null && other.getRelativeColumnNameBeforeOrAfter()==null) || 
             (this.relativeColumnNameBeforeOrAfter!=null &&
              java.util.Arrays.equals(this.relativeColumnNameBeforeOrAfter, other.getRelativeColumnNameBeforeOrAfter()))) &&
            ((this.secondAbsoluteDate==null && other.getSecondAbsoluteDate()==null) || 
             (this.secondAbsoluteDate!=null &&
              java.util.Arrays.equals(this.secondAbsoluteDate, other.getSecondAbsoluteDate())));
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
        _hashCode += (isAbsoluteDate() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getColumnName() != null) {
            _hashCode += getColumnName().hashCode();
        }
        if (getFirstAbsoluteDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstAbsoluteDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstAbsoluteDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumberDaysBeforeOrAfter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumberDaysBeforeOrAfter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumberDaysBeforeOrAfter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getRelativeColumnNameBeforeOrAfter() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRelativeColumnNameBeforeOrAfter());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRelativeColumnNameBeforeOrAfter(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSecondAbsoluteDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSecondAbsoluteDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSecondAbsoluteDate(), i);
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
        new org.apache.axis.description.TypeDesc(ApiDateDemographicCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDateDemographicCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("absoluteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "absoluteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columnName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "columnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstAbsoluteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstAbsoluteDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberDaysBeforeOrAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberDaysBeforeOrAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDateDemographicOperator"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relativeColumnNameBeforeOrAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relativeColumnNameBeforeOrAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondAbsoluteDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondAbsoluteDate"));
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

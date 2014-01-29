/**
 * APIWebformField.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIWebformField  implements java.io.Serializable {
    private java.lang.String fieldName;

    private java.lang.Boolean required;

    private java.lang.String displayName;

    private com.emailvision.apiccmd.service.api.ApiWebformInputType inputType;

    private java.lang.String[] listOfValues;

    private java.lang.String defaultValue;

    private com.emailvision.apiccmd.service.api.ApiWebformValidationType validationType;

    private java.lang.Integer textLength;

    private java.lang.Boolean customKey;

    public APIWebformField() {
    }

    public APIWebformField(
           java.lang.String fieldName,
           java.lang.Boolean required,
           java.lang.String displayName,
           com.emailvision.apiccmd.service.api.ApiWebformInputType inputType,
           java.lang.String[] listOfValues,
           java.lang.String defaultValue,
           com.emailvision.apiccmd.service.api.ApiWebformValidationType validationType,
           java.lang.Integer textLength,
           java.lang.Boolean customKey) {
           this.fieldName = fieldName;
           this.required = required;
           this.displayName = displayName;
           this.inputType = inputType;
           this.listOfValues = listOfValues;
           this.defaultValue = defaultValue;
           this.validationType = validationType;
           this.textLength = textLength;
           this.customKey = customKey;
    }


    /**
     * Gets the fieldName value for this APIWebformField.
     * 
     * @return fieldName
     */
    public java.lang.String getFieldName() {
        return fieldName;
    }


    /**
     * Sets the fieldName value for this APIWebformField.
     * 
     * @param fieldName
     */
    public void setFieldName(java.lang.String fieldName) {
        this.fieldName = fieldName;
    }


    /**
     * Gets the required value for this APIWebformField.
     * 
     * @return required
     */
    public java.lang.Boolean getRequired() {
        return required;
    }


    /**
     * Sets the required value for this APIWebformField.
     * 
     * @param required
     */
    public void setRequired(java.lang.Boolean required) {
        this.required = required;
    }


    /**
     * Gets the displayName value for this APIWebformField.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this APIWebformField.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the inputType value for this APIWebformField.
     * 
     * @return inputType
     */
    public com.emailvision.apiccmd.service.api.ApiWebformInputType getInputType() {
        return inputType;
    }


    /**
     * Sets the inputType value for this APIWebformField.
     * 
     * @param inputType
     */
    public void setInputType(com.emailvision.apiccmd.service.api.ApiWebformInputType inputType) {
        this.inputType = inputType;
    }


    /**
     * Gets the listOfValues value for this APIWebformField.
     * 
     * @return listOfValues
     */
    public java.lang.String[] getListOfValues() {
        return listOfValues;
    }


    /**
     * Sets the listOfValues value for this APIWebformField.
     * 
     * @param listOfValues
     */
    public void setListOfValues(java.lang.String[] listOfValues) {
        this.listOfValues = listOfValues;
    }


    /**
     * Gets the defaultValue value for this APIWebformField.
     * 
     * @return defaultValue
     */
    public java.lang.String getDefaultValue() {
        return defaultValue;
    }


    /**
     * Sets the defaultValue value for this APIWebformField.
     * 
     * @param defaultValue
     */
    public void setDefaultValue(java.lang.String defaultValue) {
        this.defaultValue = defaultValue;
    }


    /**
     * Gets the validationType value for this APIWebformField.
     * 
     * @return validationType
     */
    public com.emailvision.apiccmd.service.api.ApiWebformValidationType getValidationType() {
        return validationType;
    }


    /**
     * Sets the validationType value for this APIWebformField.
     * 
     * @param validationType
     */
    public void setValidationType(com.emailvision.apiccmd.service.api.ApiWebformValidationType validationType) {
        this.validationType = validationType;
    }


    /**
     * Gets the textLength value for this APIWebformField.
     * 
     * @return textLength
     */
    public java.lang.Integer getTextLength() {
        return textLength;
    }


    /**
     * Sets the textLength value for this APIWebformField.
     * 
     * @param textLength
     */
    public void setTextLength(java.lang.Integer textLength) {
        this.textLength = textLength;
    }


    /**
     * Gets the customKey value for this APIWebformField.
     * 
     * @return customKey
     */
    public java.lang.Boolean getCustomKey() {
        return customKey;
    }


    /**
     * Sets the customKey value for this APIWebformField.
     * 
     * @param customKey
     */
    public void setCustomKey(java.lang.Boolean customKey) {
        this.customKey = customKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIWebformField)) return false;
        APIWebformField other = (APIWebformField) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fieldName==null && other.getFieldName()==null) || 
             (this.fieldName!=null &&
              this.fieldName.equals(other.getFieldName()))) &&
            ((this.required==null && other.getRequired()==null) || 
             (this.required!=null &&
              this.required.equals(other.getRequired()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.inputType==null && other.getInputType()==null) || 
             (this.inputType!=null &&
              this.inputType.equals(other.getInputType()))) &&
            ((this.listOfValues==null && other.getListOfValues()==null) || 
             (this.listOfValues!=null &&
              java.util.Arrays.equals(this.listOfValues, other.getListOfValues()))) &&
            ((this.defaultValue==null && other.getDefaultValue()==null) || 
             (this.defaultValue!=null &&
              this.defaultValue.equals(other.getDefaultValue()))) &&
            ((this.validationType==null && other.getValidationType()==null) || 
             (this.validationType!=null &&
              this.validationType.equals(other.getValidationType()))) &&
            ((this.textLength==null && other.getTextLength()==null) || 
             (this.textLength!=null &&
              this.textLength.equals(other.getTextLength()))) &&
            ((this.customKey==null && other.getCustomKey()==null) || 
             (this.customKey!=null &&
              this.customKey.equals(other.getCustomKey())));
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
        if (getFieldName() != null) {
            _hashCode += getFieldName().hashCode();
        }
        if (getRequired() != null) {
            _hashCode += getRequired().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getInputType() != null) {
            _hashCode += getInputType().hashCode();
        }
        if (getListOfValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListOfValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListOfValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultValue() != null) {
            _hashCode += getDefaultValue().hashCode();
        }
        if (getValidationType() != null) {
            _hashCode += getValidationType().hashCode();
        }
        if (getTextLength() != null) {
            _hashCode += getTextLength().hashCode();
        }
        if (getCustomKey() != null) {
            _hashCode += getCustomKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIWebformField.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformField"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fieldName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fieldName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("required");
        elemField.setXmlName(new javax.xml.namespace.QName("", "required"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformInputType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listOfValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listOfValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "value"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validationType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformValidationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textLength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "textLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

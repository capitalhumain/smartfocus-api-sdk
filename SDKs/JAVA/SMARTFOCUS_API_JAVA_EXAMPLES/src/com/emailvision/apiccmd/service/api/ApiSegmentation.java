/**
 * ApiSegmentation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiSegmentation  implements java.io.Serializable {
    private long id;

    private java.lang.String name;

    private java.lang.String description;

    private float sampleRate;

    private com.emailvision.apiccmd.service.api.ApiSegmentationSampleType sampleType;

    private java.util.Calendar dateCreate;

    private java.util.Calendar dateModif;

    public ApiSegmentation() {
    }

    public ApiSegmentation(
           long id,
           java.lang.String name,
           java.lang.String description,
           float sampleRate,
           com.emailvision.apiccmd.service.api.ApiSegmentationSampleType sampleType,
           java.util.Calendar dateCreate,
           java.util.Calendar dateModif) {
           this.id = id;
           this.name = name;
           this.description = description;
           this.sampleRate = sampleRate;
           this.sampleType = sampleType;
           this.dateCreate = dateCreate;
           this.dateModif = dateModif;
    }


    /**
     * Gets the id value for this ApiSegmentation.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this ApiSegmentation.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the name value for this ApiSegmentation.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ApiSegmentation.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this ApiSegmentation.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ApiSegmentation.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the sampleRate value for this ApiSegmentation.
     * 
     * @return sampleRate
     */
    public float getSampleRate() {
        return sampleRate;
    }


    /**
     * Sets the sampleRate value for this ApiSegmentation.
     * 
     * @param sampleRate
     */
    public void setSampleRate(float sampleRate) {
        this.sampleRate = sampleRate;
    }


    /**
     * Gets the sampleType value for this ApiSegmentation.
     * 
     * @return sampleType
     */
    public com.emailvision.apiccmd.service.api.ApiSegmentationSampleType getSampleType() {
        return sampleType;
    }


    /**
     * Sets the sampleType value for this ApiSegmentation.
     * 
     * @param sampleType
     */
    public void setSampleType(com.emailvision.apiccmd.service.api.ApiSegmentationSampleType sampleType) {
        this.sampleType = sampleType;
    }


    /**
     * Gets the dateCreate value for this ApiSegmentation.
     * 
     * @return dateCreate
     */
    public java.util.Calendar getDateCreate() {
        return dateCreate;
    }


    /**
     * Sets the dateCreate value for this ApiSegmentation.
     * 
     * @param dateCreate
     */
    public void setDateCreate(java.util.Calendar dateCreate) {
        this.dateCreate = dateCreate;
    }


    /**
     * Gets the dateModif value for this ApiSegmentation.
     * 
     * @return dateModif
     */
    public java.util.Calendar getDateModif() {
        return dateModif;
    }


    /**
     * Sets the dateModif value for this ApiSegmentation.
     * 
     * @param dateModif
     */
    public void setDateModif(java.util.Calendar dateModif) {
        this.dateModif = dateModif;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiSegmentation)) return false;
        ApiSegmentation other = (ApiSegmentation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.sampleRate == other.getSampleRate() &&
            ((this.sampleType==null && other.getSampleType()==null) || 
             (this.sampleType!=null &&
              this.sampleType.equals(other.getSampleType()))) &&
            ((this.dateCreate==null && other.getDateCreate()==null) || 
             (this.dateCreate!=null &&
              this.dateCreate.equals(other.getDateCreate()))) &&
            ((this.dateModif==null && other.getDateModif()==null) || 
             (this.dateModif!=null &&
              this.dateModif.equals(other.getDateModif())));
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
        _hashCode += new Long(getId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += new Float(getSampleRate()).hashCode();
        if (getSampleType() != null) {
            _hashCode += getSampleType().hashCode();
        }
        if (getDateCreate() != null) {
            _hashCode += getDateCreate().hashCode();
        }
        if (getDateModif() != null) {
            _hashCode += getDateModif().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiSegmentation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ApiSegmentation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sampleRate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sampleRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sampleType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sampleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegmentationSampleType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateCreate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateModif");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateModif"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

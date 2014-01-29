/**
 * APISegmentSummary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APISegmentSummary  implements java.io.Serializable {
    private long segmentId;

    private java.lang.String name;

    private java.lang.String manager;

    private java.util.Calendar createdDate;

    private java.lang.Integer lastCount;

    private com.emailvision.apiccmd.service.api.ApiSegmentType type;

    private java.lang.Boolean pendingJobs;

    public APISegmentSummary() {
    }

    public APISegmentSummary(
           long segmentId,
           java.lang.String name,
           java.lang.String manager,
           java.util.Calendar createdDate,
           java.lang.Integer lastCount,
           com.emailvision.apiccmd.service.api.ApiSegmentType type,
           java.lang.Boolean pendingJobs) {
           this.segmentId = segmentId;
           this.name = name;
           this.manager = manager;
           this.createdDate = createdDate;
           this.lastCount = lastCount;
           this.type = type;
           this.pendingJobs = pendingJobs;
    }


    /**
     * Gets the segmentId value for this APISegmentSummary.
     * 
     * @return segmentId
     */
    public long getSegmentId() {
        return segmentId;
    }


    /**
     * Sets the segmentId value for this APISegmentSummary.
     * 
     * @param segmentId
     */
    public void setSegmentId(long segmentId) {
        this.segmentId = segmentId;
    }


    /**
     * Gets the name value for this APISegmentSummary.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this APISegmentSummary.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the manager value for this APISegmentSummary.
     * 
     * @return manager
     */
    public java.lang.String getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this APISegmentSummary.
     * 
     * @param manager
     */
    public void setManager(java.lang.String manager) {
        this.manager = manager;
    }


    /**
     * Gets the createdDate value for this APISegmentSummary.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this APISegmentSummary.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastCount value for this APISegmentSummary.
     * 
     * @return lastCount
     */
    public java.lang.Integer getLastCount() {
        return lastCount;
    }


    /**
     * Sets the lastCount value for this APISegmentSummary.
     * 
     * @param lastCount
     */
    public void setLastCount(java.lang.Integer lastCount) {
        this.lastCount = lastCount;
    }


    /**
     * Gets the type value for this APISegmentSummary.
     * 
     * @return type
     */
    public com.emailvision.apiccmd.service.api.ApiSegmentType getType() {
        return type;
    }


    /**
     * Sets the type value for this APISegmentSummary.
     * 
     * @param type
     */
    public void setType(com.emailvision.apiccmd.service.api.ApiSegmentType type) {
        this.type = type;
    }


    /**
     * Gets the pendingJobs value for this APISegmentSummary.
     * 
     * @return pendingJobs
     */
    public java.lang.Boolean getPendingJobs() {
        return pendingJobs;
    }


    /**
     * Sets the pendingJobs value for this APISegmentSummary.
     * 
     * @param pendingJobs
     */
    public void setPendingJobs(java.lang.Boolean pendingJobs) {
        this.pendingJobs = pendingJobs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APISegmentSummary)) return false;
        APISegmentSummary other = (APISegmentSummary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.segmentId == other.getSegmentId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastCount==null && other.getLastCount()==null) || 
             (this.lastCount!=null &&
              this.lastCount.equals(other.getLastCount()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.pendingJobs==null && other.getPendingJobs()==null) || 
             (this.pendingJobs!=null &&
              this.pendingJobs.equals(other.getPendingJobs())));
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
        _hashCode += new Long(getSegmentId()).hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastCount() != null) {
            _hashCode += getLastCount().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPendingJobs() != null) {
            _hashCode += getPendingJobs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APISegmentSummary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSummary"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegmentType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingJobs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pendingJobs"));
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

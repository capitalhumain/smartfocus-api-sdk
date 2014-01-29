/**
 * UploadSummaryEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public class UploadSummaryEntity  implements java.io.Serializable {
    private long uploadId;

    private java.lang.String manager;

    private com.emailvision.apibatchmember.service.api.UploadSource source;

    private com.emailvision.apibatchmember.service.api.UploadType type;

    private java.util.Calendar date;

    private java.lang.String name;

    private long size;

    private com.emailvision.apibatchmember.service.api.UploadJobStatus status;

    public UploadSummaryEntity() {
    }

    public UploadSummaryEntity(
           long uploadId,
           java.lang.String manager,
           com.emailvision.apibatchmember.service.api.UploadSource source,
           com.emailvision.apibatchmember.service.api.UploadType type,
           java.util.Calendar date,
           java.lang.String name,
           long size,
           com.emailvision.apibatchmember.service.api.UploadJobStatus status) {
           this.uploadId = uploadId;
           this.manager = manager;
           this.source = source;
           this.type = type;
           this.date = date;
           this.name = name;
           this.size = size;
           this.status = status;
    }


    /**
     * Gets the uploadId value for this UploadSummaryEntity.
     * 
     * @return uploadId
     */
    public long getUploadId() {
        return uploadId;
    }


    /**
     * Sets the uploadId value for this UploadSummaryEntity.
     * 
     * @param uploadId
     */
    public void setUploadId(long uploadId) {
        this.uploadId = uploadId;
    }


    /**
     * Gets the manager value for this UploadSummaryEntity.
     * 
     * @return manager
     */
    public java.lang.String getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this UploadSummaryEntity.
     * 
     * @param manager
     */
    public void setManager(java.lang.String manager) {
        this.manager = manager;
    }


    /**
     * Gets the source value for this UploadSummaryEntity.
     * 
     * @return source
     */
    public com.emailvision.apibatchmember.service.api.UploadSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this UploadSummaryEntity.
     * 
     * @param source
     */
    public void setSource(com.emailvision.apibatchmember.service.api.UploadSource source) {
        this.source = source;
    }


    /**
     * Gets the type value for this UploadSummaryEntity.
     * 
     * @return type
     */
    public com.emailvision.apibatchmember.service.api.UploadType getType() {
        return type;
    }


    /**
     * Sets the type value for this UploadSummaryEntity.
     * 
     * @param type
     */
    public void setType(com.emailvision.apibatchmember.service.api.UploadType type) {
        this.type = type;
    }


    /**
     * Gets the date value for this UploadSummaryEntity.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this UploadSummaryEntity.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the name value for this UploadSummaryEntity.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this UploadSummaryEntity.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the size value for this UploadSummaryEntity.
     * 
     * @return size
     */
    public long getSize() {
        return size;
    }


    /**
     * Sets the size value for this UploadSummaryEntity.
     * 
     * @param size
     */
    public void setSize(long size) {
        this.size = size;
    }


    /**
     * Gets the status value for this UploadSummaryEntity.
     * 
     * @return status
     */
    public com.emailvision.apibatchmember.service.api.UploadJobStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UploadSummaryEntity.
     * 
     * @param status
     */
    public void setStatus(com.emailvision.apibatchmember.service.api.UploadJobStatus status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadSummaryEntity)) return false;
        UploadSummaryEntity other = (UploadSummaryEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.uploadId == other.getUploadId() &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.size == other.getSize() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        _hashCode += new Long(getUploadId()).hashCode();
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Long(getSize()).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadSummaryEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSummaryEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uploadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadJobStatus"));
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

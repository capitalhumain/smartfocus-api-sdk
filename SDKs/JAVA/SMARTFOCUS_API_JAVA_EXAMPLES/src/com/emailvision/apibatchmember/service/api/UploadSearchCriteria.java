/**
 * UploadSearchCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public class UploadSearchCriteria  implements java.io.Serializable {
    private java.lang.Long uploadId;

    private com.emailvision.apibatchmember.service.api.UploadSource source;

    private com.emailvision.apibatchmember.service.api.UploadType type;

    private com.emailvision.apibatchmember.service.api.UploadJobStatus status;

    private java.util.Calendar minImportDate;

    private java.util.Calendar maxImportDate;

    public UploadSearchCriteria() {
    }

    public UploadSearchCriteria(
           java.lang.Long uploadId,
           com.emailvision.apibatchmember.service.api.UploadSource source,
           com.emailvision.apibatchmember.service.api.UploadType type,
           com.emailvision.apibatchmember.service.api.UploadJobStatus status,
           java.util.Calendar minImportDate,
           java.util.Calendar maxImportDate) {
           this.uploadId = uploadId;
           this.source = source;
           this.type = type;
           this.status = status;
           this.minImportDate = minImportDate;
           this.maxImportDate = maxImportDate;
    }


    /**
     * Gets the uploadId value for this UploadSearchCriteria.
     * 
     * @return uploadId
     */
    public java.lang.Long getUploadId() {
        return uploadId;
    }


    /**
     * Sets the uploadId value for this UploadSearchCriteria.
     * 
     * @param uploadId
     */
    public void setUploadId(java.lang.Long uploadId) {
        this.uploadId = uploadId;
    }


    /**
     * Gets the source value for this UploadSearchCriteria.
     * 
     * @return source
     */
    public com.emailvision.apibatchmember.service.api.UploadSource getSource() {
        return source;
    }


    /**
     * Sets the source value for this UploadSearchCriteria.
     * 
     * @param source
     */
    public void setSource(com.emailvision.apibatchmember.service.api.UploadSource source) {
        this.source = source;
    }


    /**
     * Gets the type value for this UploadSearchCriteria.
     * 
     * @return type
     */
    public com.emailvision.apibatchmember.service.api.UploadType getType() {
        return type;
    }


    /**
     * Sets the type value for this UploadSearchCriteria.
     * 
     * @param type
     */
    public void setType(com.emailvision.apibatchmember.service.api.UploadType type) {
        this.type = type;
    }


    /**
     * Gets the status value for this UploadSearchCriteria.
     * 
     * @return status
     */
    public com.emailvision.apibatchmember.service.api.UploadJobStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this UploadSearchCriteria.
     * 
     * @param status
     */
    public void setStatus(com.emailvision.apibatchmember.service.api.UploadJobStatus status) {
        this.status = status;
    }


    /**
     * Gets the minImportDate value for this UploadSearchCriteria.
     * 
     * @return minImportDate
     */
    public java.util.Calendar getMinImportDate() {
        return minImportDate;
    }


    /**
     * Sets the minImportDate value for this UploadSearchCriteria.
     * 
     * @param minImportDate
     */
    public void setMinImportDate(java.util.Calendar minImportDate) {
        this.minImportDate = minImportDate;
    }


    /**
     * Gets the maxImportDate value for this UploadSearchCriteria.
     * 
     * @return maxImportDate
     */
    public java.util.Calendar getMaxImportDate() {
        return maxImportDate;
    }


    /**
     * Sets the maxImportDate value for this UploadSearchCriteria.
     * 
     * @param maxImportDate
     */
    public void setMaxImportDate(java.util.Calendar maxImportDate) {
        this.maxImportDate = maxImportDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadSearchCriteria)) return false;
        UploadSearchCriteria other = (UploadSearchCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.uploadId==null && other.getUploadId()==null) || 
             (this.uploadId!=null &&
              this.uploadId.equals(other.getUploadId()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.minImportDate==null && other.getMinImportDate()==null) || 
             (this.minImportDate!=null &&
              this.minImportDate.equals(other.getMinImportDate()))) &&
            ((this.maxImportDate==null && other.getMaxImportDate()==null) || 
             (this.maxImportDate!=null &&
              this.maxImportDate.equals(other.getMaxImportDate())));
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
        if (getUploadId() != null) {
            _hashCode += getUploadId().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMinImportDate() != null) {
            _hashCode += getMinImportDate().hashCode();
        }
        if (getMaxImportDate() != null) {
            _hashCode += getMaxImportDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadSearchCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSearchCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uploadId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uploadId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadJobStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minImportDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minImportDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxImportDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxImportDate"));
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

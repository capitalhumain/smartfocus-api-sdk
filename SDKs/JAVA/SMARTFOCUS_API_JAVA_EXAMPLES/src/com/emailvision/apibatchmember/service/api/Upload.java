/**
 * Upload.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public abstract class Upload  implements java.io.Serializable {
    private java.lang.String dateFormat;

    private java.lang.String fileEncoding;

    private java.lang.String fileName;

    private com.emailvision.apibatchmember.service.api.Column[] mapping;

    private java.lang.String separator;

    private boolean skipFirstLine;

    public Upload() {
    }

    public Upload(
           java.lang.String dateFormat,
           java.lang.String fileEncoding,
           java.lang.String fileName,
           com.emailvision.apibatchmember.service.api.Column[] mapping,
           java.lang.String separator,
           boolean skipFirstLine) {
           this.dateFormat = dateFormat;
           this.fileEncoding = fileEncoding;
           this.fileName = fileName;
           this.mapping = mapping;
           this.separator = separator;
           this.skipFirstLine = skipFirstLine;
    }


    /**
     * Gets the dateFormat value for this Upload.
     * 
     * @return dateFormat
     */
    public java.lang.String getDateFormat() {
        return dateFormat;
    }


    /**
     * Sets the dateFormat value for this Upload.
     * 
     * @param dateFormat
     */
    public void setDateFormat(java.lang.String dateFormat) {
        this.dateFormat = dateFormat;
    }


    /**
     * Gets the fileEncoding value for this Upload.
     * 
     * @return fileEncoding
     */
    public java.lang.String getFileEncoding() {
        return fileEncoding;
    }


    /**
     * Sets the fileEncoding value for this Upload.
     * 
     * @param fileEncoding
     */
    public void setFileEncoding(java.lang.String fileEncoding) {
        this.fileEncoding = fileEncoding;
    }


    /**
     * Gets the fileName value for this Upload.
     * 
     * @return fileName
     */
    public java.lang.String getFileName() {
        return fileName;
    }


    /**
     * Sets the fileName value for this Upload.
     * 
     * @param fileName
     */
    public void setFileName(java.lang.String fileName) {
        this.fileName = fileName;
    }


    /**
     * Gets the mapping value for this Upload.
     * 
     * @return mapping
     */
    public com.emailvision.apibatchmember.service.api.Column[] getMapping() {
        return mapping;
    }


    /**
     * Sets the mapping value for this Upload.
     * 
     * @param mapping
     */
    public void setMapping(com.emailvision.apibatchmember.service.api.Column[] mapping) {
        this.mapping = mapping;
    }


    /**
     * Gets the separator value for this Upload.
     * 
     * @return separator
     */
    public java.lang.String getSeparator() {
        return separator;
    }


    /**
     * Sets the separator value for this Upload.
     * 
     * @param separator
     */
    public void setSeparator(java.lang.String separator) {
        this.separator = separator;
    }


    /**
     * Gets the skipFirstLine value for this Upload.
     * 
     * @return skipFirstLine
     */
    public boolean isSkipFirstLine() {
        return skipFirstLine;
    }


    /**
     * Sets the skipFirstLine value for this Upload.
     * 
     * @param skipFirstLine
     */
    public void setSkipFirstLine(boolean skipFirstLine) {
        this.skipFirstLine = skipFirstLine;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Upload)) return false;
        Upload other = (Upload) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dateFormat==null && other.getDateFormat()==null) || 
             (this.dateFormat!=null &&
              this.dateFormat.equals(other.getDateFormat()))) &&
            ((this.fileEncoding==null && other.getFileEncoding()==null) || 
             (this.fileEncoding!=null &&
              this.fileEncoding.equals(other.getFileEncoding()))) &&
            ((this.fileName==null && other.getFileName()==null) || 
             (this.fileName!=null &&
              this.fileName.equals(other.getFileName()))) &&
            ((this.mapping==null && other.getMapping()==null) || 
             (this.mapping!=null &&
              java.util.Arrays.equals(this.mapping, other.getMapping()))) &&
            ((this.separator==null && other.getSeparator()==null) || 
             (this.separator!=null &&
              this.separator.equals(other.getSeparator()))) &&
            this.skipFirstLine == other.isSkipFirstLine();
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
        if (getDateFormat() != null) {
            _hashCode += getDateFormat().hashCode();
        }
        if (getFileEncoding() != null) {
            _hashCode += getFileEncoding().hashCode();
        }
        if (getFileName() != null) {
            _hashCode += getFileName().hashCode();
        }
        if (getMapping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMapping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMapping(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeparator() != null) {
            _hashCode += getSeparator().hashCode();
        }
        _hashCode += (isSkipFirstLine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Upload.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "upload"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileEncoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileEncoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "column"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "column"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("separator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "separator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipFirstLine");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skipFirstLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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

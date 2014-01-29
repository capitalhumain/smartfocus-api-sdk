/**
 * UploadListOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public class UploadListOptions  implements java.io.Serializable {
    private int page;

    private java.lang.Integer pageSize;

    private com.emailvision.apibatchmember.service.api.UploadSearchCriteria search;

    private com.emailvision.apibatchmember.service.api.UploadSortOption[] sortOptions;

    public UploadListOptions() {
    }

    public UploadListOptions(
           int page,
           java.lang.Integer pageSize,
           com.emailvision.apibatchmember.service.api.UploadSearchCriteria search,
           com.emailvision.apibatchmember.service.api.UploadSortOption[] sortOptions) {
           this.page = page;
           this.pageSize = pageSize;
           this.search = search;
           this.sortOptions = sortOptions;
    }


    /**
     * Gets the page value for this UploadListOptions.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this UploadListOptions.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }


    /**
     * Gets the pageSize value for this UploadListOptions.
     * 
     * @return pageSize
     */
    public java.lang.Integer getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this UploadListOptions.
     * 
     * @param pageSize
     */
    public void setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the search value for this UploadListOptions.
     * 
     * @return search
     */
    public com.emailvision.apibatchmember.service.api.UploadSearchCriteria getSearch() {
        return search;
    }


    /**
     * Sets the search value for this UploadListOptions.
     * 
     * @param search
     */
    public void setSearch(com.emailvision.apibatchmember.service.api.UploadSearchCriteria search) {
        this.search = search;
    }


    /**
     * Gets the sortOptions value for this UploadListOptions.
     * 
     * @return sortOptions
     */
    public com.emailvision.apibatchmember.service.api.UploadSortOption[] getSortOptions() {
        return sortOptions;
    }


    /**
     * Sets the sortOptions value for this UploadListOptions.
     * 
     * @param sortOptions
     */
    public void setSortOptions(com.emailvision.apibatchmember.service.api.UploadSortOption[] sortOptions) {
        this.sortOptions = sortOptions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadListOptions)) return false;
        UploadListOptions other = (UploadListOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.page == other.getPage() &&
            ((this.pageSize==null && other.getPageSize()==null) || 
             (this.pageSize!=null &&
              this.pageSize.equals(other.getPageSize()))) &&
            ((this.search==null && other.getSearch()==null) || 
             (this.search!=null &&
              this.search.equals(other.getSearch()))) &&
            ((this.sortOptions==null && other.getSortOptions()==null) || 
             (this.sortOptions!=null &&
              java.util.Arrays.equals(this.sortOptions, other.getSortOptions())));
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
        _hashCode += getPage();
        if (getPageSize() != null) {
            _hashCode += getPageSize().hashCode();
        }
        if (getSearch() != null) {
            _hashCode += getSearch().hashCode();
        }
        if (getSortOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSortOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSortOptions(), i);
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
        new org.apache.axis.description.TypeDesc(UploadListOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadListOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("search");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSearchCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSortOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "sortOption"));
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

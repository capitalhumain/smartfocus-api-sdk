/**
 * APISegmentSummaryList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APISegmentSummaryList  implements java.io.Serializable {
    private com.emailvision.apiccmd.service.api.APISegmentSummary[] segmentSummaryList;

    private int pageSize;

    private long nbTotalItems;

    private int page;

    private boolean nextPage;

    private boolean previousPage;

    public APISegmentSummaryList() {
    }

    public APISegmentSummaryList(
           com.emailvision.apiccmd.service.api.APISegmentSummary[] segmentSummaryList,
           int pageSize,
           long nbTotalItems,
           int page,
           boolean nextPage,
           boolean previousPage) {
           this.segmentSummaryList = segmentSummaryList;
           this.pageSize = pageSize;
           this.nbTotalItems = nbTotalItems;
           this.page = page;
           this.nextPage = nextPage;
           this.previousPage = previousPage;
    }


    /**
     * Gets the segmentSummaryList value for this APISegmentSummaryList.
     * 
     * @return segmentSummaryList
     */
    public com.emailvision.apiccmd.service.api.APISegmentSummary[] getSegmentSummaryList() {
        return segmentSummaryList;
    }


    /**
     * Sets the segmentSummaryList value for this APISegmentSummaryList.
     * 
     * @param segmentSummaryList
     */
    public void setSegmentSummaryList(com.emailvision.apiccmd.service.api.APISegmentSummary[] segmentSummaryList) {
        this.segmentSummaryList = segmentSummaryList;
    }


    /**
     * Gets the pageSize value for this APISegmentSummaryList.
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this APISegmentSummaryList.
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the nbTotalItems value for this APISegmentSummaryList.
     * 
     * @return nbTotalItems
     */
    public long getNbTotalItems() {
        return nbTotalItems;
    }


    /**
     * Sets the nbTotalItems value for this APISegmentSummaryList.
     * 
     * @param nbTotalItems
     */
    public void setNbTotalItems(long nbTotalItems) {
        this.nbTotalItems = nbTotalItems;
    }


    /**
     * Gets the page value for this APISegmentSummaryList.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this APISegmentSummaryList.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }


    /**
     * Gets the nextPage value for this APISegmentSummaryList.
     * 
     * @return nextPage
     */
    public boolean isNextPage() {
        return nextPage;
    }


    /**
     * Sets the nextPage value for this APISegmentSummaryList.
     * 
     * @param nextPage
     */
    public void setNextPage(boolean nextPage) {
        this.nextPage = nextPage;
    }


    /**
     * Gets the previousPage value for this APISegmentSummaryList.
     * 
     * @return previousPage
     */
    public boolean isPreviousPage() {
        return previousPage;
    }


    /**
     * Sets the previousPage value for this APISegmentSummaryList.
     * 
     * @param previousPage
     */
    public void setPreviousPage(boolean previousPage) {
        this.previousPage = previousPage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APISegmentSummaryList)) return false;
        APISegmentSummaryList other = (APISegmentSummaryList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.segmentSummaryList==null && other.getSegmentSummaryList()==null) || 
             (this.segmentSummaryList!=null &&
              java.util.Arrays.equals(this.segmentSummaryList, other.getSegmentSummaryList()))) &&
            this.pageSize == other.getPageSize() &&
            this.nbTotalItems == other.getNbTotalItems() &&
            this.page == other.getPage() &&
            this.nextPage == other.isNextPage() &&
            this.previousPage == other.isPreviousPage();
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
        if (getSegmentSummaryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegmentSummaryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegmentSummaryList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPageSize();
        _hashCode += new Long(getNbTotalItems()).hashCode();
        _hashCode += getPage();
        _hashCode += (isNextPage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPreviousPage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APISegmentSummaryList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSummaryList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentSummaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "segmentSummaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "segmentSummary"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pageSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbTotalItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbTotalItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("", "page"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "previousPage"));
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

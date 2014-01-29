/**
 * APIMessageSummaryList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIMessageSummaryList  implements java.io.Serializable {
    private com.emailvision.apiccmd.service.api.APIMessageSummary[] messageSummaryList;

    private int pageSize;

    private long nbTotalItems;

    private int page;

    private boolean nextPage;

    private boolean previousPage;

    public APIMessageSummaryList() {
    }

    public APIMessageSummaryList(
           com.emailvision.apiccmd.service.api.APIMessageSummary[] messageSummaryList,
           int pageSize,
           long nbTotalItems,
           int page,
           boolean nextPage,
           boolean previousPage) {
           this.messageSummaryList = messageSummaryList;
           this.pageSize = pageSize;
           this.nbTotalItems = nbTotalItems;
           this.page = page;
           this.nextPage = nextPage;
           this.previousPage = previousPage;
    }


    /**
     * Gets the messageSummaryList value for this APIMessageSummaryList.
     * 
     * @return messageSummaryList
     */
    public com.emailvision.apiccmd.service.api.APIMessageSummary[] getMessageSummaryList() {
        return messageSummaryList;
    }


    /**
     * Sets the messageSummaryList value for this APIMessageSummaryList.
     * 
     * @param messageSummaryList
     */
    public void setMessageSummaryList(com.emailvision.apiccmd.service.api.APIMessageSummary[] messageSummaryList) {
        this.messageSummaryList = messageSummaryList;
    }


    /**
     * Gets the pageSize value for this APIMessageSummaryList.
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this APIMessageSummaryList.
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the nbTotalItems value for this APIMessageSummaryList.
     * 
     * @return nbTotalItems
     */
    public long getNbTotalItems() {
        return nbTotalItems;
    }


    /**
     * Sets the nbTotalItems value for this APIMessageSummaryList.
     * 
     * @param nbTotalItems
     */
    public void setNbTotalItems(long nbTotalItems) {
        this.nbTotalItems = nbTotalItems;
    }


    /**
     * Gets the page value for this APIMessageSummaryList.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this APIMessageSummaryList.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }


    /**
     * Gets the nextPage value for this APIMessageSummaryList.
     * 
     * @return nextPage
     */
    public boolean isNextPage() {
        return nextPage;
    }


    /**
     * Sets the nextPage value for this APIMessageSummaryList.
     * 
     * @param nextPage
     */
    public void setNextPage(boolean nextPage) {
        this.nextPage = nextPage;
    }


    /**
     * Gets the previousPage value for this APIMessageSummaryList.
     * 
     * @return previousPage
     */
    public boolean isPreviousPage() {
        return previousPage;
    }


    /**
     * Sets the previousPage value for this APIMessageSummaryList.
     * 
     * @param previousPage
     */
    public void setPreviousPage(boolean previousPage) {
        this.previousPage = previousPage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIMessageSummaryList)) return false;
        APIMessageSummaryList other = (APIMessageSummaryList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.messageSummaryList==null && other.getMessageSummaryList()==null) || 
             (this.messageSummaryList!=null &&
              java.util.Arrays.equals(this.messageSummaryList, other.getMessageSummaryList()))) &&
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
        if (getMessageSummaryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessageSummaryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessageSummaryList(), i);
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
        new org.apache.axis.description.TypeDesc(APIMessageSummaryList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSummaryList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSummaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageSummaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "messageSummary"));
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

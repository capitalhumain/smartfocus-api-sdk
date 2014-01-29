/**
 * APIBannerSummaryList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIBannerSummaryList  implements java.io.Serializable {
    private com.emailvision.apiccmd.service.api.APIBannerSummary[] bannerSummaryList;

    private int pageSize;

    private long nbTotalItems;

    private int page;

    private boolean previousPage;

    private boolean nextPage;

    public APIBannerSummaryList() {
    }

    public APIBannerSummaryList(
           com.emailvision.apiccmd.service.api.APIBannerSummary[] bannerSummaryList,
           int pageSize,
           long nbTotalItems,
           int page,
           boolean previousPage,
           boolean nextPage) {
           this.bannerSummaryList = bannerSummaryList;
           this.pageSize = pageSize;
           this.nbTotalItems = nbTotalItems;
           this.page = page;
           this.previousPage = previousPage;
           this.nextPage = nextPage;
    }


    /**
     * Gets the bannerSummaryList value for this APIBannerSummaryList.
     * 
     * @return bannerSummaryList
     */
    public com.emailvision.apiccmd.service.api.APIBannerSummary[] getBannerSummaryList() {
        return bannerSummaryList;
    }


    /**
     * Sets the bannerSummaryList value for this APIBannerSummaryList.
     * 
     * @param bannerSummaryList
     */
    public void setBannerSummaryList(com.emailvision.apiccmd.service.api.APIBannerSummary[] bannerSummaryList) {
        this.bannerSummaryList = bannerSummaryList;
    }


    /**
     * Gets the pageSize value for this APIBannerSummaryList.
     * 
     * @return pageSize
     */
    public int getPageSize() {
        return pageSize;
    }


    /**
     * Sets the pageSize value for this APIBannerSummaryList.
     * 
     * @param pageSize
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }


    /**
     * Gets the nbTotalItems value for this APIBannerSummaryList.
     * 
     * @return nbTotalItems
     */
    public long getNbTotalItems() {
        return nbTotalItems;
    }


    /**
     * Sets the nbTotalItems value for this APIBannerSummaryList.
     * 
     * @param nbTotalItems
     */
    public void setNbTotalItems(long nbTotalItems) {
        this.nbTotalItems = nbTotalItems;
    }


    /**
     * Gets the page value for this APIBannerSummaryList.
     * 
     * @return page
     */
    public int getPage() {
        return page;
    }


    /**
     * Sets the page value for this APIBannerSummaryList.
     * 
     * @param page
     */
    public void setPage(int page) {
        this.page = page;
    }


    /**
     * Gets the previousPage value for this APIBannerSummaryList.
     * 
     * @return previousPage
     */
    public boolean isPreviousPage() {
        return previousPage;
    }


    /**
     * Sets the previousPage value for this APIBannerSummaryList.
     * 
     * @param previousPage
     */
    public void setPreviousPage(boolean previousPage) {
        this.previousPage = previousPage;
    }


    /**
     * Gets the nextPage value for this APIBannerSummaryList.
     * 
     * @return nextPage
     */
    public boolean isNextPage() {
        return nextPage;
    }


    /**
     * Sets the nextPage value for this APIBannerSummaryList.
     * 
     * @param nextPage
     */
    public void setNextPage(boolean nextPage) {
        this.nextPage = nextPage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIBannerSummaryList)) return false;
        APIBannerSummaryList other = (APIBannerSummaryList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bannerSummaryList==null && other.getBannerSummaryList()==null) || 
             (this.bannerSummaryList!=null &&
              java.util.Arrays.equals(this.bannerSummaryList, other.getBannerSummaryList()))) &&
            this.pageSize == other.getPageSize() &&
            this.nbTotalItems == other.getNbTotalItems() &&
            this.page == other.getPage() &&
            this.previousPage == other.isPreviousPage() &&
            this.nextPage == other.isNextPage();
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
        if (getBannerSummaryList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBannerSummaryList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBannerSummaryList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPageSize();
        _hashCode += new Long(getNbTotalItems()).hashCode();
        _hashCode += getPage();
        _hashCode += (isPreviousPage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNextPage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIBannerSummaryList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSummaryList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bannerSummaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bannerSummaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSummary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "bannerSummary"));
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
        elemField.setFieldName("previousPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "previousPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextPage"));
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

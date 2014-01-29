/**
 * ApiCampaignSnapshot.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiCampaignSnapshot  implements java.io.Serializable {
    private java.util.Calendar beginDate;

    private long campaignId;

    private java.util.Calendar endDate;

    private long nbBounce;

    private long nbComplaint;

    private long nbConversion;

    private long nbDelivered;

    private long nbFiltered;

    private long nbHardBounce;

    private long nbSelected;

    private long nbSoftBounce;

    private long nbUniqueClick;

    private long nbUniqueOpen;

    private long nbUnsubscribe;

    public ApiCampaignSnapshot() {
    }

    public ApiCampaignSnapshot(
           java.util.Calendar beginDate,
           long campaignId,
           java.util.Calendar endDate,
           long nbBounce,
           long nbComplaint,
           long nbConversion,
           long nbDelivered,
           long nbFiltered,
           long nbHardBounce,
           long nbSelected,
           long nbSoftBounce,
           long nbUniqueClick,
           long nbUniqueOpen,
           long nbUnsubscribe) {
           this.beginDate = beginDate;
           this.campaignId = campaignId;
           this.endDate = endDate;
           this.nbBounce = nbBounce;
           this.nbComplaint = nbComplaint;
           this.nbConversion = nbConversion;
           this.nbDelivered = nbDelivered;
           this.nbFiltered = nbFiltered;
           this.nbHardBounce = nbHardBounce;
           this.nbSelected = nbSelected;
           this.nbSoftBounce = nbSoftBounce;
           this.nbUniqueClick = nbUniqueClick;
           this.nbUniqueOpen = nbUniqueOpen;
           this.nbUnsubscribe = nbUnsubscribe;
    }


    /**
     * Gets the beginDate value for this ApiCampaignSnapshot.
     * 
     * @return beginDate
     */
    public java.util.Calendar getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this ApiCampaignSnapshot.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.util.Calendar beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the campaignId value for this ApiCampaignSnapshot.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this ApiCampaignSnapshot.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the endDate value for this ApiCampaignSnapshot.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ApiCampaignSnapshot.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the nbBounce value for this ApiCampaignSnapshot.
     * 
     * @return nbBounce
     */
    public long getNbBounce() {
        return nbBounce;
    }


    /**
     * Sets the nbBounce value for this ApiCampaignSnapshot.
     * 
     * @param nbBounce
     */
    public void setNbBounce(long nbBounce) {
        this.nbBounce = nbBounce;
    }


    /**
     * Gets the nbComplaint value for this ApiCampaignSnapshot.
     * 
     * @return nbComplaint
     */
    public long getNbComplaint() {
        return nbComplaint;
    }


    /**
     * Sets the nbComplaint value for this ApiCampaignSnapshot.
     * 
     * @param nbComplaint
     */
    public void setNbComplaint(long nbComplaint) {
        this.nbComplaint = nbComplaint;
    }


    /**
     * Gets the nbConversion value for this ApiCampaignSnapshot.
     * 
     * @return nbConversion
     */
    public long getNbConversion() {
        return nbConversion;
    }


    /**
     * Sets the nbConversion value for this ApiCampaignSnapshot.
     * 
     * @param nbConversion
     */
    public void setNbConversion(long nbConversion) {
        this.nbConversion = nbConversion;
    }


    /**
     * Gets the nbDelivered value for this ApiCampaignSnapshot.
     * 
     * @return nbDelivered
     */
    public long getNbDelivered() {
        return nbDelivered;
    }


    /**
     * Sets the nbDelivered value for this ApiCampaignSnapshot.
     * 
     * @param nbDelivered
     */
    public void setNbDelivered(long nbDelivered) {
        this.nbDelivered = nbDelivered;
    }


    /**
     * Gets the nbFiltered value for this ApiCampaignSnapshot.
     * 
     * @return nbFiltered
     */
    public long getNbFiltered() {
        return nbFiltered;
    }


    /**
     * Sets the nbFiltered value for this ApiCampaignSnapshot.
     * 
     * @param nbFiltered
     */
    public void setNbFiltered(long nbFiltered) {
        this.nbFiltered = nbFiltered;
    }


    /**
     * Gets the nbHardBounce value for this ApiCampaignSnapshot.
     * 
     * @return nbHardBounce
     */
    public long getNbHardBounce() {
        return nbHardBounce;
    }


    /**
     * Sets the nbHardBounce value for this ApiCampaignSnapshot.
     * 
     * @param nbHardBounce
     */
    public void setNbHardBounce(long nbHardBounce) {
        this.nbHardBounce = nbHardBounce;
    }


    /**
     * Gets the nbSelected value for this ApiCampaignSnapshot.
     * 
     * @return nbSelected
     */
    public long getNbSelected() {
        return nbSelected;
    }


    /**
     * Sets the nbSelected value for this ApiCampaignSnapshot.
     * 
     * @param nbSelected
     */
    public void setNbSelected(long nbSelected) {
        this.nbSelected = nbSelected;
    }


    /**
     * Gets the nbSoftBounce value for this ApiCampaignSnapshot.
     * 
     * @return nbSoftBounce
     */
    public long getNbSoftBounce() {
        return nbSoftBounce;
    }


    /**
     * Sets the nbSoftBounce value for this ApiCampaignSnapshot.
     * 
     * @param nbSoftBounce
     */
    public void setNbSoftBounce(long nbSoftBounce) {
        this.nbSoftBounce = nbSoftBounce;
    }


    /**
     * Gets the nbUniqueClick value for this ApiCampaignSnapshot.
     * 
     * @return nbUniqueClick
     */
    public long getNbUniqueClick() {
        return nbUniqueClick;
    }


    /**
     * Sets the nbUniqueClick value for this ApiCampaignSnapshot.
     * 
     * @param nbUniqueClick
     */
    public void setNbUniqueClick(long nbUniqueClick) {
        this.nbUniqueClick = nbUniqueClick;
    }


    /**
     * Gets the nbUniqueOpen value for this ApiCampaignSnapshot.
     * 
     * @return nbUniqueOpen
     */
    public long getNbUniqueOpen() {
        return nbUniqueOpen;
    }


    /**
     * Sets the nbUniqueOpen value for this ApiCampaignSnapshot.
     * 
     * @param nbUniqueOpen
     */
    public void setNbUniqueOpen(long nbUniqueOpen) {
        this.nbUniqueOpen = nbUniqueOpen;
    }


    /**
     * Gets the nbUnsubscribe value for this ApiCampaignSnapshot.
     * 
     * @return nbUnsubscribe
     */
    public long getNbUnsubscribe() {
        return nbUnsubscribe;
    }


    /**
     * Sets the nbUnsubscribe value for this ApiCampaignSnapshot.
     * 
     * @param nbUnsubscribe
     */
    public void setNbUnsubscribe(long nbUnsubscribe) {
        this.nbUnsubscribe = nbUnsubscribe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiCampaignSnapshot)) return false;
        ApiCampaignSnapshot other = (ApiCampaignSnapshot) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.beginDate==null && other.getBeginDate()==null) || 
             (this.beginDate!=null &&
              this.beginDate.equals(other.getBeginDate()))) &&
            this.campaignId == other.getCampaignId() &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            this.nbBounce == other.getNbBounce() &&
            this.nbComplaint == other.getNbComplaint() &&
            this.nbConversion == other.getNbConversion() &&
            this.nbDelivered == other.getNbDelivered() &&
            this.nbFiltered == other.getNbFiltered() &&
            this.nbHardBounce == other.getNbHardBounce() &&
            this.nbSelected == other.getNbSelected() &&
            this.nbSoftBounce == other.getNbSoftBounce() &&
            this.nbUniqueClick == other.getNbUniqueClick() &&
            this.nbUniqueOpen == other.getNbUniqueOpen() &&
            this.nbUnsubscribe == other.getNbUnsubscribe();
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
        if (getBeginDate() != null) {
            _hashCode += getBeginDate().hashCode();
        }
        _hashCode += new Long(getCampaignId()).hashCode();
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        _hashCode += new Long(getNbBounce()).hashCode();
        _hashCode += new Long(getNbComplaint()).hashCode();
        _hashCode += new Long(getNbConversion()).hashCode();
        _hashCode += new Long(getNbDelivered()).hashCode();
        _hashCode += new Long(getNbFiltered()).hashCode();
        _hashCode += new Long(getNbHardBounce()).hashCode();
        _hashCode += new Long(getNbSelected()).hashCode();
        _hashCode += new Long(getNbSoftBounce()).hashCode();
        _hashCode += new Long(getNbUniqueClick()).hashCode();
        _hashCode += new Long(getNbUniqueOpen()).hashCode();
        _hashCode += new Long(getNbUnsubscribe()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiCampaignSnapshot.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignSnapshot"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "beginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbBounce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbBounce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbComplaint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbComplaint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbFiltered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbFiltered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbHardBounce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbHardBounce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbSoftBounce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbSoftBounce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbUniqueClick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbUniqueClick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbUniqueOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbUniqueOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbUnsubscribe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbUnsubscribe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

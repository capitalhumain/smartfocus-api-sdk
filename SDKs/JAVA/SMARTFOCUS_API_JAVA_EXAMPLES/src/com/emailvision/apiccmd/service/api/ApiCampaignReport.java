/**
 * ApiCampaignReport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class ApiCampaignReport  implements java.io.Serializable {
    private java.util.Calendar beginDate;

    private long campaignId;

    private java.util.Calendar endDate;

    private long initDuration;

    private long messageId;

    private long nbBadEmail;

    private long nbConversion;

    private long nbError;

    private long nbJoin;

    private long nbMessage;

    private long nbMultiple;

    private long nbOpen;

    private long nbOpened;

    private long nbResponse;

    private long nbSelected;

    private long nbSingle;

    private long nbSkipped;

    private long nbSoftError;

    private long nbTotalClick;

    private long nbUniqueClick;

    private long nbUnjoined;

    private boolean passThruFlg;

    public ApiCampaignReport() {
    }

    public ApiCampaignReport(
           java.util.Calendar beginDate,
           long campaignId,
           java.util.Calendar endDate,
           long initDuration,
           long messageId,
           long nbBadEmail,
           long nbConversion,
           long nbError,
           long nbJoin,
           long nbMessage,
           long nbMultiple,
           long nbOpen,
           long nbOpened,
           long nbResponse,
           long nbSelected,
           long nbSingle,
           long nbSkipped,
           long nbSoftError,
           long nbTotalClick,
           long nbUniqueClick,
           long nbUnjoined,
           boolean passThruFlg) {
           this.beginDate = beginDate;
           this.campaignId = campaignId;
           this.endDate = endDate;
           this.initDuration = initDuration;
           this.messageId = messageId;
           this.nbBadEmail = nbBadEmail;
           this.nbConversion = nbConversion;
           this.nbError = nbError;
           this.nbJoin = nbJoin;
           this.nbMessage = nbMessage;
           this.nbMultiple = nbMultiple;
           this.nbOpen = nbOpen;
           this.nbOpened = nbOpened;
           this.nbResponse = nbResponse;
           this.nbSelected = nbSelected;
           this.nbSingle = nbSingle;
           this.nbSkipped = nbSkipped;
           this.nbSoftError = nbSoftError;
           this.nbTotalClick = nbTotalClick;
           this.nbUniqueClick = nbUniqueClick;
           this.nbUnjoined = nbUnjoined;
           this.passThruFlg = passThruFlg;
    }


    /**
     * Gets the beginDate value for this ApiCampaignReport.
     * 
     * @return beginDate
     */
    public java.util.Calendar getBeginDate() {
        return beginDate;
    }


    /**
     * Sets the beginDate value for this ApiCampaignReport.
     * 
     * @param beginDate
     */
    public void setBeginDate(java.util.Calendar beginDate) {
        this.beginDate = beginDate;
    }


    /**
     * Gets the campaignId value for this ApiCampaignReport.
     * 
     * @return campaignId
     */
    public long getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this ApiCampaignReport.
     * 
     * @param campaignId
     */
    public void setCampaignId(long campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the endDate value for this ApiCampaignReport.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ApiCampaignReport.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the initDuration value for this ApiCampaignReport.
     * 
     * @return initDuration
     */
    public long getInitDuration() {
        return initDuration;
    }


    /**
     * Sets the initDuration value for this ApiCampaignReport.
     * 
     * @param initDuration
     */
    public void setInitDuration(long initDuration) {
        this.initDuration = initDuration;
    }


    /**
     * Gets the messageId value for this ApiCampaignReport.
     * 
     * @return messageId
     */
    public long getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this ApiCampaignReport.
     * 
     * @param messageId
     */
    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the nbBadEmail value for this ApiCampaignReport.
     * 
     * @return nbBadEmail
     */
    public long getNbBadEmail() {
        return nbBadEmail;
    }


    /**
     * Sets the nbBadEmail value for this ApiCampaignReport.
     * 
     * @param nbBadEmail
     */
    public void setNbBadEmail(long nbBadEmail) {
        this.nbBadEmail = nbBadEmail;
    }


    /**
     * Gets the nbConversion value for this ApiCampaignReport.
     * 
     * @return nbConversion
     */
    public long getNbConversion() {
        return nbConversion;
    }


    /**
     * Sets the nbConversion value for this ApiCampaignReport.
     * 
     * @param nbConversion
     */
    public void setNbConversion(long nbConversion) {
        this.nbConversion = nbConversion;
    }


    /**
     * Gets the nbError value for this ApiCampaignReport.
     * 
     * @return nbError
     */
    public long getNbError() {
        return nbError;
    }


    /**
     * Sets the nbError value for this ApiCampaignReport.
     * 
     * @param nbError
     */
    public void setNbError(long nbError) {
        this.nbError = nbError;
    }


    /**
     * Gets the nbJoin value for this ApiCampaignReport.
     * 
     * @return nbJoin
     */
    public long getNbJoin() {
        return nbJoin;
    }


    /**
     * Sets the nbJoin value for this ApiCampaignReport.
     * 
     * @param nbJoin
     */
    public void setNbJoin(long nbJoin) {
        this.nbJoin = nbJoin;
    }


    /**
     * Gets the nbMessage value for this ApiCampaignReport.
     * 
     * @return nbMessage
     */
    public long getNbMessage() {
        return nbMessage;
    }


    /**
     * Sets the nbMessage value for this ApiCampaignReport.
     * 
     * @param nbMessage
     */
    public void setNbMessage(long nbMessage) {
        this.nbMessage = nbMessage;
    }


    /**
     * Gets the nbMultiple value for this ApiCampaignReport.
     * 
     * @return nbMultiple
     */
    public long getNbMultiple() {
        return nbMultiple;
    }


    /**
     * Sets the nbMultiple value for this ApiCampaignReport.
     * 
     * @param nbMultiple
     */
    public void setNbMultiple(long nbMultiple) {
        this.nbMultiple = nbMultiple;
    }


    /**
     * Gets the nbOpen value for this ApiCampaignReport.
     * 
     * @return nbOpen
     */
    public long getNbOpen() {
        return nbOpen;
    }


    /**
     * Sets the nbOpen value for this ApiCampaignReport.
     * 
     * @param nbOpen
     */
    public void setNbOpen(long nbOpen) {
        this.nbOpen = nbOpen;
    }


    /**
     * Gets the nbOpened value for this ApiCampaignReport.
     * 
     * @return nbOpened
     */
    public long getNbOpened() {
        return nbOpened;
    }


    /**
     * Sets the nbOpened value for this ApiCampaignReport.
     * 
     * @param nbOpened
     */
    public void setNbOpened(long nbOpened) {
        this.nbOpened = nbOpened;
    }


    /**
     * Gets the nbResponse value for this ApiCampaignReport.
     * 
     * @return nbResponse
     */
    public long getNbResponse() {
        return nbResponse;
    }


    /**
     * Sets the nbResponse value for this ApiCampaignReport.
     * 
     * @param nbResponse
     */
    public void setNbResponse(long nbResponse) {
        this.nbResponse = nbResponse;
    }


    /**
     * Gets the nbSelected value for this ApiCampaignReport.
     * 
     * @return nbSelected
     */
    public long getNbSelected() {
        return nbSelected;
    }


    /**
     * Sets the nbSelected value for this ApiCampaignReport.
     * 
     * @param nbSelected
     */
    public void setNbSelected(long nbSelected) {
        this.nbSelected = nbSelected;
    }


    /**
     * Gets the nbSingle value for this ApiCampaignReport.
     * 
     * @return nbSingle
     */
    public long getNbSingle() {
        return nbSingle;
    }


    /**
     * Sets the nbSingle value for this ApiCampaignReport.
     * 
     * @param nbSingle
     */
    public void setNbSingle(long nbSingle) {
        this.nbSingle = nbSingle;
    }


    /**
     * Gets the nbSkipped value for this ApiCampaignReport.
     * 
     * @return nbSkipped
     */
    public long getNbSkipped() {
        return nbSkipped;
    }


    /**
     * Sets the nbSkipped value for this ApiCampaignReport.
     * 
     * @param nbSkipped
     */
    public void setNbSkipped(long nbSkipped) {
        this.nbSkipped = nbSkipped;
    }


    /**
     * Gets the nbSoftError value for this ApiCampaignReport.
     * 
     * @return nbSoftError
     */
    public long getNbSoftError() {
        return nbSoftError;
    }


    /**
     * Sets the nbSoftError value for this ApiCampaignReport.
     * 
     * @param nbSoftError
     */
    public void setNbSoftError(long nbSoftError) {
        this.nbSoftError = nbSoftError;
    }


    /**
     * Gets the nbTotalClick value for this ApiCampaignReport.
     * 
     * @return nbTotalClick
     */
    public long getNbTotalClick() {
        return nbTotalClick;
    }


    /**
     * Sets the nbTotalClick value for this ApiCampaignReport.
     * 
     * @param nbTotalClick
     */
    public void setNbTotalClick(long nbTotalClick) {
        this.nbTotalClick = nbTotalClick;
    }


    /**
     * Gets the nbUniqueClick value for this ApiCampaignReport.
     * 
     * @return nbUniqueClick
     */
    public long getNbUniqueClick() {
        return nbUniqueClick;
    }


    /**
     * Sets the nbUniqueClick value for this ApiCampaignReport.
     * 
     * @param nbUniqueClick
     */
    public void setNbUniqueClick(long nbUniqueClick) {
        this.nbUniqueClick = nbUniqueClick;
    }


    /**
     * Gets the nbUnjoined value for this ApiCampaignReport.
     * 
     * @return nbUnjoined
     */
    public long getNbUnjoined() {
        return nbUnjoined;
    }


    /**
     * Sets the nbUnjoined value for this ApiCampaignReport.
     * 
     * @param nbUnjoined
     */
    public void setNbUnjoined(long nbUnjoined) {
        this.nbUnjoined = nbUnjoined;
    }


    /**
     * Gets the passThruFlg value for this ApiCampaignReport.
     * 
     * @return passThruFlg
     */
    public boolean isPassThruFlg() {
        return passThruFlg;
    }


    /**
     * Sets the passThruFlg value for this ApiCampaignReport.
     * 
     * @param passThruFlg
     */
    public void setPassThruFlg(boolean passThruFlg) {
        this.passThruFlg = passThruFlg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ApiCampaignReport)) return false;
        ApiCampaignReport other = (ApiCampaignReport) obj;
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
            this.initDuration == other.getInitDuration() &&
            this.messageId == other.getMessageId() &&
            this.nbBadEmail == other.getNbBadEmail() &&
            this.nbConversion == other.getNbConversion() &&
            this.nbError == other.getNbError() &&
            this.nbJoin == other.getNbJoin() &&
            this.nbMessage == other.getNbMessage() &&
            this.nbMultiple == other.getNbMultiple() &&
            this.nbOpen == other.getNbOpen() &&
            this.nbOpened == other.getNbOpened() &&
            this.nbResponse == other.getNbResponse() &&
            this.nbSelected == other.getNbSelected() &&
            this.nbSingle == other.getNbSingle() &&
            this.nbSkipped == other.getNbSkipped() &&
            this.nbSoftError == other.getNbSoftError() &&
            this.nbTotalClick == other.getNbTotalClick() &&
            this.nbUniqueClick == other.getNbUniqueClick() &&
            this.nbUnjoined == other.getNbUnjoined() &&
            this.passThruFlg == other.isPassThruFlg();
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
        _hashCode += new Long(getInitDuration()).hashCode();
        _hashCode += new Long(getMessageId()).hashCode();
        _hashCode += new Long(getNbBadEmail()).hashCode();
        _hashCode += new Long(getNbConversion()).hashCode();
        _hashCode += new Long(getNbError()).hashCode();
        _hashCode += new Long(getNbJoin()).hashCode();
        _hashCode += new Long(getNbMessage()).hashCode();
        _hashCode += new Long(getNbMultiple()).hashCode();
        _hashCode += new Long(getNbOpen()).hashCode();
        _hashCode += new Long(getNbOpened()).hashCode();
        _hashCode += new Long(getNbResponse()).hashCode();
        _hashCode += new Long(getNbSelected()).hashCode();
        _hashCode += new Long(getNbSingle()).hashCode();
        _hashCode += new Long(getNbSkipped()).hashCode();
        _hashCode += new Long(getNbSoftError()).hashCode();
        _hashCode += new Long(getNbTotalClick()).hashCode();
        _hashCode += new Long(getNbUniqueClick()).hashCode();
        _hashCode += new Long(getNbUnjoined()).hashCode();
        _hashCode += (isPassThruFlg() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ApiCampaignReport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignReport"));
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
        elemField.setFieldName("initDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbBadEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbBadEmail"));
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
        elemField.setFieldName("nbError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbMultiple");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbMultiple"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbOpened");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbOpened"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbResponse"));
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
        elemField.setFieldName("nbSingle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbSingle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbSkipped");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbSkipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbSoftError");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbSoftError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbTotalClick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbTotalClick"));
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
        elemField.setFieldName("nbUnjoined");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbUnjoined"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passThruFlg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passThruFlg"));
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

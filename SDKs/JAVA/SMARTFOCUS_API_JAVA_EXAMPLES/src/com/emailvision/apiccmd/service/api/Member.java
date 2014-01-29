/**
 * Member.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class Member  implements java.io.Serializable {
    private long clientId;

    private java.util.Calendar dateJoin;

    private java.util.Calendar dateUnJoin;

    private java.lang.String email;

    private java.lang.Long emvCellPhone;

    private java.util.Calendar emvHBQ;

    private java.lang.String emvISP;

    private com.emailvision.apiccmd.service.api.HbqReason hbqReason;

    private long id;

    private java.util.Calendar smsDateUnJoin;

    private java.util.Calendar smsEmvHbq;

    private com.emailvision.apiccmd.service.api.HbqReason smsHbqReason;

    private com.emailvision.apiccmd.service.api.Status status;

    public Member() {
    }

    public Member(
           long clientId,
           java.util.Calendar dateJoin,
           java.util.Calendar dateUnJoin,
           java.lang.String email,
           java.lang.Long emvCellPhone,
           java.util.Calendar emvHBQ,
           java.lang.String emvISP,
           com.emailvision.apiccmd.service.api.HbqReason hbqReason,
           long id,
           java.util.Calendar smsDateUnJoin,
           java.util.Calendar smsEmvHbq,
           com.emailvision.apiccmd.service.api.HbqReason smsHbqReason,
           com.emailvision.apiccmd.service.api.Status status) {
           this.clientId = clientId;
           this.dateJoin = dateJoin;
           this.dateUnJoin = dateUnJoin;
           this.email = email;
           this.emvCellPhone = emvCellPhone;
           this.emvHBQ = emvHBQ;
           this.emvISP = emvISP;
           this.hbqReason = hbqReason;
           this.id = id;
           this.smsDateUnJoin = smsDateUnJoin;
           this.smsEmvHbq = smsEmvHbq;
           this.smsHbqReason = smsHbqReason;
           this.status = status;
    }


    /**
     * Gets the clientId value for this Member.
     * 
     * @return clientId
     */
    public long getClientId() {
        return clientId;
    }


    /**
     * Sets the clientId value for this Member.
     * 
     * @param clientId
     */
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }


    /**
     * Gets the dateJoin value for this Member.
     * 
     * @return dateJoin
     */
    public java.util.Calendar getDateJoin() {
        return dateJoin;
    }


    /**
     * Sets the dateJoin value for this Member.
     * 
     * @param dateJoin
     */
    public void setDateJoin(java.util.Calendar dateJoin) {
        this.dateJoin = dateJoin;
    }


    /**
     * Gets the dateUnJoin value for this Member.
     * 
     * @return dateUnJoin
     */
    public java.util.Calendar getDateUnJoin() {
        return dateUnJoin;
    }


    /**
     * Sets the dateUnJoin value for this Member.
     * 
     * @param dateUnJoin
     */
    public void setDateUnJoin(java.util.Calendar dateUnJoin) {
        this.dateUnJoin = dateUnJoin;
    }


    /**
     * Gets the email value for this Member.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Member.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the emvCellPhone value for this Member.
     * 
     * @return emvCellPhone
     */
    public java.lang.Long getEmvCellPhone() {
        return emvCellPhone;
    }


    /**
     * Sets the emvCellPhone value for this Member.
     * 
     * @param emvCellPhone
     */
    public void setEmvCellPhone(java.lang.Long emvCellPhone) {
        this.emvCellPhone = emvCellPhone;
    }


    /**
     * Gets the emvHBQ value for this Member.
     * 
     * @return emvHBQ
     */
    public java.util.Calendar getEmvHBQ() {
        return emvHBQ;
    }


    /**
     * Sets the emvHBQ value for this Member.
     * 
     * @param emvHBQ
     */
    public void setEmvHBQ(java.util.Calendar emvHBQ) {
        this.emvHBQ = emvHBQ;
    }


    /**
     * Gets the emvISP value for this Member.
     * 
     * @return emvISP
     */
    public java.lang.String getEmvISP() {
        return emvISP;
    }


    /**
     * Sets the emvISP value for this Member.
     * 
     * @param emvISP
     */
    public void setEmvISP(java.lang.String emvISP) {
        this.emvISP = emvISP;
    }


    /**
     * Gets the hbqReason value for this Member.
     * 
     * @return hbqReason
     */
    public com.emailvision.apiccmd.service.api.HbqReason getHbqReason() {
        return hbqReason;
    }


    /**
     * Sets the hbqReason value for this Member.
     * 
     * @param hbqReason
     */
    public void setHbqReason(com.emailvision.apiccmd.service.api.HbqReason hbqReason) {
        this.hbqReason = hbqReason;
    }


    /**
     * Gets the id value for this Member.
     * 
     * @return id
     */
    public long getId() {
        return id;
    }


    /**
     * Sets the id value for this Member.
     * 
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }


    /**
     * Gets the smsDateUnJoin value for this Member.
     * 
     * @return smsDateUnJoin
     */
    public java.util.Calendar getSmsDateUnJoin() {
        return smsDateUnJoin;
    }


    /**
     * Sets the smsDateUnJoin value for this Member.
     * 
     * @param smsDateUnJoin
     */
    public void setSmsDateUnJoin(java.util.Calendar smsDateUnJoin) {
        this.smsDateUnJoin = smsDateUnJoin;
    }


    /**
     * Gets the smsEmvHbq value for this Member.
     * 
     * @return smsEmvHbq
     */
    public java.util.Calendar getSmsEmvHbq() {
        return smsEmvHbq;
    }


    /**
     * Sets the smsEmvHbq value for this Member.
     * 
     * @param smsEmvHbq
     */
    public void setSmsEmvHbq(java.util.Calendar smsEmvHbq) {
        this.smsEmvHbq = smsEmvHbq;
    }


    /**
     * Gets the smsHbqReason value for this Member.
     * 
     * @return smsHbqReason
     */
    public com.emailvision.apiccmd.service.api.HbqReason getSmsHbqReason() {
        return smsHbqReason;
    }


    /**
     * Sets the smsHbqReason value for this Member.
     * 
     * @param smsHbqReason
     */
    public void setSmsHbqReason(com.emailvision.apiccmd.service.api.HbqReason smsHbqReason) {
        this.smsHbqReason = smsHbqReason;
    }


    /**
     * Gets the status value for this Member.
     * 
     * @return status
     */
    public com.emailvision.apiccmd.service.api.Status getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Member.
     * 
     * @param status
     */
    public void setStatus(com.emailvision.apiccmd.service.api.Status status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Member)) return false;
        Member other = (Member) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clientId == other.getClientId() &&
            ((this.dateJoin==null && other.getDateJoin()==null) || 
             (this.dateJoin!=null &&
              this.dateJoin.equals(other.getDateJoin()))) &&
            ((this.dateUnJoin==null && other.getDateUnJoin()==null) || 
             (this.dateUnJoin!=null &&
              this.dateUnJoin.equals(other.getDateUnJoin()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.emvCellPhone==null && other.getEmvCellPhone()==null) || 
             (this.emvCellPhone!=null &&
              this.emvCellPhone.equals(other.getEmvCellPhone()))) &&
            ((this.emvHBQ==null && other.getEmvHBQ()==null) || 
             (this.emvHBQ!=null &&
              this.emvHBQ.equals(other.getEmvHBQ()))) &&
            ((this.emvISP==null && other.getEmvISP()==null) || 
             (this.emvISP!=null &&
              this.emvISP.equals(other.getEmvISP()))) &&
            ((this.hbqReason==null && other.getHbqReason()==null) || 
             (this.hbqReason!=null &&
              this.hbqReason.equals(other.getHbqReason()))) &&
            this.id == other.getId() &&
            ((this.smsDateUnJoin==null && other.getSmsDateUnJoin()==null) || 
             (this.smsDateUnJoin!=null &&
              this.smsDateUnJoin.equals(other.getSmsDateUnJoin()))) &&
            ((this.smsEmvHbq==null && other.getSmsEmvHbq()==null) || 
             (this.smsEmvHbq!=null &&
              this.smsEmvHbq.equals(other.getSmsEmvHbq()))) &&
            ((this.smsHbqReason==null && other.getSmsHbqReason()==null) || 
             (this.smsHbqReason!=null &&
              this.smsHbqReason.equals(other.getSmsHbqReason()))) &&
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
        _hashCode += new Long(getClientId()).hashCode();
        if (getDateJoin() != null) {
            _hashCode += getDateJoin().hashCode();
        }
        if (getDateUnJoin() != null) {
            _hashCode += getDateUnJoin().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmvCellPhone() != null) {
            _hashCode += getEmvCellPhone().hashCode();
        }
        if (getEmvHBQ() != null) {
            _hashCode += getEmvHBQ().hashCode();
        }
        if (getEmvISP() != null) {
            _hashCode += getEmvISP().hashCode();
        }
        if (getHbqReason() != null) {
            _hashCode += getHbqReason().hashCode();
        }
        _hashCode += new Long(getId()).hashCode();
        if (getSmsDateUnJoin() != null) {
            _hashCode += getSmsDateUnJoin().hashCode();
        }
        if (getSmsEmvHbq() != null) {
            _hashCode += getSmsEmvHbq().hashCode();
        }
        if (getSmsHbqReason() != null) {
            _hashCode += getSmsHbqReason().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Member.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "member"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateUnJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateUnJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvCellPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emvCellPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvHBQ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emvHBQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emvISP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emvISP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hbqReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hbqReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "hbqReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsDateUnJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsDateUnJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsEmvHbq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsEmvHbq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsHbqReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsHbqReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "hbqReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "status"));
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

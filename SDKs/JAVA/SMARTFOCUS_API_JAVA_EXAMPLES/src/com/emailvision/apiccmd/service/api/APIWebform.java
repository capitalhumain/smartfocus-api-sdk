/**
 * APIWebform.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class APIWebform  implements java.io.Serializable {
    private java.lang.Long webformId;

    private java.lang.String name;

    private java.lang.String description;

    private com.emailvision.apiccmd.service.api.ApiWebformType type;

    private com.emailvision.apiccmd.service.api.ApiWebformLanguage controlWarningLanguage;

    private com.emailvision.apiccmd.service.api.ApiWebformStatus status;

    private java.util.Calendar creationDate;

    private java.util.Calendar expirationDate;

    private java.lang.Boolean useDefaultExpirationLandingPage;

    private java.lang.String customExpirationLandingPageUrl;

    private java.lang.String confirmationLandingPageUrl;

    private java.lang.String standardErrorLandingPageUrl;

    private java.lang.String duplicateEmailErrorLandingPageUrl;

    private com.emailvision.apiccmd.service.api.APIWebformField[] fields;

    private com.emailvision.apiccmd.service.api.ApiWebformBouncebackType bouncebackType;

    private java.lang.String[] customerServiceAddresses;

    private java.lang.String replyTo;

    private java.lang.Boolean overrideUnsubscribedUsersStatus;

    private java.lang.Boolean allowMessageOverriding;

    private java.lang.Long bouncebackMessageId;

    private java.lang.Long managerBouncebackMessageId;

    public APIWebform() {
    }

    public APIWebform(
           java.lang.Long webformId,
           java.lang.String name,
           java.lang.String description,
           com.emailvision.apiccmd.service.api.ApiWebformType type,
           com.emailvision.apiccmd.service.api.ApiWebformLanguage controlWarningLanguage,
           com.emailvision.apiccmd.service.api.ApiWebformStatus status,
           java.util.Calendar creationDate,
           java.util.Calendar expirationDate,
           java.lang.Boolean useDefaultExpirationLandingPage,
           java.lang.String customExpirationLandingPageUrl,
           java.lang.String confirmationLandingPageUrl,
           java.lang.String standardErrorLandingPageUrl,
           java.lang.String duplicateEmailErrorLandingPageUrl,
           com.emailvision.apiccmd.service.api.APIWebformField[] fields,
           com.emailvision.apiccmd.service.api.ApiWebformBouncebackType bouncebackType,
           java.lang.String[] customerServiceAddresses,
           java.lang.String replyTo,
           java.lang.Boolean overrideUnsubscribedUsersStatus,
           java.lang.Boolean allowMessageOverriding,
           java.lang.Long bouncebackMessageId,
           java.lang.Long managerBouncebackMessageId) {
           this.webformId = webformId;
           this.name = name;
           this.description = description;
           this.type = type;
           this.controlWarningLanguage = controlWarningLanguage;
           this.status = status;
           this.creationDate = creationDate;
           this.expirationDate = expirationDate;
           this.useDefaultExpirationLandingPage = useDefaultExpirationLandingPage;
           this.customExpirationLandingPageUrl = customExpirationLandingPageUrl;
           this.confirmationLandingPageUrl = confirmationLandingPageUrl;
           this.standardErrorLandingPageUrl = standardErrorLandingPageUrl;
           this.duplicateEmailErrorLandingPageUrl = duplicateEmailErrorLandingPageUrl;
           this.fields = fields;
           this.bouncebackType = bouncebackType;
           this.customerServiceAddresses = customerServiceAddresses;
           this.replyTo = replyTo;
           this.overrideUnsubscribedUsersStatus = overrideUnsubscribedUsersStatus;
           this.allowMessageOverriding = allowMessageOverriding;
           this.bouncebackMessageId = bouncebackMessageId;
           this.managerBouncebackMessageId = managerBouncebackMessageId;
    }


    /**
     * Gets the webformId value for this APIWebform.
     * 
     * @return webformId
     */
    public java.lang.Long getWebformId() {
        return webformId;
    }


    /**
     * Sets the webformId value for this APIWebform.
     * 
     * @param webformId
     */
    public void setWebformId(java.lang.Long webformId) {
        this.webformId = webformId;
    }


    /**
     * Gets the name value for this APIWebform.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this APIWebform.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the description value for this APIWebform.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this APIWebform.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the type value for this APIWebform.
     * 
     * @return type
     */
    public com.emailvision.apiccmd.service.api.ApiWebformType getType() {
        return type;
    }


    /**
     * Sets the type value for this APIWebform.
     * 
     * @param type
     */
    public void setType(com.emailvision.apiccmd.service.api.ApiWebformType type) {
        this.type = type;
    }


    /**
     * Gets the controlWarningLanguage value for this APIWebform.
     * 
     * @return controlWarningLanguage
     */
    public com.emailvision.apiccmd.service.api.ApiWebformLanguage getControlWarningLanguage() {
        return controlWarningLanguage;
    }


    /**
     * Sets the controlWarningLanguage value for this APIWebform.
     * 
     * @param controlWarningLanguage
     */
    public void setControlWarningLanguage(com.emailvision.apiccmd.service.api.ApiWebformLanguage controlWarningLanguage) {
        this.controlWarningLanguage = controlWarningLanguage;
    }


    /**
     * Gets the status value for this APIWebform.
     * 
     * @return status
     */
    public com.emailvision.apiccmd.service.api.ApiWebformStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this APIWebform.
     * 
     * @param status
     */
    public void setStatus(com.emailvision.apiccmd.service.api.ApiWebformStatus status) {
        this.status = status;
    }


    /**
     * Gets the creationDate value for this APIWebform.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this APIWebform.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the expirationDate value for this APIWebform.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this APIWebform.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the useDefaultExpirationLandingPage value for this APIWebform.
     * 
     * @return useDefaultExpirationLandingPage
     */
    public java.lang.Boolean getUseDefaultExpirationLandingPage() {
        return useDefaultExpirationLandingPage;
    }


    /**
     * Sets the useDefaultExpirationLandingPage value for this APIWebform.
     * 
     * @param useDefaultExpirationLandingPage
     */
    public void setUseDefaultExpirationLandingPage(java.lang.Boolean useDefaultExpirationLandingPage) {
        this.useDefaultExpirationLandingPage = useDefaultExpirationLandingPage;
    }


    /**
     * Gets the customExpirationLandingPageUrl value for this APIWebform.
     * 
     * @return customExpirationLandingPageUrl
     */
    public java.lang.String getCustomExpirationLandingPageUrl() {
        return customExpirationLandingPageUrl;
    }


    /**
     * Sets the customExpirationLandingPageUrl value for this APIWebform.
     * 
     * @param customExpirationLandingPageUrl
     */
    public void setCustomExpirationLandingPageUrl(java.lang.String customExpirationLandingPageUrl) {
        this.customExpirationLandingPageUrl = customExpirationLandingPageUrl;
    }


    /**
     * Gets the confirmationLandingPageUrl value for this APIWebform.
     * 
     * @return confirmationLandingPageUrl
     */
    public java.lang.String getConfirmationLandingPageUrl() {
        return confirmationLandingPageUrl;
    }


    /**
     * Sets the confirmationLandingPageUrl value for this APIWebform.
     * 
     * @param confirmationLandingPageUrl
     */
    public void setConfirmationLandingPageUrl(java.lang.String confirmationLandingPageUrl) {
        this.confirmationLandingPageUrl = confirmationLandingPageUrl;
    }


    /**
     * Gets the standardErrorLandingPageUrl value for this APIWebform.
     * 
     * @return standardErrorLandingPageUrl
     */
    public java.lang.String getStandardErrorLandingPageUrl() {
        return standardErrorLandingPageUrl;
    }


    /**
     * Sets the standardErrorLandingPageUrl value for this APIWebform.
     * 
     * @param standardErrorLandingPageUrl
     */
    public void setStandardErrorLandingPageUrl(java.lang.String standardErrorLandingPageUrl) {
        this.standardErrorLandingPageUrl = standardErrorLandingPageUrl;
    }


    /**
     * Gets the duplicateEmailErrorLandingPageUrl value for this APIWebform.
     * 
     * @return duplicateEmailErrorLandingPageUrl
     */
    public java.lang.String getDuplicateEmailErrorLandingPageUrl() {
        return duplicateEmailErrorLandingPageUrl;
    }


    /**
     * Sets the duplicateEmailErrorLandingPageUrl value for this APIWebform.
     * 
     * @param duplicateEmailErrorLandingPageUrl
     */
    public void setDuplicateEmailErrorLandingPageUrl(java.lang.String duplicateEmailErrorLandingPageUrl) {
        this.duplicateEmailErrorLandingPageUrl = duplicateEmailErrorLandingPageUrl;
    }


    /**
     * Gets the fields value for this APIWebform.
     * 
     * @return fields
     */
    public com.emailvision.apiccmd.service.api.APIWebformField[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this APIWebform.
     * 
     * @param fields
     */
    public void setFields(com.emailvision.apiccmd.service.api.APIWebformField[] fields) {
        this.fields = fields;
    }


    /**
     * Gets the bouncebackType value for this APIWebform.
     * 
     * @return bouncebackType
     */
    public com.emailvision.apiccmd.service.api.ApiWebformBouncebackType getBouncebackType() {
        return bouncebackType;
    }


    /**
     * Sets the bouncebackType value for this APIWebform.
     * 
     * @param bouncebackType
     */
    public void setBouncebackType(com.emailvision.apiccmd.service.api.ApiWebformBouncebackType bouncebackType) {
        this.bouncebackType = bouncebackType;
    }


    /**
     * Gets the customerServiceAddresses value for this APIWebform.
     * 
     * @return customerServiceAddresses
     */
    public java.lang.String[] getCustomerServiceAddresses() {
        return customerServiceAddresses;
    }


    /**
     * Sets the customerServiceAddresses value for this APIWebform.
     * 
     * @param customerServiceAddresses
     */
    public void setCustomerServiceAddresses(java.lang.String[] customerServiceAddresses) {
        this.customerServiceAddresses = customerServiceAddresses;
    }


    /**
     * Gets the replyTo value for this APIWebform.
     * 
     * @return replyTo
     */
    public java.lang.String getReplyTo() {
        return replyTo;
    }


    /**
     * Sets the replyTo value for this APIWebform.
     * 
     * @param replyTo
     */
    public void setReplyTo(java.lang.String replyTo) {
        this.replyTo = replyTo;
    }


    /**
     * Gets the overrideUnsubscribedUsersStatus value for this APIWebform.
     * 
     * @return overrideUnsubscribedUsersStatus
     */
    public java.lang.Boolean getOverrideUnsubscribedUsersStatus() {
        return overrideUnsubscribedUsersStatus;
    }


    /**
     * Sets the overrideUnsubscribedUsersStatus value for this APIWebform.
     * 
     * @param overrideUnsubscribedUsersStatus
     */
    public void setOverrideUnsubscribedUsersStatus(java.lang.Boolean overrideUnsubscribedUsersStatus) {
        this.overrideUnsubscribedUsersStatus = overrideUnsubscribedUsersStatus;
    }


    /**
     * Gets the allowMessageOverriding value for this APIWebform.
     * 
     * @return allowMessageOverriding
     */
    public java.lang.Boolean getAllowMessageOverriding() {
        return allowMessageOverriding;
    }


    /**
     * Sets the allowMessageOverriding value for this APIWebform.
     * 
     * @param allowMessageOverriding
     */
    public void setAllowMessageOverriding(java.lang.Boolean allowMessageOverriding) {
        this.allowMessageOverriding = allowMessageOverriding;
    }


    /**
     * Gets the bouncebackMessageId value for this APIWebform.
     * 
     * @return bouncebackMessageId
     */
    public java.lang.Long getBouncebackMessageId() {
        return bouncebackMessageId;
    }


    /**
     * Sets the bouncebackMessageId value for this APIWebform.
     * 
     * @param bouncebackMessageId
     */
    public void setBouncebackMessageId(java.lang.Long bouncebackMessageId) {
        this.bouncebackMessageId = bouncebackMessageId;
    }


    /**
     * Gets the managerBouncebackMessageId value for this APIWebform.
     * 
     * @return managerBouncebackMessageId
     */
    public java.lang.Long getManagerBouncebackMessageId() {
        return managerBouncebackMessageId;
    }


    /**
     * Sets the managerBouncebackMessageId value for this APIWebform.
     * 
     * @param managerBouncebackMessageId
     */
    public void setManagerBouncebackMessageId(java.lang.Long managerBouncebackMessageId) {
        this.managerBouncebackMessageId = managerBouncebackMessageId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof APIWebform)) return false;
        APIWebform other = (APIWebform) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webformId==null && other.getWebformId()==null) || 
             (this.webformId!=null &&
              this.webformId.equals(other.getWebformId()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.controlWarningLanguage==null && other.getControlWarningLanguage()==null) || 
             (this.controlWarningLanguage!=null &&
              this.controlWarningLanguage.equals(other.getControlWarningLanguage()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.useDefaultExpirationLandingPage==null && other.getUseDefaultExpirationLandingPage()==null) || 
             (this.useDefaultExpirationLandingPage!=null &&
              this.useDefaultExpirationLandingPage.equals(other.getUseDefaultExpirationLandingPage()))) &&
            ((this.customExpirationLandingPageUrl==null && other.getCustomExpirationLandingPageUrl()==null) || 
             (this.customExpirationLandingPageUrl!=null &&
              this.customExpirationLandingPageUrl.equals(other.getCustomExpirationLandingPageUrl()))) &&
            ((this.confirmationLandingPageUrl==null && other.getConfirmationLandingPageUrl()==null) || 
             (this.confirmationLandingPageUrl!=null &&
              this.confirmationLandingPageUrl.equals(other.getConfirmationLandingPageUrl()))) &&
            ((this.standardErrorLandingPageUrl==null && other.getStandardErrorLandingPageUrl()==null) || 
             (this.standardErrorLandingPageUrl!=null &&
              this.standardErrorLandingPageUrl.equals(other.getStandardErrorLandingPageUrl()))) &&
            ((this.duplicateEmailErrorLandingPageUrl==null && other.getDuplicateEmailErrorLandingPageUrl()==null) || 
             (this.duplicateEmailErrorLandingPageUrl!=null &&
              this.duplicateEmailErrorLandingPageUrl.equals(other.getDuplicateEmailErrorLandingPageUrl()))) &&
            ((this.fields==null && other.getFields()==null) || 
             (this.fields!=null &&
              java.util.Arrays.equals(this.fields, other.getFields()))) &&
            ((this.bouncebackType==null && other.getBouncebackType()==null) || 
             (this.bouncebackType!=null &&
              this.bouncebackType.equals(other.getBouncebackType()))) &&
            ((this.customerServiceAddresses==null && other.getCustomerServiceAddresses()==null) || 
             (this.customerServiceAddresses!=null &&
              java.util.Arrays.equals(this.customerServiceAddresses, other.getCustomerServiceAddresses()))) &&
            ((this.replyTo==null && other.getReplyTo()==null) || 
             (this.replyTo!=null &&
              this.replyTo.equals(other.getReplyTo()))) &&
            ((this.overrideUnsubscribedUsersStatus==null && other.getOverrideUnsubscribedUsersStatus()==null) || 
             (this.overrideUnsubscribedUsersStatus!=null &&
              this.overrideUnsubscribedUsersStatus.equals(other.getOverrideUnsubscribedUsersStatus()))) &&
            ((this.allowMessageOverriding==null && other.getAllowMessageOverriding()==null) || 
             (this.allowMessageOverriding!=null &&
              this.allowMessageOverriding.equals(other.getAllowMessageOverriding()))) &&
            ((this.bouncebackMessageId==null && other.getBouncebackMessageId()==null) || 
             (this.bouncebackMessageId!=null &&
              this.bouncebackMessageId.equals(other.getBouncebackMessageId()))) &&
            ((this.managerBouncebackMessageId==null && other.getManagerBouncebackMessageId()==null) || 
             (this.managerBouncebackMessageId!=null &&
              this.managerBouncebackMessageId.equals(other.getManagerBouncebackMessageId())));
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
        if (getWebformId() != null) {
            _hashCode += getWebformId().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getControlWarningLanguage() != null) {
            _hashCode += getControlWarningLanguage().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getUseDefaultExpirationLandingPage() != null) {
            _hashCode += getUseDefaultExpirationLandingPage().hashCode();
        }
        if (getCustomExpirationLandingPageUrl() != null) {
            _hashCode += getCustomExpirationLandingPageUrl().hashCode();
        }
        if (getConfirmationLandingPageUrl() != null) {
            _hashCode += getConfirmationLandingPageUrl().hashCode();
        }
        if (getStandardErrorLandingPageUrl() != null) {
            _hashCode += getStandardErrorLandingPageUrl().hashCode();
        }
        if (getDuplicateEmailErrorLandingPageUrl() != null) {
            _hashCode += getDuplicateEmailErrorLandingPageUrl().hashCode();
        }
        if (getFields() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFields());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFields(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBouncebackType() != null) {
            _hashCode += getBouncebackType().hashCode();
        }
        if (getCustomerServiceAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerServiceAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerServiceAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReplyTo() != null) {
            _hashCode += getReplyTo().hashCode();
        }
        if (getOverrideUnsubscribedUsersStatus() != null) {
            _hashCode += getOverrideUnsubscribedUsersStatus().hashCode();
        }
        if (getAllowMessageOverriding() != null) {
            _hashCode += getAllowMessageOverriding().hashCode();
        }
        if (getBouncebackMessageId() != null) {
            _hashCode += getBouncebackMessageId().hashCode();
        }
        if (getManagerBouncebackMessageId() != null) {
            _hashCode += getManagerBouncebackMessageId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(APIWebform.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebform"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webformId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "webformId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("controlWarningLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "controlWarningLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformLanguage"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDefaultExpirationLandingPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useDefaultExpirationLandingPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customExpirationLandingPageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customExpirationLandingPageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationLandingPageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmationLandingPageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardErrorLandingPageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "standardErrorLandingPageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicateEmailErrorLandingPageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duplicateEmailErrorLandingPageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformField"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "field"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouncebackType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bouncebackType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformBouncebackType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerServiceAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customerServiceAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "customerServiceAddress"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replyTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overrideUnsubscribedUsersStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overrideUnsubscribedUsersStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowMessageOverriding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowMessageOverriding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bouncebackMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bouncebackMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerBouncebackMessageId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "managerBouncebackMessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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

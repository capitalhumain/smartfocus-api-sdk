/**
 * CcmdServiceServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apiccmd.service.api;

public class CcmdServiceServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.emailvision.apiccmd.service.api.CcmdService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[184];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
        _initOperationDesc19();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTestMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUnsubscribeBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createEmailMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "fromEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "to"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "body"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "encoding"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replyTo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "replyToEmail"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isBounceback"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hotmailUnsubFlg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "hotmailUnsubUrl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("openApiConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateWebformStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webformId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformStatus"), com.emailvision.apiccmd.service.api.ApiWebformStatus.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "emvWebServiceException"),
                      "com.emailvision.apiccmd.service.api.SoapError",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "SoapError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEmailMessagePreview");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "part"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testCampaignByMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEmailMessagesByField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addShareLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "linkType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "buttonUrl"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignsByPeriod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateBegin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getClientTestGroups");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("distinctMembersCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationDeleteCriteria");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "difflistId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orderCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("untrackLinkByOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastBanners");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUrlByOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiUrl"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiUrl.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testEmailMessageByMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "part"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBannersByPeriod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateBegin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllUnusedTrackedLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateMailingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMailingListsByField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationCreateInclusionExclusionCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "apiInclusionExclusionCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiInclusionExclusionCriteria"), com.emailvision.apiccmd.service.api.ApiInclusionExclusionCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateSocialNetworkCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "socialNetworkCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSocialNetworkCriteria"), com.emailvision.apiccmd.service.api.ApiSocialNetworkCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebformIntegration");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webformId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformIntegration"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.APIWebformIntegration.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "emvWebServiceException"),
                      "com.emailvision.apiccmd.service.api.SoapError",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "SoapError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSmsMessageByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessage"), com.emailvision.apiccmd.service.api.ApiMessage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteBanner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllBannerTrackedLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("untrackAllBannerLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastCampaigns");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastSegments");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddPersonalisedBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastMailingLists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateDateDemographicCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateDemographicCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDateDemographicCriteria"), com.emailvision.apiccmd.service.api.ApiDateDemographicCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddActionBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "action"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createActionBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "action"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPersonalisedBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSmsMessagePreview");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("copyWebform");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webformId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebform"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.APIWebform.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "emvWebServiceException"),
                      "com.emailvision.apiccmd.service.api.SoapError",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "SoapError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("untrackAllLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationCreateSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "apiSegmentation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ApiSegmentation"), com.emailvision.apiccmd.service.api.ApiSegmentation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMailingListsByPeriod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateBegin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addTestMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBannersByField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddMirrorBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUnsubscribeUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaign"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiCampaign.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createWebform");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webform"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebform"), com.emailvision.apiccmd.service.api.APIWebform.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "emvWebServiceException"),
                      "com.emailvision.apiccmd.service.api.SoapError",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "SoapError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createPersonalisedUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddStringDemographicCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "stringDemographicCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiStringDemographicCriteria"), com.emailvision.apiccmd.service.api.ApiStringDemographicCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignSnapshot");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignSnapshot"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiCampaignSnapshot.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBanner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "contentType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "content"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("postCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateDataMartCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataMartCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDataMartCriteria"), com.emailvision.apiccmd.service.api.ApiDataMartCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBannerByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "banner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBanner"), com.emailvision.apiccmd.service.api.ApiBanner.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddDateDemographicCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateDemographicCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDateDemographicCriteria"), com.emailvision.apiccmd.service.api.ApiDateDemographicCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateMessageByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessage"), com.emailvision.apiccmd.service.api.ApiMessage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddStandardBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationGetPersoFragList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nbItemPerPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiPersoFragCriteria"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiPersoFragCriteria[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createEmailMessageByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "message"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessage"), com.emailvision.apiccmd.service.api.ApiMessage.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddPersonalisedUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMessageSummaryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listOptionsEntity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageListOptions"), com.emailvision.apiccmd.service.api.APIMessageListOptions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSummaryList"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.APIMessageSummaryList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddSerieTrackableLinkCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trackableLinkCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTrackableLinkCriteria"), com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSmsMessagesByField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("openPartnerConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partnerkey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiPartnerConnectionResult"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiPartnerConnectionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sendDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mailingListId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "notifProgress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "postClickTracking"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emaildedupflg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("membersCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateNumericDemographicCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numericDemographicCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiNumericDemographicCriteria"), com.emailvision.apiccmd.service.api.ApiNumericDemographicCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createStandardUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddNumericDemographicCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "numericDemographicCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiNumericDemographicCriteria"), com.emailvision.apiccmd.service.api.ApiNumericDemographicCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("closeApiConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddActionUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "action"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddRecencyCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "recencyCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyCriteria"), com.emailvision.apiccmd.service.api.ApiRecencyCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUpdateBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "apiSegmentation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ApiSegmentation"), com.emailvision.apiccmd.service.api.ApiSegmentation.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddUnsubscribeBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddUpdateUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddMirrorUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSmsTestMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "cellphone"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "member"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.Member.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBannerByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "banner"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBanner"), com.emailvision.apiccmd.service.api.ApiBanner.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessage"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiMessage.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBanner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSegmentByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegment"), com.emailvision.apiccmd.service.api.ApiSegment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignsByField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBannerLinkByOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBannerLink"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiBannerLink.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMessagesByPeriod");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateBegin"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dateEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createMirrorBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNotValidatedSenders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddCampaignActionCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "actionCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiActionCriteria"), com.emailvision.apiccmd.service.api.ApiActionCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateSerieTrackableLinkCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trackableLinkCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTrackableLinkCriteria"), com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCampaignWithAnalytics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sendDate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mailingListId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "notifProgress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "postClickTracking"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "emaildedupflg"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllBannerTrackableLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationDeleteSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "difflistId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testSmsMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddUnsubscribeUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSQLSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sqlCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllTrackableLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSQLSegmentByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegment"), com.emailvision.apiccmd.service.api.ApiSegment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCombinedSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "operator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createCampaignByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaign"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaign"), com.emailvision.apiccmd.service.api.ApiCampaign.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSegmentsByField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cloneMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("untrackBannerLinkByOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createMirrorUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createTestMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "email"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "member"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.Member.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createActionUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "action"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddCampaignTrackableLinkCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trackableLinkCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTrackableLinkCriteria"), com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testEmailMessageByGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "subject"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "part"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createMailingListByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mailingList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMailingList"), com.emailvision.apiccmd.service.api.ApiMailingList.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("isHtmlValid");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteMailingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateTestGroupByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "testGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTestGroup"), com.emailvision.apiccmd.service.api.ApiTestGroup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaignId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignReport"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiCampaignReport.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getDefaultSender");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegment"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiSegment.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateInclusionExclusionCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "apiInclusionExclusionCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiInclusionExclusionCriteria"), com.emailvision.apiccmd.service.api.ApiInclusionExclusionCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebformSummaryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformListOptions"), com.emailvision.apiccmd.service.api.APIWebformListOptions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSummaryList"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.APIWebformSummaryList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "emvWebServiceException"),
                      "com.emailvision.apiccmd.service.api.SoapError",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "SoapError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationGetSegmentCriterias");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "difflistId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegmentationCriteria"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiSegmentationCriteria[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createSmsMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "description"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "from"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "body"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mailingListCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeTestMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBannerSummaryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerListOptions"), com.emailvision.apiccmd.service.api.APIBannerListOptions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSummaryList"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.APIBannerSummaryList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationGetSegmentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nbItemsPerPage"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("trackLinkByPosition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "position"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "part"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateCampaignTrackableLinkCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "trackableLinkCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTrackableLinkCriteria"), com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationDistinctCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cloneBanner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "newName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBasicSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "criteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBannerPreview");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddDataMartCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataMartCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDataMartCriteria"), com.emailvision.apiccmd.service.api.ApiDataMartCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateCampaignByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "campaign"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaign"), com.emailvision.apiccmd.service.api.ApiCampaign.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getValidatedAltSenders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignsByStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "status"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddSocialNetworkCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "socialNetworkCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSocialNetworkCriteria"), com.emailvision.apiccmd.service.api.ApiSocialNetworkCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddStandardUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createBasicSegmentByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segment"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegment"), com.emailvision.apiccmd.service.api.ApiSegment.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unpostCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pauseCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationGetSegmentById");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "difflistId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ApiSegmentation"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiSegmentation.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateSerieActionCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "actionCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiActionCriteria"), com.emailvision.apiccmd.service.api.ApiActionCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createTestGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateWebform");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webform"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebform"), com.emailvision.apiccmd.service.api.APIWebform.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "emvWebServiceException"),
                      "com.emailvision.apiccmd.service.api.SoapError",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "SoapError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCampaignSummaryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignListOptions"), com.emailvision.apiccmd.service.api.APICampaignListOptions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignSummaryList"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.APICampaignSummaryList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("trackBannerLinkByPosition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "position"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllUnusedBannerTrackedLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mailingListDistinctCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createMailingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "desc"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateCampaignActionCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "actionCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiActionCriteria"), com.emailvision.apiccmd.service.api.ApiActionCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastEmailMessages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createStandardBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "url"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("trackAllLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestMembers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "testMembers"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "memberId"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteTestGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createAndAddUpdateBannerLink");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllTrackedLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSegmentSummaryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listOptionsEntity"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentListOptions"), com.emailvision.apiccmd.service.api.APISegmentListOptions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSummaryList"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.APISegmentSummaryList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("removeSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "segmentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationAddSerieActionCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "actionCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiActionCriteria"), com.emailvision.apiccmd.service.api.ApiActionCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateRecencyCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "recencyCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyCriteria"), com.emailvision.apiccmd.service.api.ApiRecencyCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getWebform");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "webformId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebform"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.APIWebform.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "emvWebServiceException"),
                      "com.emailvision.apiccmd.service.api.SoapError",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "SoapError"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBanner");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBanner"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiBanner.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateMailingListByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mailingList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMailingList"), com.emailvision.apiccmd.service.api.ApiMailingList.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createTestGroupByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "testGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTestGroup"), com.emailvision.apiccmd.service.api.ApiTestGroup.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unpauseCampaign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateUrlByField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[172] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("cloneMailingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[173] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getMailingList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMailingList"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiMailingList.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[174] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTestGroup"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.ApiTestGroup.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[175] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateSegment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[176] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTestMember");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "memberId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "member"));
        oper.setReturnClass(com.emailvision.apiccmd.service.api.Member.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[177] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createUpdateUrl");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageOK"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "messageError"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[178] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("testCampaignByGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "groupId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[179] = oper;

    }

    private static void _initOperationDesc19(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("trackAllBannerLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[180] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("segmentationUpdateStringDemographicCriteriaByObj");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "stringDemographicCriteria"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiStringDemographicCriteria"), com.emailvision.apiccmd.service.api.ApiStringDemographicCriteria.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[181] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastSmsMessages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "limit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[182] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateBannerLinkByField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bannerId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "order"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "field"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apiccmd.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apiccmd.emailvision.com/", "CcmdServiceException"),
                      "com.emailvision.apiccmd.service.api.CcmdExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails"), 
                      true
                     ));
        _operations[183] = oper;

    }

    public CcmdServiceServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CcmdServiceServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CcmdServiceServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APIBannerListOptions>sortOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIBannerSortOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSortOption");
            qName2 = new javax.xml.namespace.QName("", "sortOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APIBannerSummaryList>bannerSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIBannerSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSummary");
            qName2 = new javax.xml.namespace.QName("", "bannerSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APICampaignListOptions>sortOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APICampaignSortOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignSortOption");
            qName2 = new javax.xml.namespace.QName("", "sortOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APICampaignSummary>segmentIds");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("", "segmentId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APICampaignSummaryList>campaignSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APICampaignSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignSummary");
            qName2 = new javax.xml.namespace.QName("", "campaignSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APIMessageListOptions>sortOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIMessageSortOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSortOption");
            qName2 = new javax.xml.namespace.QName("", "sortOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APIMessageSummaryList>messageSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIMessageSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSummary");
            qName2 = new javax.xml.namespace.QName("", "messageSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APISegmentListOptions>sortOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APISegmentSortOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSortOption");
            qName2 = new javax.xml.namespace.QName("", "sortOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APISegmentSummaryList>segmentSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APISegmentSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSummary");
            qName2 = new javax.xml.namespace.QName("", "segmentSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APIWebform>customerServiceAddresses");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "customerServiceAddress");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APIWebform>fields");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformField[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformField");
            qName2 = new javax.xml.namespace.QName("", "field");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APIWebformField>listOfValues");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "value");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APIWebformListOptions>sortOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformSortOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSortOption");
            qName2 = new javax.xml.namespace.QName("", "sortOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", ">APIWebformSummaryList>webformSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformSummary[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSummary");
            qName2 = new javax.xml.namespace.QName("", "webformSummary");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiActionCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiActionCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiActionOperator");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiActionOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBanner");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiBanner.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBannerCriteriaColumn");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiBannerCriteriaColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBannerLink");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiBannerLink.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBannerLinkType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiBannerLinkType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerListOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIBannerListOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIBannerSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSortOption");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIBannerSortOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSummary");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIBannerSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIBannerSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIBannerSummaryList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiBannerType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiBannerType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaign");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiCampaign.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignCriteriaColumn");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiCampaignCriteriaColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignListOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APICampaignListOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignReport");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiCampaignReport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APICampaignSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignSnapshot");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiCampaignSnapshot.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignSortOption");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APICampaignSortOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiCampaignStatus");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiCampaignStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignSummary");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APICampaignSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APICampaignSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APICampaignSummaryList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDataMartCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiDataMartCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDateDemographicCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiDateDemographicCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiDateDemographicOperator");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiDateDemographicOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiInclusionExclusionCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiInclusionExclusionCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiInclusionExclusionOperator");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiInclusionExclusionOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiLifeStatus");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiLifeStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMailingList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiMailingList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessage");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiMessage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessageCriteriaColumn");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiMessageCriteriaColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageListOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIMessageListOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIMessageSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSortOption");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIMessageSortOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSummary");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIMessageSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIMessageSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIMessageSummaryList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiMessageType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiMessageType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiNumericDemographicCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiNumericDemographicCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiNumericDemographicOperator");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiNumericDemographicOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiPartnerConnectionResult");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiPartnerConnectionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiPersoFragCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiPersoFragCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyColumn");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiRecencyColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiRecencyCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiRecencyOperator");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiRecencyOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegment");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ApiSegmentation");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSegmentation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegmentationCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSegmentationCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegmentationSampleType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSegmentationSampleType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegmentationType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSegmentationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegmentCriteriaColumn");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSegmentCriteriaColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentListOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APISegmentListOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegments");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("", "segment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APISegmentSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSortOption");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APISegmentSortOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSummary");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APISegmentSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APISegmentSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APISegmentSummaryList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSegmentType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSegmentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSocialNetworkColumn");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSocialNetworkColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSocialNetworkCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSocialNetworkCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiSocialNetworkOperator");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiSocialNetworkOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiStringDemographicCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiStringDemographicCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiStringDemographicOperator");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiStringDemographicOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTestGroup");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiTestGroup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTrackableLinkCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiTrackableLinkOperator");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiTrackableLinkOperator.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiUrl");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiUrl.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiUrlType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiUrlType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiValidStatus");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiValidStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebform");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebform.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformBouncebackType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiWebformBouncebackType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformCriteriaColumn");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiWebformCriteriaColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformField");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformField.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformInputType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiWebformInputType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformIntegration");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformIntegration.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformLanguage");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiWebformLanguage.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformListOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformListOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSortOption");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformSortOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformStatus");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiWebformStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSummary");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformSummary.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "APIWebformSummaryList");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.APIWebformSummaryList.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiWebformType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "apiWebformValidationType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ApiWebformValidationType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "ccmdExceptionDetails");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.CcmdExceptionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "connectionExceptionDetails");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.ConnectionExceptionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "hbqReason");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.HbqReason.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "member");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.Member.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "SoapError");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.SoapError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "sortOrder");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "status");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apiccmd.service.api.Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "testMembers");
            cachedSerQNames.add(qName);
            cls = long[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long");
            qName2 = new javax.xml.namespace.QName("", "memberId");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public boolean deleteTestMember(java.lang.String token, long memberId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "deleteTestMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(memberId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createUnsubscribeBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createUnsubscribeBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createEmailMessage(java.lang.String token, java.lang.String name, java.lang.String description, java.lang.String subject, java.lang.String from, java.lang.String fromEmail, java.lang.String to, java.lang.String body, java.lang.String encoding, java.lang.String replyTo, java.lang.String replyToEmail, boolean isBounceback, boolean hotmailUnsubFlg, java.lang.String hotmailUnsubUrl) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createEmailMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name, description, subject, from, fromEmail, to, body, encoding, replyTo, replyToEmail, new java.lang.Boolean(isBounceback), new java.lang.Boolean(hotmailUnsubFlg), hotmailUnsubUrl});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String openApiConnection(java.lang.String login, java.lang.String pwd, java.lang.String key) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "openApiConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login, pwd, key});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateWebformStatus(java.lang.String token, long webformId, com.emailvision.apiccmd.service.api.ApiWebformStatus status) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateWebformStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(webformId), status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.SoapError) {
              throw (com.emailvision.apiccmd.service.api.SoapError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getEmailMessagePreview(java.lang.String token, long id, java.lang.String part) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getEmailMessagePreview"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), part});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean testCampaignByMember(java.lang.String token, long id, long memberId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "testCampaignByMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(memberId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getEmailMessagesByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getEmailMessagesByField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, field, value, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addShareLink(java.lang.String token, long messageId, boolean linkType, java.lang.String buttonUrl, int language) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "addShareLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), new java.lang.Boolean(linkType), buttonUrl, new java.lang.Integer(language)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getCampaignsByPeriod(java.lang.String token, java.lang.String dateBegin, java.lang.String dateEnd) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getCampaignsByPeriod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, dateBegin, dateEnd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getClientTestGroups(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getClientTestGroups"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int distinctMembersCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "distinctMembersCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationDeleteCriteria(java.lang.String token, long difflistId, int orderCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationDeleteCriteria"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(difflistId), new java.lang.Integer(orderCriteria)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean untrackLinkByOrder(java.lang.String token, long id, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "untrackLinkByOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(order)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getLastBanners(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getLastBanners"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiUrl getUrlByOrder(java.lang.String token, long messageId, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getUrlByOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), new java.lang.Long(order)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiUrl) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiUrl) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiUrl.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deleteSegment(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "deleteSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean testEmailMessageByMember(java.lang.String token, long id, long memberId, java.lang.String campaignName, java.lang.String subject, java.lang.String part) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "testEmailMessageByMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(memberId), campaignName, subject, part});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getBannersByPeriod(java.lang.String token, java.lang.String dateBegin, java.lang.String dateEnd) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getBannersByPeriod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, dateBegin, dateEnd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getAllUnusedTrackedLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getAllUnusedTrackedLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateMailingList(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateMailingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), field, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getMailingListsByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getMailingListsByField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, field, value, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationCreateInclusionExclusionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiInclusionExclusionCriteria apiInclusionExclusionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationCreateInclusionExclusionCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, apiInclusionExclusionCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateSocialNetworkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSocialNetworkCriteria socialNetworkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSocialNetworkCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, socialNetworkCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.APIWebformIntegration getWebformIntegration(java.lang.String token, long webformId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getWebformIntegration"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(webformId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.APIWebformIntegration) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.APIWebformIntegration) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.APIWebformIntegration.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.SoapError) {
              throw (com.emailvision.apiccmd.service.api.SoapError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createSmsMessageByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMessage message) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createSmsMessageByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deleteBanner(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "deleteBanner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getAllBannerTrackedLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getAllBannerTrackedLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean untrackAllBannerLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "untrackAllBannerLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getLastCampaigns(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getLastCampaigns"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getLastSegments(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getLastSegments"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddPersonalisedBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddPersonalisedBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getLastMailingLists(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getLastMailingLists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateDateDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiDateDemographicCriteria dateDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateDateDemographicCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, dateDemographicCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddActionBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String action, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddActionBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, action, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createActionBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String action, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createActionBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, action, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createPersonalisedBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createPersonalisedBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getSmsMessagePreview(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getSmsMessagePreview"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.APIWebform copyWebform(java.lang.String token, long webformId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "copyWebform"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(webformId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.APIWebform) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.APIWebform) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.APIWebform.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.SoapError) {
              throw (com.emailvision.apiccmd.service.api.SoapError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean untrackAllLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "untrackAllLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long segmentationCreateSegment(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegmentation apiSegmentation) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationCreateSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, apiSegmentation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getMailingListsByPeriod(java.lang.String token, java.lang.String dateBegin, java.lang.String dateEnd) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getMailingListsByPeriod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, dateBegin, dateEnd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addTestMember(java.lang.String token, long memberId, long groupId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "addTestMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(memberId), new java.lang.Long(groupId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getBannersByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getBannersByField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, field, value, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddMirrorBannerLink(java.lang.String token, long bannerId, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddMirrorBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createUnsubscribeUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createUnsubscribeUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deleteMessage(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "deleteMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiCampaign getCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiCampaign) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiCampaign) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiCampaign.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createWebform(java.lang.String token, com.emailvision.apiccmd.service.api.APIWebform webform) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createWebform"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, webform});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.SoapError) {
              throw (com.emailvision.apiccmd.service.api.SoapError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createPersonalisedUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createPersonalisedUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddStringDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiStringDemographicCriteria stringDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddStringDemographicCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, stringDemographicCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiCampaignSnapshot getCampaignSnapshot(java.lang.String token, long campaignId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getCampaignSnapshot"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(campaignId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiCampaignSnapshot) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiCampaignSnapshot) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiCampaignSnapshot.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createBanner(java.lang.String token, java.lang.String name, java.lang.String description, java.lang.String contentType, java.lang.String content) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createBanner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name, description, contentType, content});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean postCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "postCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateDataMartCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiDataMartCriteria dataMartCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateDataMartCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, dataMartCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createBannerByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiBanner banner) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createBannerByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, banner});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddDateDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiDateDemographicCriteria dateDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddDateDemographicCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, dateDemographicCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateMessageByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMessage message) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateMessageByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddStandardBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddStandardBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiPersoFragCriteria[] segmentationGetPersoFragList(java.lang.String token, int pageNumber, int nbItemPerPage) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetPersoFragList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(pageNumber), new java.lang.Integer(nbItemPerPage)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiPersoFragCriteria[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiPersoFragCriteria[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiPersoFragCriteria[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createEmailMessageByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMessage message) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createEmailMessageByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, message});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddPersonalisedUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddPersonalisedUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.APIMessageSummaryList getMessageSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APIMessageListOptions listOptionsEntity) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getMessageSummaryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, listOptionsEntity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.APIMessageSummaryList) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.APIMessageSummaryList) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.APIMessageSummaryList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddSerieTrackableLinkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria trackableLinkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddSerieTrackableLinkCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, trackableLinkCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getSmsMessagesByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getSmsMessagesByField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, field, value, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiPartnerConnectionResult openPartnerConnection(java.lang.String login, java.lang.String pwd, java.lang.String partnerkey) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "openPartnerConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login, pwd, partnerkey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiPartnerConnectionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiPartnerConnectionResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiPartnerConnectionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createCampaign(java.lang.String token, java.lang.String name, java.lang.String desc, java.lang.String sendDate, long messageId, long mailingListId, boolean notifProgress, boolean postClickTracking, boolean emaildedupflg) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name, desc, sendDate, new java.lang.Long(messageId), new java.lang.Long(mailingListId), new java.lang.Boolean(notifProgress), new java.lang.Boolean(postClickTracking), new java.lang.Boolean(emaildedupflg)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deleteUrl(java.lang.String token, long messageId, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "deleteUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), new java.lang.Long(order)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int membersCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "membersCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateNumericDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiNumericDemographicCriteria numericDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateNumericDemographicCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, numericDemographicCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createStandardUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createStandardUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddNumericDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiNumericDemographicCriteria numericDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddNumericDemographicCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, numericDemographicCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String closeApiConnection(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "closeApiConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddActionUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String action, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddActionUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, action, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddRecencyCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiRecencyCriteria recencyCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddRecencyCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, recencyCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createUpdateBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String parameters, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createUpdateBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, parameters, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateSegment(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegmentation apiSegmentation) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, apiSegmentation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddUnsubscribeBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUnsubscribeBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddUpdateUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String parameters, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUpdateUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, parameters, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddMirrorUrl(java.lang.String token, long messageId, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddMirrorUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.Member createSmsTestMember(java.lang.String token, java.lang.String email, long cellphone) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createSmsTestMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, email, new java.lang.Long(cellphone)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.Member) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.Member) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.Member.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateBannerByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiBanner banner) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateBannerByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, banner});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiMessage getMessage(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiMessage) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiMessage) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiMessage.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateBanner(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateBanner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), field, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateSegmentByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegment segment) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateSegmentByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, segment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getCampaignsByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getCampaignsByField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, field, value, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiBannerLink getBannerLinkByOrder(java.lang.String token, long bannerId, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getBannerLinkByOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), new java.lang.Long(order)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiBannerLink) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiBannerLink) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiBannerLink.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getMessagesByPeriod(java.lang.String token, java.lang.String dateBegin, java.lang.String dateEnd) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getMessagesByPeriod"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, dateBegin, dateEnd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createMirrorBannerLink(java.lang.String token, long bannerId, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createMirrorBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getNotValidatedSenders(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getNotValidatedSenders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddCampaignActionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiActionCriteria actionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddCampaignActionCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, actionCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateSerieTrackableLinkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria trackableLinkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSerieTrackableLinkCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, trackableLinkCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createCampaignWithAnalytics(java.lang.String token, java.lang.String name, java.lang.String desc, java.lang.String sendDate, long messageId, long mailingListId, boolean notifProgress, boolean postClickTracking, boolean emaildedupflg) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createCampaignWithAnalytics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name, desc, sendDate, new java.lang.Long(messageId), new java.lang.Long(mailingListId), new java.lang.Boolean(notifProgress), new java.lang.Boolean(postClickTracking), new java.lang.Boolean(emaildedupflg)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getAllBannerTrackableLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getAllBannerTrackableLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationDeleteSegment(java.lang.String token, long difflistId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationDeleteSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(difflistId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean testSmsMessage(java.lang.String token, long id, long memberId, java.lang.String campaignName) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "testSmsMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(memberId), campaignName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddUnsubscribeUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUnsubscribeUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createSQLSegment(java.lang.String token, java.lang.String name, java.lang.String desc, java.lang.String sqlCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createSQLSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name, desc, sqlCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getAllTrackableLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getAllTrackableLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createSQLSegmentByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegment segment) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createSQLSegmentByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, segment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createCombinedSegment(java.lang.String token, java.lang.String name, java.lang.String desc, long segment1, long segment2, java.lang.String operator) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createCombinedSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name, desc, new java.lang.Long(segment1), new java.lang.Long(segment2), operator});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createCampaignByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiCampaign campaign) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createCampaignByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, campaign});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getSegmentsByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getSegmentsByField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, field, value, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long cloneMessage(java.lang.String token, long id, java.lang.String newName) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "cloneMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), newName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean untrackBannerLinkByOrder(java.lang.String token, long id, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "untrackBannerLinkByOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(order)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateCampaign(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), field, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createMirrorUrl(java.lang.String token, long messageId, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createMirrorUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.Member createTestMember(java.lang.String token, java.lang.String email) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createTestMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, email});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.Member) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.Member) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.Member.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createActionUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String action, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createActionUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, action, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddCampaignTrackableLinkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria trackableLinkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddCampaignTrackableLinkCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, trackableLinkCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean testEmailMessageByGroup(java.lang.String token, long id, long groupId, java.lang.String campaignName, java.lang.String subject, java.lang.String part) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "testEmailMessageByGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(groupId), campaignName, subject, part});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createMailingListByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMailingList mailingList) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createMailingListByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, mailingList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean isHtmlValid(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "isHtmlValid"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deleteMailingList(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "deleteMailingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateTestGroupByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTestGroup testGroup) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateTestGroupByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, testGroup});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiCampaignReport getCampaignReport(java.lang.String token, long campaignId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getCampaignReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(campaignId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiCampaignReport) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiCampaignReport) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiCampaignReport.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getDefaultSender(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getDefaultSender"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiSegment getSegment(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiSegment) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiSegment) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiSegment.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateInclusionExclusionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiInclusionExclusionCriteria apiInclusionExclusionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateInclusionExclusionCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, apiInclusionExclusionCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.APIWebformSummaryList getWebformSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APIWebformListOptions listOptions) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getWebformSummaryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, listOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.APIWebformSummaryList) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.APIWebformSummaryList) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.APIWebformSummaryList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.SoapError) {
              throw (com.emailvision.apiccmd.service.api.SoapError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiSegmentationCriteria[] segmentationGetSegmentCriterias(java.lang.String token, long difflistId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetSegmentCriterias"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(difflistId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiSegmentationCriteria[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiSegmentationCriteria[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiSegmentationCriteria[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createSmsMessage(java.lang.String token, java.lang.String name, java.lang.String description, java.lang.String from, java.lang.String body) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createSmsMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name, description, from, body});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int mailingListCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "mailingListCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeTestMember(java.lang.String token, long memberId, long groupId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "removeTestMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(memberId), new java.lang.Long(groupId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.APIBannerSummaryList getBannerSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APIBannerListOptions listOptions) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getBannerSummaryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, listOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.APIBannerSummaryList) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.APIBannerSummaryList) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.APIBannerSummaryList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] segmentationGetSegmentList(java.lang.String token, int page, int nbItemsPerPage) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetSegmentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(page), new java.lang.Integer(nbItemsPerPage)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long trackLinkByPosition(java.lang.String token, long id, long position, java.lang.String part) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "trackLinkByPosition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(position), part});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateCampaignTrackableLinkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria trackableLinkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateCampaignTrackableLinkCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, trackableLinkCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int segmentationDistinctCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationDistinctCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long cloneBanner(java.lang.String token, long id, java.lang.String newName) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "cloneBanner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), newName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createBasicSegment(java.lang.String token, java.lang.String name, java.lang.String desc, java.lang.String criteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createBasicSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name, desc, criteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getBannerPreview(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getBannerPreview"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddDataMartCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiDataMartCriteria dataMartCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddDataMartCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, dataMartCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateCampaignByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiCampaign campaign) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateCampaignByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, campaign});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getValidatedAltSenders(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getValidatedAltSenders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getCampaignsByStatus(java.lang.String token, java.lang.String status) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getCampaignsByStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, status});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deleteCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "deleteCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddSocialNetworkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSocialNetworkCriteria socialNetworkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddSocialNetworkCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, socialNetworkCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddStandardUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddStandardUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createBasicSegmentByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegment segment) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createBasicSegmentByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, segment});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean unpostCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "unpostCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateMessage(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), field, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean pauseCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "pauseCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getCampaignStatus(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getCampaignStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiSegmentation segmentationGetSegmentById(java.lang.String token, long difflistId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationGetSegmentById"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(difflistId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiSegmentation) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiSegmentation) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiSegmentation.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateSerieActionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiActionCriteria actionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateSerieActionCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, actionCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createTestGroup(java.lang.String token, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createTestGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateWebform(java.lang.String token, com.emailvision.apiccmd.service.api.APIWebform webform) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateWebform"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, webform});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.SoapError) {
              throw (com.emailvision.apiccmd.service.api.SoapError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.APICampaignSummaryList getCampaignSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APICampaignListOptions listOptions) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getCampaignSummaryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, listOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.APICampaignSummaryList) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.APICampaignSummaryList) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.APICampaignSummaryList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long trackBannerLinkByPosition(java.lang.String token, long id, long position) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "trackBannerLinkByPosition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(position)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getAllUnusedBannerTrackedLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getAllUnusedBannerTrackedLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int mailingListDistinctCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "mailingListDistinctCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createMailingList(java.lang.String token, java.lang.String name, java.lang.String desc, long segmentId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createMailingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, name, desc, new java.lang.Long(segmentId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateCampaignActionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiActionCriteria actionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateCampaignActionCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, actionCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getLastEmailMessages(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getLastEmailMessages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createStandardBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createStandardBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, url});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long trackAllLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "trackAllLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getTestMembers(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getTestMembers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int segmentationCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean deleteTestGroup(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "deleteTestGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createAndAddUpdateBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String parameters, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createAndAddUpdateBannerLink"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), name, parameters, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getAllTrackedLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getAllTrackedLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.APISegmentSummaryList getSegmentSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APISegmentListOptions listOptionsEntity) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getSegmentSummaryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, listOptionsEntity});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.APISegmentSummaryList) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.APISegmentSummaryList) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.APISegmentSummaryList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean removeSegment(java.lang.String token, long id, long segmentId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "removeSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(segmentId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean addSegment(java.lang.String token, long id, long segmentId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "addSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(segmentId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationAddSerieActionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiActionCriteria actionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationAddSerieActionCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, actionCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateRecencyCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiRecencyCriteria recencyCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateRecencyCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, recencyCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.APIWebform getWebform(java.lang.String token, long webformId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getWebform"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(webformId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.APIWebform) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.APIWebform) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.APIWebform.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.SoapError) {
              throw (com.emailvision.apiccmd.service.api.SoapError) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiBanner getBanner(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getBanner"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiBanner) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiBanner) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiBanner.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateMailingListByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMailingList mailingList) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateMailingListByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, mailingList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createTestGroupByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTestGroup testGroup) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createTestGroupByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, testGroup});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean unpauseCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "unpauseCampaign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateUrlByField(java.lang.String token, long messageId, long order, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateUrlByField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), new java.lang.Long(order), field, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long cloneMailingList(java.lang.String token, long id, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[173]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "cloneMailingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiMailingList getMailingList(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[174]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getMailingList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiMailingList) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiMailingList) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiMailingList.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.ApiTestGroup getTestGroup(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[175]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getTestGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.ApiTestGroup) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.ApiTestGroup) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.ApiTestGroup.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateSegment(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[176]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateSegment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), field, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apiccmd.service.api.Member getTestMember(java.lang.String token, long memberId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[177]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getTestMember"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(memberId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apiccmd.service.api.Member) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apiccmd.service.api.Member) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apiccmd.service.api.Member.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long createUpdateUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String parameters, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[178]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "createUpdateUrl"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(messageId), name, parameters, pageOK, new java.lang.Long(messageOK), pageError, new java.lang.Long(messageError)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean testCampaignByGroup(java.lang.String token, long id, long groupId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[179]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "testCampaignByGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id), new java.lang.Long(groupId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long trackAllBannerLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[180]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "trackAllBannerLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Long) _resp).longValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Long) org.apache.axis.utils.JavaUtils.convert(_resp, long.class)).longValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean segmentationUpdateStringDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiStringDemographicCriteria stringDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[181]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "segmentationUpdateStringDemographicCriteriaByObj"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, stringDemographicCriteria});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long[] getLastSmsMessages(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[182]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "getLastSmsMessages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Integer(limit)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (long[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (long[]) org.apache.axis.utils.JavaUtils.convert(_resp, long[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public boolean updateBannerLinkByField(java.lang.String token, long bannerId, long order, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[183]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apiccmd.emailvision.com/", "updateBannerLinkByField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(bannerId), new java.lang.Long(order), field, value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apiccmd.service.api.CcmdExceptionDetails) {
              throw (com.emailvision.apiccmd.service.api.CcmdExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

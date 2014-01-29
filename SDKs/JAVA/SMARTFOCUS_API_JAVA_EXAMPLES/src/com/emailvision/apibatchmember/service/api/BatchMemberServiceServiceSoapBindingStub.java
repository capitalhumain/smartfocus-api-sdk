/**
 * BatchMemberServiceServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public class BatchMemberServiceServiceSoapBindingStub extends org.apache.axis.client.Stub implements com.emailvision.apibatchmember.service.api.BatchMemberService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("uploadFileInsert");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "insertUpload"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "insertUpload"), com.emailvision.apibatchmember.service.api.InsertUpload.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apibatchmember.emailvision.com/", "BatchMemberServiceException"),
                      "com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "batchMemberExceptionDetails"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getBadFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uploadId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apibatchmember.emailvision.com/", "BatchMemberServiceException"),
                      "com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "batchMemberExceptionDetails"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("uploadFileMerge");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mergeUpload"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "mergeUpload"), com.emailvision.apibatchmember.service.api.MergeUpload.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "file"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"), byte[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        oper.setReturnClass(long.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apibatchmember.emailvision.com/", "BatchMemberServiceException"),
                      "com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "batchMemberExceptionDetails"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLogFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uploadId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apibatchmember.emailvision.com/", "BatchMemberServiceException"),
                      "com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "batchMemberExceptionDetails"), 
                      true
                     ));
        _operations[3] = oper;

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
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUploadSummaryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "listOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadListOptions"), com.emailvision.apibatchmember.service.api.UploadListOptions.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "List"));
        oper.setReturnClass(com.emailvision.apibatchmember.service.api.List.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apibatchmember.emailvision.com/", "BatchMemberServiceException"),
                      "com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "batchMemberExceptionDetails"), 
                      true
                     ));
        _operations[5] = oper;

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
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLastUpload");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadInfo"));
        oper.setReturnClass(com.emailvision.apibatchmember.service.api.UploadInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apibatchmember.emailvision.com/", "BatchMemberServiceException"),
                      "com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "batchMemberExceptionDetails"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("openPartnerConnection");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "login"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "partnerkey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "apiPartnerConnectionResult"));
        oper.setReturnClass(com.emailvision.apibatchmember.service.api.ApiPartnerConnectionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUploadStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "uploadId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadStatus"));
        oper.setReturnClass(com.emailvision.apibatchmember.service.api.UploadStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://connection.exception.api.commons.emailvision.com/", "ConnectionServiceException"),
                      "com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://exceptions.service.apibatchmember.emailvision.com/", "BatchMemberServiceException"),
                      "com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails",
                      new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "batchMemberExceptionDetails"), 
                      true
                     ));
        _operations[9] = oper;

    }

    public BatchMemberServiceServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public BatchMemberServiceServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public BatchMemberServiceServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", ">List>uploadSummaries");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadSummaryEntity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSummaryEntity");
            qName2 = new javax.xml.namespace.QName("", "uploadSummaryEntity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", ">UploadListOptions>sortOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadSortOption[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSortOption");
            qName2 = new javax.xml.namespace.QName("", "sortOption");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "apiPartnerConnectionResult");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.ApiPartnerConnectionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "batchMemberExceptionDetails");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "column");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.Column.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "connectionExceptionDetails");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "dedup");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.Dedup.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "insertUpload");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.InsertUpload.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "List");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.List.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "mapping");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.Column[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "column");
            qName2 = new javax.xml.namespace.QName("", "column");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "mergeUpload");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.MergeUpload.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "sortOrder");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.SortOrder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "upload");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.Upload.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadCriteriaColumn");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadCriteriaColumn.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadInfo");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadJobStatus");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadJobStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadListOptions");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadListOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSearchCriteria");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadSearchCriteria.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSortOption");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadSortOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadSource");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadSource.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadStatus");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "UploadSummaryEntity");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadSummaryEntity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadType");
            cachedSerQNames.add(qName);
            cls = com.emailvision.apibatchmember.service.api.UploadType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

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

    public long uploadFileInsert(java.lang.String token, com.emailvision.apibatchmember.service.api.InsertUpload insertUpload, byte[] file) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadFileInsert"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, insertUpload, file});

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
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getBadFile(java.lang.String token, long uploadId) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "getBadFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(uploadId)});

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
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public long uploadFileMerge(java.lang.String token, com.emailvision.apibatchmember.service.api.MergeUpload mergeUpload, byte[] file) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "uploadFileMerge"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, mergeUpload, file});

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
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getLogFile(java.lang.String token, long uploadId) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "getLogFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(uploadId)});

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
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String openApiConnection(java.lang.String login, java.lang.String pwd, java.lang.String key) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "openApiConnection"));

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
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apibatchmember.service.api.List getUploadSummaryList(java.lang.String token, com.emailvision.apibatchmember.service.api.UploadListOptions listOptions) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "getUploadSummaryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, listOptions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apibatchmember.service.api.List) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apibatchmember.service.api.List) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apibatchmember.service.api.List.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String closeApiConnection(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "closeApiConnection"));

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
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apibatchmember.service.api.UploadInfo[] getLastUpload(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "getLastUpload"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apibatchmember.service.api.UploadInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apibatchmember.service.api.UploadInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apibatchmember.service.api.UploadInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apibatchmember.service.api.ApiPartnerConnectionResult openPartnerConnection(java.lang.String login, java.lang.String pwd, java.lang.String partnerkey) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "openPartnerConnection"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {login, pwd, partnerkey});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apibatchmember.service.api.ApiPartnerConnectionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apibatchmember.service.api.ApiPartnerConnectionResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apibatchmember.service.api.ApiPartnerConnectionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public com.emailvision.apibatchmember.service.api.UploadStatus getUploadStatus(java.lang.String token, long uploadId) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails {
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
        _call.setOperationName(new javax.xml.namespace.QName("http://api.service.apibatchmember.emailvision.com/", "getUploadStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {token, new java.lang.Long(uploadId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.emailvision.apibatchmember.service.api.UploadStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.emailvision.apibatchmember.service.api.UploadStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.emailvision.apibatchmember.service.api.UploadStatus.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) {
              throw (com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

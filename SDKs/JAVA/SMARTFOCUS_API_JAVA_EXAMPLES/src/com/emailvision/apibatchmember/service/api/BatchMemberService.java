/**
 * BatchMemberService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emailvision.apibatchmember.service.api;

public interface BatchMemberService extends java.rmi.Remote {
    public long uploadFileInsert(java.lang.String token, com.emailvision.apibatchmember.service.api.InsertUpload insertUpload, byte[] file) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails;
    public java.lang.String getBadFile(java.lang.String token, long uploadId) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails;
    public long uploadFileMerge(java.lang.String token, com.emailvision.apibatchmember.service.api.MergeUpload mergeUpload, byte[] file) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails;
    public java.lang.String getLogFile(java.lang.String token, long uploadId) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails;
    public java.lang.String openApiConnection(java.lang.String login, java.lang.String pwd, java.lang.String key) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails;
    public com.emailvision.apibatchmember.service.api.List getUploadSummaryList(java.lang.String token, com.emailvision.apibatchmember.service.api.UploadListOptions listOptions) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails;
    public java.lang.String closeApiConnection(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails;
    public com.emailvision.apibatchmember.service.api.UploadInfo[] getLastUpload(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails;
    public com.emailvision.apibatchmember.service.api.ApiPartnerConnectionResult openPartnerConnection(java.lang.String login, java.lang.String pwd, java.lang.String partnerkey) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails;
    public com.emailvision.apibatchmember.service.api.UploadStatus getUploadStatus(java.lang.String token, long uploadId) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails;
}

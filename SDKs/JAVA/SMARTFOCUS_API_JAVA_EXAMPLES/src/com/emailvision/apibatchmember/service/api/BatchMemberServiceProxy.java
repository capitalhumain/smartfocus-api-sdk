package com.emailvision.apibatchmember.service.api;

public class BatchMemberServiceProxy implements com.emailvision.apibatchmember.service.api.BatchMemberService {
  private String _endpoint = null;
  private com.emailvision.apibatchmember.service.api.BatchMemberService batchMemberService = null;
  
  public BatchMemberServiceProxy() {
    _initBatchMemberServiceProxy();
  }
  
  public BatchMemberServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initBatchMemberServiceProxy();
  }
  
  private void _initBatchMemberServiceProxy() {
    try {
      batchMemberService = (new com.emailvision.apibatchmember.service.api.BatchMemberServiceServiceLocator()).getBatchMemberServicePort();
      if (batchMemberService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)batchMemberService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)batchMemberService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (batchMemberService != null)
      ((javax.xml.rpc.Stub)batchMemberService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.emailvision.apibatchmember.service.api.BatchMemberService getBatchMemberService() {
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService;
  }
  
  public long uploadFileInsert(java.lang.String token, com.emailvision.apibatchmember.service.api.InsertUpload insertUpload, byte[] file) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.uploadFileInsert(token, insertUpload, file);
  }
  
  public java.lang.String getBadFile(java.lang.String token, long uploadId) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.getBadFile(token, uploadId);
  }
  
  public long uploadFileMerge(java.lang.String token, com.emailvision.apibatchmember.service.api.MergeUpload mergeUpload, byte[] file) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.uploadFileMerge(token, mergeUpload, file);
  }
  
  public java.lang.String getLogFile(java.lang.String token, long uploadId) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.getLogFile(token, uploadId);
  }
  
  public java.lang.String openApiConnection(java.lang.String login, java.lang.String pwd, java.lang.String key) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.openApiConnection(login, pwd, key);
  }
  
  public com.emailvision.apibatchmember.service.api.List getUploadSummaryList(java.lang.String token, com.emailvision.apibatchmember.service.api.UploadListOptions listOptions) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.getUploadSummaryList(token, listOptions);
  }
  
  public java.lang.String closeApiConnection(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.closeApiConnection(token);
  }
  
  public com.emailvision.apibatchmember.service.api.UploadInfo[] getLastUpload(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.getLastUpload(token);
  }
  
  public com.emailvision.apibatchmember.service.api.ApiPartnerConnectionResult openPartnerConnection(java.lang.String login, java.lang.String pwd, java.lang.String partnerkey) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.openPartnerConnection(login, pwd, partnerkey);
  }
  
  public com.emailvision.apibatchmember.service.api.UploadStatus getUploadStatus(java.lang.String token, long uploadId) throws java.rmi.RemoteException, com.emailvision.apibatchmember.service.api.ConnectionExceptionDetails, com.emailvision.apibatchmember.service.api.BatchMemberExceptionDetails{
    if (batchMemberService == null)
      _initBatchMemberServiceProxy();
    return batchMemberService.getUploadStatus(token, uploadId);
  }
  
  
}
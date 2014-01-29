package com.emailvision.apiccmd.service.api;

public class CcmdServiceProxy implements com.emailvision.apiccmd.service.api.CcmdService {
  private String _endpoint = null;
  private com.emailvision.apiccmd.service.api.CcmdService ccmdService = null;
  
  public CcmdServiceProxy() {
    _initCcmdServiceProxy();
  }
  
  public CcmdServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCcmdServiceProxy();
  }
  
  private void _initCcmdServiceProxy() {
    try {
      ccmdService = (new com.emailvision.apiccmd.service.api.CcmdServiceServiceLocator()).getCcmdServicePort();
      if (ccmdService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ccmdService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ccmdService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ccmdService != null)
      ((javax.xml.rpc.Stub)ccmdService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.emailvision.apiccmd.service.api.CcmdService getCcmdService() {
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService;
  }
  
  public boolean deleteTestMember(java.lang.String token, long memberId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.deleteTestMember(token, memberId);
  }
  
  public java.lang.String openApiConnection(java.lang.String login, java.lang.String pwd, java.lang.String key) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.openApiConnection(login, pwd, key);
  }
  
  public long createEmailMessage(java.lang.String token, java.lang.String name, java.lang.String description, java.lang.String subject, java.lang.String from, java.lang.String fromEmail, java.lang.String to, java.lang.String body, java.lang.String encoding, java.lang.String replyTo, java.lang.String replyToEmail, boolean isBounceback, boolean hotmailUnsubFlg, java.lang.String hotmailUnsubUrl) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createEmailMessage(token, name, description, subject, from, fromEmail, to, body, encoding, replyTo, replyToEmail, isBounceback, hotmailUnsubFlg, hotmailUnsubUrl);
  }
  
  public long createUnsubscribeBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createUnsubscribeBannerLink(token, bannerId, name, pageOK, messageOK, pageError, messageError);
  }
  
  public boolean updateWebformStatus(java.lang.String token, long webformId, com.emailvision.apiccmd.service.api.ApiWebformStatus status) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateWebformStatus(token, webformId, status);
  }
  
  public boolean testCampaignByMember(java.lang.String token, long id, long memberId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.testCampaignByMember(token, id, memberId);
  }
  
  public java.lang.String getEmailMessagePreview(java.lang.String token, long id, java.lang.String part) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getEmailMessagePreview(token, id, part);
  }
  
  public long[] getEmailMessagesByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getEmailMessagesByField(token, field, value, limit);
  }
  
  public boolean addShareLink(java.lang.String token, long messageId, boolean linkType, java.lang.String buttonUrl, int language) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.addShareLink(token, messageId, linkType, buttonUrl, language);
  }
  
  public long[] getClientTestGroups(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getClientTestGroups(token);
  }
  
  public long[] getCampaignsByPeriod(java.lang.String token, java.lang.String dateBegin, java.lang.String dateEnd) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getCampaignsByPeriod(token, dateBegin, dateEnd);
  }
  
  public int distinctMembersCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.distinctMembersCount(token, id);
  }
  
  public boolean segmentationDeleteCriteria(java.lang.String token, long difflistId, int orderCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationDeleteCriteria(token, difflistId, orderCriteria);
  }
  
  public boolean untrackLinkByOrder(java.lang.String token, long id, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.untrackLinkByOrder(token, id, order);
  }
  
  public long[] getLastBanners(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getLastBanners(token, limit);
  }
  
  public com.emailvision.apiccmd.service.api.ApiUrl getUrlByOrder(java.lang.String token, long messageId, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getUrlByOrder(token, messageId, order);
  }
  
  public boolean deleteSegment(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.deleteSegment(token, id);
  }
  
  public boolean testEmailMessageByMember(java.lang.String token, long id, long memberId, java.lang.String campaignName, java.lang.String subject, java.lang.String part) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.testEmailMessageByMember(token, id, memberId, campaignName, subject, part);
  }
  
  public long[] getBannersByPeriod(java.lang.String token, java.lang.String dateBegin, java.lang.String dateEnd) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getBannersByPeriod(token, dateBegin, dateEnd);
  }
  
  public long[] getAllUnusedTrackedLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getAllUnusedTrackedLinks(token, id);
  }
  
  public boolean updateMailingList(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateMailingList(token, id, field, value);
  }
  
  public long[] getMailingListsByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getMailingListsByField(token, field, value, limit);
  }
  
  public boolean segmentationCreateInclusionExclusionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiInclusionExclusionCriteria apiInclusionExclusionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationCreateInclusionExclusionCriteriaByObj(token, apiInclusionExclusionCriteria);
  }
  
  public boolean segmentationUpdateSocialNetworkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSocialNetworkCriteria socialNetworkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateSocialNetworkCriteriaByObj(token, socialNetworkCriteria);
  }
  
  public com.emailvision.apiccmd.service.api.APIWebformIntegration getWebformIntegration(java.lang.String token, long webformId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getWebformIntegration(token, webformId);
  }
  
  public boolean deleteBanner(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.deleteBanner(token, id);
  }
  
  public long createSmsMessageByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMessage message) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createSmsMessageByObj(token, message);
  }
  
  public long[] getAllBannerTrackedLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getAllBannerTrackedLinks(token, id);
  }
  
  public boolean untrackAllBannerLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.untrackAllBannerLinks(token, id);
  }
  
  public long[] getLastCampaigns(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getLastCampaigns(token, limit);
  }
  
  public long[] getLastSegments(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getLastSegments(token, limit);
  }
  
  public long createAndAddPersonalisedBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddPersonalisedBannerLink(token, bannerId, name, url);
  }
  
  public boolean segmentationUpdateDateDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiDateDemographicCriteria dateDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateDateDemographicCriteriaByObj(token, dateDemographicCriteria);
  }
  
  public long[] getLastMailingLists(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getLastMailingLists(token, limit);
  }
  
  public long createAndAddActionBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String action, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddActionBannerLink(token, bannerId, name, action, pageOK, messageOK, pageError, messageError);
  }
  
  public long createActionBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String action, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createActionBannerLink(token, bannerId, name, action, pageOK, messageOK, pageError, messageError);
  }
  
  public long createPersonalisedBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createPersonalisedBannerLink(token, bannerId, name, url);
  }
  
  public java.lang.String getSmsMessagePreview(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getSmsMessagePreview(token, id);
  }
  
  public com.emailvision.apiccmd.service.api.APIWebform copyWebform(java.lang.String token, long webformId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.copyWebform(token, webformId);
  }
  
  public boolean untrackAllLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.untrackAllLinks(token, id);
  }
  
  public long segmentationCreateSegment(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegmentation apiSegmentation) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationCreateSegment(token, apiSegmentation);
  }
  
  public long[] getMailingListsByPeriod(java.lang.String token, java.lang.String dateBegin, java.lang.String dateEnd) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getMailingListsByPeriod(token, dateBegin, dateEnd);
  }
  
  public boolean addTestMember(java.lang.String token, long memberId, long groupId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.addTestMember(token, memberId, groupId);
  }
  
  public long[] getBannersByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getBannersByField(token, field, value, limit);
  }
  
  public long createUnsubscribeUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createUnsubscribeUrl(token, messageId, name, pageOK, messageOK, pageError, messageError);
  }
  
  public long createAndAddMirrorBannerLink(java.lang.String token, long bannerId, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddMirrorBannerLink(token, bannerId, name);
  }
  
  public com.emailvision.apiccmd.service.api.ApiCampaign getCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getCampaign(token, id);
  }
  
  public boolean deleteMessage(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.deleteMessage(token, id);
  }
  
  public long createWebform(java.lang.String token, com.emailvision.apiccmd.service.api.APIWebform webform) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createWebform(token, webform);
  }
  
  public long createPersonalisedUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createPersonalisedUrl(token, messageId, name, url);
  }
  
  public boolean segmentationAddStringDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiStringDemographicCriteria stringDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddStringDemographicCriteriaByObj(token, stringDemographicCriteria);
  }
  
  public com.emailvision.apiccmd.service.api.ApiCampaignSnapshot getCampaignSnapshot(java.lang.String token, long campaignId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getCampaignSnapshot(token, campaignId);
  }
  
  public boolean segmentationUpdateDataMartCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiDataMartCriteria dataMartCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateDataMartCriteriaByObj(token, dataMartCriteria);
  }
  
  public boolean postCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.postCampaign(token, id);
  }
  
  public long createBanner(java.lang.String token, java.lang.String name, java.lang.String description, java.lang.String contentType, java.lang.String content) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createBanner(token, name, description, contentType, content);
  }
  
  public long createBannerByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiBanner banner) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createBannerByObj(token, banner);
  }
  
  public boolean segmentationAddDateDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiDateDemographicCriteria dateDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddDateDemographicCriteriaByObj(token, dateDemographicCriteria);
  }
  
  public boolean updateMessageByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMessage message) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateMessageByObj(token, message);
  }
  
  public long createAndAddStandardBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddStandardBannerLink(token, bannerId, name, url);
  }
  
  public com.emailvision.apiccmd.service.api.ApiPersoFragCriteria[] segmentationGetPersoFragList(java.lang.String token, int pageNumber, int nbItemPerPage) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationGetPersoFragList(token, pageNumber, nbItemPerPage);
  }
  
  public long createEmailMessageByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMessage message) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createEmailMessageByObj(token, message);
  }
  
  public long createAndAddPersonalisedUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddPersonalisedUrl(token, messageId, name, url);
  }
  
  public boolean segmentationAddSerieTrackableLinkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria trackableLinkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddSerieTrackableLinkCriteriaByObj(token, trackableLinkCriteria);
  }
  
  public com.emailvision.apiccmd.service.api.APIMessageSummaryList getMessageSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APIMessageListOptions listOptionsEntity) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getMessageSummaryList(token, listOptionsEntity);
  }
  
  public long[] getSmsMessagesByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getSmsMessagesByField(token, field, value, limit);
  }
  
  public com.emailvision.apiccmd.service.api.ApiPartnerConnectionResult openPartnerConnection(java.lang.String login, java.lang.String pwd, java.lang.String partnerkey) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.openPartnerConnection(login, pwd, partnerkey);
  }
  
  public boolean deleteUrl(java.lang.String token, long messageId, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.deleteUrl(token, messageId, order);
  }
  
  public long createCampaign(java.lang.String token, java.lang.String name, java.lang.String desc, java.lang.String sendDate, long messageId, long mailingListId, boolean notifProgress, boolean postClickTracking, boolean emaildedupflg) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createCampaign(token, name, desc, sendDate, messageId, mailingListId, notifProgress, postClickTracking, emaildedupflg);
  }
  
  public boolean segmentationUpdateNumericDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiNumericDemographicCriteria numericDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateNumericDemographicCriteriaByObj(token, numericDemographicCriteria);
  }
  
  public int membersCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.membersCount(token, id);
  }
  
  public long createStandardUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createStandardUrl(token, messageId, name, url);
  }
  
  public boolean segmentationAddNumericDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiNumericDemographicCriteria numericDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddNumericDemographicCriteriaByObj(token, numericDemographicCriteria);
  }
  
  public long createAndAddActionUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String action, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddActionUrl(token, messageId, name, action, pageOK, messageOK, pageError, messageError);
  }
  
  public java.lang.String closeApiConnection(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.closeApiConnection(token);
  }
  
  public boolean segmentationAddRecencyCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiRecencyCriteria recencyCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddRecencyCriteriaByObj(token, recencyCriteria);
  }
  
  public boolean segmentationUpdateSegment(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegmentation apiSegmentation) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateSegment(token, apiSegmentation);
  }
  
  public long createUpdateBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String parameters, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createUpdateBannerLink(token, bannerId, name, parameters, pageOK, messageOK, pageError, messageError);
  }
  
  public long createAndAddUnsubscribeBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddUnsubscribeBannerLink(token, bannerId, name, pageOK, messageOK, pageError, messageError);
  }
  
  public long createAndAddUpdateUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String parameters, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddUpdateUrl(token, messageId, name, parameters, pageOK, messageOK, pageError, messageError);
  }
  
  public boolean updateBannerByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiBanner banner) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateBannerByObj(token, banner);
  }
  
  public com.emailvision.apiccmd.service.api.Member createSmsTestMember(java.lang.String token, java.lang.String email, long cellphone) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createSmsTestMember(token, email, cellphone);
  }
  
  public long createAndAddMirrorUrl(java.lang.String token, long messageId, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddMirrorUrl(token, messageId, name);
  }
  
  public com.emailvision.apiccmd.service.api.ApiMessage getMessage(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getMessage(token, id);
  }
  
  public boolean updateSegmentByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegment segment) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateSegmentByObj(token, segment);
  }
  
  public boolean updateBanner(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateBanner(token, id, field, value);
  }
  
  public long[] getMessagesByPeriod(java.lang.String token, java.lang.String dateBegin, java.lang.String dateEnd) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getMessagesByPeriod(token, dateBegin, dateEnd);
  }
  
  public com.emailvision.apiccmd.service.api.ApiBannerLink getBannerLinkByOrder(java.lang.String token, long bannerId, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getBannerLinkByOrder(token, bannerId, order);
  }
  
  public long[] getCampaignsByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getCampaignsByField(token, field, value, limit);
  }
  
  public java.lang.String[] getNotValidatedSenders(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getNotValidatedSenders(token);
  }
  
  public long createMirrorBannerLink(java.lang.String token, long bannerId, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createMirrorBannerLink(token, bannerId, name);
  }
  
  public boolean segmentationAddCampaignActionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiActionCriteria actionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddCampaignActionCriteriaByObj(token, actionCriteria);
  }
  
  public boolean segmentationUpdateSerieTrackableLinkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria trackableLinkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateSerieTrackableLinkCriteriaByObj(token, trackableLinkCriteria);
  }
  
  public long createCampaignWithAnalytics(java.lang.String token, java.lang.String name, java.lang.String desc, java.lang.String sendDate, long messageId, long mailingListId, boolean notifProgress, boolean postClickTracking, boolean emaildedupflg) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createCampaignWithAnalytics(token, name, desc, sendDate, messageId, mailingListId, notifProgress, postClickTracking, emaildedupflg);
  }
  
  public long[] getAllBannerTrackableLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getAllBannerTrackableLinks(token, id);
  }
  
  public boolean segmentationDeleteSegment(java.lang.String token, long difflistId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationDeleteSegment(token, difflistId);
  }
  
  public boolean testSmsMessage(java.lang.String token, long id, long memberId, java.lang.String campaignName) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.testSmsMessage(token, id, memberId, campaignName);
  }
  
  public long createSQLSegment(java.lang.String token, java.lang.String name, java.lang.String desc, java.lang.String sqlCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createSQLSegment(token, name, desc, sqlCriteria);
  }
  
  public long createAndAddUnsubscribeUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddUnsubscribeUrl(token, messageId, name, pageOK, messageOK, pageError, messageError);
  }
  
  public long[] getAllTrackableLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getAllTrackableLinks(token, id);
  }
  
  public long createSQLSegmentByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegment segment) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createSQLSegmentByObj(token, segment);
  }
  
  public long createCombinedSegment(java.lang.String token, java.lang.String name, java.lang.String desc, long segment1, long segment2, java.lang.String operator) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createCombinedSegment(token, name, desc, segment1, segment2, operator);
  }
  
  public long createCampaignByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiCampaign campaign) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createCampaignByObj(token, campaign);
  }
  
  public long[] getSegmentsByField(java.lang.String token, java.lang.String field, java.lang.String value, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getSegmentsByField(token, field, value, limit);
  }
  
  public long cloneMessage(java.lang.String token, long id, java.lang.String newName) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.cloneMessage(token, id, newName);
  }
  
  public boolean untrackBannerLinkByOrder(java.lang.String token, long id, long order) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.untrackBannerLinkByOrder(token, id, order);
  }
  
  public boolean updateCampaign(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateCampaign(token, id, field, value);
  }
  
  public long createMirrorUrl(java.lang.String token, long messageId, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createMirrorUrl(token, messageId, name);
  }
  
  public com.emailvision.apiccmd.service.api.Member createTestMember(java.lang.String token, java.lang.String email) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createTestMember(token, email);
  }
  
  public long createActionUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String action, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createActionUrl(token, messageId, name, action, pageOK, messageOK, pageError, messageError);
  }
  
  public boolean segmentationAddCampaignTrackableLinkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria trackableLinkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddCampaignTrackableLinkCriteriaByObj(token, trackableLinkCriteria);
  }
  
  public boolean testEmailMessageByGroup(java.lang.String token, long id, long groupId, java.lang.String campaignName, java.lang.String subject, java.lang.String part) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.testEmailMessageByGroup(token, id, groupId, campaignName, subject, part);
  }
  
  public long createMailingListByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMailingList mailingList) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createMailingListByObj(token, mailingList);
  }
  
  public boolean updateTestGroupByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTestGroup testGroup) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateTestGroupByObj(token, testGroup);
  }
  
  public boolean deleteMailingList(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.deleteMailingList(token, id);
  }
  
  public boolean isHtmlValid(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.isHtmlValid(token, id);
  }
  
  public com.emailvision.apiccmd.service.api.ApiCampaignReport getCampaignReport(java.lang.String token, long campaignId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getCampaignReport(token, campaignId);
  }
  
  public com.emailvision.apiccmd.service.api.ApiSegment getSegment(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getSegment(token, id);
  }
  
  public java.lang.String getDefaultSender(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getDefaultSender(token);
  }
  
  public boolean segmentationUpdateInclusionExclusionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiInclusionExclusionCriteria apiInclusionExclusionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateInclusionExclusionCriteriaByObj(token, apiInclusionExclusionCriteria);
  }
  
  public com.emailvision.apiccmd.service.api.ApiSegmentationCriteria[] segmentationGetSegmentCriterias(java.lang.String token, long difflistId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationGetSegmentCriterias(token, difflistId);
  }
  
  public com.emailvision.apiccmd.service.api.APIWebformSummaryList getWebformSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APIWebformListOptions listOptions) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getWebformSummaryList(token, listOptions);
  }
  
  public int mailingListCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.mailingListCount(token, id);
  }
  
  public long createSmsMessage(java.lang.String token, java.lang.String name, java.lang.String description, java.lang.String from, java.lang.String body) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createSmsMessage(token, name, description, from, body);
  }
  
  public boolean removeTestMember(java.lang.String token, long memberId, long groupId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.removeTestMember(token, memberId, groupId);
  }
  
  public com.emailvision.apiccmd.service.api.APIBannerSummaryList getBannerSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APIBannerListOptions listOptions) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getBannerSummaryList(token, listOptions);
  }
  
  public long[] segmentationGetSegmentList(java.lang.String token, int page, int nbItemsPerPage) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationGetSegmentList(token, page, nbItemsPerPage);
  }
  
  public long trackLinkByPosition(java.lang.String token, long id, long position, java.lang.String part) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.trackLinkByPosition(token, id, position, part);
  }
  
  public boolean segmentationUpdateCampaignTrackableLinkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTrackableLinkCriteria trackableLinkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateCampaignTrackableLinkCriteriaByObj(token, trackableLinkCriteria);
  }
  
  public int segmentationDistinctCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationDistinctCount(token, id);
  }
  
  public long cloneBanner(java.lang.String token, long id, java.lang.String newName) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.cloneBanner(token, id, newName);
  }
  
  public long createBasicSegment(java.lang.String token, java.lang.String name, java.lang.String desc, java.lang.String criteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createBasicSegment(token, name, desc, criteria);
  }
  
  public java.lang.String getBannerPreview(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getBannerPreview(token, id);
  }
  
  public boolean updateCampaignByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiCampaign campaign) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateCampaignByObj(token, campaign);
  }
  
  public boolean segmentationAddDataMartCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiDataMartCriteria dataMartCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddDataMartCriteriaByObj(token, dataMartCriteria);
  }
  
  public java.lang.String[] getValidatedAltSenders(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getValidatedAltSenders(token);
  }
  
  public long[] getCampaignsByStatus(java.lang.String token, java.lang.String status) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getCampaignsByStatus(token, status);
  }
  
  public boolean segmentationAddSocialNetworkCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSocialNetworkCriteria socialNetworkCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddSocialNetworkCriteriaByObj(token, socialNetworkCriteria);
  }
  
  public boolean deleteCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.deleteCampaign(token, id);
  }
  
  public long createAndAddStandardUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddStandardUrl(token, messageId, name, url);
  }
  
  public long createBasicSegmentByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiSegment segment) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createBasicSegmentByObj(token, segment);
  }
  
  public boolean updateMessage(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateMessage(token, id, field, value);
  }
  
  public boolean unpostCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.unpostCampaign(token, id);
  }
  
  public boolean pauseCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.pauseCampaign(token, id);
  }
  
  public java.lang.String getCampaignStatus(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getCampaignStatus(token, id);
  }
  
  public com.emailvision.apiccmd.service.api.ApiSegmentation segmentationGetSegmentById(java.lang.String token, long difflistId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationGetSegmentById(token, difflistId);
  }
  
  public boolean segmentationUpdateSerieActionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiActionCriteria actionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateSerieActionCriteriaByObj(token, actionCriteria);
  }
  
  public long createTestGroup(java.lang.String token, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createTestGroup(token, name);
  }
  
  public boolean updateWebform(java.lang.String token, com.emailvision.apiccmd.service.api.APIWebform webform) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateWebform(token, webform);
  }
  
  public com.emailvision.apiccmd.service.api.APICampaignSummaryList getCampaignSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APICampaignListOptions listOptions) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getCampaignSummaryList(token, listOptions);
  }
  
  public long trackBannerLinkByPosition(java.lang.String token, long id, long position) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.trackBannerLinkByPosition(token, id, position);
  }
  
  public int mailingListDistinctCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.mailingListDistinctCount(token, id);
  }
  
  public long[] getAllUnusedBannerTrackedLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getAllUnusedBannerTrackedLinks(token, id);
  }
  
  public boolean segmentationUpdateCampaignActionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiActionCriteria actionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateCampaignActionCriteriaByObj(token, actionCriteria);
  }
  
  public long createMailingList(java.lang.String token, java.lang.String name, java.lang.String desc, long segmentId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createMailingList(token, name, desc, segmentId);
  }
  
  public long[] getLastEmailMessages(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getLastEmailMessages(token, limit);
  }
  
  public long trackAllLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.trackAllLinks(token, id);
  }
  
  public long createStandardBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String url) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createStandardBannerLink(token, bannerId, name, url);
  }
  
  public int segmentationCount(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationCount(token, id);
  }
  
  public long[] getTestMembers(java.lang.String token) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getTestMembers(token);
  }
  
  public boolean deleteTestGroup(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.deleteTestGroup(token, id);
  }
  
  public long createAndAddUpdateBannerLink(java.lang.String token, long bannerId, java.lang.String name, java.lang.String parameters, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createAndAddUpdateBannerLink(token, bannerId, name, parameters, pageOK, messageOK, pageError, messageError);
  }
  
  public long[] getAllTrackedLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getAllTrackedLinks(token, id);
  }
  
  public com.emailvision.apiccmd.service.api.APISegmentSummaryList getSegmentSummaryList(java.lang.String token, com.emailvision.apiccmd.service.api.APISegmentListOptions listOptionsEntity) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getSegmentSummaryList(token, listOptionsEntity);
  }
  
  public boolean removeSegment(java.lang.String token, long id, long segmentId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.removeSegment(token, id, segmentId);
  }
  
  public boolean segmentationUpdateRecencyCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiRecencyCriteria recencyCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateRecencyCriteriaByObj(token, recencyCriteria);
  }
  
  public boolean segmentationAddSerieActionCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiActionCriteria actionCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationAddSerieActionCriteriaByObj(token, actionCriteria);
  }
  
  public boolean addSegment(java.lang.String token, long id, long segmentId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.addSegment(token, id, segmentId);
  }
  
  public com.emailvision.apiccmd.service.api.APIWebform getWebform(java.lang.String token, long webformId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.SoapError, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getWebform(token, webformId);
  }
  
  public com.emailvision.apiccmd.service.api.ApiBanner getBanner(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getBanner(token, id);
  }
  
  public boolean updateMailingListByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiMailingList mailingList) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateMailingListByObj(token, mailingList);
  }
  
  public boolean unpauseCampaign(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.unpauseCampaign(token, id);
  }
  
  public long createTestGroupByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiTestGroup testGroup) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createTestGroupByObj(token, testGroup);
  }
  
  public boolean updateUrlByField(java.lang.String token, long messageId, long order, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateUrlByField(token, messageId, order, field, value);
  }
  
  public long cloneMailingList(java.lang.String token, long id, java.lang.String name) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.cloneMailingList(token, id, name);
  }
  
  public boolean updateSegment(java.lang.String token, long id, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateSegment(token, id, field, value);
  }
  
  public com.emailvision.apiccmd.service.api.ApiTestGroup getTestGroup(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getTestGroup(token, id);
  }
  
  public com.emailvision.apiccmd.service.api.ApiMailingList getMailingList(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getMailingList(token, id);
  }
  
  public com.emailvision.apiccmd.service.api.Member getTestMember(java.lang.String token, long memberId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getTestMember(token, memberId);
  }
  
  public long trackAllBannerLinks(java.lang.String token, long id) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.trackAllBannerLinks(token, id);
  }
  
  public boolean testCampaignByGroup(java.lang.String token, long id, long groupId) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.testCampaignByGroup(token, id, groupId);
  }
  
  public long createUpdateUrl(java.lang.String token, long messageId, java.lang.String name, java.lang.String parameters, java.lang.String pageOK, long messageOK, java.lang.String pageError, long messageError) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.createUpdateUrl(token, messageId, name, parameters, pageOK, messageOK, pageError, messageError);
  }
  
  public boolean segmentationUpdateStringDemographicCriteriaByObj(java.lang.String token, com.emailvision.apiccmd.service.api.ApiStringDemographicCriteria stringDemographicCriteria) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.segmentationUpdateStringDemographicCriteriaByObj(token, stringDemographicCriteria);
  }
  
  public boolean updateBannerLinkByField(java.lang.String token, long bannerId, long order, java.lang.String field, java.lang.String value) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.updateBannerLinkByField(token, bannerId, order, field, value);
  }
  
  public long[] getLastSmsMessages(java.lang.String token, int limit) throws java.rmi.RemoteException, com.emailvision.apiccmd.service.api.ConnectionExceptionDetails, com.emailvision.apiccmd.service.api.CcmdExceptionDetails{
    if (ccmdService == null)
      _initCcmdServiceProxy();
    return ccmdService.getLastSmsMessages(token, limit);
  }
  
  
}
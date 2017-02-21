package es.meyss.sgtic.sige.portafirmas.client.ws.query;

public class QueryServiceProxy implements es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryService_PortType {
  private String _endpoint = null;
  private es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryService_PortType queryService_PortType = null;
  
  public QueryServiceProxy() {
    _initQueryServiceProxy();
  }
  
  public QueryServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initQueryServiceProxy();
  }
  
  private void _initQueryServiceProxy() {
    try {
      queryService_PortType = (new es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryService_ServiceLocator()).getQueryServicePort();
      if (queryService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)queryService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)queryService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (queryService_PortType != null)
      ((javax.xml.rpc.Stub)queryService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryService_PortType getQueryService_PortType() {
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType;
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature downloadSign(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.downloadSign(authentication, documentId);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.User[] queryUsers(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryUsers(authentication, query);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[] queryDocumentTypes(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryDocumentTypes(authentication, query);
  }
  
  public byte[] downloadDocument(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.downloadDocument(authentication, documentId);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.State[] queryStates(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryStates(authentication, query);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel[] queryImportanceLevels(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryImportanceLevels(authentication, query);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.Request queryRequest(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String requestId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryRequest(authentication, requestId);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.Job[] queryJobs(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryJobs(authentication, query);
  }
  
  public java.lang.String getCVS(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature firma) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.getCVS(authentication, firma);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[] queryEnhancedUsers(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String queryUser, java.lang.String querySeat) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryEnhancedUsers(authentication, queryUser, querySeat);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[] queryEnhancedJobs(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String queryJob, java.lang.String querySeat) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryEnhancedJobs(authentication, queryJob, querySeat);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat[] querySeats(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.querySeats(authentication, query);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[] queryEnhancedUserJobAssociatedToJob(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String jobIdentifier) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryEnhancedUserJobAssociatedToJob(authentication, jobIdentifier);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[] queryEnhancedUserJobAssociatedToUser(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String userIdentifier) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryEnhancedUserJobAssociatedToUser(authentication, userIdentifier);
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.type.CsvJustificante queryCSVyJustificante(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (queryService_PortType == null)
      _initQueryServiceProxy();
    return queryService_PortType.queryCSVyJustificante(authentication, documentId);
  }
  
  
}
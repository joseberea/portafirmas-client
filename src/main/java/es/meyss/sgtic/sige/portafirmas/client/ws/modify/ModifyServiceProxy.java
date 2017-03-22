package es.meyss.sgtic.sige.portafirmas.client.ws.modify;

public class ModifyServiceProxy implements es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyService_PortType {
  private String _endpoint = null;
  private es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyService_PortType modifyService_PortType = null;
  
  public ModifyServiceProxy() {
    _initModifyServiceProxy();
  }
  
  public ModifyServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initModifyServiceProxy();
  }
  
  private void _initModifyServiceProxy() {
    try {
      modifyService_PortType = (new es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyService_ServiceLocator()).getModifyServicePort();
      if (modifyService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)modifyService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)modifyService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (modifyService_PortType != null)
      ((javax.xml.rpc.Stub)modifyService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.modify.ModifyService_PortType getModifyService_PortType() {
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    return modifyService_PortType;
  }
  
  public java.lang.String createRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.Request request) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    return modifyService_PortType.createRequest(authentication, request);
  }
  
  public java.lang.String updateRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.Request request) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    return modifyService_PortType.updateRequest(authentication, request);
  }
  
  public void deleteRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    modifyService_PortType.deleteRequest(authentication, requestId);
  }
  
  public void removeRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId, java.lang.String removingMessage) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    modifyService_PortType.removeRequest(authentication, requestId, removingMessage);
  }
  
  public void sendRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    modifyService_PortType.sendRequest(authentication, requestId);
  }
  
  public java.lang.String insertDocument(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, java.lang.String requestId, es.meyss.sgtic.sige.portafirmas.type.Document document) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    return modifyService_PortType.insertDocument(authentication, requestId, document);
  }
  
  public void deleteDocument(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    modifyService_PortType.deleteDocument(authentication, documentId);
  }
  
  public void insertSigners(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId, int signLine, es.meyss.sgtic.sige.portafirmas.type.Signer[] signerList, es.meyss.sgtic.sige.portafirmas.type.SignLineType signLineType) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    modifyService_PortType.insertSigners(authentication, requestId, signLine, signerList, signLineType);
  }
  
  public void deleteSigners(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId, java.lang.Integer signLineNumber, es.meyss.sgtic.sige.portafirmas.type.Signer[] signerList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    modifyService_PortType.deleteSigners(authentication, requestId, signLineNumber, signerList);
  }
  
  public es.meyss.sgtic.sige.portafirmas.type.ResultRemoteSign remoteSign(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, java.lang.String requestId, java.lang.String signatures, java.lang.String documentId, long idTagList, java.lang.String user) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo{
    if (modifyService_PortType == null)
      _initModifyServiceProxy();
    return modifyService_PortType.remoteSign(authentication, requestId, signatures, documentId, idTagList, user);
  }
  
  
}
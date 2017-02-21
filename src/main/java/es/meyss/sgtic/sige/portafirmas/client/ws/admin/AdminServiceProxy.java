package es.meyss.sgtic.sige.portafirmas.client.ws.admin;

public class AdminServiceProxy implements es.meyss.sgtic.sige.portafirmas.client.ws.admin.AdminService_PortType {
  private String _endpoint = null;
  private es.meyss.sgtic.sige.portafirmas.client.ws.admin.AdminService_PortType adminService_PortType = null;
  
  public AdminServiceProxy() {
    _initAdminServiceProxy();
  }
  
  public AdminServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdminServiceProxy();
  }
  
  private void _initAdminServiceProxy() {
    try {
      adminService_PortType = (new es.meyss.sgtic.sige.portafirmas.client.ws.admin.AdminService_ServiceLocator()).getAdminServicePort();
      if (adminService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)adminService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)adminService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (adminService_PortType != null)
      ((javax.xml.rpc.Stub)adminService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public es.meyss.sgtic.sige.portafirmas.client.ws.admin.AdminService_PortType getAdminService_PortType() {
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType;
  }
  
  public void insertDocumentsType(javax.xml.rpc.holders.StringHolder applicationId, es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[] documentTypeList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.insertDocumentsType(applicationId, documentTypeList);
  }
  
  public void deleteDocumentsType(javax.xml.rpc.holders.StringHolder applicationId, es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[] documentTypeList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.deleteDocumentsType(applicationId, documentTypeList);
  }
  
  public void updateDocumentsType(javax.xml.rpc.holders.StringHolder applicationId, es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[] documentTypeList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    adminService_PortType.updateDocumentsType(applicationId, documentTypeList);
  }
  
  public java.math.BigInteger insertEnhancedUsers(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[] enhancedUserList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.insertEnhancedUsers(authentication, enhancedUserList);
  }
  
  public java.math.BigInteger insertEnhancedJobs(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[] enhancedJobList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.insertEnhancedJobs(authentication, enhancedJobList);
  }
  
  public java.math.BigInteger updateEnhancedUsers(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[] enhancedUserList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.updateEnhancedUsers(authentication, enhancedUserList);
  }
  
  public java.math.BigInteger updateEnhancedJobs(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[] enhancedJobList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.updateEnhancedJobs(authentication, enhancedJobList);
  }
  
  public java.math.BigInteger deleteUsers(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String[] userIdentifierList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.deleteUsers(authentication, userIdentifierList);
  }
  
  public java.math.BigInteger deleteJobs(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String[] jobIdentifierList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.deleteJobs(authentication, jobIdentifierList);
  }
  
  public boolean assignJobToUser(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String jobIdentifier, java.lang.String userIdentifier, java.util.Date fstart, java.util.Date fend) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.assignJobToUser(authentication, jobIdentifier, userIdentifier, fstart, fend);
  }
  
  public boolean separateJobToUser(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String jobIdentifier, java.lang.String userIdentifier) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo{
    if (adminService_PortType == null)
      _initAdminServiceProxy();
    return adminService_PortType.separateJobToUser(authentication, jobIdentifier, userIdentifier);
  }
  
  
}
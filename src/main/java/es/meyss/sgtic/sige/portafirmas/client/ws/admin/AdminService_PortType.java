/**
 * AdminService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.admin;

public interface AdminService_PortType extends java.rmi.Remote {
    public void insertDocumentsType(javax.xml.rpc.holders.StringHolder applicationId, es.meyss.sgtic.sige.portafirmas.type.DocumentType[] documentTypeList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public void deleteDocumentsType(javax.xml.rpc.holders.StringHolder applicationId, es.meyss.sgtic.sige.portafirmas.type.DocumentType[] documentTypeList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public void updateDocumentsType(javax.xml.rpc.holders.StringHolder applicationId, es.meyss.sgtic.sige.portafirmas.type.DocumentType[] documentTypeList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public java.math.BigInteger insertEnhancedUsers(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.EnhancedUser[] enhancedUserList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public java.math.BigInteger insertEnhancedJobs(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.EnhancedJob[] enhancedJobList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public java.math.BigInteger updateEnhancedUsers(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.EnhancedUser[] enhancedUserList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public java.math.BigInteger updateEnhancedJobs(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.EnhancedJob[] enhancedJobList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public java.math.BigInteger deleteUsers(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, java.lang.String[] userIdentifierList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public java.math.BigInteger deleteJobs(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, java.lang.String[] jobIdentifierList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public boolean assignJobToUser(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, java.lang.String jobIdentifier, java.lang.String userIdentifier, java.util.Date fstart, java.util.Date fend) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public boolean separateJobToUser(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, java.lang.String jobIdentifier, java.lang.String userIdentifier) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
}

/**
 * QueryService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.query;

public interface QueryService_PortType extends java.rmi.Remote {
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature downloadSign(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.User[] queryUsers(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[] queryDocumentTypes(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public byte[] downloadDocument(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.State[] queryStates(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel[] queryImportanceLevels(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Request queryRequest(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String requestId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Job[] queryJobs(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public java.lang.String getCVS(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature firma) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[] queryEnhancedUsers(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String queryUser, java.lang.String querySeat) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[] queryEnhancedJobs(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String queryJob, java.lang.String querySeat) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat[] querySeats(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[] queryEnhancedUserJobAssociatedToJob(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String jobIdentifier) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[] queryEnhancedUserJobAssociatedToUser(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String userIdentifier) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.CsvJustificante queryCSVyJustificante(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo;
}

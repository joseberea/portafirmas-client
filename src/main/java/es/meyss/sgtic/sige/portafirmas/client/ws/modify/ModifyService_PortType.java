/**
 * ModifyService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.modify;

public interface ModifyService_PortType extends java.rmi.Remote {
    public java.lang.String createRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.Request request) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public java.lang.String updateRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.type.Request request) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public void deleteRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public void removeRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId, java.lang.String removingMessage) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public void sendRequest(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public java.lang.String insertDocument(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, java.lang.String requestId, es.meyss.sgtic.sige.portafirmas.type.Document document) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public void deleteDocument(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public void insertSigners(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId, int signLine, es.meyss.sgtic.sige.portafirmas.type.Signer[] signerList, es.meyss.sgtic.sige.portafirmas.type.SignLineType signLineType) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public void deleteSigners(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, javax.xml.rpc.holders.StringHolder requestId, java.lang.Integer signLineNumber, es.meyss.sgtic.sige.portafirmas.type.Signer[] signerList) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
    public es.meyss.sgtic.sige.portafirmas.type.ResultRemoteSign remoteSign(es.meyss.sgtic.sige.portafirmas.type.Authentication authentication, java.lang.String requestId, java.lang.String signatures, java.lang.String documentId, long idTagList, java.lang.String user) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.type.ExceptionInfo;
}

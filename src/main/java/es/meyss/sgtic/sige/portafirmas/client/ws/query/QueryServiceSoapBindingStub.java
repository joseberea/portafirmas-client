/**
 * QueryServiceSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.query;

public class QueryServiceSoapBindingStub extends org.apache.axis.client.Stub implements es.meyss.sgtic.sige.portafirmas.client.ws.query.QueryService_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[15];
        _initOperationDesc1();
        _initOperationDesc2();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("downloadSign");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signature"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "signature"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "userList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.User[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "userList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "user"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryDocumentTypes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "documentTypeList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "documentTypeList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "documentType"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("downloadDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "documentBinary"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryStates");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "stateList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.State[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "stateList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "state"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryImportanceLevels");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "importanceLevelList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "importanceLevelList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "importanceLevels"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryJobs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "jobList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.Job[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "jobList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "job"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "requestId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "request"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.Request.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "request"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCVS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "firma"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signature"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "cvs"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryEnhancedUsers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryUser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "querySeat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "enhancedUserList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "enhancedUser"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryEnhancedJobs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "queryJob"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "querySeat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedJobList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "enhancedJobList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "enhancedJob"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("querySeats");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "query"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "seatList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "seatList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "seat"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryEnhancedUserJobAssociatedToJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "jobIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserJobAssociatedList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "enhancedUserJobAssociatedList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "enhancedUserJobAssociated"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryEnhancedUserJobAssociatedToUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userIdentifier"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserJobAssociatedList"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "enhancedUserJobAssociatedList"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("", "enhancedUserJobAssociated"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("queryCSVyJustificante");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "authentication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication"), es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "documentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "CsvJustificante"));
        oper.setReturnClass(es.meyss.sgtic.sige.portafirmas.client.ws.type.CsvJustificante.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "csvJustificante"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "exceptionInfo"),
                      "_0.v2.type.pfirma.cice.juntadeandalucia.ExceptionInfo",
                      new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo"), 
                      true
                     ));
        _operations[14] = oper;

    }

    public QueryServiceSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public QueryServiceSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public QueryServiceSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
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
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", ">exceptionInfo");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "action");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Action.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "actionList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Action[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "action");
            qName2 = new javax.xml.namespace.QName("", "action");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "authentication");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "comment");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Comment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "commentList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Comment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "comment");
            qName2 = new javax.xml.namespace.QName("", "comment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "CsvJustificante");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.CsvJustificante.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "document");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Document.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "documentList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Document[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "document");
            qName2 = new javax.xml.namespace.QName("", "document");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "documentType");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "documentTypeList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "documentType");
            qName2 = new javax.xml.namespace.QName("", "documentType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedJob");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedJobList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedJob");
            qName2 = new javax.xml.namespace.QName("", "enhancedJob");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUser");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserJobAssociated");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserJobAssociatedList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserJobAssociated");
            qName2 = new javax.xml.namespace.QName("", "enhancedUserJobAssociated");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserJobInfo");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUser");
            qName2 = new javax.xml.namespace.QName("", "enhancedUser");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "importanceLevel");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "importanceLevelList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "importanceLevel");
            qName2 = new javax.xml.namespace.QName("", "importanceLevels");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "job");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Job.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "jobList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Job[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "job");
            qName2 = new javax.xml.namespace.QName("", "job");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "noticeList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.State[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "state");
            qName2 = new javax.xml.namespace.QName("", "state");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "parameter");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "parameterList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "parameter");
            qName2 = new javax.xml.namespace.QName("", "parameter");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "remitterList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "user");
            qName2 = new javax.xml.namespace.QName("", "user");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "request");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "requestStatus");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.RequestStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "seat");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "seatList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "seat");
            qName2 = new javax.xml.namespace.QName("", "seat");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signature");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signer");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Signer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signerList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.Signer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signer");
            qName2 = new javax.xml.namespace.QName("", "signer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signFormat");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.SignFormat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLine");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLineList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLine[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLine");
            qName2 = new javax.xml.namespace.QName("", "signLine");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLineType");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLineType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signType");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.SignType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "state");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.State.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "stateList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.State[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "state");
            qName2 = new javax.xml.namespace.QName("", "state");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "stringList");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("", "str");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "timestampInfo");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.TimestampInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "user");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.User.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "userJob");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.UserJob.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "userList");
            cachedSerQNames.add(qName);
            cls = es.meyss.sgtic.sige.portafirmas.client.ws.type.User[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "user");
            qName2 = new javax.xml.namespace.QName("", "user");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

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

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature downloadSign(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "downloadSign"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, documentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.User[] queryUsers(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, query});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.User[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.User[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.User[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[] queryDocumentTypes(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryDocumentTypes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, query});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.DocumentType[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public byte[] downloadDocument(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "downloadDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, documentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (byte[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.State[] queryStates(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryStates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, query});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.State[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.State[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.State[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel[] queryImportanceLevels(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryImportanceLevels"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, query});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Job[] queryJobs(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryJobs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, query});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.Job[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.Job[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.Job[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Request queryRequest(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String requestId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, requestId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.Request) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.Request) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.Request.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getCVS(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, es.meyss.sgtic.sige.portafirmas.client.ws.type.Signature firma) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "getCVS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, firma});

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
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[] queryEnhancedUsers(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String queryUser, java.lang.String querySeat) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
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
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryEnhancedUsers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, queryUser, querySeat});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[] queryEnhancedJobs(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String queryJob, java.lang.String querySeat) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryEnhancedJobs"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, queryJob, querySeat});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat[] querySeats(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String query) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "querySeats"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, query});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[] queryEnhancedUserJobAssociatedToJob(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String jobIdentifier) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryEnhancedUserJobAssociatedToJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, jobIdentifier});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[] queryEnhancedUserJobAssociatedToUser(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String userIdentifier) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryEnhancedUserJobAssociatedToUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, userIdentifier});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[]) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobAssociated[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public es.meyss.sgtic.sige.portafirmas.client.ws.type.CsvJustificante queryCSVyJustificante(es.meyss.sgtic.sige.portafirmas.client.ws.type.Authentication authentication, java.lang.String documentId) throws java.rmi.RemoteException, es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:query:request:v2.0", "queryCSVyJustificante"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {authentication, documentId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.CsvJustificante) _resp;
            } catch (java.lang.Exception _exception) {
                return (es.meyss.sgtic.sige.portafirmas.client.ws.type.CsvJustificante) org.apache.axis.utils.JavaUtils.convert(_resp, es.meyss.sgtic.sige.portafirmas.client.ws.type.CsvJustificante.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) {
              throw (es.meyss.sgtic.sige.portafirmas.client.ws.type.ExceptionInfo) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}

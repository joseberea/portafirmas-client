/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.type;

public class Request  implements java.io.Serializable {
    private java.lang.String identifier;

    private java.lang.String subject;

    private java.util.Calendar fentry;

    private java.util.Calendar fstart;

    private java.util.Calendar fexpiration;

    private java.lang.String reference;

    private java.lang.String text;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.SignType signType;

    private java.lang.String application;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel importanceLevel;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.Document[] documentList;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLine[] signLineList;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.User[] remitterList;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter[] parameterList;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.State[] noticeList;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.Action[] actionList;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.Comment[] commentList;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.RequestStatus requestStatus;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.TimestampInfo timestampInfo;

    private java.lang.String[] emailToNotifyList;

    public Request() {
    }

    public Request(
           java.lang.String identifier,
           java.lang.String subject,
           java.util.Calendar fentry,
           java.util.Calendar fstart,
           java.util.Calendar fexpiration,
           java.lang.String reference,
           java.lang.String text,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.SignType signType,
           java.lang.String application,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel importanceLevel,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.Document[] documentList,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLine[] signLineList,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.User[] remitterList,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter[] parameterList,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.State[] noticeList,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.Action[] actionList,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.Comment[] commentList,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.RequestStatus requestStatus,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.TimestampInfo timestampInfo,
           java.lang.String[] emailToNotifyList) {
           this.identifier = identifier;
           this.subject = subject;
           this.fentry = fentry;
           this.fstart = fstart;
           this.fexpiration = fexpiration;
           this.reference = reference;
           this.text = text;
           this.signType = signType;
           this.application = application;
           this.importanceLevel = importanceLevel;
           this.documentList = documentList;
           this.signLineList = signLineList;
           this.remitterList = remitterList;
           this.parameterList = parameterList;
           this.noticeList = noticeList;
           this.actionList = actionList;
           this.commentList = commentList;
           this.requestStatus = requestStatus;
           this.timestampInfo = timestampInfo;
           this.emailToNotifyList = emailToNotifyList;
    }


    /**
     * Gets the identifier value for this Request.
     * 
     * @return identifier
     */
    public java.lang.String getIdentifier() {
        return identifier;
    }


    /**
     * Sets the identifier value for this Request.
     * 
     * @param identifier
     */
    public void setIdentifier(java.lang.String identifier) {
        this.identifier = identifier;
    }


    /**
     * Gets the subject value for this Request.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Request.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the fentry value for this Request.
     * 
     * @return fentry
     */
    public java.util.Calendar getFentry() {
        return fentry;
    }


    /**
     * Sets the fentry value for this Request.
     * 
     * @param fentry
     */
    public void setFentry(java.util.Calendar fentry) {
        this.fentry = fentry;
    }


    /**
     * Gets the fstart value for this Request.
     * 
     * @return fstart
     */
    public java.util.Calendar getFstart() {
        return fstart;
    }


    /**
     * Sets the fstart value for this Request.
     * 
     * @param fstart
     */
    public void setFstart(java.util.Calendar fstart) {
        this.fstart = fstart;
    }


    /**
     * Gets the fexpiration value for this Request.
     * 
     * @return fexpiration
     */
    public java.util.Calendar getFexpiration() {
        return fexpiration;
    }


    /**
     * Sets the fexpiration value for this Request.
     * 
     * @param fexpiration
     */
    public void setFexpiration(java.util.Calendar fexpiration) {
        this.fexpiration = fexpiration;
    }


    /**
     * Gets the reference value for this Request.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this Request.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the text value for this Request.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this Request.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the signType value for this Request.
     * 
     * @return signType
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.SignType getSignType() {
        return signType;
    }


    /**
     * Sets the signType value for this Request.
     * 
     * @param signType
     */
    public void setSignType(es.meyss.sgtic.sige.portafirmas.client.ws.type.SignType signType) {
        this.signType = signType;
    }


    /**
     * Gets the application value for this Request.
     * 
     * @return application
     */
    public java.lang.String getApplication() {
        return application;
    }


    /**
     * Sets the application value for this Request.
     * 
     * @param application
     */
    public void setApplication(java.lang.String application) {
        this.application = application;
    }


    /**
     * Gets the importanceLevel value for this Request.
     * 
     * @return importanceLevel
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel getImportanceLevel() {
        return importanceLevel;
    }


    /**
     * Sets the importanceLevel value for this Request.
     * 
     * @param importanceLevel
     */
    public void setImportanceLevel(es.meyss.sgtic.sige.portafirmas.client.ws.type.ImportanceLevel importanceLevel) {
        this.importanceLevel = importanceLevel;
    }


    /**
     * Gets the documentList value for this Request.
     * 
     * @return documentList
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Document[] getDocumentList() {
        return documentList;
    }


    /**
     * Sets the documentList value for this Request.
     * 
     * @param documentList
     */
    public void setDocumentList(es.meyss.sgtic.sige.portafirmas.client.ws.type.Document[] documentList) {
        this.documentList = documentList;
    }


    /**
     * Gets the signLineList value for this Request.
     * 
     * @return signLineList
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLine[] getSignLineList() {
        return signLineList;
    }


    /**
     * Sets the signLineList value for this Request.
     * 
     * @param signLineList
     */
    public void setSignLineList(es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLine[] signLineList) {
        this.signLineList = signLineList;
    }


    /**
     * Gets the remitterList value for this Request.
     * 
     * @return remitterList
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.User[] getRemitterList() {
        return remitterList;
    }


    /**
     * Sets the remitterList value for this Request.
     * 
     * @param remitterList
     */
    public void setRemitterList(es.meyss.sgtic.sige.portafirmas.client.ws.type.User[] remitterList) {
        this.remitterList = remitterList;
    }


    /**
     * Gets the parameterList value for this Request.
     * 
     * @return parameterList
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter[] getParameterList() {
        return parameterList;
    }


    /**
     * Sets the parameterList value for this Request.
     * 
     * @param parameterList
     */
    public void setParameterList(es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter[] parameterList) {
        this.parameterList = parameterList;
    }


    /**
     * Gets the noticeList value for this Request.
     * 
     * @return noticeList
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.State[] getNoticeList() {
        return noticeList;
    }


    /**
     * Sets the noticeList value for this Request.
     * 
     * @param noticeList
     */
    public void setNoticeList(es.meyss.sgtic.sige.portafirmas.client.ws.type.State[] noticeList) {
        this.noticeList = noticeList;
    }


    /**
     * Gets the actionList value for this Request.
     * 
     * @return actionList
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Action[] getActionList() {
        return actionList;
    }


    /**
     * Sets the actionList value for this Request.
     * 
     * @param actionList
     */
    public void setActionList(es.meyss.sgtic.sige.portafirmas.client.ws.type.Action[] actionList) {
        this.actionList = actionList;
    }


    /**
     * Gets the commentList value for this Request.
     * 
     * @return commentList
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Comment[] getCommentList() {
        return commentList;
    }


    /**
     * Sets the commentList value for this Request.
     * 
     * @param commentList
     */
    public void setCommentList(es.meyss.sgtic.sige.portafirmas.client.ws.type.Comment[] commentList) {
        this.commentList = commentList;
    }


    /**
     * Gets the requestStatus value for this Request.
     * 
     * @return requestStatus
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.RequestStatus getRequestStatus() {
        return requestStatus;
    }


    /**
     * Sets the requestStatus value for this Request.
     * 
     * @param requestStatus
     */
    public void setRequestStatus(es.meyss.sgtic.sige.portafirmas.client.ws.type.RequestStatus requestStatus) {
        this.requestStatus = requestStatus;
    }


    /**
     * Gets the timestampInfo value for this Request.
     * 
     * @return timestampInfo
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.TimestampInfo getTimestampInfo() {
        return timestampInfo;
    }


    /**
     * Sets the timestampInfo value for this Request.
     * 
     * @param timestampInfo
     */
    public void setTimestampInfo(es.meyss.sgtic.sige.portafirmas.client.ws.type.TimestampInfo timestampInfo) {
        this.timestampInfo = timestampInfo;
    }


    /**
     * Gets the emailToNotifyList value for this Request.
     * 
     * @return emailToNotifyList
     */
    public java.lang.String[] getEmailToNotifyList() {
        return emailToNotifyList;
    }


    /**
     * Sets the emailToNotifyList value for this Request.
     * 
     * @param emailToNotifyList
     */
    public void setEmailToNotifyList(java.lang.String[] emailToNotifyList) {
        this.emailToNotifyList = emailToNotifyList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identifier==null && other.getIdentifier()==null) || 
             (this.identifier!=null &&
              this.identifier.equals(other.getIdentifier()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.fentry==null && other.getFentry()==null) || 
             (this.fentry!=null &&
              this.fentry.equals(other.getFentry()))) &&
            ((this.fstart==null && other.getFstart()==null) || 
             (this.fstart!=null &&
              this.fstart.equals(other.getFstart()))) &&
            ((this.fexpiration==null && other.getFexpiration()==null) || 
             (this.fexpiration!=null &&
              this.fexpiration.equals(other.getFexpiration()))) &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.signType==null && other.getSignType()==null) || 
             (this.signType!=null &&
              this.signType.equals(other.getSignType()))) &&
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.importanceLevel==null && other.getImportanceLevel()==null) || 
             (this.importanceLevel!=null &&
              this.importanceLevel.equals(other.getImportanceLevel()))) &&
            ((this.documentList==null && other.getDocumentList()==null) || 
             (this.documentList!=null &&
              java.util.Arrays.equals(this.documentList, other.getDocumentList()))) &&
            ((this.signLineList==null && other.getSignLineList()==null) || 
             (this.signLineList!=null &&
              java.util.Arrays.equals(this.signLineList, other.getSignLineList()))) &&
            ((this.remitterList==null && other.getRemitterList()==null) || 
             (this.remitterList!=null &&
              java.util.Arrays.equals(this.remitterList, other.getRemitterList()))) &&
            ((this.parameterList==null && other.getParameterList()==null) || 
             (this.parameterList!=null &&
              java.util.Arrays.equals(this.parameterList, other.getParameterList()))) &&
            ((this.noticeList==null && other.getNoticeList()==null) || 
             (this.noticeList!=null &&
              java.util.Arrays.equals(this.noticeList, other.getNoticeList()))) &&
            ((this.actionList==null && other.getActionList()==null) || 
             (this.actionList!=null &&
              java.util.Arrays.equals(this.actionList, other.getActionList()))) &&
            ((this.commentList==null && other.getCommentList()==null) || 
             (this.commentList!=null &&
              java.util.Arrays.equals(this.commentList, other.getCommentList()))) &&
            ((this.requestStatus==null && other.getRequestStatus()==null) || 
             (this.requestStatus!=null &&
              this.requestStatus.equals(other.getRequestStatus()))) &&
            ((this.timestampInfo==null && other.getTimestampInfo()==null) || 
             (this.timestampInfo!=null &&
              this.timestampInfo.equals(other.getTimestampInfo()))) &&
            ((this.emailToNotifyList==null && other.getEmailToNotifyList()==null) || 
             (this.emailToNotifyList!=null &&
              java.util.Arrays.equals(this.emailToNotifyList, other.getEmailToNotifyList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getIdentifier() != null) {
            _hashCode += getIdentifier().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getFentry() != null) {
            _hashCode += getFentry().hashCode();
        }
        if (getFstart() != null) {
            _hashCode += getFstart().hashCode();
        }
        if (getFexpiration() != null) {
            _hashCode += getFexpiration().hashCode();
        }
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getSignType() != null) {
            _hashCode += getSignType().hashCode();
        }
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getImportanceLevel() != null) {
            _hashCode += getImportanceLevel().hashCode();
        }
        if (getDocumentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSignLineList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignLineList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignLineList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemitterList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemitterList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemitterList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParameterList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameterList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameterList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoticeList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoticeList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoticeList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActionList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommentList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommentList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommentList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequestStatus() != null) {
            _hashCode += getRequestStatus().hashCode();
        }
        if (getTimestampInfo() != null) {
            _hashCode += getTimestampInfo().hashCode();
        }
        if (getEmailToNotifyList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailToNotifyList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailToNotifyList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fentry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fentry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fstart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fstart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fexpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fexpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("", "application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importanceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importanceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "importanceLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "document"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "document"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signLineList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signLineList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "signLine"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remitterList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remitterList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "user"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "user"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "parameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "parameter"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noticeList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noticeList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "state"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "state"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "action"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "action"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commentList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commentList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "comment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "comment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "requestStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestampInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timestampInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "timestampInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailToNotifyList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailToNotifyList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "str"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}

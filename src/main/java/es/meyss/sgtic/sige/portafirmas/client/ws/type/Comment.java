/**
 * Comment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.type;

public class Comment  implements java.io.Serializable {
    private java.lang.String subject;

    private java.lang.String textComment;

    private java.util.Calendar fmodify;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.UserJob user;

    public Comment() {
    }

    public Comment(
           java.lang.String subject,
           java.lang.String textComment,
           java.util.Calendar fmodify,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.UserJob user) {
           this.subject = subject;
           this.textComment = textComment;
           this.fmodify = fmodify;
           this.user = user;
    }


    /**
     * Gets the subject value for this Comment.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Comment.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the textComment value for this Comment.
     * 
     * @return textComment
     */
    public java.lang.String getTextComment() {
        return textComment;
    }


    /**
     * Sets the textComment value for this Comment.
     * 
     * @param textComment
     */
    public void setTextComment(java.lang.String textComment) {
        this.textComment = textComment;
    }


    /**
     * Gets the fmodify value for this Comment.
     * 
     * @return fmodify
     */
    public java.util.Calendar getFmodify() {
        return fmodify;
    }


    /**
     * Sets the fmodify value for this Comment.
     * 
     * @param fmodify
     */
    public void setFmodify(java.util.Calendar fmodify) {
        this.fmodify = fmodify;
    }


    /**
     * Gets the user value for this Comment.
     * 
     * @return user
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.UserJob getUser() {
        return user;
    }


    /**
     * Sets the user value for this Comment.
     * 
     * @param user
     */
    public void setUser(es.meyss.sgtic.sige.portafirmas.client.ws.type.UserJob user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Comment)) return false;
        Comment other = (Comment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.textComment==null && other.getTextComment()==null) || 
             (this.textComment!=null &&
              this.textComment.equals(other.getTextComment()))) &&
            ((this.fmodify==null && other.getFmodify()==null) || 
             (this.fmodify!=null &&
              this.fmodify.equals(other.getFmodify()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getTextComment() != null) {
            _hashCode += getTextComment().hashCode();
        }
        if (getFmodify() != null) {
            _hashCode += getFmodify().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Comment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "comment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textComment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "textComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fmodify");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fmodify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "userJob"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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

/**
 * EnhancedUserJobAssociated.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.type;

public class EnhancedUserJobAssociated  implements java.io.Serializable {
    private es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser enhancedUser;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob enhancedJob;

    private java.util.Calendar fstart;

    private java.util.Calendar fend;

    public EnhancedUserJobAssociated() {
    }

    public EnhancedUserJobAssociated(
           es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser enhancedUser,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob enhancedJob,
           java.util.Calendar fstart,
           java.util.Calendar fend) {
           this.enhancedUser = enhancedUser;
           this.enhancedJob = enhancedJob;
           this.fstart = fstart;
           this.fend = fend;
    }


    /**
     * Gets the enhancedUser value for this EnhancedUserJobAssociated.
     * 
     * @return enhancedUser
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser getEnhancedUser() {
        return enhancedUser;
    }


    /**
     * Sets the enhancedUser value for this EnhancedUserJobAssociated.
     * 
     * @param enhancedUser
     */
    public void setEnhancedUser(es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUser enhancedUser) {
        this.enhancedUser = enhancedUser;
    }


    /**
     * Gets the enhancedJob value for this EnhancedUserJobAssociated.
     * 
     * @return enhancedJob
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob getEnhancedJob() {
        return enhancedJob;
    }


    /**
     * Sets the enhancedJob value for this EnhancedUserJobAssociated.
     * 
     * @param enhancedJob
     */
    public void setEnhancedJob(es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedJob enhancedJob) {
        this.enhancedJob = enhancedJob;
    }


    /**
     * Gets the fstart value for this EnhancedUserJobAssociated.
     * 
     * @return fstart
     */
    public java.util.Calendar getFstart() {
        return fstart;
    }


    /**
     * Sets the fstart value for this EnhancedUserJobAssociated.
     * 
     * @param fstart
     */
    public void setFstart(java.util.Calendar fstart) {
        this.fstart = fstart;
    }


    /**
     * Gets the fend value for this EnhancedUserJobAssociated.
     * 
     * @return fend
     */
    public java.util.Calendar getFend() {
        return fend;
    }


    /**
     * Sets the fend value for this EnhancedUserJobAssociated.
     * 
     * @param fend
     */
    public void setFend(java.util.Calendar fend) {
        this.fend = fend;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnhancedUserJobAssociated)) return false;
        EnhancedUserJobAssociated other = (EnhancedUserJobAssociated) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enhancedUser==null && other.getEnhancedUser()==null) || 
             (this.enhancedUser!=null &&
              this.enhancedUser.equals(other.getEnhancedUser()))) &&
            ((this.enhancedJob==null && other.getEnhancedJob()==null) || 
             (this.enhancedJob!=null &&
              this.enhancedJob.equals(other.getEnhancedJob()))) &&
            ((this.fstart==null && other.getFstart()==null) || 
             (this.fstart!=null &&
              this.fstart.equals(other.getFstart()))) &&
            ((this.fend==null && other.getFend()==null) || 
             (this.fend!=null &&
              this.fend.equals(other.getFend())));
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
        if (getEnhancedUser() != null) {
            _hashCode += getEnhancedUser().hashCode();
        }
        if (getEnhancedJob() != null) {
            _hashCode += getEnhancedJob().hashCode();
        }
        if (getFstart() != null) {
            _hashCode += getFstart().hashCode();
        }
        if (getFend() != null) {
            _hashCode += getFend().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnhancedUserJobAssociated.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserJobAssociated"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUser"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedJob");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedJob"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fstart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fstart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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

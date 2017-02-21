/**
 * Signer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.type;

public class Signer  implements java.io.Serializable {
    private es.meyss.sgtic.sige.portafirmas.client.ws.type.UserJob userJob;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.State state;

    private java.util.Calendar fstate;

    public Signer() {
    }

    public Signer(
           es.meyss.sgtic.sige.portafirmas.client.ws.type.UserJob userJob,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.State state,
           java.util.Calendar fstate) {
           this.userJob = userJob;
           this.state = state;
           this.fstate = fstate;
    }


    /**
     * Gets the userJob value for this Signer.
     * 
     * @return userJob
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.UserJob getUserJob() {
        return userJob;
    }


    /**
     * Sets the userJob value for this Signer.
     * 
     * @param userJob
     */
    public void setUserJob(es.meyss.sgtic.sige.portafirmas.client.ws.type.UserJob userJob) {
        this.userJob = userJob;
    }


    /**
     * Gets the state value for this Signer.
     * 
     * @return state
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.State getState() {
        return state;
    }


    /**
     * Sets the state value for this Signer.
     * 
     * @param state
     */
    public void setState(es.meyss.sgtic.sige.portafirmas.client.ws.type.State state) {
        this.state = state;
    }


    /**
     * Gets the fstate value for this Signer.
     * 
     * @return fstate
     */
    public java.util.Calendar getFstate() {
        return fstate;
    }


    /**
     * Sets the fstate value for this Signer.
     * 
     * @param fstate
     */
    public void setFstate(java.util.Calendar fstate) {
        this.fstate = fstate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Signer)) return false;
        Signer other = (Signer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userJob==null && other.getUserJob()==null) || 
             (this.userJob!=null &&
              this.userJob.equals(other.getUserJob()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.fstate==null && other.getFstate()==null) || 
             (this.fstate!=null &&
              this.fstate.equals(other.getFstate())));
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
        if (getUserJob() != null) {
            _hashCode += getUserJob().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getFstate() != null) {
            _hashCode += getFstate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Signer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJob");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "userJob"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "state"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

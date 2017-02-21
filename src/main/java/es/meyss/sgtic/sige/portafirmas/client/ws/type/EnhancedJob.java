/**
 * EnhancedJob.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.type;

public class EnhancedJob  implements java.io.Serializable {
    private es.meyss.sgtic.sige.portafirmas.client.ws.type.Job job;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobInfo enhancedUserJobInfo;

    public EnhancedJob() {
    }

    public EnhancedJob(
           es.meyss.sgtic.sige.portafirmas.client.ws.type.Job job,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobInfo enhancedUserJobInfo) {
           this.job = job;
           this.enhancedUserJobInfo = enhancedUserJobInfo;
    }


    /**
     * Gets the job value for this EnhancedJob.
     * 
     * @return job
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Job getJob() {
        return job;
    }


    /**
     * Sets the job value for this EnhancedJob.
     * 
     * @param job
     */
    public void setJob(es.meyss.sgtic.sige.portafirmas.client.ws.type.Job job) {
        this.job = job;
    }


    /**
     * Gets the enhancedUserJobInfo value for this EnhancedJob.
     * 
     * @return enhancedUserJobInfo
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobInfo getEnhancedUserJobInfo() {
        return enhancedUserJobInfo;
    }


    /**
     * Sets the enhancedUserJobInfo value for this EnhancedJob.
     * 
     * @param enhancedUserJobInfo
     */
    public void setEnhancedUserJobInfo(es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobInfo enhancedUserJobInfo) {
        this.enhancedUserJobInfo = enhancedUserJobInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnhancedJob)) return false;
        EnhancedJob other = (EnhancedJob) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.enhancedUserJobInfo==null && other.getEnhancedUserJobInfo()==null) || 
             (this.enhancedUserJobInfo!=null &&
              this.enhancedUserJobInfo.equals(other.getEnhancedUserJobInfo())));
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
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getEnhancedUserJobInfo() != null) {
            _hashCode += getEnhancedUserJobInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnhancedJob.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedJob"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "job"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enhancedUserJobInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enhancedUserJobInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserJobInfo"));
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

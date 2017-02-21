/**
 * EnhancedUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.type;

public class EnhancedUser  implements java.io.Serializable {
    private es.meyss.sgtic.sige.portafirmas.client.ws.type.User user;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobInfo enhancedUserJobInfo;

    public EnhancedUser() {
    }

    public EnhancedUser(
           es.meyss.sgtic.sige.portafirmas.client.ws.type.User user,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobInfo enhancedUserJobInfo) {
           this.user = user;
           this.enhancedUserJobInfo = enhancedUserJobInfo;
    }


    /**
     * Gets the user value for this EnhancedUser.
     * 
     * @return user
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this EnhancedUser.
     * 
     * @param user
     */
    public void setUser(es.meyss.sgtic.sige.portafirmas.client.ws.type.User user) {
        this.user = user;
    }


    /**
     * Gets the enhancedUserJobInfo value for this EnhancedUser.
     * 
     * @return enhancedUserJobInfo
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobInfo getEnhancedUserJobInfo() {
        return enhancedUserJobInfo;
    }


    /**
     * Sets the enhancedUserJobInfo value for this EnhancedUser.
     * 
     * @param enhancedUserJobInfo
     */
    public void setEnhancedUserJobInfo(es.meyss.sgtic.sige.portafirmas.client.ws.type.EnhancedUserJobInfo enhancedUserJobInfo) {
        this.enhancedUserJobInfo = enhancedUserJobInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnhancedUser)) return false;
        EnhancedUser other = (EnhancedUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
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
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getEnhancedUserJobInfo() != null) {
            _hashCode += getEnhancedUserJobInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnhancedUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "user"));
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

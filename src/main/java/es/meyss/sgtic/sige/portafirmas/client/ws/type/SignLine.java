/**
 * SignLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.type;

public class SignLine  implements java.io.Serializable {
    private es.meyss.sgtic.sige.portafirmas.client.ws.type.Signer[] signerList;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLineType type;

    public SignLine() {
    }

    public SignLine(
           es.meyss.sgtic.sige.portafirmas.client.ws.type.Signer[] signerList,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLineType type) {
           this.signerList = signerList;
           this.type = type;
    }


    /**
     * Gets the signerList value for this SignLine.
     * 
     * @return signerList
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Signer[] getSignerList() {
        return signerList;
    }


    /**
     * Sets the signerList value for this SignLine.
     * 
     * @param signerList
     */
    public void setSignerList(es.meyss.sgtic.sige.portafirmas.client.ws.type.Signer[] signerList) {
        this.signerList = signerList;
    }


    /**
     * Gets the type value for this SignLine.
     * 
     * @return type
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLineType getType() {
        return type;
    }


    /**
     * Sets the type value for this SignLine.
     * 
     * @param type
     */
    public void setType(es.meyss.sgtic.sige.portafirmas.client.ws.type.SignLineType type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SignLine)) return false;
        SignLine other = (SignLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.signerList==null && other.getSignerList()==null) || 
             (this.signerList!=null &&
              java.util.Arrays.equals(this.signerList, other.getSignerList()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getSignerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignerList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signerList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signerList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "signer"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signLineType"));
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

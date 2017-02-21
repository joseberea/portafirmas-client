/**
 * EnhancedUserJobInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.type;

public class EnhancedUserJobInfo  implements java.io.Serializable {
    private es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat seat;

    private java.lang.Boolean valid;

    private java.lang.Boolean visibleOtherSeats;

    private es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter[] parameterList;

    public EnhancedUserJobInfo() {
    }

    public EnhancedUserJobInfo(
           es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat seat,
           java.lang.Boolean valid,
           java.lang.Boolean visibleOtherSeats,
           es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter[] parameterList) {
           this.seat = seat;
           this.valid = valid;
           this.visibleOtherSeats = visibleOtherSeats;
           this.parameterList = parameterList;
    }


    /**
     * Gets the seat value for this EnhancedUserJobInfo.
     * 
     * @return seat
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat getSeat() {
        return seat;
    }


    /**
     * Sets the seat value for this EnhancedUserJobInfo.
     * 
     * @param seat
     */
    public void setSeat(es.meyss.sgtic.sige.portafirmas.client.ws.type.Seat seat) {
        this.seat = seat;
    }


    /**
     * Gets the valid value for this EnhancedUserJobInfo.
     * 
     * @return valid
     */
    public java.lang.Boolean getValid() {
        return valid;
    }


    /**
     * Sets the valid value for this EnhancedUserJobInfo.
     * 
     * @param valid
     */
    public void setValid(java.lang.Boolean valid) {
        this.valid = valid;
    }


    /**
     * Gets the visibleOtherSeats value for this EnhancedUserJobInfo.
     * 
     * @return visibleOtherSeats
     */
    public java.lang.Boolean getVisibleOtherSeats() {
        return visibleOtherSeats;
    }


    /**
     * Sets the visibleOtherSeats value for this EnhancedUserJobInfo.
     * 
     * @param visibleOtherSeats
     */
    public void setVisibleOtherSeats(java.lang.Boolean visibleOtherSeats) {
        this.visibleOtherSeats = visibleOtherSeats;
    }


    /**
     * Gets the parameterList value for this EnhancedUserJobInfo.
     * 
     * @return parameterList
     */
    public es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter[] getParameterList() {
        return parameterList;
    }


    /**
     * Sets the parameterList value for this EnhancedUserJobInfo.
     * 
     * @param parameterList
     */
    public void setParameterList(es.meyss.sgtic.sige.portafirmas.client.ws.type.Parameter[] parameterList) {
        this.parameterList = parameterList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnhancedUserJobInfo)) return false;
        EnhancedUserJobInfo other = (EnhancedUserJobInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.seat==null && other.getSeat()==null) || 
             (this.seat!=null &&
              this.seat.equals(other.getSeat()))) &&
            ((this.valid==null && other.getValid()==null) || 
             (this.valid!=null &&
              this.valid.equals(other.getValid()))) &&
            ((this.visibleOtherSeats==null && other.getVisibleOtherSeats()==null) || 
             (this.visibleOtherSeats!=null &&
              this.visibleOtherSeats.equals(other.getVisibleOtherSeats()))) &&
            ((this.parameterList==null && other.getParameterList()==null) || 
             (this.parameterList!=null &&
              java.util.Arrays.equals(this.parameterList, other.getParameterList())));
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
        if (getSeat() != null) {
            _hashCode += getSeat().hashCode();
        }
        if (getValid() != null) {
            _hashCode += getValid().hashCode();
        }
        if (getVisibleOtherSeats() != null) {
            _hashCode += getVisibleOtherSeats().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnhancedUserJobInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "enhancedUserJobInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seat"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "seat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibleOtherSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("", "visibleOtherSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameterList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "parameter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "parameter"));
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

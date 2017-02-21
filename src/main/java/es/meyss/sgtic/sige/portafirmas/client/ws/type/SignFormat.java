/**
 * SignFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package es.meyss.sgtic.sige.portafirmas.client.ws.type;

public class SignFormat implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SignFormat(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "PKCS7";
    public static final java.lang.String _value2 = "CMS";
    public static final java.lang.String _value3 = "CADES";
    public static final java.lang.String _value4 = "XADES";
    public static final java.lang.String _value5 = "XADES IMPLICITO";
    public static final java.lang.String _value6 = "XADES EXPLICITO";
    public static final java.lang.String _value7 = "XADES ENVELOPING";
    public static final java.lang.String _value8 = "PDF";
    public static final SignFormat value1 = new SignFormat(_value1);
    public static final SignFormat value2 = new SignFormat(_value2);
    public static final SignFormat value3 = new SignFormat(_value3);
    public static final SignFormat value4 = new SignFormat(_value4);
    public static final SignFormat value5 = new SignFormat(_value5);
    public static final SignFormat value6 = new SignFormat(_value6);
    public static final SignFormat value7 = new SignFormat(_value7);
    public static final SignFormat value8 = new SignFormat(_value8);
    public java.lang.String getValue() { return _value_;}
    public static SignFormat fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SignFormat enumeration = (SignFormat)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SignFormat fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SignFormat.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:juntadeandalucia:cice:pfirma:type:v2.0", "signFormat"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

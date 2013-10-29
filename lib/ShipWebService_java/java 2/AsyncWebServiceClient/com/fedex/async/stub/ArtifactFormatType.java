/**
 * ArtifactFormatType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.async.stub;

public class ArtifactFormatType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ArtifactFormatType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BINARY = "BINARY";
    public static final java.lang.String _DOC = "DOC";
    public static final java.lang.String _EPL2 = "EPL2";
    public static final java.lang.String _PDF = "PDF";
    public static final java.lang.String _PNG = "PNG";
    public static final java.lang.String _RTF = "RTF";
    public static final java.lang.String _TEXT = "TEXT";
    public static final java.lang.String _XML = "XML";
    public static final java.lang.String _ZPLII = "ZPLII";
    public static final ArtifactFormatType BINARY = new ArtifactFormatType(_BINARY);
    public static final ArtifactFormatType DOC = new ArtifactFormatType(_DOC);
    public static final ArtifactFormatType EPL2 = new ArtifactFormatType(_EPL2);
    public static final ArtifactFormatType PDF = new ArtifactFormatType(_PDF);
    public static final ArtifactFormatType PNG = new ArtifactFormatType(_PNG);
    public static final ArtifactFormatType RTF = new ArtifactFormatType(_RTF);
    public static final ArtifactFormatType TEXT = new ArtifactFormatType(_TEXT);
    public static final ArtifactFormatType XML = new ArtifactFormatType(_XML);
    public static final ArtifactFormatType ZPLII = new ArtifactFormatType(_ZPLII);
    public java.lang.String getValue() { return _value_;}
    public static ArtifactFormatType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ArtifactFormatType enumeration = (ArtifactFormatType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ArtifactFormatType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ArtifactFormatType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ArtifactFormatType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

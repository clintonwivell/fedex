/**
 * ArtifactType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.async.stub;

public class ArtifactType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ArtifactType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AUXILIARY_LABEL = "AUXILIARY_LABEL";
    public static final java.lang.String _CERTIFICATE_OF_ORIGIN = "CERTIFICATE_OF_ORIGIN";
    public static final java.lang.String _COD_RETURN_LABEL = "COD_RETURN_LABEL";
    public static final java.lang.String _COMMERCIAL_INVOICE = "COMMERCIAL_INVOICE";
    public static final java.lang.String _CONDENSED_CRN_REPORT = "CONDENSED_CRN_REPORT";
    public static final java.lang.String _CONSOLIDATED_COMMERCIAL_INVOICE = "CONSOLIDATED_COMMERCIAL_INVOICE";
    public static final java.lang.String _CRN_REPORT = "CRN_REPORT";
    public static final java.lang.String _CUSTOMS_PACKING_LIST = "CUSTOMS_PACKING_LIST";
    public static final java.lang.String _CUSTOM_CONSOLIDATION_DOCUMENT = "CUSTOM_CONSOLIDATION_DOCUMENT";
    public static final java.lang.String _CUSTOM_PACKAGE_DOCUMENT = "CUSTOM_PACKAGE_DOCUMENT";
    public static final java.lang.String _CUSTOM_SHIPMENT_DOCUMENT = "CUSTOM_SHIPMENT_DOCUMENT";
    public static final java.lang.String _DANGEROUS_GOODS_SHIPPERS_DECLARATION = "DANGEROUS_GOODS_SHIPPERS_DECLARATION";
    public static final java.lang.String _DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL = "DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL";
    public static final java.lang.String _FREIGHT_ADDRESS_LABEL = "FREIGHT_ADDRESS_LABEL";
    public static final java.lang.String _GENERAL_AGENCY_AGREEMENT = "GENERAL_AGENCY_AGREEMENT";
    public static final java.lang.String _NAFTA_CERTIFICATE_OF_ORIGIN = "NAFTA_CERTIFICATE_OF_ORIGIN";
    public static final java.lang.String _OP_900 = "OP_900";
    public static final java.lang.String _OUTBOUND_LABEL = "OUTBOUND_LABEL";
    public static final java.lang.String _PRO_FORMA_INVOICE = "PRO_FORMA_INVOICE";
    public static final java.lang.String _RETURN_INSTRUCTIONS = "RETURN_INSTRUCTIONS";
    public static final java.lang.String _SERVICE_REPLY = "SERVICE_REPLY";
    public static final java.lang.String _SERVICE_REQUEST = "SERVICE_REQUEST";
    public static final java.lang.String _TERMS_AND_CONDITIONS = "TERMS_AND_CONDITIONS";
    public static final ArtifactType AUXILIARY_LABEL = new ArtifactType(_AUXILIARY_LABEL);
    public static final ArtifactType CERTIFICATE_OF_ORIGIN = new ArtifactType(_CERTIFICATE_OF_ORIGIN);
    public static final ArtifactType COD_RETURN_LABEL = new ArtifactType(_COD_RETURN_LABEL);
    public static final ArtifactType COMMERCIAL_INVOICE = new ArtifactType(_COMMERCIAL_INVOICE);
    public static final ArtifactType CONDENSED_CRN_REPORT = new ArtifactType(_CONDENSED_CRN_REPORT);
    public static final ArtifactType CONSOLIDATED_COMMERCIAL_INVOICE = new ArtifactType(_CONSOLIDATED_COMMERCIAL_INVOICE);
    public static final ArtifactType CRN_REPORT = new ArtifactType(_CRN_REPORT);
    public static final ArtifactType CUSTOMS_PACKING_LIST = new ArtifactType(_CUSTOMS_PACKING_LIST);
    public static final ArtifactType CUSTOM_CONSOLIDATION_DOCUMENT = new ArtifactType(_CUSTOM_CONSOLIDATION_DOCUMENT);
    public static final ArtifactType CUSTOM_PACKAGE_DOCUMENT = new ArtifactType(_CUSTOM_PACKAGE_DOCUMENT);
    public static final ArtifactType CUSTOM_SHIPMENT_DOCUMENT = new ArtifactType(_CUSTOM_SHIPMENT_DOCUMENT);
    public static final ArtifactType DANGEROUS_GOODS_SHIPPERS_DECLARATION = new ArtifactType(_DANGEROUS_GOODS_SHIPPERS_DECLARATION);
    public static final ArtifactType DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL = new ArtifactType(_DELIVERY_ON_INVOICE_ACCEPTANCE_RETURN_LABEL);
    public static final ArtifactType FREIGHT_ADDRESS_LABEL = new ArtifactType(_FREIGHT_ADDRESS_LABEL);
    public static final ArtifactType GENERAL_AGENCY_AGREEMENT = new ArtifactType(_GENERAL_AGENCY_AGREEMENT);
    public static final ArtifactType NAFTA_CERTIFICATE_OF_ORIGIN = new ArtifactType(_NAFTA_CERTIFICATE_OF_ORIGIN);
    public static final ArtifactType OP_900 = new ArtifactType(_OP_900);
    public static final ArtifactType OUTBOUND_LABEL = new ArtifactType(_OUTBOUND_LABEL);
    public static final ArtifactType PRO_FORMA_INVOICE = new ArtifactType(_PRO_FORMA_INVOICE);
    public static final ArtifactType RETURN_INSTRUCTIONS = new ArtifactType(_RETURN_INSTRUCTIONS);
    public static final ArtifactType SERVICE_REPLY = new ArtifactType(_SERVICE_REPLY);
    public static final ArtifactType SERVICE_REQUEST = new ArtifactType(_SERVICE_REQUEST);
    public static final ArtifactType TERMS_AND_CONDITIONS = new ArtifactType(_TERMS_AND_CONDITIONS);
    public java.lang.String getValue() { return _value_;}
    public static ArtifactType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ArtifactType enumeration = (ArtifactType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ArtifactType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ArtifactType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ArtifactType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}

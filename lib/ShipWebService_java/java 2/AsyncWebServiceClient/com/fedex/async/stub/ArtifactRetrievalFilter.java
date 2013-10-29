/**
 * ArtifactRetrievalFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.async.stub;


/**
 * Specifies the details about the criteria used for artifact selection
 * during retrieval.
 */
public class ArtifactRetrievalFilter  implements java.io.Serializable {
    private java.lang.String accessReference;

    private com.fedex.async.stub.ArtifactType type;

    private java.lang.String referenceId;

    public ArtifactRetrievalFilter() {
    }

    public ArtifactRetrievalFilter(
           java.lang.String accessReference,
           com.fedex.async.stub.ArtifactType type,
           java.lang.String referenceId) {
           this.accessReference = accessReference;
           this.type = type;
           this.referenceId = referenceId;
    }


    /**
     * Gets the accessReference value for this ArtifactRetrievalFilter.
     * 
     * @return accessReference
     */
    public java.lang.String getAccessReference() {
        return accessReference;
    }


    /**
     * Sets the accessReference value for this ArtifactRetrievalFilter.
     * 
     * @param accessReference
     */
    public void setAccessReference(java.lang.String accessReference) {
        this.accessReference = accessReference;
    }


    /**
     * Gets the type value for this ArtifactRetrievalFilter.
     * 
     * @return type
     */
    public com.fedex.async.stub.ArtifactType getType() {
        return type;
    }


    /**
     * Sets the type value for this ArtifactRetrievalFilter.
     * 
     * @param type
     */
    public void setType(com.fedex.async.stub.ArtifactType type) {
        this.type = type;
    }


    /**
     * Gets the referenceId value for this ArtifactRetrievalFilter.
     * 
     * @return referenceId
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this ArtifactRetrievalFilter.
     * 
     * @param referenceId
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArtifactRetrievalFilter)) return false;
        ArtifactRetrievalFilter other = (ArtifactRetrievalFilter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessReference==null && other.getAccessReference()==null) || 
             (this.accessReference!=null &&
              this.accessReference.equals(other.getAccessReference()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId())));
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
        if (getAccessReference() != null) {
            _hashCode += getAccessReference().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArtifactRetrievalFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ArtifactRetrievalFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "AccessReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ArtifactType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ReferenceId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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

/**
 * RetrievedArtifact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.async.stub;

public class RetrievedArtifact  implements java.io.Serializable {
    private java.lang.String accessReference;

    private com.fedex.async.stub.NotificationSeverityType highestSeverity;

    private com.fedex.async.stub.Notification[] notifications;

    /* Identifies the type of artifact. */
    private com.fedex.async.stub.ArtifactType type;

    /* Specifies the format of the artifact. */
    private com.fedex.async.stub.ArtifactFormatType format;

    /* Identifies the schema or specific format definition used for
     * the artifact. */
    private java.lang.String formatSpecification;

    /* Specifies a reference to the artifact that follows the naming
     * convention defined for file storage. */
    private java.lang.String referenceId;

    private com.fedex.async.stub.ArtifactPart[] parts;

    public RetrievedArtifact() {
    }

    public RetrievedArtifact(
           java.lang.String accessReference,
           com.fedex.async.stub.NotificationSeverityType highestSeverity,
           com.fedex.async.stub.Notification[] notifications,
           com.fedex.async.stub.ArtifactType type,
           com.fedex.async.stub.ArtifactFormatType format,
           java.lang.String formatSpecification,
           java.lang.String referenceId,
           com.fedex.async.stub.ArtifactPart[] parts) {
           this.accessReference = accessReference;
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.type = type;
           this.format = format;
           this.formatSpecification = formatSpecification;
           this.referenceId = referenceId;
           this.parts = parts;
    }


    /**
     * Gets the accessReference value for this RetrievedArtifact.
     * 
     * @return accessReference
     */
    public java.lang.String getAccessReference() {
        return accessReference;
    }


    /**
     * Sets the accessReference value for this RetrievedArtifact.
     * 
     * @param accessReference
     */
    public void setAccessReference(java.lang.String accessReference) {
        this.accessReference = accessReference;
    }


    /**
     * Gets the highestSeverity value for this RetrievedArtifact.
     * 
     * @return highestSeverity
     */
    public com.fedex.async.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this RetrievedArtifact.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.fedex.async.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this RetrievedArtifact.
     * 
     * @return notifications
     */
    public com.fedex.async.stub.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this RetrievedArtifact.
     * 
     * @param notifications
     */
    public void setNotifications(com.fedex.async.stub.Notification[] notifications) {
        this.notifications = notifications;
    }

    public com.fedex.async.stub.Notification getNotifications(int i) {
        return this.notifications[i];
    }

    public void setNotifications(int i, com.fedex.async.stub.Notification _value) {
        this.notifications[i] = _value;
    }


    /**
     * Gets the type value for this RetrievedArtifact.
     * 
     * @return type   * Identifies the type of artifact.
     */
    public com.fedex.async.stub.ArtifactType getType() {
        return type;
    }


    /**
     * Sets the type value for this RetrievedArtifact.
     * 
     * @param type   * Identifies the type of artifact.
     */
    public void setType(com.fedex.async.stub.ArtifactType type) {
        this.type = type;
    }


    /**
     * Gets the format value for this RetrievedArtifact.
     * 
     * @return format   * Specifies the format of the artifact.
     */
    public com.fedex.async.stub.ArtifactFormatType getFormat() {
        return format;
    }


    /**
     * Sets the format value for this RetrievedArtifact.
     * 
     * @param format   * Specifies the format of the artifact.
     */
    public void setFormat(com.fedex.async.stub.ArtifactFormatType format) {
        this.format = format;
    }


    /**
     * Gets the formatSpecification value for this RetrievedArtifact.
     * 
     * @return formatSpecification   * Identifies the schema or specific format definition used for
     * the artifact.
     */
    public java.lang.String getFormatSpecification() {
        return formatSpecification;
    }


    /**
     * Sets the formatSpecification value for this RetrievedArtifact.
     * 
     * @param formatSpecification   * Identifies the schema or specific format definition used for
     * the artifact.
     */
    public void setFormatSpecification(java.lang.String formatSpecification) {
        this.formatSpecification = formatSpecification;
    }


    /**
     * Gets the referenceId value for this RetrievedArtifact.
     * 
     * @return referenceId   * Specifies a reference to the artifact that follows the naming
     * convention defined for file storage.
     */
    public java.lang.String getReferenceId() {
        return referenceId;
    }


    /**
     * Sets the referenceId value for this RetrievedArtifact.
     * 
     * @param referenceId   * Specifies a reference to the artifact that follows the naming
     * convention defined for file storage.
     */
    public void setReferenceId(java.lang.String referenceId) {
        this.referenceId = referenceId;
    }


    /**
     * Gets the parts value for this RetrievedArtifact.
     * 
     * @return parts
     */
    public com.fedex.async.stub.ArtifactPart[] getParts() {
        return parts;
    }


    /**
     * Sets the parts value for this RetrievedArtifact.
     * 
     * @param parts
     */
    public void setParts(com.fedex.async.stub.ArtifactPart[] parts) {
        this.parts = parts;
    }

    public com.fedex.async.stub.ArtifactPart getParts(int i) {
        return this.parts[i];
    }

    public void setParts(int i, com.fedex.async.stub.ArtifactPart _value) {
        this.parts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrievedArtifact)) return false;
        RetrievedArtifact other = (RetrievedArtifact) obj;
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
            ((this.highestSeverity==null && other.getHighestSeverity()==null) || 
             (this.highestSeverity!=null &&
              this.highestSeverity.equals(other.getHighestSeverity()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.formatSpecification==null && other.getFormatSpecification()==null) || 
             (this.formatSpecification!=null &&
              this.formatSpecification.equals(other.getFormatSpecification()))) &&
            ((this.referenceId==null && other.getReferenceId()==null) || 
             (this.referenceId!=null &&
              this.referenceId.equals(other.getReferenceId()))) &&
            ((this.parts==null && other.getParts()==null) || 
             (this.parts!=null &&
              java.util.Arrays.equals(this.parts, other.getParts())));
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
        if (getHighestSeverity() != null) {
            _hashCode += getHighestSeverity().hashCode();
        }
        if (getNotifications() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotifications());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotifications(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getFormatSpecification() != null) {
            _hashCode += getFormatSpecification().hashCode();
        }
        if (getReferenceId() != null) {
            _hashCode += getReferenceId().hashCode();
        }
        if (getParts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParts(), i);
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
        new org.apache.axis.description.TypeDesc(RetrievedArtifact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "RetrievedArtifact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "AccessReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "NotificationSeverityType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Notification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ArtifactType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ArtifactFormatType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formatSpecification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "FormatSpecification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Parts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ArtifactPart"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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

/**
 * RetrieveJobResultsReply.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.async.stub;

public class RetrieveJobResultsReply  implements java.io.Serializable {
    private com.fedex.async.stub.NotificationSeverityType highestSeverity;

    private com.fedex.async.stub.Notification[] notifications;

    private com.fedex.async.stub.TransactionDetail transactionDetail;

    private com.fedex.async.stub.VersionId version;

    private com.fedex.async.stub.RetrievedArtifact[] artifacts;

    public RetrieveJobResultsReply() {
    }

    public RetrieveJobResultsReply(
           com.fedex.async.stub.NotificationSeverityType highestSeverity,
           com.fedex.async.stub.Notification[] notifications,
           com.fedex.async.stub.TransactionDetail transactionDetail,
           com.fedex.async.stub.VersionId version,
           com.fedex.async.stub.RetrievedArtifact[] artifacts) {
           this.highestSeverity = highestSeverity;
           this.notifications = notifications;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.artifacts = artifacts;
    }


    /**
     * Gets the highestSeverity value for this RetrieveJobResultsReply.
     * 
     * @return highestSeverity
     */
    public com.fedex.async.stub.NotificationSeverityType getHighestSeverity() {
        return highestSeverity;
    }


    /**
     * Sets the highestSeverity value for this RetrieveJobResultsReply.
     * 
     * @param highestSeverity
     */
    public void setHighestSeverity(com.fedex.async.stub.NotificationSeverityType highestSeverity) {
        this.highestSeverity = highestSeverity;
    }


    /**
     * Gets the notifications value for this RetrieveJobResultsReply.
     * 
     * @return notifications
     */
    public com.fedex.async.stub.Notification[] getNotifications() {
        return notifications;
    }


    /**
     * Sets the notifications value for this RetrieveJobResultsReply.
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
     * Gets the transactionDetail value for this RetrieveJobResultsReply.
     * 
     * @return transactionDetail
     */
    public com.fedex.async.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this RetrieveJobResultsReply.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.async.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this RetrieveJobResultsReply.
     * 
     * @return version
     */
    public com.fedex.async.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RetrieveJobResultsReply.
     * 
     * @param version
     */
    public void setVersion(com.fedex.async.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the artifacts value for this RetrieveJobResultsReply.
     * 
     * @return artifacts
     */
    public com.fedex.async.stub.RetrievedArtifact[] getArtifacts() {
        return artifacts;
    }


    /**
     * Sets the artifacts value for this RetrieveJobResultsReply.
     * 
     * @param artifacts
     */
    public void setArtifacts(com.fedex.async.stub.RetrievedArtifact[] artifacts) {
        this.artifacts = artifacts;
    }

    public com.fedex.async.stub.RetrievedArtifact getArtifacts(int i) {
        return this.artifacts[i];
    }

    public void setArtifacts(int i, com.fedex.async.stub.RetrievedArtifact _value) {
        this.artifacts[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveJobResultsReply)) return false;
        RetrieveJobResultsReply other = (RetrieveJobResultsReply) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.highestSeverity==null && other.getHighestSeverity()==null) || 
             (this.highestSeverity!=null &&
              this.highestSeverity.equals(other.getHighestSeverity()))) &&
            ((this.notifications==null && other.getNotifications()==null) || 
             (this.notifications!=null &&
              java.util.Arrays.equals(this.notifications, other.getNotifications()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.artifacts==null && other.getArtifacts()==null) || 
             (this.artifacts!=null &&
              java.util.Arrays.equals(this.artifacts, other.getArtifacts())));
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
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getArtifacts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArtifacts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArtifacts(), i);
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
        new org.apache.axis.description.TypeDesc(RetrieveJobResultsReply.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "RetrieveJobResultsReply"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highestSeverity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "HighestSeverity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "NotificationSeverityType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifications");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Notifications"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Notification"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "TransactionDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "TransactionDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "VersionId"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("artifacts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Artifacts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "RetrievedArtifact"));
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

/**
 * RetrieveJobResultsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.async.stub;


/**
 * This request object is used by the client to retrieve artifacts
 * stored by the ASYNC service.
 */
public class RetrieveJobResultsRequest  implements java.io.Serializable {
    /* Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services). */
    private com.fedex.async.stub.WebAuthenticationDetail webAuthenticationDetail;

    private com.fedex.async.stub.ClientDetail clientDetail;

    private com.fedex.async.stub.TransactionDetail transactionDetail;

    private com.fedex.async.stub.VersionId version;

    /* Specifies the job under which the desired artifacts are stored. */
    private java.lang.String jobId;

    /* Specifies the filters to be used for retrieving artifacts. */
    private com.fedex.async.stub.ArtifactRetrievalFilter[] filters;

    public RetrieveJobResultsRequest() {
    }

    public RetrieveJobResultsRequest(
           com.fedex.async.stub.WebAuthenticationDetail webAuthenticationDetail,
           com.fedex.async.stub.ClientDetail clientDetail,
           com.fedex.async.stub.TransactionDetail transactionDetail,
           com.fedex.async.stub.VersionId version,
           java.lang.String jobId,
           com.fedex.async.stub.ArtifactRetrievalFilter[] filters) {
           this.webAuthenticationDetail = webAuthenticationDetail;
           this.clientDetail = clientDetail;
           this.transactionDetail = transactionDetail;
           this.version = version;
           this.jobId = jobId;
           this.filters = filters;
    }


    /**
     * Gets the webAuthenticationDetail value for this RetrieveJobResultsRequest.
     * 
     * @return webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public com.fedex.async.stub.WebAuthenticationDetail getWebAuthenticationDetail() {
        return webAuthenticationDetail;
    }


    /**
     * Sets the webAuthenticationDetail value for this RetrieveJobResultsRequest.
     * 
     * @param webAuthenticationDetail   * Descriptive data to be used in authentication of the sender's
     * identity (and right to use FedEx web services).
     */
    public void setWebAuthenticationDetail(com.fedex.async.stub.WebAuthenticationDetail webAuthenticationDetail) {
        this.webAuthenticationDetail = webAuthenticationDetail;
    }


    /**
     * Gets the clientDetail value for this RetrieveJobResultsRequest.
     * 
     * @return clientDetail
     */
    public com.fedex.async.stub.ClientDetail getClientDetail() {
        return clientDetail;
    }


    /**
     * Sets the clientDetail value for this RetrieveJobResultsRequest.
     * 
     * @param clientDetail
     */
    public void setClientDetail(com.fedex.async.stub.ClientDetail clientDetail) {
        this.clientDetail = clientDetail;
    }


    /**
     * Gets the transactionDetail value for this RetrieveJobResultsRequest.
     * 
     * @return transactionDetail
     */
    public com.fedex.async.stub.TransactionDetail getTransactionDetail() {
        return transactionDetail;
    }


    /**
     * Sets the transactionDetail value for this RetrieveJobResultsRequest.
     * 
     * @param transactionDetail
     */
    public void setTransactionDetail(com.fedex.async.stub.TransactionDetail transactionDetail) {
        this.transactionDetail = transactionDetail;
    }


    /**
     * Gets the version value for this RetrieveJobResultsRequest.
     * 
     * @return version
     */
    public com.fedex.async.stub.VersionId getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RetrieveJobResultsRequest.
     * 
     * @param version
     */
    public void setVersion(com.fedex.async.stub.VersionId version) {
        this.version = version;
    }


    /**
     * Gets the jobId value for this RetrieveJobResultsRequest.
     * 
     * @return jobId   * Specifies the job under which the desired artifacts are stored.
     */
    public java.lang.String getJobId() {
        return jobId;
    }


    /**
     * Sets the jobId value for this RetrieveJobResultsRequest.
     * 
     * @param jobId   * Specifies the job under which the desired artifacts are stored.
     */
    public void setJobId(java.lang.String jobId) {
        this.jobId = jobId;
    }


    /**
     * Gets the filters value for this RetrieveJobResultsRequest.
     * 
     * @return filters   * Specifies the filters to be used for retrieving artifacts.
     */
    public com.fedex.async.stub.ArtifactRetrievalFilter[] getFilters() {
        return filters;
    }


    /**
     * Sets the filters value for this RetrieveJobResultsRequest.
     * 
     * @param filters   * Specifies the filters to be used for retrieving artifacts.
     */
    public void setFilters(com.fedex.async.stub.ArtifactRetrievalFilter[] filters) {
        this.filters = filters;
    }

    public com.fedex.async.stub.ArtifactRetrievalFilter getFilters(int i) {
        return this.filters[i];
    }

    public void setFilters(int i, com.fedex.async.stub.ArtifactRetrievalFilter _value) {
        this.filters[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveJobResultsRequest)) return false;
        RetrieveJobResultsRequest other = (RetrieveJobResultsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webAuthenticationDetail==null && other.getWebAuthenticationDetail()==null) || 
             (this.webAuthenticationDetail!=null &&
              this.webAuthenticationDetail.equals(other.getWebAuthenticationDetail()))) &&
            ((this.clientDetail==null && other.getClientDetail()==null) || 
             (this.clientDetail!=null &&
              this.clientDetail.equals(other.getClientDetail()))) &&
            ((this.transactionDetail==null && other.getTransactionDetail()==null) || 
             (this.transactionDetail!=null &&
              this.transactionDetail.equals(other.getTransactionDetail()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.jobId==null && other.getJobId()==null) || 
             (this.jobId!=null &&
              this.jobId.equals(other.getJobId()))) &&
            ((this.filters==null && other.getFilters()==null) || 
             (this.filters!=null &&
              java.util.Arrays.equals(this.filters, other.getFilters())));
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
        if (getWebAuthenticationDetail() != null) {
            _hashCode += getWebAuthenticationDetail().hashCode();
        }
        if (getClientDetail() != null) {
            _hashCode += getClientDetail().hashCode();
        }
        if (getTransactionDetail() != null) {
            _hashCode += getTransactionDetail().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getJobId() != null) {
            _hashCode += getJobId().hashCode();
        }
        if (getFilters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilters(), i);
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
        new org.apache.axis.description.TypeDesc(RetrieveJobResultsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "RetrieveJobResultsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webAuthenticationDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "WebAuthenticationDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "WebAuthenticationDetail"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ClientDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ClientDetail"));
        elemField.setNillable(false);
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
        elemField.setFieldName("jobId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "JobId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filters");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "Filters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/async/v1", "ArtifactRetrievalFilter"));
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

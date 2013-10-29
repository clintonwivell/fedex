/**
 * VariableHandlingCharges.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.fedex.ship.stub;


/**
 * The variable handling charges calculated based on the type variable
 * handling charges requested.
 */
public class VariableHandlingCharges  implements java.io.Serializable {
    /* The variable handling charge amount calculated based on the
     * requested variable handling charge detail. */
    private com.fedex.ship.stub.Money variableHandlingCharge;

    private com.fedex.ship.stub.Money fixedVariableHandlingCharge;

    private com.fedex.ship.stub.Money percentVariableHandlingCharge;

    /* The calculated varibale handling charge plus the net charge. */
    private com.fedex.ship.stub.Money totalCustomerCharge;

    public VariableHandlingCharges() {
    }

    public VariableHandlingCharges(
           com.fedex.ship.stub.Money variableHandlingCharge,
           com.fedex.ship.stub.Money fixedVariableHandlingCharge,
           com.fedex.ship.stub.Money percentVariableHandlingCharge,
           com.fedex.ship.stub.Money totalCustomerCharge) {
           this.variableHandlingCharge = variableHandlingCharge;
           this.fixedVariableHandlingCharge = fixedVariableHandlingCharge;
           this.percentVariableHandlingCharge = percentVariableHandlingCharge;
           this.totalCustomerCharge = totalCustomerCharge;
    }


    /**
     * Gets the variableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @return variableHandlingCharge   * The variable handling charge amount calculated based on the
     * requested variable handling charge detail.
     */
    public com.fedex.ship.stub.Money getVariableHandlingCharge() {
        return variableHandlingCharge;
    }


    /**
     * Sets the variableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @param variableHandlingCharge   * The variable handling charge amount calculated based on the
     * requested variable handling charge detail.
     */
    public void setVariableHandlingCharge(com.fedex.ship.stub.Money variableHandlingCharge) {
        this.variableHandlingCharge = variableHandlingCharge;
    }


    /**
     * Gets the fixedVariableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @return fixedVariableHandlingCharge
     */
    public com.fedex.ship.stub.Money getFixedVariableHandlingCharge() {
        return fixedVariableHandlingCharge;
    }


    /**
     * Sets the fixedVariableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @param fixedVariableHandlingCharge
     */
    public void setFixedVariableHandlingCharge(com.fedex.ship.stub.Money fixedVariableHandlingCharge) {
        this.fixedVariableHandlingCharge = fixedVariableHandlingCharge;
    }


    /**
     * Gets the percentVariableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @return percentVariableHandlingCharge
     */
    public com.fedex.ship.stub.Money getPercentVariableHandlingCharge() {
        return percentVariableHandlingCharge;
    }


    /**
     * Sets the percentVariableHandlingCharge value for this VariableHandlingCharges.
     * 
     * @param percentVariableHandlingCharge
     */
    public void setPercentVariableHandlingCharge(com.fedex.ship.stub.Money percentVariableHandlingCharge) {
        this.percentVariableHandlingCharge = percentVariableHandlingCharge;
    }


    /**
     * Gets the totalCustomerCharge value for this VariableHandlingCharges.
     * 
     * @return totalCustomerCharge   * The calculated varibale handling charge plus the net charge.
     */
    public com.fedex.ship.stub.Money getTotalCustomerCharge() {
        return totalCustomerCharge;
    }


    /**
     * Sets the totalCustomerCharge value for this VariableHandlingCharges.
     * 
     * @param totalCustomerCharge   * The calculated varibale handling charge plus the net charge.
     */
    public void setTotalCustomerCharge(com.fedex.ship.stub.Money totalCustomerCharge) {
        this.totalCustomerCharge = totalCustomerCharge;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VariableHandlingCharges)) return false;
        VariableHandlingCharges other = (VariableHandlingCharges) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.variableHandlingCharge==null && other.getVariableHandlingCharge()==null) || 
             (this.variableHandlingCharge!=null &&
              this.variableHandlingCharge.equals(other.getVariableHandlingCharge()))) &&
            ((this.fixedVariableHandlingCharge==null && other.getFixedVariableHandlingCharge()==null) || 
             (this.fixedVariableHandlingCharge!=null &&
              this.fixedVariableHandlingCharge.equals(other.getFixedVariableHandlingCharge()))) &&
            ((this.percentVariableHandlingCharge==null && other.getPercentVariableHandlingCharge()==null) || 
             (this.percentVariableHandlingCharge!=null &&
              this.percentVariableHandlingCharge.equals(other.getPercentVariableHandlingCharge()))) &&
            ((this.totalCustomerCharge==null && other.getTotalCustomerCharge()==null) || 
             (this.totalCustomerCharge!=null &&
              this.totalCustomerCharge.equals(other.getTotalCustomerCharge())));
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
        if (getVariableHandlingCharge() != null) {
            _hashCode += getVariableHandlingCharge().hashCode();
        }
        if (getFixedVariableHandlingCharge() != null) {
            _hashCode += getFixedVariableHandlingCharge().hashCode();
        }
        if (getPercentVariableHandlingCharge() != null) {
            _hashCode += getPercentVariableHandlingCharge().hashCode();
        }
        if (getTotalCustomerCharge() != null) {
            _hashCode += getTotalCustomerCharge().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VariableHandlingCharges.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v13", "VariableHandlingCharges"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("variableHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v13", "VariableHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v13", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fixedVariableHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v13", "FixedVariableHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v13", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentVariableHandlingCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v13", "PercentVariableHandlingCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v13", "Money"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCustomerCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v13", "TotalCustomerCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://fedex.com/ws/ship/v13", "Money"));
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

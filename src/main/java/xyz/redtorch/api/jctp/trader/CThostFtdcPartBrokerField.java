/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcPartBrokerField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcPartBrokerField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcPartBrokerField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcPartBrokerField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcPartBrokerField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcPartBrokerField_BrokerID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcPartBrokerField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcPartBrokerField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcPartBrokerField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcPartBrokerField_ParticipantID_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcPartBrokerField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcPartBrokerField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcPartBrokerField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcPartBrokerField(), true);
  }

}

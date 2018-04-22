/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcTraderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTraderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTraderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcTraderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_TraderID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_ParticipantID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_Password_get(swigCPtr, this);
  }

  public void setInstallCount(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_InstallCount_set(swigCPtr, this, value);
  }

  public int getInstallCount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_InstallCount_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcTraderField_BrokerID_get(swigCPtr, this);
  }

  public CThostFtdcTraderField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcTraderField(), true);
  }

}

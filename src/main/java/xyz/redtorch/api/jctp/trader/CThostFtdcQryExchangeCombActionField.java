/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcQryExchangeCombActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExchangeCombActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExchangeCombActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcQryExchangeCombActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setParticipantID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExchangeCombActionField_TraderID_get(swigCPtr, this);
  }

  public CThostFtdcQryExchangeCombActionField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcQryExchangeCombActionField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcQryExecOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryExecOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcQryExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setInsertTimeStart(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_InsertTimeStart_set(swigCPtr, this, value);
  }

  public String getInsertTimeStart() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_InsertTimeStart_get(swigCPtr, this);
  }

  public void setInsertTimeEnd(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_InsertTimeEnd_set(swigCPtr, this, value);
  }

  public String getInsertTimeEnd() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryExecOrderField_InsertTimeEnd_get(swigCPtr, this);
  }

  public CThostFtdcQryExecOrderField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcQryExecOrderField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcQryInstrumentStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryInstrumentStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryInstrumentStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcQryInstrumentStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryInstrumentStatusField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryInstrumentStatusField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcQryInstrumentStatusField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcQryInstrumentStatusField_ExchangeInstID_get(swigCPtr, this);
  }

  public CThostFtdcQryInstrumentStatusField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcQryInstrumentStatusField(), true);
  }

}

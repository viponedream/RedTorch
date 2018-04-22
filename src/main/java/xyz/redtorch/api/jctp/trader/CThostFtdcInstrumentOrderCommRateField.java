/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcInstrumentOrderCommRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentOrderCommRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentOrderCommRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcInstrumentOrderCommRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_HedgeFlag_get(swigCPtr, this);
  }

  public void setOrderCommByVolume(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_OrderCommByVolume_set(swigCPtr, this, value);
  }

  public double getOrderCommByVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_OrderCommByVolume_get(swigCPtr, this);
  }

  public void setOrderActionCommByVolume(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_OrderActionCommByVolume_set(swigCPtr, this, value);
  }

  public double getOrderActionCommByVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_OrderActionCommByVolume_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentOrderCommRateField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentOrderCommRateField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcInstrumentOrderCommRateField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcInstrumentMarginRateAdjustField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInstrumentMarginRateAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInstrumentMarginRateAdjustField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcInstrumentMarginRateAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_InvestorID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_HedgeFlag_get(swigCPtr, this);
  }

  public void setLongMarginRatioByMoney(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByMoney() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setLongMarginRatioByVolume(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getLongMarginRatioByVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_LongMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setShortMarginRatioByMoney(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByMoney() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setShortMarginRatioByVolume(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getShortMarginRatioByVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_ShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcInstrumentMarginRateAdjustField_IsRelative_get(swigCPtr, this);
  }

  public CThostFtdcInstrumentMarginRateAdjustField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcInstrumentMarginRateAdjustField(), true);
  }

}

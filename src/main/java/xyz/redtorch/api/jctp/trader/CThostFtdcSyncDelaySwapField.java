/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcSyncDelaySwapField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncDelaySwapField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncDelaySwapField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcSyncDelaySwapField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDelaySwapSeqNo(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_DelaySwapSeqNo_set(swigCPtr, this, value);
  }

  public String getDelaySwapSeqNo() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_DelaySwapSeqNo_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_InvestorID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setFromAmount(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_FromAmount_set(swigCPtr, this, value);
  }

  public double getFromAmount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_FromAmount_get(swigCPtr, this);
  }

  public void setFromFrozenSwap(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_FromFrozenSwap_set(swigCPtr, this, value);
  }

  public double getFromFrozenSwap() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_FromFrozenSwap_get(swigCPtr, this);
  }

  public void setFromRemainSwap(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_FromRemainSwap_set(swigCPtr, this, value);
  }

  public double getFromRemainSwap() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_FromRemainSwap_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_ToCurrencyID_get(swigCPtr, this);
  }

  public void setToAmount(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_ToAmount_set(swigCPtr, this, value);
  }

  public double getToAmount() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSyncDelaySwapField_ToAmount_get(swigCPtr, this);
  }

  public CThostFtdcSyncDelaySwapField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcSyncDelaySwapField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcTransferQryBankRspField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTransferQryBankRspField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTransferQryBankRspField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcTransferQryBankRspField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRetCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_RetCode_set(swigCPtr, this, value);
  }

  public String getRetCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_RetCode_get(swigCPtr, this);
  }

  public void setRetInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_RetInfo_set(swigCPtr, this, value);
  }

  public String getRetInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_RetInfo_get(swigCPtr, this);
  }

  public void setFutureAccount(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_FutureAccount_set(swigCPtr, this, value);
  }

  public String getFutureAccount() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_FutureAccount_get(swigCPtr, this);
  }

  public void setTradeAmt(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_TradeAmt_set(swigCPtr, this, value);
  }

  public double getTradeAmt() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_TradeAmt_get(swigCPtr, this);
  }

  public void setUseAmt(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_UseAmt_set(swigCPtr, this, value);
  }

  public double getUseAmt() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_UseAmt_get(swigCPtr, this);
  }

  public void setFetchAmt(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_FetchAmt_set(swigCPtr, this, value);
  }

  public double getFetchAmt() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_FetchAmt_get(swigCPtr, this);
  }

  public void setCurrencyCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_CurrencyCode_set(swigCPtr, this, value);
  }

  public String getCurrencyCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcTransferQryBankRspField_CurrencyCode_get(swigCPtr, this);
  }

  public CThostFtdcTransferQryBankRspField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcTransferQryBankRspField(), true);
  }

}

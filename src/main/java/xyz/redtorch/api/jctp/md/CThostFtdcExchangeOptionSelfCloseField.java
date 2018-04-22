/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcExchangeOptionSelfCloseField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeOptionSelfCloseField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOptionSelfCloseField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcExchangeOptionSelfCloseField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVolume(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_BusinessUnit_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_HedgeFlag_get(swigCPtr, this);
  }

  public void setOptSelfCloseFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_OptSelfCloseFlag_set(swigCPtr, this, value);
  }

  public char getOptSelfCloseFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_OptSelfCloseFlag_get(swigCPtr, this);
  }

  public void setOptionSelfCloseLocalID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseLocalID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseLocalID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_SettlementID_get(swigCPtr, this);
  }

  public void setOptionSelfCloseSysID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseSysID_set(swigCPtr, this, value);
  }

  public String getOptionSelfCloseSysID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_OptionSelfCloseSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeOptionSelfCloseField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOptionSelfCloseField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcExchangeOptionSelfCloseField(), true);
  }

}

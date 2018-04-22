/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcExchangeExecOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeExecOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeExecOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcExchangeExecOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setVolume(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_Volume_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_RequestID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOffsetFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_OffsetFlag_set(swigCPtr, this, value);
  }

  public char getOffsetFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_OffsetFlag_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_HedgeFlag_get(swigCPtr, this);
  }

  public void setActionType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ActionType_set(swigCPtr, this, value);
  }

  public char getActionType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ActionType_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_PosiDirection_get(swigCPtr, this);
  }

  public void setReservePositionFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ReservePositionFlag_set(swigCPtr, this, value);
  }

  public char getReservePositionFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ReservePositionFlag_get(swigCPtr, this);
  }

  public void setCloseFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_CloseFlag_set(swigCPtr, this, value);
  }

  public char getCloseFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_CloseFlag_get(swigCPtr, this);
  }

  public void setExecOrderLocalID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecOrderLocalID_set(swigCPtr, this, value);
  }

  public String getExecOrderLocalID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecOrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setExecOrderSysID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecOrderSysID_set(swigCPtr, this, value);
  }

  public String getExecOrderSysID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecOrderSysID_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setExecResult(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecResult_set(swigCPtr, this, value);
  }

  public char getExecResult() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ExecResult_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcExchangeExecOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeExecOrderField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcExchangeExecOrderField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcErrOrderActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcErrOrderActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcErrOrderActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcErrOrderActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_InvestorID_get(swigCPtr, this);
  }

  public void setOrderActionRef(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderActionRef_set(swigCPtr, this, value);
  }

  public int getOrderActionRef() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderActionRef_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeChange(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_VolumeChange_set(swigCPtr, this, value);
  }

  public int getVolumeChange() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_VolumeChange_get(swigCPtr, this);
  }

  public void setActionDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ActionDate_set(swigCPtr, this, value);
  }

  public String getActionDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ActionDate_get(swigCPtr, this);
  }

  public void setActionTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ActionTime_set(swigCPtr, this, value);
  }

  public String getActionTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ActionTime_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_InstallID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderLocalID_get(swigCPtr, this);
  }

  public void setActionLocalID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ActionLocalID_set(swigCPtr, this, value);
  }

  public String getActionLocalID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ActionLocalID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ClientID_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_BusinessUnit_get(swigCPtr, this);
  }

  public void setOrderActionStatus(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderActionStatus_set(swigCPtr, this, value);
  }

  public char getOrderActionStatus() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_OrderActionStatus_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_UserID_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_StatusMsg_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_MacAddress_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcErrOrderActionField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcErrOrderActionField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcErrOrderActionField(), true);
  }

}

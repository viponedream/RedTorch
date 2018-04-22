/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcReqRepealField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReqRepealField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReqRepealField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcReqRepealField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setRepealTimeInterval(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_RepealTimeInterval_set(swigCPtr, this, value);
  }

  public int getRepealTimeInterval() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_RepealTimeInterval_get(swigCPtr, this);
  }

  public void setRepealedTimes(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_RepealedTimes_set(swigCPtr, this, value);
  }

  public int getRepealedTimes() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_RepealedTimes_get(swigCPtr, this);
  }

  public void setBankRepealFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankRepealFlag_set(swigCPtr, this, value);
  }

  public char getBankRepealFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankRepealFlag_get(swigCPtr, this);
  }

  public void setBrokerRepealFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerRepealFlag_set(swigCPtr, this, value);
  }

  public char getBrokerRepealFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerRepealFlag_get(swigCPtr, this);
  }

  public void setPlateRepealSerial(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_PlateRepealSerial_set(swigCPtr, this, value);
  }

  public int getPlateRepealSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_PlateRepealSerial_get(swigCPtr, this);
  }

  public void setBankRepealSerial(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankRepealSerial_set(swigCPtr, this, value);
  }

  public String getBankRepealSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankRepealSerial_get(swigCPtr, this);
  }

  public void setFutureRepealSerial(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_FutureRepealSerial_set(swigCPtr, this, value);
  }

  public int getFutureRepealSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_FutureRepealSerial_get(swigCPtr, this);
  }

  public void setTradeCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_InstallID_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_FutureSerial_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TradeAmount_get(swigCPtr, this);
  }

  public void setFutureFetchAmount(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_FutureFetchAmount_set(swigCPtr, this, value);
  }

  public double getFutureFetchAmount() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_FutureFetchAmount_get(swigCPtr, this);
  }

  public void setFeePayFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_FeePayFlag_set(swigCPtr, this, value);
  }

  public char getFeePayFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_FeePayFlag_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_CustFee_get(swigCPtr, this);
  }

  public void setBrokerFee(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerFee_set(swigCPtr, this, value);
  }

  public double getBrokerFee() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerFee_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_Message_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TID_get(swigCPtr, this);
  }

  public void setTransferStatus(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TransferStatus_set(swigCPtr, this, value);
  }

  public char getTransferStatus() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_TransferStatus_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReqRepealField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcReqRepealField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcReqRepealField(), true);
  }

}

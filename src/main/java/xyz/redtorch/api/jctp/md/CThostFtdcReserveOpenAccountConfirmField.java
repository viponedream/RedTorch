/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcReserveOpenAccountConfirmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReserveOpenAccountConfirmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReserveOpenAccountConfirmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcReserveOpenAccountConfirmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankPassWord_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setTID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_TID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_Password_get(swigCPtr, this);
  }

  public void setBankReserveOpenSeq(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankReserveOpenSeq_set(swigCPtr, this, value);
  }

  public String getBankReserveOpenSeq() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BankReserveOpenSeq_get(swigCPtr, this);
  }

  public void setBookDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BookDate_set(swigCPtr, this, value);
  }

  public String getBookDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BookDate_get(swigCPtr, this);
  }

  public void setBookPsw(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BookPsw_set(swigCPtr, this, value);
  }

  public String getBookPsw() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_BookPsw_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcReserveOpenAccountConfirmField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcReserveOpenAccountConfirmField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcReserveOpenAccountConfirmField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcOptionInstrTradeCostField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrTradeCostField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrTradeCostField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcOptionInstrTradeCostField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_InstrumentID_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_HedgeFlag_get(swigCPtr, this);
  }

  public void setFixedMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_FixedMargin_set(swigCPtr, this, value);
  }

  public double getFixedMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_FixedMargin_get(swigCPtr, this);
  }

  public void setMiniMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_MiniMargin_set(swigCPtr, this, value);
  }

  public double getMiniMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_MiniMargin_get(swigCPtr, this);
  }

  public void setRoyalty(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_Royalty_set(swigCPtr, this, value);
  }

  public double getRoyalty() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_Royalty_get(swigCPtr, this);
  }

  public void setExchFixedMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_ExchFixedMargin_set(swigCPtr, this, value);
  }

  public double getExchFixedMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_ExchFixedMargin_get(swigCPtr, this);
  }

  public void setExchMiniMargin(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_ExchMiniMargin_set(swigCPtr, this, value);
  }

  public double getExchMiniMargin() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_ExchMiniMargin_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_ExchangeID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcOptionInstrTradeCostField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrTradeCostField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcOptionInstrTradeCostField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcOptionInstrTradingRightField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrTradingRightField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrTradingRightField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcOptionInstrTradingRightField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_InvestorID_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_Direction_get(swigCPtr, this);
  }

  public void setTradingRight(char value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_TradingRight_set(swigCPtr, this, value);
  }

  public char getTradingRight() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcOptionInstrTradingRightField_TradingRight_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrTradingRightField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcOptionInstrTradingRightField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcDepthMarketDataField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcDepthMarketDataField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcDepthMarketDataField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcDepthMarketDataField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_TradingDay_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_InstrumentID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_ExchangeID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setLastPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_LastPrice_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setPreClosePrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_PreClosePrice_set(swigCPtr, this, value);
  }

  public double getPreClosePrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_PreClosePrice_get(swigCPtr, this);
  }

  public void setPreOpenInterest(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_PreOpenInterest_set(swigCPtr, this, value);
  }

  public double getPreOpenInterest() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_PreOpenInterest_get(swigCPtr, this);
  }

  public void setOpenPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_OpenPrice_set(swigCPtr, this, value);
  }

  public double getOpenPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_OpenPrice_get(swigCPtr, this);
  }

  public void setHighestPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_HighestPrice_set(swigCPtr, this, value);
  }

  public double getHighestPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_HighestPrice_get(swigCPtr, this);
  }

  public void setLowestPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_LowestPrice_set(swigCPtr, this, value);
  }

  public double getLowestPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_LowestPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_OpenInterest_get(swigCPtr, this);
  }

  public void setClosePrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_ClosePrice_set(swigCPtr, this, value);
  }

  public double getClosePrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_ClosePrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_SettlementPrice_get(swigCPtr, this);
  }

  public void setUpperLimitPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_UpperLimitPrice_set(swigCPtr, this, value);
  }

  public double getUpperLimitPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_UpperLimitPrice_get(swigCPtr, this);
  }

  public void setLowerLimitPrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_LowerLimitPrice_set(swigCPtr, this, value);
  }

  public double getLowerLimitPrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_LowerLimitPrice_get(swigCPtr, this);
  }

  public void setPreDelta(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_PreDelta_set(swigCPtr, this, value);
  }

  public double getPreDelta() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_PreDelta_get(swigCPtr, this);
  }

  public void setCurrDelta(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_CurrDelta_set(swigCPtr, this, value);
  }

  public double getCurrDelta() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_CurrDelta_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_UpdateTime_get(swigCPtr, this);
  }

  public void setUpdateMillisec(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_UpdateMillisec_set(swigCPtr, this, value);
  }

  public int getUpdateMillisec() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_UpdateMillisec_get(swigCPtr, this);
  }

  public void setBidPrice1(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice1_set(swigCPtr, this, value);
  }

  public double getBidPrice1() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice1_get(swigCPtr, this);
  }

  public void setBidVolume1(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume1_set(swigCPtr, this, value);
  }

  public int getBidVolume1() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume1_get(swigCPtr, this);
  }

  public void setAskPrice1(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice1_set(swigCPtr, this, value);
  }

  public double getAskPrice1() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice1_get(swigCPtr, this);
  }

  public void setAskVolume1(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume1_set(swigCPtr, this, value);
  }

  public int getAskVolume1() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume1_get(swigCPtr, this);
  }

  public void setBidPrice2(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice2_set(swigCPtr, this, value);
  }

  public double getBidPrice2() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice2_get(swigCPtr, this);
  }

  public void setBidVolume2(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume2_set(swigCPtr, this, value);
  }

  public int getBidVolume2() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume2_get(swigCPtr, this);
  }

  public void setAskPrice2(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice2_set(swigCPtr, this, value);
  }

  public double getAskPrice2() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice2_get(swigCPtr, this);
  }

  public void setAskVolume2(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume2_set(swigCPtr, this, value);
  }

  public int getAskVolume2() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume2_get(swigCPtr, this);
  }

  public void setBidPrice3(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice3_set(swigCPtr, this, value);
  }

  public double getBidPrice3() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice3_get(swigCPtr, this);
  }

  public void setBidVolume3(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume3_set(swigCPtr, this, value);
  }

  public int getBidVolume3() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume3_get(swigCPtr, this);
  }

  public void setAskPrice3(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice3_set(swigCPtr, this, value);
  }

  public double getAskPrice3() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice3_get(swigCPtr, this);
  }

  public void setAskVolume3(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume3_set(swigCPtr, this, value);
  }

  public int getAskVolume3() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume3_get(swigCPtr, this);
  }

  public void setBidPrice4(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice4_set(swigCPtr, this, value);
  }

  public double getBidPrice4() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice4_get(swigCPtr, this);
  }

  public void setBidVolume4(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume4_set(swigCPtr, this, value);
  }

  public int getBidVolume4() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume4_get(swigCPtr, this);
  }

  public void setAskPrice4(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice4_set(swigCPtr, this, value);
  }

  public double getAskPrice4() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice4_get(swigCPtr, this);
  }

  public void setAskVolume4(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume4_set(swigCPtr, this, value);
  }

  public int getAskVolume4() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume4_get(swigCPtr, this);
  }

  public void setBidPrice5(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice5_set(swigCPtr, this, value);
  }

  public double getBidPrice5() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidPrice5_get(swigCPtr, this);
  }

  public void setBidVolume5(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume5_set(swigCPtr, this, value);
  }

  public int getBidVolume5() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_BidVolume5_get(swigCPtr, this);
  }

  public void setAskPrice5(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice5_set(swigCPtr, this, value);
  }

  public double getAskPrice5() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskPrice5_get(swigCPtr, this);
  }

  public void setAskVolume5(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume5_set(swigCPtr, this, value);
  }

  public int getAskVolume5() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AskVolume5_get(swigCPtr, this);
  }

  public void setAveragePrice(double value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AveragePrice_set(swigCPtr, this, value);
  }

  public double getAveragePrice() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_AveragePrice_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcDepthMarketDataField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcDepthMarketDataField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcDepthMarketDataField(), true);
  }

}

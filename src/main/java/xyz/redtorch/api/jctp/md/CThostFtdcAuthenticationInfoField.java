/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcAuthenticationInfoField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcAuthenticationInfoField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcAuthenticationInfoField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcAuthenticationInfoField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_UserProductInfo_get(swigCPtr, this);
  }

  public void setAuthInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_AuthInfo_set(swigCPtr, this, value);
  }

  public String getAuthInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_AuthInfo_get(swigCPtr, this);
  }

  public void setIsResult(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_IsResult_set(swigCPtr, this, value);
  }

  public int getIsResult() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcAuthenticationInfoField_IsResult_get(swigCPtr, this);
  }

  public CThostFtdcAuthenticationInfoField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcAuthenticationInfoField(), true);
  }

}

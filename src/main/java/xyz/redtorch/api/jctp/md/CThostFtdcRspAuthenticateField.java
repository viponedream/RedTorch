/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcRspAuthenticateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspAuthenticateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspAuthenticateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcRspAuthenticateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspAuthenticateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspAuthenticateField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspAuthenticateField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspAuthenticateField_UserID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspAuthenticateField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspAuthenticateField_UserProductInfo_get(swigCPtr, this);
  }

  public CThostFtdcRspAuthenticateField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcRspAuthenticateField(), true);
  }

}

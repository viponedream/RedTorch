/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.trader;

public class CThostFtdcSuperUserField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSuperUserField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSuperUserField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctptraderapiv6v3v11x64JNI.delete_CThostFtdcSuperUserField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setUserID(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSuperUserField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSuperUserField_UserID_get(swigCPtr, this);
  }

  public void setUserName(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSuperUserField_UserName_set(swigCPtr, this, value);
  }

  public String getUserName() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSuperUserField_UserName_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSuperUserField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSuperUserField_Password_get(swigCPtr, this);
  }

  public void setIsActive(int value) {
    jctptraderapiv6v3v11x64JNI.CThostFtdcSuperUserField_IsActive_set(swigCPtr, this, value);
  }

  public int getIsActive() {
    return jctptraderapiv6v3v11x64JNI.CThostFtdcSuperUserField_IsActive_get(swigCPtr, this);
  }

  public CThostFtdcSuperUserField() {
    this(jctptraderapiv6v3v11x64JNI.new_CThostFtdcSuperUserField(), true);
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcCurrentTimeField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcCurrentTimeField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcCurrentTimeField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcCurrentTimeField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCurrDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCurrentTimeField_CurrDate_set(swigCPtr, this, value);
  }

  public String getCurrDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCurrentTimeField_CurrDate_get(swigCPtr, this);
  }

  public void setCurrTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCurrentTimeField_CurrTime_set(swigCPtr, this, value);
  }

  public String getCurrTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCurrentTimeField_CurrTime_get(swigCPtr, this);
  }

  public void setCurrMillisec(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCurrentTimeField_CurrMillisec_set(swigCPtr, this, value);
  }

  public int getCurrMillisec() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCurrentTimeField_CurrMillisec_get(swigCPtr, this);
  }

  public void setActionDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcCurrentTimeField_ActionDay_set(swigCPtr, this, value);
  }

  public String getActionDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcCurrentTimeField_ActionDay_get(swigCPtr, this);
  }

  public CThostFtdcCurrentTimeField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcCurrentTimeField(), true);
  }

}

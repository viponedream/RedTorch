/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcQryMarginModelField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcQryMarginModelField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcQryMarginModelField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcQryMarginModelField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryMarginModelField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryMarginModelField_BrokerID_get(swigCPtr, this);
  }

  public void setMarginModelID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcQryMarginModelField_MarginModelID_set(swigCPtr, this, value);
  }

  public String getMarginModelID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcQryMarginModelField_MarginModelID_get(swigCPtr, this);
  }

  public CThostFtdcQryMarginModelField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcQryMarginModelField(), true);
  }

}

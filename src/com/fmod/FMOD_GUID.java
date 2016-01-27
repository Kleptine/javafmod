/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public class FMOD_GUID {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_GUID(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_GUID obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javafmodJNI.delete_FMOD_GUID(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setData1(long value) {
    javafmodJNI.FMOD_GUID_Data1_set(swigCPtr, this, value);
  }

  public long getData1() {
    return javafmodJNI.FMOD_GUID_Data1_get(swigCPtr, this);
  }

  public void setData2(int value) {
    javafmodJNI.FMOD_GUID_Data2_set(swigCPtr, this, value);
  }

  public int getData2() {
    return javafmodJNI.FMOD_GUID_Data2_get(swigCPtr, this);
  }

  public void setData3(int value) {
    javafmodJNI.FMOD_GUID_Data3_set(swigCPtr, this, value);
  }

  public int getData3() {
    return javafmodJNI.FMOD_GUID_Data3_get(swigCPtr, this);
  }

  public void setData4(SWIGTYPE_p_unsigned_char value) {
    javafmodJNI.FMOD_GUID_Data4_set(swigCPtr, this, SWIGTYPE_p_unsigned_char.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_char getData4() {
    long cPtr = javafmodJNI.FMOD_GUID_Data4_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public FMOD_GUID() {
    this(javafmodJNI.new_FMOD_GUID(), true);
  }

}
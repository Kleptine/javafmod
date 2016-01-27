/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public class FMOD_STUDIO_CPU_USAGE {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_STUDIO_CPU_USAGE(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_CPU_USAGE obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javafmodJNI.delete_FMOD_STUDIO_CPU_USAGE(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDspUsage(float value) {
    javafmodJNI.FMOD_STUDIO_CPU_USAGE_dspUsage_set(swigCPtr, this, value);
  }

  public float getDspUsage() {
    return javafmodJNI.FMOD_STUDIO_CPU_USAGE_dspUsage_get(swigCPtr, this);
  }

  public void setStreamUsage(float value) {
    javafmodJNI.FMOD_STUDIO_CPU_USAGE_streamUsage_set(swigCPtr, this, value);
  }

  public float getStreamUsage() {
    return javafmodJNI.FMOD_STUDIO_CPU_USAGE_streamUsage_get(swigCPtr, this);
  }

  public void setGeometryUsage(float value) {
    javafmodJNI.FMOD_STUDIO_CPU_USAGE_geometryUsage_set(swigCPtr, this, value);
  }

  public float getGeometryUsage() {
    return javafmodJNI.FMOD_STUDIO_CPU_USAGE_geometryUsage_get(swigCPtr, this);
  }

  public void setUpdateUsage(float value) {
    javafmodJNI.FMOD_STUDIO_CPU_USAGE_updateUsage_set(swigCPtr, this, value);
  }

  public float getUpdateUsage() {
    return javafmodJNI.FMOD_STUDIO_CPU_USAGE_updateUsage_get(swigCPtr, this);
  }

  public void setStudioUsage(float value) {
    javafmodJNI.FMOD_STUDIO_CPU_USAGE_studioUsage_set(swigCPtr, this, value);
  }

  public float getStudioUsage() {
    return javafmodJNI.FMOD_STUDIO_CPU_USAGE_studioUsage_get(swigCPtr, this);
  }

  public FMOD_STUDIO_CPU_USAGE() {
    this(javafmodJNI.new_FMOD_STUDIO_CPU_USAGE(), true);
  }

}
/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public class FMOD_VECTOR {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_VECTOR(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_VECTOR obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javafmodJNI.delete_FMOD_VECTOR(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX(float value) {
    javafmodJNI.FMOD_VECTOR_x_set(swigCPtr, this, value);
  }

  public float getX() {
    return javafmodJNI.FMOD_VECTOR_x_get(swigCPtr, this);
  }

  public void setY(float value) {
    javafmodJNI.FMOD_VECTOR_y_set(swigCPtr, this, value);
  }

  public float getY() {
    return javafmodJNI.FMOD_VECTOR_y_get(swigCPtr, this);
  }

  public void setZ(float value) {
    javafmodJNI.FMOD_VECTOR_z_set(swigCPtr, this, value);
  }

  public float getZ() {
    return javafmodJNI.FMOD_VECTOR_z_get(swigCPtr, this);
  }

  public FMOD_VECTOR() {
    this(javafmodJNI.new_FMOD_VECTOR(), true);
  }

}
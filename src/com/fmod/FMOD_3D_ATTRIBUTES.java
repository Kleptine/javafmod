/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public class FMOD_3D_ATTRIBUTES {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_3D_ATTRIBUTES(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_3D_ATTRIBUTES obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javafmodJNI.delete_FMOD_3D_ATTRIBUTES(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPosition(FMOD_VECTOR value) {
    javafmodJNI.FMOD_3D_ATTRIBUTES_position_set(swigCPtr, this, FMOD_VECTOR.getCPtr(value), value);
  }

  public FMOD_VECTOR getPosition() {
    long cPtr = javafmodJNI.FMOD_3D_ATTRIBUTES_position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FMOD_VECTOR(cPtr, false);
  }

  public void setVelocity(FMOD_VECTOR value) {
    javafmodJNI.FMOD_3D_ATTRIBUTES_velocity_set(swigCPtr, this, FMOD_VECTOR.getCPtr(value), value);
  }

  public FMOD_VECTOR getVelocity() {
    long cPtr = javafmodJNI.FMOD_3D_ATTRIBUTES_velocity_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FMOD_VECTOR(cPtr, false);
  }

  public void setForward(FMOD_VECTOR value) {
    javafmodJNI.FMOD_3D_ATTRIBUTES_forward_set(swigCPtr, this, FMOD_VECTOR.getCPtr(value), value);
  }

  public FMOD_VECTOR getForward() {
    long cPtr = javafmodJNI.FMOD_3D_ATTRIBUTES_forward_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FMOD_VECTOR(cPtr, false);
  }

  public void setUp(FMOD_VECTOR value) {
    javafmodJNI.FMOD_3D_ATTRIBUTES_up_set(swigCPtr, this, FMOD_VECTOR.getCPtr(value), value);
  }

  public FMOD_VECTOR getUp() {
    long cPtr = javafmodJNI.FMOD_3D_ATTRIBUTES_up_get(swigCPtr, this);
    return (cPtr == 0) ? null : new FMOD_VECTOR(cPtr, false);
  }

  public FMOD_3D_ATTRIBUTES() {
    this(javafmodJNI.new_FMOD_3D_ATTRIBUTES(), true);
  }

}

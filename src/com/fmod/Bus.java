/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public class Bus {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Bus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Bus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javafmodJNI.delete_Bus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public boolean isValid() {
    return javafmodJNI.Bus_isValid(swigCPtr, this);
  }

  public FMOD_RESULT getID(FMOD_GUID id) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_getID(swigCPtr, this, FMOD_GUID.getCPtr(id), id));
  }

  public FMOD_RESULT getPath(String path, int size, SWIGTYPE_p_int retrieved) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_getPath(swigCPtr, this, path, size, SWIGTYPE_p_int.getCPtr(retrieved)));
  }

  public FMOD_RESULT getFaderLevel(SWIGTYPE_p_float level) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_getFaderLevel(swigCPtr, this, SWIGTYPE_p_float.getCPtr(level)));
  }

  public FMOD_RESULT setFaderLevel(float level) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_setFaderLevel(swigCPtr, this, level));
  }

  public FMOD_RESULT getPaused(SWIGTYPE_p_bool paused) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_getPaused(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(paused)));
  }

  public FMOD_RESULT setPaused(boolean paused) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_setPaused(swigCPtr, this, paused));
  }

  public FMOD_RESULT getMute(SWIGTYPE_p_bool paused) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_getMute(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(paused)));
  }

  public FMOD_RESULT setMute(boolean paused) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_setMute(swigCPtr, this, paused));
  }

  public FMOD_RESULT stopAllEvents(FMOD_STUDIO_STOP_MODE mode) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_stopAllEvents(swigCPtr, this, mode.swigValue()));
  }

  public FMOD_RESULT lockChannelGroup() {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_lockChannelGroup(swigCPtr, this));
  }

  public FMOD_RESULT unlockChannelGroup() {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_unlockChannelGroup(swigCPtr, this));
  }

  public FMOD_RESULT getChannelGroup(ChannelGroup channelgroup) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.Bus_getChannelGroup(swigCPtr, this, channelgroup));
  }

}

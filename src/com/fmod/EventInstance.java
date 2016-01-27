/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public class EventInstance {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected EventInstance(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EventInstance obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javafmodJNI.delete_EventInstance(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

	/** This constructor creates the proxy which initially does not create nor own any C memory */
	public EventInstance() {
		this(0, false);
	}

  public boolean isValid() {
    return javafmodJNI.EventInstance_isValid(swigCPtr, this);
  }

  public FMOD_RESULT getDescription(EventDescription description) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getDescription(swigCPtr, this, description));
  }

  public FMOD_RESULT getVolume(SWIGTYPE_p_float volume) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getVolume(swigCPtr, this, SWIGTYPE_p_float.getCPtr(volume)));
  }

  public FMOD_RESULT setVolume(float volume) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_setVolume(swigCPtr, this, volume));
  }

  public FMOD_RESULT getPitch(SWIGTYPE_p_float pitch) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getPitch(swigCPtr, this, SWIGTYPE_p_float.getCPtr(pitch)));
  }

  public FMOD_RESULT setPitch(float pitch) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_setPitch(swigCPtr, this, pitch));
  }

  public FMOD_RESULT get3DAttributes(FMOD_3D_ATTRIBUTES attributes) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_get3DAttributes(swigCPtr, this, FMOD_3D_ATTRIBUTES.getCPtr(attributes), attributes));
  }

  public FMOD_RESULT set3DAttributes(FMOD_3D_ATTRIBUTES attributes) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_set3DAttributes(swigCPtr, this, FMOD_3D_ATTRIBUTES.getCPtr(attributes), attributes));
  }

  public FMOD_RESULT getProperty(FMOD_STUDIO_EVENT_PROPERTY index, SWIGTYPE_p_float value) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getProperty(swigCPtr, this, index.swigValue(), SWIGTYPE_p_float.getCPtr(value)));
  }

  public FMOD_RESULT setProperty(FMOD_STUDIO_EVENT_PROPERTY index, float value) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_setProperty(swigCPtr, this, index.swigValue(), value));
  }

  public FMOD_RESULT getPaused(SWIGTYPE_p_bool paused) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getPaused(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(paused)));
  }

  public FMOD_RESULT setPaused(boolean paused) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_setPaused(swigCPtr, this, paused));
  }

  public FMOD_RESULT start() {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_start(swigCPtr, this));
  }

  public FMOD_RESULT stop(FMOD_STUDIO_STOP_MODE mode) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_stop(swigCPtr, this, mode.swigValue()));
  }

  public FMOD_RESULT getTimelinePosition(SWIGTYPE_p_int position) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getTimelinePosition(swigCPtr, this, SWIGTYPE_p_int.getCPtr(position)));
  }

  public FMOD_RESULT setTimelinePosition(int position) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_setTimelinePosition(swigCPtr, this, position));
  }

  public FMOD_RESULT getPlaybackState(SWIGTYPE_p_FMOD_STUDIO_PLAYBACK_STATE state) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getPlaybackState(swigCPtr, this, SWIGTYPE_p_FMOD_STUDIO_PLAYBACK_STATE.getCPtr(state)));
  }

  public FMOD_RESULT getChannelGroup(ChannelGroup group) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getChannelGroup(swigCPtr, this, group));
  }

  public FMOD_RESULT release() {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_release(swigCPtr, this));
  }

  public FMOD_RESULT isVirtual(SWIGTYPE_p_bool virtualState) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_isVirtual(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(virtualState)));
  }

  public FMOD_RESULT getParameter(String name, ParameterInstance parameter) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getParameter(swigCPtr, this, name, parameter));
  }

  public FMOD_RESULT getParameterByIndex(int index, ParameterInstance parameter) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getParameterByIndex(swigCPtr, this, index, parameter));
  }

  public FMOD_RESULT getParameterCount(SWIGTYPE_p_int count) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getParameterCount(swigCPtr, this, SWIGTYPE_p_int.getCPtr(count)));
  }

  public FMOD_RESULT setParameterValue(String name, float value) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_setParameterValue(swigCPtr, this, name, value));
  }

  public FMOD_RESULT setParameterValueByIndex(int index, float value) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_setParameterValueByIndex(swigCPtr, this, index, value));
  }

  public FMOD_RESULT getCue(String name, CueInstance cue) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getCue(swigCPtr, this, name, cue));
  }

  public FMOD_RESULT getCueByIndex(int index, CueInstance cue) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getCueByIndex(swigCPtr, this, index, cue));
  }

  public FMOD_RESULT getCueCount(SWIGTYPE_p_int count) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getCueCount(swigCPtr, this, SWIGTYPE_p_int.getCPtr(count)));
  }

  public FMOD_RESULT setCallback(SWIGTYPE_p_f_enum_FMOD_STUDIO_EVENT_CALLBACK_TYPE_p_FMOD_STUDIO_EVENTINSTANCE_p_void__FMOD_RESULT callback) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_setCallback(swigCPtr, this, SWIGTYPE_p_f_enum_FMOD_STUDIO_EVENT_CALLBACK_TYPE_p_FMOD_STUDIO_EVENTINSTANCE_p_void__FMOD_RESULT.getCPtr(callback)));
  }

  public FMOD_RESULT getUserData(SWIGTYPE_p_p_void userData) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_getUserData(swigCPtr, this, SWIGTYPE_p_p_void.getCPtr(userData)));
  }

  public FMOD_RESULT setUserData(SWIGTYPE_p_void userData) {
    return FMOD_RESULT.swigToEnum(javafmodJNI.EventInstance_setUserData(swigCPtr, this, SWIGTYPE_p_void.getCPtr(userData)));
  }

}

/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_STUDIO_EVENT_CALLBACK_TYPE {
  public final static FMOD_STUDIO_EVENT_CALLBACK_TYPE FMOD_STUDIO_EVENT_CALLBACK_STARTED = new FMOD_STUDIO_EVENT_CALLBACK_TYPE("FMOD_STUDIO_EVENT_CALLBACK_STARTED");
  public final static FMOD_STUDIO_EVENT_CALLBACK_TYPE FMOD_STUDIO_EVENT_CALLBACK_STOPPED = new FMOD_STUDIO_EVENT_CALLBACK_TYPE("FMOD_STUDIO_EVENT_CALLBACK_STOPPED");
  public final static FMOD_STUDIO_EVENT_CALLBACK_TYPE FMOD_STUDIO_EVENT_CALLBACK_CREATE_PROGRAMMER_SOUND = new FMOD_STUDIO_EVENT_CALLBACK_TYPE("FMOD_STUDIO_EVENT_CALLBACK_CREATE_PROGRAMMER_SOUND");
  public final static FMOD_STUDIO_EVENT_CALLBACK_TYPE FMOD_STUDIO_EVENT_CALLBACK_DESTROY_PROGRAMMER_SOUND = new FMOD_STUDIO_EVENT_CALLBACK_TYPE("FMOD_STUDIO_EVENT_CALLBACK_DESTROY_PROGRAMMER_SOUND");
  public final static FMOD_STUDIO_EVENT_CALLBACK_TYPE FMOD_STUDIO_EVENT_CALLBACK_RESTARTED = new FMOD_STUDIO_EVENT_CALLBACK_TYPE("FMOD_STUDIO_EVENT_CALLBACK_RESTARTED");
  public final static FMOD_STUDIO_EVENT_CALLBACK_TYPE FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_CREATED = new FMOD_STUDIO_EVENT_CALLBACK_TYPE("FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_CREATED");
  public final static FMOD_STUDIO_EVENT_CALLBACK_TYPE FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_DESTROYED = new FMOD_STUDIO_EVENT_CALLBACK_TYPE("FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_DESTROYED");
  public final static FMOD_STUDIO_EVENT_CALLBACK_TYPE FMOD_STUDIO_EVENT_CALLBACK_FORCEINT = new FMOD_STUDIO_EVENT_CALLBACK_TYPE("FMOD_STUDIO_EVENT_CALLBACK_FORCEINT", javafmodJNI.FMOD_STUDIO_EVENT_CALLBACK_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_STUDIO_EVENT_CALLBACK_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_STUDIO_EVENT_CALLBACK_TYPE.class + " with value " + swigValue);
  }

  private FMOD_STUDIO_EVENT_CALLBACK_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_STUDIO_EVENT_CALLBACK_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_STUDIO_EVENT_CALLBACK_TYPE(String swigName, FMOD_STUDIO_EVENT_CALLBACK_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_STUDIO_EVENT_CALLBACK_TYPE[] swigValues = { FMOD_STUDIO_EVENT_CALLBACK_STARTED, FMOD_STUDIO_EVENT_CALLBACK_STOPPED, FMOD_STUDIO_EVENT_CALLBACK_CREATE_PROGRAMMER_SOUND, FMOD_STUDIO_EVENT_CALLBACK_DESTROY_PROGRAMMER_SOUND, FMOD_STUDIO_EVENT_CALLBACK_RESTARTED, FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_CREATED, FMOD_STUDIO_EVENT_CALLBACK_PLUGIN_DESTROYED, FMOD_STUDIO_EVENT_CALLBACK_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


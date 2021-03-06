/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_OPENSTATE {
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_READY = new FMOD_OPENSTATE("FMOD_OPENSTATE_READY", javafmodJNI.FMOD_OPENSTATE_READY_get());
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_LOADING = new FMOD_OPENSTATE("FMOD_OPENSTATE_LOADING");
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_ERROR = new FMOD_OPENSTATE("FMOD_OPENSTATE_ERROR");
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_CONNECTING = new FMOD_OPENSTATE("FMOD_OPENSTATE_CONNECTING");
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_BUFFERING = new FMOD_OPENSTATE("FMOD_OPENSTATE_BUFFERING");
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_SEEKING = new FMOD_OPENSTATE("FMOD_OPENSTATE_SEEKING");
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_PLAYING = new FMOD_OPENSTATE("FMOD_OPENSTATE_PLAYING");
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_SETPOSITION = new FMOD_OPENSTATE("FMOD_OPENSTATE_SETPOSITION");
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_MAX = new FMOD_OPENSTATE("FMOD_OPENSTATE_MAX");
  public final static FMOD_OPENSTATE FMOD_OPENSTATE_FORCEINT = new FMOD_OPENSTATE("FMOD_OPENSTATE_FORCEINT", javafmodJNI.FMOD_OPENSTATE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_OPENSTATE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_OPENSTATE.class + " with value " + swigValue);
  }

  private FMOD_OPENSTATE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_OPENSTATE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_OPENSTATE(String swigName, FMOD_OPENSTATE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_OPENSTATE[] swigValues = { FMOD_OPENSTATE_READY, FMOD_OPENSTATE_LOADING, FMOD_OPENSTATE_ERROR, FMOD_OPENSTATE_CONNECTING, FMOD_OPENSTATE_BUFFERING, FMOD_OPENSTATE_SEEKING, FMOD_OPENSTATE_PLAYING, FMOD_OPENSTATE_SETPOSITION, FMOD_OPENSTATE_MAX, FMOD_OPENSTATE_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


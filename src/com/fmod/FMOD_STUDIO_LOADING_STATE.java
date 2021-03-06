/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_STUDIO_LOADING_STATE {
  public final static FMOD_STUDIO_LOADING_STATE FMOD_STUDIO_LOADING_STATE_UNLOADING = new FMOD_STUDIO_LOADING_STATE("FMOD_STUDIO_LOADING_STATE_UNLOADING");
  public final static FMOD_STUDIO_LOADING_STATE FMOD_STUDIO_LOADING_STATE_UNLOADED = new FMOD_STUDIO_LOADING_STATE("FMOD_STUDIO_LOADING_STATE_UNLOADED");
  public final static FMOD_STUDIO_LOADING_STATE FMOD_STUDIO_LOADING_STATE_LOADING = new FMOD_STUDIO_LOADING_STATE("FMOD_STUDIO_LOADING_STATE_LOADING");
  public final static FMOD_STUDIO_LOADING_STATE FMOD_STUDIO_LOADING_STATE_LOADED = new FMOD_STUDIO_LOADING_STATE("FMOD_STUDIO_LOADING_STATE_LOADED");
  public final static FMOD_STUDIO_LOADING_STATE FMOD_STUDIO_LOADING_STATE_FORCEINT = new FMOD_STUDIO_LOADING_STATE("FMOD_STUDIO_LOADING_STATE_FORCEINT", javafmodJNI.FMOD_STUDIO_LOADING_STATE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_STUDIO_LOADING_STATE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_STUDIO_LOADING_STATE.class + " with value " + swigValue);
  }

  private FMOD_STUDIO_LOADING_STATE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_STUDIO_LOADING_STATE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_STUDIO_LOADING_STATE(String swigName, FMOD_STUDIO_LOADING_STATE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_STUDIO_LOADING_STATE[] swigValues = { FMOD_STUDIO_LOADING_STATE_UNLOADING, FMOD_STUDIO_LOADING_STATE_UNLOADED, FMOD_STUDIO_LOADING_STATE_LOADING, FMOD_STUDIO_LOADING_STATE_LOADED, FMOD_STUDIO_LOADING_STATE_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


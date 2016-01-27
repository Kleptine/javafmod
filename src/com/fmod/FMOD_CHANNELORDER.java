/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_CHANNELORDER {
  public final static FMOD_CHANNELORDER FMOD_CHANNELORDER_DEFAULT = new FMOD_CHANNELORDER("FMOD_CHANNELORDER_DEFAULT");
  public final static FMOD_CHANNELORDER FMOD_CHANNELORDER_WAVEFORMAT = new FMOD_CHANNELORDER("FMOD_CHANNELORDER_WAVEFORMAT");
  public final static FMOD_CHANNELORDER FMOD_CHANNELORDER_PROTOOLS = new FMOD_CHANNELORDER("FMOD_CHANNELORDER_PROTOOLS");
  public final static FMOD_CHANNELORDER FMOD_CHANNELORDER_ALLMONO = new FMOD_CHANNELORDER("FMOD_CHANNELORDER_ALLMONO");
  public final static FMOD_CHANNELORDER FMOD_CHANNELORDER_ALLSTEREO = new FMOD_CHANNELORDER("FMOD_CHANNELORDER_ALLSTEREO");
  public final static FMOD_CHANNELORDER FMOD_CHANNELORDER_ALSA = new FMOD_CHANNELORDER("FMOD_CHANNELORDER_ALSA");
  public final static FMOD_CHANNELORDER FMOD_CHANNELORDER_MAX = new FMOD_CHANNELORDER("FMOD_CHANNELORDER_MAX");
  public final static FMOD_CHANNELORDER FMOD_CHANNELORDER_FORCEINT = new FMOD_CHANNELORDER("FMOD_CHANNELORDER_FORCEINT", javafmodJNI.FMOD_CHANNELORDER_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_CHANNELORDER swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_CHANNELORDER.class + " with value " + swigValue);
  }

  private FMOD_CHANNELORDER(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_CHANNELORDER(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_CHANNELORDER(String swigName, FMOD_CHANNELORDER swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_CHANNELORDER[] swigValues = { FMOD_CHANNELORDER_DEFAULT, FMOD_CHANNELORDER_WAVEFORMAT, FMOD_CHANNELORDER_PROTOOLS, FMOD_CHANNELORDER_ALLMONO, FMOD_CHANNELORDER_ALLSTEREO, FMOD_CHANNELORDER_ALSA, FMOD_CHANNELORDER_MAX, FMOD_CHANNELORDER_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


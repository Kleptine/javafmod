/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_CHANNELCONTROL_CALLBACK_TYPE {
  public final static FMOD_CHANNELCONTROL_CALLBACK_TYPE FMOD_CHANNELCONTROL_CALLBACK_END = new FMOD_CHANNELCONTROL_CALLBACK_TYPE("FMOD_CHANNELCONTROL_CALLBACK_END");
  public final static FMOD_CHANNELCONTROL_CALLBACK_TYPE FMOD_CHANNELCONTROL_CALLBACK_VIRTUALVOICE = new FMOD_CHANNELCONTROL_CALLBACK_TYPE("FMOD_CHANNELCONTROL_CALLBACK_VIRTUALVOICE");
  public final static FMOD_CHANNELCONTROL_CALLBACK_TYPE FMOD_CHANNELCONTROL_CALLBACK_SYNCPOINT = new FMOD_CHANNELCONTROL_CALLBACK_TYPE("FMOD_CHANNELCONTROL_CALLBACK_SYNCPOINT");
  public final static FMOD_CHANNELCONTROL_CALLBACK_TYPE FMOD_CHANNELCONTROL_CALLBACK_OCCLUSION = new FMOD_CHANNELCONTROL_CALLBACK_TYPE("FMOD_CHANNELCONTROL_CALLBACK_OCCLUSION");
  public final static FMOD_CHANNELCONTROL_CALLBACK_TYPE FMOD_CHANNELCONTROL_CALLBACK_MAX = new FMOD_CHANNELCONTROL_CALLBACK_TYPE("FMOD_CHANNELCONTROL_CALLBACK_MAX");
  public final static FMOD_CHANNELCONTROL_CALLBACK_TYPE FMOD_CHANNELCONTROL_CALLBACK_FORCEINT = new FMOD_CHANNELCONTROL_CALLBACK_TYPE("FMOD_CHANNELCONTROL_CALLBACK_FORCEINT", javafmodJNI.FMOD_CHANNELCONTROL_CALLBACK_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_CHANNELCONTROL_CALLBACK_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_CHANNELCONTROL_CALLBACK_TYPE.class + " with value " + swigValue);
  }

  private FMOD_CHANNELCONTROL_CALLBACK_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_CHANNELCONTROL_CALLBACK_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_CHANNELCONTROL_CALLBACK_TYPE(String swigName, FMOD_CHANNELCONTROL_CALLBACK_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_CHANNELCONTROL_CALLBACK_TYPE[] swigValues = { FMOD_CHANNELCONTROL_CALLBACK_END, FMOD_CHANNELCONTROL_CALLBACK_VIRTUALVOICE, FMOD_CHANNELCONTROL_CALLBACK_SYNCPOINT, FMOD_CHANNELCONTROL_CALLBACK_OCCLUSION, FMOD_CHANNELCONTROL_CALLBACK_MAX, FMOD_CHANNELCONTROL_CALLBACK_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


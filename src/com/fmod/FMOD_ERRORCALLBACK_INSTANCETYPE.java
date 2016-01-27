/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_ERRORCALLBACK_INSTANCETYPE {
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_NONE = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_NONE");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_SYSTEM = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_SYSTEM");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNEL = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNEL");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELGROUP = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELGROUP");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELCONTROL = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELCONTROL");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_SOUND = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_SOUND");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_SOUNDGROUP = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_SOUNDGROUP");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_DSP = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_DSP");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_DSPCONNECTION = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_DSPCONNECTION");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_GEOMETRY = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_GEOMETRY");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_REVERB3D = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_REVERB3D");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_SYSTEM = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_SYSTEM");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTDESCRIPTION = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTDESCRIPTION");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTINSTANCE = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTINSTANCE");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_PARAMETERINSTANCE = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_PARAMETERINSTANCE");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_CUEINSTANCE = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_CUEINSTANCE");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BUS = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BUS");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_VCA = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_VCA");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BANK = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BANK");
  public final static FMOD_ERRORCALLBACK_INSTANCETYPE FMOD_ERRORCALLBACK_INSTANCETYPE_FORCEINT = new FMOD_ERRORCALLBACK_INSTANCETYPE("FMOD_ERRORCALLBACK_INSTANCETYPE_FORCEINT", javafmodJNI.FMOD_ERRORCALLBACK_INSTANCETYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_ERRORCALLBACK_INSTANCETYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_ERRORCALLBACK_INSTANCETYPE.class + " with value " + swigValue);
  }

  private FMOD_ERRORCALLBACK_INSTANCETYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_ERRORCALLBACK_INSTANCETYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_ERRORCALLBACK_INSTANCETYPE(String swigName, FMOD_ERRORCALLBACK_INSTANCETYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_ERRORCALLBACK_INSTANCETYPE[] swigValues = { FMOD_ERRORCALLBACK_INSTANCETYPE_NONE, FMOD_ERRORCALLBACK_INSTANCETYPE_SYSTEM, FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNEL, FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELGROUP, FMOD_ERRORCALLBACK_INSTANCETYPE_CHANNELCONTROL, FMOD_ERRORCALLBACK_INSTANCETYPE_SOUND, FMOD_ERRORCALLBACK_INSTANCETYPE_SOUNDGROUP, FMOD_ERRORCALLBACK_INSTANCETYPE_DSP, FMOD_ERRORCALLBACK_INSTANCETYPE_DSPCONNECTION, FMOD_ERRORCALLBACK_INSTANCETYPE_GEOMETRY, FMOD_ERRORCALLBACK_INSTANCETYPE_REVERB3D, FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_SYSTEM, FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTDESCRIPTION, FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_EVENTINSTANCE, FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_PARAMETERINSTANCE, FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_CUEINSTANCE, FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BUS, FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_VCA, FMOD_ERRORCALLBACK_INSTANCETYPE_STUDIO_BANK, FMOD_ERRORCALLBACK_INSTANCETYPE_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

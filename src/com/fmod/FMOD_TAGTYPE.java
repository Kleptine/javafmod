/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_TAGTYPE {
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_UNKNOWN = new FMOD_TAGTYPE("FMOD_TAGTYPE_UNKNOWN", javafmodJNI.FMOD_TAGTYPE_UNKNOWN_get());
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_ID3V1 = new FMOD_TAGTYPE("FMOD_TAGTYPE_ID3V1");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_ID3V2 = new FMOD_TAGTYPE("FMOD_TAGTYPE_ID3V2");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_VORBISCOMMENT = new FMOD_TAGTYPE("FMOD_TAGTYPE_VORBISCOMMENT");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_SHOUTCAST = new FMOD_TAGTYPE("FMOD_TAGTYPE_SHOUTCAST");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_ICECAST = new FMOD_TAGTYPE("FMOD_TAGTYPE_ICECAST");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_ASF = new FMOD_TAGTYPE("FMOD_TAGTYPE_ASF");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_MIDI = new FMOD_TAGTYPE("FMOD_TAGTYPE_MIDI");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_PLAYLIST = new FMOD_TAGTYPE("FMOD_TAGTYPE_PLAYLIST");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_FMOD = new FMOD_TAGTYPE("FMOD_TAGTYPE_FMOD");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_USER = new FMOD_TAGTYPE("FMOD_TAGTYPE_USER");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_MAX = new FMOD_TAGTYPE("FMOD_TAGTYPE_MAX");
  public final static FMOD_TAGTYPE FMOD_TAGTYPE_FORCEINT = new FMOD_TAGTYPE("FMOD_TAGTYPE_FORCEINT", javafmodJNI.FMOD_TAGTYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_TAGTYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_TAGTYPE.class + " with value " + swigValue);
  }

  private FMOD_TAGTYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_TAGTYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_TAGTYPE(String swigName, FMOD_TAGTYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_TAGTYPE[] swigValues = { FMOD_TAGTYPE_UNKNOWN, FMOD_TAGTYPE_ID3V1, FMOD_TAGTYPE_ID3V2, FMOD_TAGTYPE_VORBISCOMMENT, FMOD_TAGTYPE_SHOUTCAST, FMOD_TAGTYPE_ICECAST, FMOD_TAGTYPE_ASF, FMOD_TAGTYPE_MIDI, FMOD_TAGTYPE_PLAYLIST, FMOD_TAGTYPE_FMOD, FMOD_TAGTYPE_USER, FMOD_TAGTYPE_MAX, FMOD_TAGTYPE_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


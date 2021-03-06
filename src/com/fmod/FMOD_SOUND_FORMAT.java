/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_SOUND_FORMAT {
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_NONE = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_NONE");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_PCM8 = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_PCM8");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_PCM16 = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_PCM16");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_PCM24 = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_PCM24");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_PCM32 = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_PCM32");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_PCMFLOAT = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_PCMFLOAT");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_GCADPCM = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_GCADPCM");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_IMAADPCM = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_IMAADPCM");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_VAG = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_VAG");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_HEVAG = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_HEVAG");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_XMA = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_XMA");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_MPEG = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_MPEG");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_CELT = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_CELT");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_AT9 = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_AT9");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_XWMA = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_XWMA");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_VORBIS = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_VORBIS");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_MAX = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_MAX");
  public final static FMOD_SOUND_FORMAT FMOD_SOUND_FORMAT_FORCEINT = new FMOD_SOUND_FORMAT("FMOD_SOUND_FORMAT_FORCEINT", javafmodJNI.FMOD_SOUND_FORMAT_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_SOUND_FORMAT swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_SOUND_FORMAT.class + " with value " + swigValue);
  }

  private FMOD_SOUND_FORMAT(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_SOUND_FORMAT(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_SOUND_FORMAT(String swigName, FMOD_SOUND_FORMAT swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_SOUND_FORMAT[] swigValues = { FMOD_SOUND_FORMAT_NONE, FMOD_SOUND_FORMAT_PCM8, FMOD_SOUND_FORMAT_PCM16, FMOD_SOUND_FORMAT_PCM24, FMOD_SOUND_FORMAT_PCM32, FMOD_SOUND_FORMAT_PCMFLOAT, FMOD_SOUND_FORMAT_GCADPCM, FMOD_SOUND_FORMAT_IMAADPCM, FMOD_SOUND_FORMAT_VAG, FMOD_SOUND_FORMAT_HEVAG, FMOD_SOUND_FORMAT_XMA, FMOD_SOUND_FORMAT_MPEG, FMOD_SOUND_FORMAT_CELT, FMOD_SOUND_FORMAT_AT9, FMOD_SOUND_FORMAT_XWMA, FMOD_SOUND_FORMAT_VORBIS, FMOD_SOUND_FORMAT_MAX, FMOD_SOUND_FORMAT_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


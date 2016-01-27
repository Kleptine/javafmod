/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_DSP_RESAMPLER {
  public final static FMOD_DSP_RESAMPLER FMOD_DSP_RESAMPLER_DEFAULT = new FMOD_DSP_RESAMPLER("FMOD_DSP_RESAMPLER_DEFAULT");
  public final static FMOD_DSP_RESAMPLER FMOD_DSP_RESAMPLER_NOINTERP = new FMOD_DSP_RESAMPLER("FMOD_DSP_RESAMPLER_NOINTERP");
  public final static FMOD_DSP_RESAMPLER FMOD_DSP_RESAMPLER_LINEAR = new FMOD_DSP_RESAMPLER("FMOD_DSP_RESAMPLER_LINEAR");
  public final static FMOD_DSP_RESAMPLER FMOD_DSP_RESAMPLER_CUBIC = new FMOD_DSP_RESAMPLER("FMOD_DSP_RESAMPLER_CUBIC");
  public final static FMOD_DSP_RESAMPLER FMOD_DSP_RESAMPLER_SPLINE = new FMOD_DSP_RESAMPLER("FMOD_DSP_RESAMPLER_SPLINE");
  public final static FMOD_DSP_RESAMPLER FMOD_DSP_RESAMPLER_MAX = new FMOD_DSP_RESAMPLER("FMOD_DSP_RESAMPLER_MAX");
  public final static FMOD_DSP_RESAMPLER FMOD_DSP_RESAMPLER_FORCEINT = new FMOD_DSP_RESAMPLER("FMOD_DSP_RESAMPLER_FORCEINT", javafmodJNI.FMOD_DSP_RESAMPLER_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_DSP_RESAMPLER swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_DSP_RESAMPLER.class + " with value " + swigValue);
  }

  private FMOD_DSP_RESAMPLER(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_DSP_RESAMPLER(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_DSP_RESAMPLER(String swigName, FMOD_DSP_RESAMPLER swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_DSP_RESAMPLER[] swigValues = { FMOD_DSP_RESAMPLER_DEFAULT, FMOD_DSP_RESAMPLER_NOINTERP, FMOD_DSP_RESAMPLER_LINEAR, FMOD_DSP_RESAMPLER_CUBIC, FMOD_DSP_RESAMPLER_SPLINE, FMOD_DSP_RESAMPLER_MAX, FMOD_DSP_RESAMPLER_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

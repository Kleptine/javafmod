/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public class FMOD_REVERB_PROPERTIES {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_REVERB_PROPERTIES(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_REVERB_PROPERTIES obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javafmodJNI.delete_FMOD_REVERB_PROPERTIES(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDecayTime(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_DecayTime_set(swigCPtr, this, value);
  }

  public float getDecayTime() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_DecayTime_get(swigCPtr, this);
  }

  public void setEarlyDelay(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_EarlyDelay_set(swigCPtr, this, value);
  }

  public float getEarlyDelay() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_EarlyDelay_get(swigCPtr, this);
  }

  public void setLateDelay(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_LateDelay_set(swigCPtr, this, value);
  }

  public float getLateDelay() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_LateDelay_get(swigCPtr, this);
  }

  public void setHFReference(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_HFReference_set(swigCPtr, this, value);
  }

  public float getHFReference() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_HFReference_get(swigCPtr, this);
  }

  public void setHFDecayRatio(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_HFDecayRatio_set(swigCPtr, this, value);
  }

  public float getHFDecayRatio() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_HFDecayRatio_get(swigCPtr, this);
  }

  public void setDiffusion(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_Diffusion_set(swigCPtr, this, value);
  }

  public float getDiffusion() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_Diffusion_get(swigCPtr, this);
  }

  public void setDensity(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_Density_set(swigCPtr, this, value);
  }

  public float getDensity() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_Density_get(swigCPtr, this);
  }

  public void setLowShelfFrequency(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_LowShelfFrequency_set(swigCPtr, this, value);
  }

  public float getLowShelfFrequency() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_LowShelfFrequency_get(swigCPtr, this);
  }

  public void setLowShelfGain(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_LowShelfGain_set(swigCPtr, this, value);
  }

  public float getLowShelfGain() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_LowShelfGain_get(swigCPtr, this);
  }

  public void setHighCut(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_HighCut_set(swigCPtr, this, value);
  }

  public float getHighCut() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_HighCut_get(swigCPtr, this);
  }

  public void setEarlyLateMix(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_EarlyLateMix_set(swigCPtr, this, value);
  }

  public float getEarlyLateMix() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_EarlyLateMix_get(swigCPtr, this);
  }

  public void setWetLevel(float value) {
    javafmodJNI.FMOD_REVERB_PROPERTIES_WetLevel_set(swigCPtr, this, value);
  }

  public float getWetLevel() {
    return javafmodJNI.FMOD_REVERB_PROPERTIES_WetLevel_get(swigCPtr, this);
  }

  public FMOD_REVERB_PROPERTIES() {
    this(javafmodJNI.new_FMOD_REVERB_PROPERTIES(), true);
  }

}

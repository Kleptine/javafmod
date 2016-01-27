/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public class FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javafmodJNI.delete_FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setName(String value) {
    javafmodJNI.FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return javafmodJNI.FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES_name_get(swigCPtr, this);
  }

  public void setSound(SWIGTYPE_p_FMOD_SOUND value) {
    javafmodJNI.FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES_sound_set(swigCPtr, this, SWIGTYPE_p_FMOD_SOUND.getCPtr(value));
  }

  public SWIGTYPE_p_FMOD_SOUND getSound() {
    long cPtr = javafmodJNI.FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES_sound_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FMOD_SOUND(cPtr, false);
  }

  public void setSubsoundIndex(int value) {
    javafmodJNI.FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES_subsoundIndex_set(swigCPtr, this, value);
  }

  public int getSubsoundIndex() {
    return javafmodJNI.FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES_subsoundIndex_get(swigCPtr, this);
  }

  public FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES() {
    this(javafmodJNI.new_FMOD_STUDIO_PROGRAMMER_SOUND_PROPERTIES(), true);
  }

}
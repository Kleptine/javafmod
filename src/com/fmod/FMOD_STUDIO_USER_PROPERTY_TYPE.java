/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public final class FMOD_STUDIO_USER_PROPERTY_TYPE {
  public final static FMOD_STUDIO_USER_PROPERTY_TYPE FMOD_STUDIO_USER_PROPERTY_TYPE_INTEGER = new FMOD_STUDIO_USER_PROPERTY_TYPE("FMOD_STUDIO_USER_PROPERTY_TYPE_INTEGER");
  public final static FMOD_STUDIO_USER_PROPERTY_TYPE FMOD_STUDIO_USER_PROPERTY_TYPE_BOOLEAN = new FMOD_STUDIO_USER_PROPERTY_TYPE("FMOD_STUDIO_USER_PROPERTY_TYPE_BOOLEAN");
  public final static FMOD_STUDIO_USER_PROPERTY_TYPE FMOD_STUDIO_USER_PROPERTY_TYPE_FLOAT = new FMOD_STUDIO_USER_PROPERTY_TYPE("FMOD_STUDIO_USER_PROPERTY_TYPE_FLOAT");
  public final static FMOD_STUDIO_USER_PROPERTY_TYPE FMOD_STUDIO_USER_PROPERTY_TYPE_STRING = new FMOD_STUDIO_USER_PROPERTY_TYPE("FMOD_STUDIO_USER_PROPERTY_TYPE_STRING");
  public final static FMOD_STUDIO_USER_PROPERTY_TYPE FMOD_STUDIO_USER_PROPERTY_TYPE_FORCEINT = new FMOD_STUDIO_USER_PROPERTY_TYPE("FMOD_STUDIO_USER_PROPERTY_TYPE_FORCEINT", javafmodJNI.FMOD_STUDIO_USER_PROPERTY_TYPE_FORCEINT_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static FMOD_STUDIO_USER_PROPERTY_TYPE swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + FMOD_STUDIO_USER_PROPERTY_TYPE.class + " with value " + swigValue);
  }

  private FMOD_STUDIO_USER_PROPERTY_TYPE(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private FMOD_STUDIO_USER_PROPERTY_TYPE(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private FMOD_STUDIO_USER_PROPERTY_TYPE(String swigName, FMOD_STUDIO_USER_PROPERTY_TYPE swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static FMOD_STUDIO_USER_PROPERTY_TYPE[] swigValues = { FMOD_STUDIO_USER_PROPERTY_TYPE_INTEGER, FMOD_STUDIO_USER_PROPERTY_TYPE_BOOLEAN, FMOD_STUDIO_USER_PROPERTY_TYPE_FLOAT, FMOD_STUDIO_USER_PROPERTY_TYPE_STRING, FMOD_STUDIO_USER_PROPERTY_TYPE_FORCEINT };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


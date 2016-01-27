//  Notes:
//  Features NOT supported:
//		- Programmer Sounds (ie callbacks)

// swig -v -java -c++ fmod.i
// TODO:  Rename following http://www.swig.org/Doc1.3/Java.html#dynamic_linking_problems
%module javafmod
%{
	
	#include "fmod_common.h"
	#include "fmod.h"
	#include "fmod_studio_common.h"
	#include "fmod.hpp"
	#include "fmod_studio.hpp"
	#include "fmod_errors.h"
%}

%include "windows.i"
%include "cpointer.i"
%include "typemaps.i"

%rename(FMOD_System) FMOD::System;
// ======================================
// ============ Typemaps ================
// ======================================

// ======================================
// Define a macro for creating double pointer types (cppType**) where obj pointers are created first and 
// then passed to an init function:
//    FMOD::Studio::System** sobj = NULL;
//    FMOD::Studio::System::create(sobj);
//    sobj->release();
// ======================================
// ======================================
%define DOUBLE_POINTER_TYPE(cppType, javaType)

%typemap(javacode) cppType %{
	/** This constructor creates the proxy which initially does not create nor own any C memory */
	public javaType() {
		this(0, false);
	}
%}

// Type typemaps for marshalling FMOD::Studio::System **
%typemap(jni) cppType ** "jobject"
%typemap(jtype) cppType ** "javaType"
%typemap(jstype) cppType ** "javaType"

// Typemaps for FMOD::Studio::System ** as a parameter output type
%typemap(in) cppType** (cppType* ppSystem = 0) %{
  $1 = &ppSystem;
%}
%typemap(argout) cppType ** {
  // Give Java proxy the C pointer (of newly created object)
  jclass clazz = (jenv)->FindClass("com/fmod/javaType");
  jfieldID fid = (jenv)->GetFieldID(	clazz, "swigCPtr", "J");
  jlong cPtr = 0;
  *(cppType **)&cPtr = *$1;
  (jenv)->SetLongField($input, fid, cPtr);
}
%typemap(javain) cppType ** "$javainput"

%enddef

// ======================================
// Define a macro for the various settings structs in FMOD that require the size of the struct
//    to be initialized in it as the member cbSize. 
//    Can no longer create the java class, but can statically create it with 
//		javaType.create_and_init();
// ======================================
// ======================================
%define STRUCT_SETTINGS_INIT_CBSIZE(cppType, javaType)

%javamethodmodifiers javaType() "protected";

// Typemap to initialize settings struct
%extend cppType {
  void init() { 
    $self->cbSize = sizeof(cppType);
  }
}

%typemap(javacode) cppType %{
  public static javaType create_and_init() {
    javaType set = new javaType();
    set.init();
    return set;
  }
%}

%enddef

// ======================================
//  Defined double pointer types
// ======================================
DOUBLE_POINTER_TYPE(FMOD::Studio::System, System)
DOUBLE_POINTER_TYPE(FMOD::Studio::Bank, Bank)
DOUBLE_POINTER_TYPE(FMOD::Studio::EventDescription, EventDescription)
DOUBLE_POINTER_TYPE(FMOD::Studio::EventInstance, EventInstance)
DOUBLE_POINTER_TYPE(FMOD::Studio::MixerStrip, MixerStrip)
DOUBLE_POINTER_TYPE(FMOD::Studio::ParameterInstance, ParameterInstance)
DOUBLE_POINTER_TYPE(FMOD::Studio::CueInstance, CueInstance)
DOUBLE_POINTER_TYPE(FMOD::System, FMOD_System)
DOUBLE_POINTER_TYPE(FMOD::Channel, Channel)
DOUBLE_POINTER_TYPE(FMOD::ChannelGroup, ChannelGroup)
DOUBLE_POINTER_TYPE(FMOD::DSP, DSP)
DOUBLE_POINTER_TYPE(FMOD::DSPConnection, DSPConnection)
DOUBLE_POINTER_TYPE(FMOD::Reverb3D, Reverb3D)
DOUBLE_POINTER_TYPE(FMOD::Sound, Sound)
DOUBLE_POINTER_TYPE(FMOD::SoundGroup, SoundGroup)

STRUCT_SETTINGS_INIT_CBSIZE(FMOD_STUDIO_ADVANCEDSETTINGS, FMOD_STUDIO_ADVANCEDSETTINGS);
STRUCT_SETTINGS_INIT_CBSIZE(FMOD_ADVANCEDSETTINGS, FMOD_ADVANCEDSETTINGS);


    
// ===================================================

%include "fmod_common.h"
%include "fmod.h"
%include "fmod_studio_common.h"
%include "fmod.hpp"
%include "fmod_studio.hpp"
%include "fmod_errors.h"

///*%extend FMOD::Studio::System {
//	System() {
//		FMOD::Studio::System *pSystem = 0;
//		FMOD::Studio::System::create(&pSystem);
//		printf("create");
//		return pSystem;
//	}
//	~System() {
//		$self->release();
//		printf("destroy");
//	}
//}*/

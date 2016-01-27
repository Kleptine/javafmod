/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.fmod;

public class FMOD_CREATESOUNDEXINFO {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected FMOD_CREATESOUNDEXINFO(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FMOD_CREATESOUNDEXINFO obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        javafmodJNI.delete_FMOD_CREATESOUNDEXINFO(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCbsize(int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_cbsize_set(swigCPtr, this, value);
  }

  public int getCbsize() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_cbsize_get(swigCPtr, this);
  }

  public void setLength(long value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_length_set(swigCPtr, this, value);
  }

  public long getLength() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_length_get(swigCPtr, this);
  }

  public void setFileoffset(long value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_fileoffset_set(swigCPtr, this, value);
  }

  public long getFileoffset() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_fileoffset_get(swigCPtr, this);
  }

  public void setNumchannels(int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_numchannels_set(swigCPtr, this, value);
  }

  public int getNumchannels() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_numchannels_get(swigCPtr, this);
  }

  public void setDefaultfrequency(int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_defaultfrequency_set(swigCPtr, this, value);
  }

  public int getDefaultfrequency() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_defaultfrequency_get(swigCPtr, this);
  }

  public void setFormat(FMOD_SOUND_FORMAT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_format_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_SOUND_FORMAT getFormat() {
    return FMOD_SOUND_FORMAT.swigToEnum(javafmodJNI.FMOD_CREATESOUNDEXINFO_format_get(swigCPtr, this));
  }

  public void setDecodebuffersize(long value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_decodebuffersize_set(swigCPtr, this, value);
  }

  public long getDecodebuffersize() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_decodebuffersize_get(swigCPtr, this);
  }

  public void setInitialsubsound(int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_initialsubsound_set(swigCPtr, this, value);
  }

  public int getInitialsubsound() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_initialsubsound_get(swigCPtr, this);
  }

  public void setNumsubsounds(int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_numsubsounds_set(swigCPtr, this, value);
  }

  public int getNumsubsounds() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_numsubsounds_get(swigCPtr, this);
  }

  public void setInclusionlist(SWIGTYPE_p_int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_inclusionlist_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getInclusionlist() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_inclusionlist_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setInclusionlistnum(int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_inclusionlistnum_set(swigCPtr, this, value);
  }

  public int getInclusionlistnum() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_inclusionlistnum_get(swigCPtr, this);
  }

  public void setPcmreadcallback(SWIGTYPE_p_f_p_FMOD_SOUND_p_void_unsigned_int__FMOD_RESULT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_pcmreadcallback_set(swigCPtr, this, SWIGTYPE_p_f_p_FMOD_SOUND_p_void_unsigned_int__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_FMOD_SOUND_p_void_unsigned_int__FMOD_RESULT getPcmreadcallback() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_pcmreadcallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_FMOD_SOUND_p_void_unsigned_int__FMOD_RESULT(cPtr, false);
  }

  public void setPcmsetposcallback(SWIGTYPE_p_f_p_FMOD_SOUND_int_unsigned_int_unsigned_int__FMOD_RESULT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_pcmsetposcallback_set(swigCPtr, this, SWIGTYPE_p_f_p_FMOD_SOUND_int_unsigned_int_unsigned_int__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_FMOD_SOUND_int_unsigned_int_unsigned_int__FMOD_RESULT getPcmsetposcallback() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_pcmsetposcallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_FMOD_SOUND_int_unsigned_int_unsigned_int__FMOD_RESULT(cPtr, false);
  }

  public void setNonblockcallback(SWIGTYPE_p_f_p_FMOD_SOUND_enum_FMOD_RESULT__FMOD_RESULT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_nonblockcallback_set(swigCPtr, this, SWIGTYPE_p_f_p_FMOD_SOUND_enum_FMOD_RESULT__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_FMOD_SOUND_enum_FMOD_RESULT__FMOD_RESULT getNonblockcallback() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_nonblockcallback_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_FMOD_SOUND_enum_FMOD_RESULT__FMOD_RESULT(cPtr, false);
  }

  public void setDlsname(String value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_dlsname_set(swigCPtr, this, value);
  }

  public String getDlsname() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_dlsname_get(swigCPtr, this);
  }

  public void setEncryptionkey(String value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_encryptionkey_set(swigCPtr, this, value);
  }

  public String getEncryptionkey() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_encryptionkey_get(swigCPtr, this);
  }

  public void setMaxpolyphony(int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_maxpolyphony_set(swigCPtr, this, value);
  }

  public int getMaxpolyphony() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_maxpolyphony_get(swigCPtr, this);
  }

  public void setUserdata(SWIGTYPE_p_void value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_userdata_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getUserdata() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_userdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setSuggestedsoundtype(FMOD_SOUND_TYPE value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_suggestedsoundtype_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_SOUND_TYPE getSuggestedsoundtype() {
    return FMOD_SOUND_TYPE.swigToEnum(javafmodJNI.FMOD_CREATESOUNDEXINFO_suggestedsoundtype_get(swigCPtr, this));
  }

  public void setFileuseropen(SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuseropen_set(swigCPtr, this, SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT getFileuseropen() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuseropen_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_q_const__char_p_unsigned_int_p_p_void_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserclose(SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserclose_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT getFileuserclose() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserclose_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserread(SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserread_set(swigCPtr, this, SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT getFileuserread() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserread_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_p_void_unsigned_int_p_unsigned_int_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserseek(SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserseek_set(swigCPtr, this, SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT getFileuserseek() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserseek_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_void_unsigned_int_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserasyncread(SWIGTYPE_p_f_p_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserasyncread_set(swigCPtr, this, SWIGTYPE_p_f_p_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT getFileuserasyncread() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserasyncread_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserasynccancel(SWIGTYPE_p_f_p_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserasynccancel_set(swigCPtr, this, SWIGTYPE_p_f_p_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT.getCPtr(value));
  }

  public SWIGTYPE_p_f_p_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT getFileuserasynccancel() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserasynccancel_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_f_p_FMOD_ASYNCREADINFO_p_void__FMOD_RESULT(cPtr, false);
  }

  public void setFileuserdata(SWIGTYPE_p_void value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserdata_set(swigCPtr, this, SWIGTYPE_p_void.getCPtr(value));
  }

  public SWIGTYPE_p_void getFileuserdata() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_fileuserdata_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void setChannelorder(FMOD_CHANNELORDER value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_channelorder_set(swigCPtr, this, value.swigValue());
  }

  public FMOD_CHANNELORDER getChannelorder() {
    return FMOD_CHANNELORDER.swigToEnum(javafmodJNI.FMOD_CREATESOUNDEXINFO_channelorder_get(swigCPtr, this));
  }

  public void setChannelmask(long value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_channelmask_set(swigCPtr, this, value);
  }

  public long getChannelmask() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_channelmask_get(swigCPtr, this);
  }

  public void setInitialsoundgroup(SWIGTYPE_p_FMOD_SOUNDGROUP value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_initialsoundgroup_set(swigCPtr, this, SWIGTYPE_p_FMOD_SOUNDGROUP.getCPtr(value));
  }

  public SWIGTYPE_p_FMOD_SOUNDGROUP getInitialsoundgroup() {
    long cPtr = javafmodJNI.FMOD_CREATESOUNDEXINFO_initialsoundgroup_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_FMOD_SOUNDGROUP(cPtr, false);
  }

  public void setInitialseekposition(long value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_initialseekposition_set(swigCPtr, this, value);
  }

  public long getInitialseekposition() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_initialseekposition_get(swigCPtr, this);
  }

  public void setInitialseekpostype(long value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_initialseekpostype_set(swigCPtr, this, value);
  }

  public long getInitialseekpostype() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_initialseekpostype_get(swigCPtr, this);
  }

  public void setIgnoresetfilesystem(int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_ignoresetfilesystem_set(swigCPtr, this, value);
  }

  public int getIgnoresetfilesystem() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_ignoresetfilesystem_get(swigCPtr, this);
  }

  public void setAudioqueuepolicy(long value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_audioqueuepolicy_set(swigCPtr, this, value);
  }

  public long getAudioqueuepolicy() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_audioqueuepolicy_get(swigCPtr, this);
  }

  public void setMinmidigranularity(long value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_minmidigranularity_set(swigCPtr, this, value);
  }

  public long getMinmidigranularity() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_minmidigranularity_get(swigCPtr, this);
  }

  public void setNonblockthreadid(int value) {
    javafmodJNI.FMOD_CREATESOUNDEXINFO_nonblockthreadid_set(swigCPtr, this, value);
  }

  public int getNonblockthreadid() {
    return javafmodJNI.FMOD_CREATESOUNDEXINFO_nonblockthreadid_get(swigCPtr, this);
  }

  public FMOD_CREATESOUNDEXINFO() {
    this(javafmodJNI.new_FMOD_CREATESOUNDEXINFO(), true);
  }

}

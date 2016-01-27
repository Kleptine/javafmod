LOCAL_PATH := $(call my-dir)

#
# FMOD Shared Library
# 
include $(CLEAR_VARS)

LOCAL_MODULE            := fmod
LOCAL_SRC_FILES         := ../prebuilt/$(TARGET_ARCH_ABI)/libfmod.so
LOCAL_EXPORT_C_INCLUDES := ../src

include $(PREBUILT_SHARED_LIBRARY)

#
# FMOD Studio Shared Library
# 
include $(CLEAR_VARS)

LOCAL_MODULE            := fmodstudio
LOCAL_SRC_FILES         := ../prebuilt/$(TARGET_ARCH_ABI)/libfmodstudio.so
LOCAL_EXPORT_C_INCLUDES := ../src

include $(PREBUILT_SHARED_LIBRARY)

#
# Example Library
#
include $(CLEAR_VARS)

LOCAL_MODULE            := javafmod
LOCAL_SRC_FILES         := ../src/javafmod_wrap.cpp
LOCAL_C_INCLUDES        := ../src/
LOCAL_SHARED_LIBRARIES  := fmod fmodstudio

include $(BUILD_SHARED_LIBRARY)

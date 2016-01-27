%module simple_event
%{
__declspec(dllexport) extern int FMOD_Main();
%}
%include "windows.i"
int FMOD_Main();
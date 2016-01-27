NAME = libjavafmod64.so

FLAGS = -m64

SOURCE_FILES = src/*.cpp

ifndef JAVA_HOME
    $(error Specify JAVA_HOME)
endif

INCLUDE_DIRS = \
    -Isrc \
    -I${JAVA_HOME}/include \
    -I${JAVA_HOME}/include/linux

LOWLEVEL_LIB = lib/libfmod64.so
STUDIO_LIB = lib/libfmodstudio64.so

all:
	g++ -shared -fPIC -O2 -pthread ${FLAGS} -o ${NAME} ${SOURCE_FILES} ${LOWLEVEL_LIB} ${STUDIO_LIB} ${INCLUDE_DIRS}

LICENSE = "GFDL-1.3 & BSD & GPL-3.0 | The-Qt-Company-Commercial"
LIC_FILES_CHKSUM = " \
    file://LICENSE.GPL3;md5=d32239bcb673463ab874e80d47fae504 \
"

inherit qt6-cmake

include recipes-qt/qt6/qt6-git.inc
include recipes-qt/qt6/qt6.inc

DEPENDS = "qtbase qtshadertools-native"

BBCLASSEXTEND =+ "native nativesdk"

SRCREV = "d0a9ff570105c64583d7314035a95e57a4c5b0da"

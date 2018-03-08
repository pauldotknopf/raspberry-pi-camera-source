

SUMMARY = "An Arch Echo music video"
DESCRIPTION = "An Arch Echo music video"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://github.com/pauldotknopf/raspberry-pi-camera-source/releases/download/1.0/arch-echo-color-wheel.mp4"
SRC_URI[md5sum] = "41033fba63e13c410187000975aa0284"

do_install () {
	install -d ${D}${datadir}/videos

	install -m 0755 ../arch-echo-color-wheel.mp4 ${D}${datadir}/videos/arch-echo.mp4
}

FILES_${PN} = "${datadir}/**/*.*"

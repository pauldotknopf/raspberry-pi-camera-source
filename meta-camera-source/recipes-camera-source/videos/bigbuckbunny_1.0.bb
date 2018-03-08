SUMMARY = "The big buck bunny movie"
DESCRIPTION = "The big buck bunny movie"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "http://distribution.bbb3d.renderfarming.net/video/mp4/bbb_sunflower_1080p_60fps_normal.mp4"
SRC_URI[md5sum] = "7a7bc8ae38ccbd700e07977a9deb8cb7"

do_install () {
	install -d ${D}${datadir}/videos

	install -m 0755 ../bbb_sunflower_1080p_60fps_normal.mp4 ${D}${datadir}/videos/bbb.mp4
}

FILES_${PN} = "${datadir}/**/*.*"

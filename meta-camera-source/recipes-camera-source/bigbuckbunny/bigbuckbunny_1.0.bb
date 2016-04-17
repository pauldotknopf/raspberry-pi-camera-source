SUMMARY = "The big buck bunny movie"
DESCRIPTION = "The big buck bunny movie"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "http://distribution.bbb3d.renderfarming.net/video/mp4/bbb_sunflower_1080p_60fps_normal.mp4"
SRC_URI[md5sum] = "7a7bc8ae38ccbd700e07977a9deb8cb7"
SRC_URI[sha256sum] = "3aa2d8946ec7cf3b50b7148fb3338ca421e6ec34987b20a4044845d674794e3e"

do_install () {
	install -d ${D}${datadir}/bbb

	install -m 0755 ../bbb_sunflower_1080p_60fps_normal.mp4 ${D}${datadir}/bbb/bbb.mp4
}

FILES_${PN} = "${datadir}/**/*.*"

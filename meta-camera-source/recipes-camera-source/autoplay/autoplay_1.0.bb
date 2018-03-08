SUMMARY = "The script that runs on startup that plays a video."
DESCRIPTION = "The script that runs on startup that plays a video."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

RDEPENDS_${PN} += "arch-echo"

SRC_URI += "file://autoplay.service"

inherit systemd

SYSTEMD_PACKAGES = "${PN}"
SYSTEMD_SERVICE_${PN} = "autoplay.service"

do_install_append() {
  # systemd service install
  install -d ${D}/${sysconfdir}/systemd/system
  install -m 0644 ${WORKDIR}/autoplay.service ${D}/${sysconfdir}/systemd/system
}
SUMMARY = "The script that runs on startup that plays a video."
DESCRIPTION = "The script that runs on startup that plays a video."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=b97a012949927931feb7793eee5ed924 \
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
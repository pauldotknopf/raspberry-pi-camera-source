SUMMARY = "The script that runs on startup that plays a video."
DESCRIPTION = "The script that runs on startup that plays a video."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit update-rc.d systemd

do_install_append() {
    install -d ${D}/${sysconfdir}/init.d
		echo "omxplayer --loop /usr/share/bbb/bbb.mp4" >> ${D}/${sysconfdir}/init.d/autoplay
		chmod +x ${D}/${sysconfdir}/init.d/autoplay
}

INITSCRIPT_NAME = "autoplay"
INITSCRIPT_PARAMS = "defaults 10"

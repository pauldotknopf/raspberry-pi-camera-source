LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=4d92cd373abda3937c2bc47fbc49d690 \
                    file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

do_deploy_append() {
	# force non-audio, 1080p 60fps output
	sed -i '/#hdmi_drive/ c\hdmi_drive=1' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	sed -i '/#hdmi_group/ c\hdmi_group=2' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	sed -i '/#hdmi_mode/ c\hdmi_mode=82' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
  sed -i '/#hdmi_mode/ c\hdmi_mode=82' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
  sed -i '/#hdmi_force_hotplug/ c\hdmi_force_hotplug=1' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}

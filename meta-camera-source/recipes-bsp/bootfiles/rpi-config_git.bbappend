do_deploy_append() {
	# force non-audio, 1080p 60fps output
	sed -i '/#hdmi_drive/ c\hdmi_drive=1' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	sed -i '/#hdmi_group/ c\hdmi_group=1' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	sed -i '/#hdmi_mode/ c\hdmi_mode=95' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
  	sed -i '/#hdmi_force_hotplug/ c\hdmi_force_hotplug=1' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
	sed -i '/#dtparam=audio/ c\dtparam=audio=on' ${DEPLOYDIR}/bcm2835-bootfiles/config.txt
}

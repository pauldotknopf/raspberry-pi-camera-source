# Base this image on rpi-hwup-image
require recipes-core/images/rpi-basic-image.bb

IMAGE_INSTALL += "omxplayer bigbuckbunny autoplay"

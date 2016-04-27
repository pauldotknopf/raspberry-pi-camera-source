# What?

This is Raspberry Pi image that outputs a 1080p 60fps signal, playing back [Big Buck Bunny](https://peach.blender.org/) on a continous loop.

# Why?

I do a lot of video processing/encoding. Instead of requiring actual cameras and aiming it at a TV, I use a Rasperry Pi to produce a feed with constant/clear motion with beautiful colors.

# How?

Download a pre-compiled image that can be deployed to your Raspberry Pi (only Raspberry Pi 2) from the [releases](https://github.com/pauldotknopf/raspberry-pi-camera-source/releases).

Or, you can compile it yourself. This will need to be done if you need to support any version other than Raspberry Pi 2.

Here are the steps.

1. Follow [these](http://www.yoctoproject.org/docs/2.0/yocto-project-qs/yocto-project-qs.html#packages) steps to ensure your system is able to build using the yocto environment.
1. ```git clone https://github.com/pauldotknopf/raspberry-pi-camera-source.git```
2. ```git submodule update --init --recursive```
3. Update the [```local.conf```](https://github.com/pauldotknopf/raspberry-pi-camera-source/blob/master/build/conf/local.conf#L1) and set ```MACHINE``` to be either ```raspberrypi``` or ```raspberrypi2```.
4. ```source poky/oe-init-build-env```
5. ```bitbake camera-image-minimal```
6. ```dd if=tmp/deploy/images/raspberrypi2/camera-image-minimal-*-sdimg | pv | sudo dd of=/dev/sdX```

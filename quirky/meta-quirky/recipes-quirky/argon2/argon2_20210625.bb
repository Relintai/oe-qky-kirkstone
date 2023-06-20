# Recipe created by recipetool
# recipetool create -o argon2_20210625.bb http://distro.ibiblio.org/easyos/source/alphabetical/a/argon2-20210625.tar.gz

LICENSE = "CC0-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97ba219b479900241a90026f4d22b403"

SRC_URI = "http://distro.ibiblio.org/easyos/source/alphabetical/a/argon2-${PV}.tar.gz"

SRC_URI[md5sum] = "95ed960fab9cdff508667d42f680fd40"
SRC_URI[sha256sum] = "f1af4d353d490e16c9c7645db90c37a61002528ba5d15f5464c0013ca23373ec"


do_configure () {
 true
}

do_compile () {
 oe_runmake
}

do_install () {
 oe_runmake install 'DESTDIR=${D}'
}

HOMEPAGE = "https://argon2.online"
SUMMARY = "hash generator"

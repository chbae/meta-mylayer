SUMMARY = "My Image"

require recipes-fsl/images/imx-image-core.bb

IMAGE_INSTALL_append = " net-snmp-server-snmpd"

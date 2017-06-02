<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
  <xsl:param name="censhare:command-xml"/>

  <xsl:template match="/">
    <xsl:message>DEBUG DOCUMENT IMPORTER XML :
      <xsl:copy-of select="$censhare:command-xml"/>
    </xsl:message>
  </xsl:template>
</xsl:stylesheet>

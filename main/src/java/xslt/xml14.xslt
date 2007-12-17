<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:UML='org.omg.xmi.namespace.UML'
	xmlns:UML2='org.omg.xmi.namespace.UML2'>
	
	<xsl:output method="xml" encoding="UTF-8" />

	<xsl:template match="UML2:*" />
	<xsl:template match="UML:GraphConnector" />
	<xsl:template match="UML:GraphNode" />
	<xsl:template match="UML:Diagram" />

	<xsl:template match="@*">
		<xsl:copy />
	</xsl:template>

	<xsl:template match="*">
		<xsl:copy>
			<xsl:apply-templates select="* | text() | @*" />
		</xsl:copy>
	</xsl:template>
</xsl:stylesheet>
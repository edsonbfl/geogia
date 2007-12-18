import org.geogia.xmi.GroovyMDA

Ant.property(environment:"env")
grailsHome = Ant.antProject.properties."env.GRAILS_HOME"

includeTargets << new File ( "${grailsHome}/scripts/Compile.groovy" )

target('default':'Generate domain classes from an XMI file') {
	compile()
	args = System.getProperty("grails.cli.args")
	if(args) {
		GroovyMDA.main(["jar:file:./uml/${args}.zargo!/${args}.xmi",'grails-app/domain'] as String[])
	} else {
		println 'Please specify a model name'
		println()
	}
}
/*
 * generated by Xtext 2.14.0
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.generator

import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGenerator2
import org.eclipse.xtext.generator.IGeneratorContext

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
interface AnalysisActivityDSLToWsdlGenerator extends IGenerator2 {

    /**
     * Generate a complete WSDL description from the Activity-REST framework
     * input models.
     */
	def void doGenerate(ResourceSet resourceSet,
	    IFileSystemAccess2 fsa, 
	    IGeneratorContext context
	);
	
}

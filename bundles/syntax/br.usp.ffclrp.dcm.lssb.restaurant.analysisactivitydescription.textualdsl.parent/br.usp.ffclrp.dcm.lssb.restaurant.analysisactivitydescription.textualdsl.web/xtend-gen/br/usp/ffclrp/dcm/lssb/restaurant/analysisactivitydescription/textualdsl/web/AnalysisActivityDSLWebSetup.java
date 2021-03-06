/**
 * generated by Xtext 2.14.0
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.web;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSLRuntimeModule;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.AnalysisActivityDSLStandaloneSetup;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.ide.AnalysisActivityDSLIdeModule;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.web.AnalysisActivityDSLWebModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class AnalysisActivityDSLWebSetup extends AnalysisActivityDSLStandaloneSetup {
  @Override
  public Injector createInjector() {
    AnalysisActivityDSLRuntimeModule _analysisActivityDSLRuntimeModule = new AnalysisActivityDSLRuntimeModule();
    AnalysisActivityDSLIdeModule _analysisActivityDSLIdeModule = new AnalysisActivityDSLIdeModule();
    AnalysisActivityDSLWebModule _analysisActivityDSLWebModule = new AnalysisActivityDSLWebModule();
    return Guice.createInjector(Modules2.mixin(_analysisActivityDSLRuntimeModule, _analysisActivityDSLIdeModule, _analysisActivityDSLWebModule));
  }
}

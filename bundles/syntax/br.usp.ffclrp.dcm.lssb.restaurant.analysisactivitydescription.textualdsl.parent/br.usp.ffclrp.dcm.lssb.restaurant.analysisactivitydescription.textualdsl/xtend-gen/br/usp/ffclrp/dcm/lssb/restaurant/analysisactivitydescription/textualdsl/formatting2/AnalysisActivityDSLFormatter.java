/**
 * generated by Xtext 2.14.0
 */
package br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.formatting2;

import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Activity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineEntryList;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.CommandLineTool;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.ExitCode;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.FunctionalEntity;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.InputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.OutputDataset;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.Parameter;
import br.usp.ffclrp.dcm.lssb.restaurant.analysisactivitydescription.textualdsl.services.AnalysisActivityDSLGrammarAccess;
import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class AnalysisActivityDSLFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private AnalysisActivityDSLGrammarAccess _analysisActivityDSLGrammarAccess;
  
  protected void _format(final Activity activity, @Extension final IFormattableDocument document) {
    EList<Parameter> _parameters = activity.getParameters();
    for (final Parameter parameter : _parameters) {
      document.<Parameter>format(parameter);
    }
    EList<InputDataset> _inputDatasets = activity.getInputDatasets();
    for (final InputDataset inputDataset : _inputDatasets) {
      document.<InputDataset>format(inputDataset);
    }
    EList<OutputDataset> _outputDatasets = activity.getOutputDatasets();
    for (final OutputDataset outputDataset : _outputDatasets) {
      document.<OutputDataset>format(outputDataset);
    }
    document.<FunctionalEntity>format(activity.getFunctionalEntity());
  }
  
  protected void _format(final CommandLineTool commandLineTool, @Extension final IFormattableDocument document) {
    EList<CommandLineEntryList> _commandLineTemplate = commandLineTool.getCommandLineTemplate();
    for (final CommandLineEntryList commandLineEntryList : _commandLineTemplate) {
      document.<CommandLineEntryList>format(commandLineEntryList);
    }
    EList<ExitCode> _exitCodes = commandLineTool.getExitCodes();
    for (final ExitCode exitCode : _exitCodes) {
      document.<ExitCode>format(exitCode);
    }
  }
  
  public void format(final Object commandLineTool, final IFormattableDocument document) {
    if (commandLineTool instanceof CommandLineTool) {
      _format((CommandLineTool)commandLineTool, document);
      return;
    } else if (commandLineTool instanceof XtextResource) {
      _format((XtextResource)commandLineTool, document);
      return;
    } else if (commandLineTool instanceof Activity) {
      _format((Activity)commandLineTool, document);
      return;
    } else if (commandLineTool instanceof EObject) {
      _format((EObject)commandLineTool, document);
      return;
    } else if (commandLineTool == null) {
      _format((Void)null, document);
      return;
    } else if (commandLineTool != null) {
      _format(commandLineTool, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(commandLineTool, document).toString());
    }
  }
}
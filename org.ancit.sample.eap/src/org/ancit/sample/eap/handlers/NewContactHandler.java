 
package org.ancit.sample.eap.handlers;

import org.ancit.sample.eap.ui.parts.NewWizard;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.EclipseContextFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;

public class NewContactHandler {
	@Execute
	public void execute(Shell shell) {
		IEclipseContext context = EclipseContextFactory.create();

		IWizard wizard = ContextInjectionFactory.make(NewWizard.class, context);
		WizardDialog dialog = new WizardDialog(shell, wizard);
		dialog.open();
	}
		
}
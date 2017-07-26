 
package org.ancit.sample.rcp.eap.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class MyHandler {
	@Execute
	public void execute(Shell shell) {
		MessageDialog.openInformation(shell, "Eclipse e4", "Hello Eclipse e4 Message");
		
	}
		
}
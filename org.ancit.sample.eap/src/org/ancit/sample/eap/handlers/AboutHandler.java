package org.ancit.sample.eap.handlers;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class AboutHandler {
	@Execute
	public void execute(@Preference(nodePath="org.ancit.sample.eap") IEclipsePreferences pref) {
		
//		MessageDialog.openInformation(shell, "About", "Eclipse 4 Sample Application");
		pref.put("MESSAGE", "Message from Preference store");
	}
}

 
package org.ancit.sample.eap.handlers;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class MyHandler {

	
	@Execute
	public void execute(Shell shell, @Named("myService")MyService myservice) {
		
		System.out.println("My Hanler...");
		System.out.println(myservice.getMyService());
		MessageDialog.openInformation(shell, "My Service-Named Injection", myservice.getMyService());
		
	}
		
}
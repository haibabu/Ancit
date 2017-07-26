 
package org.ancit.sample.eap.handlers;

import org.ancit.sample.eap.annotations.Person;
import org.ancit.sample.eap.model.Contact;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class ContactPerson {
	String value="eva";
	@Execute
	public void execute(Shell shell,@Person(name ="eva") Contact contact ) {
		MessageDialog.openInformation(shell, "Contact Person: "+contact.getName(), "Address: " + contact.getAddress());
	}
	
	
		
}
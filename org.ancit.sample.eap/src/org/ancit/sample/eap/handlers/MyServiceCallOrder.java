
package org.ancit.sample.eap.handlers;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class MyServiceCallOrder {

	@Inject
	MyService service;

	@Inject
	public MyServiceCallOrder(final MyService service) {
		System.out.println("Constructor: " + service.getMyService());
	}

	@Execute
	public void execute(final IEclipseContext ctx, final Shell shell) {
		MessageDialog.openInformation(shell, "My Service", service.getMyService());

	}

	@Inject
	public void getService(final MyService service) {
		System.out.println("Method: " + service.getMyService());
	}

	@Inject
	public void getMyService(final @Optional @Named("myService") MyService myService) {
		if (myService != null) {
			System.out.println("Method: " + myService.getMyService());
		}

	}

	@javax.annotation.PostConstruct
	public void PostConstruct(final MyService service) {
		System.out.println("PostConstruct: " + service.getMyService());
	}

}
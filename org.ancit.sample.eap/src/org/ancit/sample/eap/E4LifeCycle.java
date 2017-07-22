package org.ancit.sample.eap;

import org.ancit.sample.eap.handlers.MyService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.ui.workbench.lifecycle.PostContextCreate;
import org.eclipse.e4.ui.workbench.lifecycle.PreSave;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessAdditions;
import org.eclipse.e4.ui.workbench.lifecycle.ProcessRemovals;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Monitor;
import org.eclipse.swt.widgets.Shell;

/**
 * This is a stub implementation containing e4 LifeCycle annotated methods.<br />
 * T2ihere is a corresponding entry in <em>plugin.xml</em> (under the
 * <em>org.eclipse.core.runtime.products' extension point</em>) that references
 * this class.
 **/
@SuppressWarnings("restriction")
public class E4LifeCycle {

	@PostContextCreate
	void postContextCreate(IEclipseContext workbenchcontext) {
		System.out.println("@PostContextCreate");
		

		MyService service=ContextInjectionFactory.make(MyService.class, workbenchcontext);
		workbenchcontext.set(MyService.class, service);
		
		}
	

	@PreSave
	void preSave(IEclipseContext workbenchContext) {
		System.out.println("Before Save...");
	}

	@ProcessAdditions
	void processAdditions(IEclipseContext workbenchContext) {
	

		System.out.println("@ProcessAdditions");
	}

	@ProcessRemovals
	void processRemovals(IEclipseContext workbenchContext) {
		System.out.println("@ProcessRemovals");
	}
	
	
}

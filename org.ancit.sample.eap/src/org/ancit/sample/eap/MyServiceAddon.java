 
package org.ancit.sample.eap;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.ancit.sample.eap.handlers.MyService;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.workbench.UIEvents;
import org.eclipse.swt.widgets.Event;

public class MyServiceAddon {

	@Inject
	@Optional
	public void applicationStarted(
			@UIEventTopic(UIEvents.UILifeCycle.APP_STARTUP_COMPLETE) Event event) {
		
		System.out.println("Application Loaded successfully...");
	}
	
	 @PostConstruct
	    public void init(IEclipseContext context) {
		 MyService myService=ContextInjectionFactory.make(MyService.class, context);
		 myService.setMyService("My Tasty food service");
		 context.set("myService", myService);
	    }

}

package org.ancit.sample.eap.handlers;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.MContext;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
public class OpenHandler {

//	@Execute
//	public void execute(Shell shell){
//		FileDialog dialog = new FileDialog(shell);
//		dialog.open();
//	}
	
	@Execute
	public void execute(MApplication application, EPartService partService,
            EModelService modelService) {

//		IEclipseContext mcontext=  application.getContext();
//	
//		MyService service=ContextInjectionFactory.make(MyService.class, mcontext);
//		mcontext.set(MyService.class, service);
		
        // create new part
        MPart mPart = modelService.createModelElement(MPart.class);
        mPart.setLabel("Testing");
        mPart.setElementId("newid");
//        mPart.setContributionURI("bundleclass://org.ancit.sample.eap.partdescriptor.mypartdescriptors");
        partService.showPart(mPart, PartState.ACTIVATE);
        
    }
}

package org.ancit.sample.eap.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
public class OpenHandler {

	
	
	@Execute
	public void execute(MApplication application, EPartService partService,
            EModelService modelService, @Preference(nodePath="org.ancit.sample.eap", value="MESSAGE") String message ) {

		System.out.println(message);
		
        // create new part
//        MPart mPart = modelService.createModelElement(MPart.class);
//        mPart.setLabel("Testing");
//        mPart.setElementId("newid");
//        mPart.setContributionURI("bundleclass://org.ancit.sample.eap.partdescriptor.mypartdescriptors");
        partService.showPart("org.ancit.sample.eap.partdescriptor.mypartdescriptors", PartState.ACTIVATE);
        
    }
}

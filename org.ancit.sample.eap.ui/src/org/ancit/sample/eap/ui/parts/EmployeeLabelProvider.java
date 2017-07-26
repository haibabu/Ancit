package org.ancit.sample.eap.ui.parts;

import org.ancit.sample.eap.model.Contact;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;

public class EmployeeLabelProvider extends LabelProvider implements ILabelProvider {
	
	@Override
	public String getText(Object element) {
		if (element instanceof Contact)
		{
			return ((Contact)element).getName();
		}
		return null;
	}

}

package org.ancit.sample.eap.ui.parts;

import org.ancit.sample.eap.model.AddressBook;
import org.eclipse.jface.viewers.ITreeContentProvider;

public class EmployeeContentProvider implements ITreeContentProvider {

	private static final Object[] EMPTY_ARRAY=new Object[0];
	
	
	@Override
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof AddressBook)
		{
			return ((AddressBook)parentElement).getContacts().toArray();
		}
		return EMPTY_ARRAY;
	}

	@Override
	public Object getParent(Object element) {
		return null;
	}

	@Override
	public boolean hasChildren(Object element) {
		return (element instanceof AddressBook);
	}

}

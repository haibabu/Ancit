 
package org.ancit.sample.eap.ui.parts;

import javax.inject.Inject;
import javax.inject.Named;
import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Text;

import javax.annotation.PreDestroy;

import org.ancit.sample.eap.model.Contact;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.viewers.IStructuredSelection;

public class EmployeeEditor {
	
	private Contact selectedContact;
	
	Text txtName;
	Text txtAddress;
	
	@Inject
	private MDirtyable dirty;
	
	
	@Inject
	public EmployeeEditor() {
		
		
		
	}
	
	@PostConstruct
	public void postConstruct(Composite parent) {
		GridLayout gridLayout=new GridLayout();
		gridLayout.numColumns=2;
		parent.setLayout(gridLayout);
		
		new Label(parent, SWT.BORDER).setText("Name");
		txtName=new Text(parent, SWT.BORDER);
		txtName.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				dataModified();
			}
	});
	
	}
	
	
	@Inject
	private void updateView(@Named(IServiceConstants.ACTIVE_SELECTION)@Optional final IStructuredSelection selection, final MPart part)
	{
		if (selection==null)
		{
			return;
		}
		Object selectedContact=((IStructuredSelection)selection).getFirstElement();
		if (selectedContact instanceof Contact)
		{
			this.selectedContact=(Contact) selectedContact;
			part.setLabel(((Contact)selectedContact).getName());
			txtName.setText(this.selectedContact.getName());
			
		}
	}
	
	@PreDestroy
	public void preDestroy() {
		
	}
	
	
	@Focus
	public void onFocus() {
		txtName.setFocus();
	}
	
	
	@Persist
	public void save() {
		
	}
	private void dataModified() {
		dirty.setDirty(true);
		
	}
}
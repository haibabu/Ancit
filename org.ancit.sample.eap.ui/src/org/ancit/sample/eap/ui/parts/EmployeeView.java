package org.ancit.sample.eap.ui.parts;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.ancit.sample.eap.model.AddressBookModelProvider;
import org.ancit.sample.eap.model.Contact;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.UIEventTopic;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import javafx.scene.control.TreeView;

public class EmployeeView {
	private TreeViewer viewer;
	@Inject
	private ESelectionService selectionService;

	@PostConstruct
	public void createPartControl(Composite parent) {
		viewer = new TreeViewer(parent, SWT.BOLD | SWT.BORDER);
		viewer.setContentProvider(new EmployeeContentProvider());
		viewer.setLabelProvider(new EmployeeLabelProvider());
		viewer.setInput(AddressBookModelProvider.INSTANCE.init());
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {

				selectionService.setSelection(event.getSelection());
			}
		});

	}

	public void refreshTree(@UIEventTopic("REFRESH") @Optional final Contact contact) {
		if (viewer != null) {
			if (!viewer.getTree().isDisposed()) {
				viewer.refresh();
			}
		}

	}

}

package org.ancit.sample.eap.ui.parts;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ContactWizardPage extends WizardPage {

	private Text txtName;

	protected ContactWizardPage(String pageName) {
		super(pageName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void createControl(Composite parent) {
		
		GridLayout gridLayout=new GridLayout();
		gridLayout.numColumns=2;
		parent.setLayout(gridLayout);
		
		new Label(parent, SWT.BORDER).setText("Name");
		txtName=new Text(parent, SWT.BORDER);
		txtName.setLayoutData(new GridData(SWT.FILL, SWT.BEGINNING, true, false));
		txtName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
			}

			
		});

	}

}

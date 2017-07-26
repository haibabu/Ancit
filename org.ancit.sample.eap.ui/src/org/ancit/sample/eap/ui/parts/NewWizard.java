package org.ancit.sample.eap.ui.parts;

import javax.inject.Inject;

import org.ancit.sample.eap.model.AddressBook;
import org.ancit.sample.eap.model.AddressBookModelProvider;
import org.ancit.sample.eap.model.Contact;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.e4.ui.services.internal.events.EventBroker;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;

public class NewWizard extends Wizard {

	
	@Inject
	private EventBroker refreshEventBroker;
	
	public NewWizard() {
//		refreshEventBroker.subscribe("REFRESH", null);
	}
	
	@Override
	public boolean performFinish() {
		Contact contact=new Contact();
		contact.setName("Niranjan");
		AddressBook addressBook= AddressBookModelProvider.INSTANCE.init();
//		addressBook.getContacts()
		
		refreshEventBroker.post("REFRESH", contact);
		
		
		return true;
	}

	@Override
	public void addPage(IWizardPage page) {
		addPage(new ContactWizardPage("Contact Page"));
	}
}

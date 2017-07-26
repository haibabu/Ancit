package org.ancit.sample.eap.annotations;

import javax.inject.Inject;

import org.ancit.sample.eap.model.AddressBook;
import org.ancit.sample.eap.model.Contact;
import org.eclipse.e4.core.di.suppliers.ExtendedObjectSupplier;
import org.eclipse.e4.core.di.suppliers.IObjectDescriptor;
import org.eclipse.e4.core.di.suppliers.IRequestor;
import org.osgi.service.component.annotations.Component;

@Component(service=ExtendedObjectSupplier.class,
property="dependency.injection.annotation=org.ancit.sample.eap.annotations.Person")
public class MyContactPersonSupplier extends ExtendedObjectSupplier {

	@Inject
	AddressBook addressBook;

	@Override
	public Object get(IObjectDescriptor descriptor, IRequestor requestor, boolean track, boolean group) {
		Person person = descriptor.getQualifier(Person.class);
		Contact contactPerson = addressBook.getContactByName(person.name());
		return contactPerson;
	}

}

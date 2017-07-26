package org.ancit.sample.eap.model;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

	private List<Contact> contacts = new ArrayList<>();

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public Contact getContactByName(String name) {
		for (Contact contact : contacts) {
			if (contact.getName().equalsIgnoreCase(name)) {
				return contact;
			}
		}
		return null;
	}

}

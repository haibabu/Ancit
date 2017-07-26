package org.ancit.sample.eap.model;

public class AddressBookModelProvider {
	
	public static final AddressBookModelProvider INSTANCE=new AddressBookModelProvider();
	
	
	public AddressBook init()
	{
		AddressBook addressBook=new AddressBook();
		addContacts(addressBook);
		return addressBook;
	}
	private void addContacts(AddressBook addressBook) {
		Contact malai=new Contact().setName("Malai");
		malai.setAddress("Bangalore");
		Contact babu=new Contact().setName("Babu");
		babu.setAddress("Bangalore");
		Contact eva=new Contact().setName("Eva");
		eva.setAddress("Regensburg");
		addressBook.getContacts().add(malai);
		addressBook.getContacts().add(babu);
		addressBook.getContacts().add(eva);
	}
	public void updateAddressBook(AddressBook addressBook)
	{
		addContacts(addressBook);
	}

}

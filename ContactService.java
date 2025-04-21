/**Alex Simonian
 * CS-320
 * March 22, 2025
 */

package contact;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ContactService {
	
	int currentIndex = 0; 
	
	public static List<Contact> contactList = new ArrayList<Contact>();
	
	
	public void addContact(String firstName, String lastName, String phoneNum, String address) {
		
		//using Universally Unique Identifier to create the contact IDs as they should be unique for each contact
		String stringID = UUID.randomUUID().toString().substring(0, 10);
		
/*		//check if contact ID already exists, potentially unnecessary since using UUID
		for (Contact contact : contactList) {
		    if (contact.getContactID().equals(stringID)) {
		        throw new IllegalArgumentException("Contact ID already exists.");
		    }*/
		
		
		Contact newContact = new Contact(stringID, firstName, lastName, phoneNum, address);
		contactList.add(newContact);
		
		currentIndex++;
		
	}
	
	public void deleteContact(String ID) {
		
		for (int i = 0; i< contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.remove(i);
			}
		}
	}
	
	public void editFirstName(String ID, String firstName) {
		
		for (int i = 0; i< contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.get(i).setFirstName(firstName);
			}
		}
	}
	
	public void editLastName(String ID, String lastName) {
		
		for (int i = 0; i< contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.get(i).setLastName(lastName);
			}
		}
	}	
	
	public void editPhone(String ID, String phoneNum) {
		
		for (int i = 0; i< contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.get(i).setPhoneNum(phoneNum);;
			}
		}
	}	
	
	public void editAddress(String ID, String address) {
		
		for (int i = 0; i< contactList.size(); i++) {
			if(contactList.get(i).getContactID().equals(ID)) {
				contactList.get(i).setAddress(address);
			}
		}
	}
	

}

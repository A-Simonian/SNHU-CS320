/**Alex Simonian
 * CS-320
 * March 22, 2025
 */

package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

public class ContactServiceTest {

    private ContactService service;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
        ContactService.contactList.clear(); // Reset the list before each test
    }

    @Test
    public void testAddContact() {
        service.addContact("John", "Doe", "1234567890", "123 Main St");
        assertEquals(1, ContactService.contactList.size());
    }

    @Test
    public void testDeleteContact() {
        service.addContact("John", "Doe", "1234567890", "123 Main St");
        String contactID = ContactService.contactList.get(0).getContactID();
        service.deleteContact(contactID);
        assertEquals(0, ContactService.contactList.size());
    }

    @Test
    public void testDeleteInvalidContact() {
        assertDoesNotThrow(() -> service.deleteContact("NonExistentID"));
    }

    @Test
    public void testUpdateContact() {
        service.addContact("John", "Doe", "1234567890", "123 Main St");
        String contactID = ContactService.contactList.get(0).getContactID();
        
        service.editFirstName(contactID, "Jane");
        service.editLastName(contactID, "Smith");
        service.editPhone(contactID, "0987654321");
        service.editAddress(contactID, "456 Oak Rd");

        Contact updatedContact = ContactService.contactList.get(0);
        assertEquals("Jane", updatedContact.getFirstName());
        assertEquals("Smith", updatedContact.getLastName());
        assertEquals("0987654321", updatedContact.getPhoneNum());
        assertEquals("456 Oak Rd", updatedContact.getAddress());
    }
}

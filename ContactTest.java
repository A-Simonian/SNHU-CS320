/** Alex Simonian
 * CS-320
 * March 22, 2025
 */

package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;

public class ContactTest {

    @Test
    public void testValidContactCreation() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertEquals("1234567890", contact.getContactID());
        assertEquals("John", contact.getFirstName());
        assertEquals("Doe", contact.getLastName());
        assertEquals("1234567890", contact.getPhoneNum());
        assertEquals("123 Main St", contact.getAddress());
    }

    @Test
    public void testSettersAndGetters() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");

        contact.setFirstName("Jane");
        assertEquals("Jane", contact.getFirstName());

        contact.setLastName("Smith");
        assertEquals("Smith", contact.getLastName());

        contact.setPhoneNum("0987654321");
        assertEquals("0987654321", contact.getPhoneNum());

        contact.setAddress("456 Oak Rd");
        assertEquals("456 Oak Rd", contact.getAddress());
    }

    @Test
    public void testInvalidContactID() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "123 Main St");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St"); // 11 chars
        });
    }

    @Test
    public void testInvalidFirstName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setFirstName("FirstnameTooLong"));
    }

    @Test
    public void testInvalidLastName() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setLastName("LastnameTooLong"));
    }

    @Test
    public void testInvalidPhoneNum() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNum(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNum("123")); // too short
        assertThrows(IllegalArgumentException.class, () -> contact.setPhoneNum("123456789a")); // not all digits
    }

    @Test
    public void testInvalidAddress() {
        Contact contact = new Contact("1234567890", "John", "Doe", "1234567890", "123 Main St");
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress(null));
        assertThrows(IllegalArgumentException.class, () -> contact.setAddress("This address is far too long for the validation limit"));
    }

    @Test
    public void testBoundaryValues() {
        Contact contact = new Contact("1234567890", "FirstNameX", "LastNameY", "0123456789", "123456789012345678901234567890"); // 30 chars
        assertEquals("1234567890", contact.getContactID());
        assertEquals("FirstNameX", contact.getFirstName());
        assertEquals("LastNameY", contact.getLastName());
        assertEquals("0123456789", contact.getPhoneNum());
        assertEquals("123456789012345678901234567890", contact.getAddress());
    }
    
    @Test
    public void testGetContactID() {
        Contact contact = new Contact("ABC1234567", "First", "Last", "0123456789", "Address");
        assertEquals("ABC1234567", contact.getContactID());
    }

}

/**Alex Simonian
 * CS-320
 * March 22, 2025
 */

package contact;

public class Contact {
    
    private final String contactID;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String address;

    public Contact(String contactID, String firstName, String lastName, String phoneNum, String address) {
        // Validate contact ID
        if (contactID == null || contactID.length() > 10) {
            throw new IllegalArgumentException("Invalid Contact ID: must be non-null and ≤ 10 characters.");
        }
        this.contactID = contactID;

        // Use setters for consistent validation
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNum(phoneNum);
        setAddress(address);
    }

    public String getContactID() {
        return contactID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid First Name: must be non-null and ≤ 10 characters.");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid Last Name: must be non-null and ≤ 10 characters.");
        }
        this.lastName = lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        if (phoneNum == null || !phoneNum.matches("\\d{10}")) {
            throw new IllegalArgumentException("Invalid Phone Number: must be exactly 10 digits.");
        }
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid Address: must be non-null and ≤ 30 characters.");
        }
        this.address = address;
    }
}

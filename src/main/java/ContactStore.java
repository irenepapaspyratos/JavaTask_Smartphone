import model.Contact;

import java.util.Arrays;


public class ContactStore {

    private Contact[] allContacts;

    public ContactStore(Contact[] allContacts) {
        this.allContacts = allContacts;
    }

    public Contact[] getAllContacts() {
        return allContacts;
    }

    public Contact getContact(int index) {
        return allContacts[index];
    }

    public Contact getContactByName(String name) {
        try {
            Contact contact = Arrays
                    .stream(this.getAllContacts())
                    .filter(element -> element.getName().equals(name))
                    .findFirst().get();
            return contact;
        } catch (Exception exception) {
            return null;
        }
    }

    public void setAllContacts(Contact[] allContacts) {
        this.allContacts = allContacts;
    }

    public void addContact(Contact contact) {
        Contact[] newArray = new Contact[allContacts.length + 1];
        int counter = 0;
        for (Contact abc : allContacts) {
            newArray[counter] = abc;
            counter++;
        }
        newArray[counter] = contact;
        allContacts = newArray;
    }
}

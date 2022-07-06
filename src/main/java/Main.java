import model.BusinessContact;
import model.Contact;
import model.Friend;

public class Main {
    public static void main(String[] args) {
        Friend contactA = new Friend("Hans", "987");
        Friend contactB = new Friend();
        System.out.println(contactA);
        System.out.println(contactB);

        contactB = new Friend("Henny", "990876");
        Contact[] contactsA = {contactA, contactB};
        Smartphone phoneA = new Smartphone("710", "Nokia", contactsA);
        System.out.println(phoneA);

        BusinessContact contactC = new BusinessContact("Carl", "Coca-Cola");
        BusinessContact contactD = new BusinessContact("Pepsi");
        Contact[] contactsB = {contactB, contactC, contactD};
        Smartphone phoneB = new Smartphone("710", "Nokia", contactsB);
        System.out.println(phoneB);

        ContactStore allContacts = new ContactStore(contactsB);
        allContacts.addContact(contactA);
        Smartphone phoneC = new Smartphone("710", "Nokia", allContacts.getAllContacts());
        System.out.println(phoneC);

        System.out.println(allContacts.getContactByName("Carl")!= null ? allContacts.getContactByName("Cai") : "Contact not found");
        System.out.println(allContacts.getContactByName("Cai") != null ? allContacts.getContactByName("Cai") : "Contact not found");
    }
}

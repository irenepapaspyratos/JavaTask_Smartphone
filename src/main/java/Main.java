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
        Contact[] contactsB = {contactA, contactB, contactC, contactD};
        Smartphone phoneB = new Smartphone("710", "Nokia", contactsB);
        System.out.println(phoneB);
    }
}

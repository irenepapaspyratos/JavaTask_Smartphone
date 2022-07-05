import model.Contact;
import model.Friend;

public class Main {
    public static void main(String[] args) {
        Friend friendA = new Friend("Hans", "987");
        Friend friendB = new Friend();
        System.out.println(friendA);
        System.out.println(friendB);

        Contact[] contacts = {friendA, new Friend("Henny", "990876")};
        Smartphone phoneA = new Smartphone("710", "Nokia", contacts);
        System.out.println(phoneA);

    }
}

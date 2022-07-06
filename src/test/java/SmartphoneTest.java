import model.BusinessContact;
import model.Contact;
import model.Friend;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmartphoneTest {

    private Contact[] contacts = {new Friend("Hans", "987"), new BusinessContact("Carl", "Coca-Cola"), new BusinessContact("Pepsi")};
    private Smartphone smartPhone =
            new Smartphone("710", "Nokia", contacts);

    @Test
    void startRadioTest_Positive() {
        Assertions.assertTrue(smartPhone.startRadio());
    }

    @Test
    void stopRadioTest_Negative() {
        Assertions.assertFalse(smartPhone.stopRadio());
    }

    @Test
    void getPositionTest_Positive() {
        Assertions.assertEquals("Köln", smartPhone.getPosition());
    }
}
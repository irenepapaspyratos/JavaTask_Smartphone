import model.Contact;
import model.Radio;
import model.GPS;

import java.util.Arrays;

public class Smartphone implements Radio, GPS {

    String model;
    String manufacturer;
    Contact[] contacts;

    public Smartphone() {
    }

    public Smartphone(String model, String manufacturer, Contact[] contacts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.contacts = contacts;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                '}';
    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String getPosition() {
        return "Köln";
    }
}

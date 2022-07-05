package model;

public abstract class Contact {
    protected String contactName;

    public Contact(String contactName) {
        this.contactName = contactName;
    }

    public Contact() {
    }

    public String getName() {
        return contactName;
    }
}

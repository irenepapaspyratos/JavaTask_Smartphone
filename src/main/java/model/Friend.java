package model;

public class Friend extends Contact {

    private String phoneNumber;

    public Friend() {
    }

    public Friend(String contactName, String phoneNumber) {
        super(contactName);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", contactName='" + contactName + '\'' +
                '}';
    }
}

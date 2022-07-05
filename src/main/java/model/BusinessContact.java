package model;

import org.w3c.dom.ls.LSOutput;

public class BusinessContact extends Contact {
    private String companyName;


    public BusinessContact(String contactName, String companyName) {
        super(contactName);
        this.companyName = companyName;
    }

    public BusinessContact(String companyName) {
        this.companyName = companyName;
    }

    public BusinessContact() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{" +
                "companyName='" + companyName + '\'' +
                ", contactName='" + (contactName != null ? contactName : "General") + '\'' +
                '}';
    }
}

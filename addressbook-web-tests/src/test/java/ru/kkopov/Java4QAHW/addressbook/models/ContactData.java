package ru.kkopov.Java4QAHW.addressbook.models;

public class ContactData {
    private final String firstName;
    private final String midleName;
    private final String lastName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String address;
    private final String telHome;
    private final String telMobile;
    private final String telWork;
    private final String telFax;
    private final String group;


    public ContactData(String firstName, String midleName, String lastName, String nickName, String title, String company, String address, String telHome, String telMobile, String telWork, String telFax,String group) {
        this.firstName = firstName;
        this.midleName = midleName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.telHome = telHome;
        this.telMobile = telMobile;
        this.telWork = telWork;
        this.telFax = telFax;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return midleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getTelHome() {
        return telHome;
    }

    public String getTelMobile() {
        return telMobile;
    }

    public String getTelWork() {
        return telWork;
    }

    public String getTelFax() {
        return telFax;
    }

    public String getGroup() {
        return group;
    }
}

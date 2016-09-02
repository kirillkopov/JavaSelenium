package ru.kkopov.Java4QAHW.addressbook.tests;

import org.testng.annotations.Test;
import ru.kkopov.Java4QAHW.addressbook.appmanager.ContactHelper;
import ru.kkopov.Java4QAHW.addressbook.appmanager.NavigationHelper;
import ru.kkopov.Java4QAHW.addressbook.models.ContactData;


public class ContactCreationTests extends TestBase {

    @Test
    public void ContactCreationTests() {
        ContactHelper contactHelper = app.getContactHelper();
        NavigationHelper navigationHelper = app.getNavigationHelper();

        navigationHelper.gotoAddNew();
        contactHelper.createContact(
                new ContactData("FirstName", "MidleName", "LastName",
                        "NickName", "Title", "Company", "Address",
                        "telHome", "telMobile", "telWork", "telFax","test1"));
        navigationHelper.gotoHomePage();
    }


}

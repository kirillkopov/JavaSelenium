package ru.kkopov.Java4QAHW.addressbook.tests;

import org.testng.annotations.Test;
import ru.kkopov.Java4QAHW.addressbook.appmanager.ContactHelper;
import ru.kkopov.Java4QAHW.addressbook.appmanager.NavigationHelper;
import ru.kkopov.Java4QAHW.addressbook.models.ContactData;

/**
 * Created by kkopov on 26.08.2016.
 */
public class ContactModificationTests extends TestBase {
    @Test
    public void testContactModification() {
        ContactHelper contactHelper = app.getContactHelper();
        NavigationHelper navigationHelper = app.getNavigationHelper();

        if(!contactHelper.isThereAContact()){
            navigationHelper.gotoAddNew();
            contactHelper.createContact(
                    new ContactData("FirstName", "MidleName", "LastName",
                    "NickName", "Title", "Company", "Address",
                    "telHome", "telMobile", "telWork", "telFax","test1"));
            navigationHelper.gotoHomePage();
        }
        contactHelper.initContactModification();
        contactHelper.fillContactForm(
                new ContactData("FirstNamemod", "MiddleNamemod", "LastNamemod",
                        "NickNamemod", "Titlemod", "Companymod", "Addressmod",
                        "telHomemod", "telMobilemod", "telWorkmod", "telFaxmod",null),false);
        contactHelper.submitContactModification();
        navigationHelper.gotoHomePage();
    }

}

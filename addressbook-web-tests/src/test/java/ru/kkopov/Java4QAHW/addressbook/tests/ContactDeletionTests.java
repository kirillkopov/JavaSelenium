package ru.kkopov.Java4QAHW.addressbook.tests;

import org.testng.annotations.Test;
import ru.kkopov.Java4QAHW.addressbook.appmanager.ContactHelper;
import ru.kkopov.Java4QAHW.addressbook.appmanager.GroupHelper;
import ru.kkopov.Java4QAHW.addressbook.appmanager.NavigationHelper;
import ru.kkopov.Java4QAHW.addressbook.models.ContactData;

/**
 * Created by kkopov on 26.08.2016.
 */
public class ContactDeletionTests extends TestBase {
    @Test
    public void testContactDeletion(){
        ContactHelper contactHelper = app.getContactHelper();
        NavigationHelper navigationHelper =app.getNavigationHelper();
        if(!contactHelper.isThereAContact()){
            navigationHelper.gotoAddNew();
            contactHelper.createContact(
                    new ContactData("FirstName", "MidleName", "LastName",
                            "NickName", "Title", "Company", "Address",
                            "telHome", "telMobile", "telWork", "telFax","test1"));
            navigationHelper.gotoHomePage();
        }
        contactHelper.selectContact();
        contactHelper.deleteSelectedContact();
        navigationHelper.gotoHome();
    }
}

package ru.kkopov.Java4QAHW.addressbook.tests;

import org.testng.annotations.Test;
import ru.kkopov.Java4QAHW.addressbook.appmanager.GroupHelper;
import ru.kkopov.Java4QAHW.addressbook.appmanager.NavigationHelper;
import ru.kkopov.Java4QAHW.addressbook.models.GroupData;

public class GroupCreationTests extends TestBase {


    @Test
    public void testGroupCreation() {
        GroupHelper groupHelper = app.getGroupHelper();
        NavigationHelper navigationHelper = app.getNavigationHelper();

        navigationHelper.gotoGroups();
        groupHelper.createGroup(new GroupData("test1", null, "test2footer"));
    }
}


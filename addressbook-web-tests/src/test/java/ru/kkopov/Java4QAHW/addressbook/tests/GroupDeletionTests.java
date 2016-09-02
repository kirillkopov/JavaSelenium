package ru.kkopov.Java4QAHW.addressbook.tests;

import org.testng.annotations.Test;
import ru.kkopov.Java4QAHW.addressbook.appmanager.GroupHelper;
import ru.kkopov.Java4QAHW.addressbook.appmanager.NavigationHelper;
import ru.kkopov.Java4QAHW.addressbook.models.GroupData;

public class GroupDeletionTests extends TestBase {


    @Test
    public void testGroupDeletion() {
        GroupHelper groupHelper = app.getGroupHelper();
        NavigationHelper navigationHelper = app.getNavigationHelper();

        navigationHelper.gotoGroups();
        if (!groupHelper.isThereAGroup()) {
            groupHelper.createGroup(new GroupData("test1", null, "test2footer"));
        }
        groupHelper.selectGroup();
        groupHelper.deleteSelectedGroup();
        navigationHelper.gotoGroups();
    }

}

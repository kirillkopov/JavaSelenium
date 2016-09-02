package ru.kkopov.Java4QAHW.addressbook.tests;

import org.testng.annotations.Test;
import ru.kkopov.Java4QAHW.addressbook.appmanager.GroupHelper;
import ru.kkopov.Java4QAHW.addressbook.appmanager.NavigationHelper;
import ru.kkopov.Java4QAHW.addressbook.models.GroupData;

/**
 * Created by kkopov on 26.08.2016.
 */
public class GroupModificationTests extends TestBase{
    @Test
    public void testGroupModification(){
        GroupHelper groupHelper = app.getGroupHelper();
        NavigationHelper navigationHelper = app.getNavigationHelper();

        navigationHelper.gotoGroups();
        if (!groupHelper.isThereAGroup()) {
            groupHelper.createGroup(new GroupData("test1", null, "test2footer"));
        }
        groupHelper.selectGroup();
        groupHelper.initGroupModification();
        groupHelper.fillGroupForm(new GroupData("test1mod", "test1headermod", "test2footermod"));
        groupHelper.submitGroupModification();
        groupHelper.returnToGroupPage();
    }
}

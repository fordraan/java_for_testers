package ru.stqa.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.addressbook.model.GroupData;

public class GroupModificationsTests extends TestBase{

    @Test
    void canModificationGroup(){
        if (!app.groups().isGroupPresent()){
            app.groups().createGroup(new GroupData("group name", "group header", "group footer"));
        }
        app.groups().modifyGroup(new GroupData().withName("modified name"));
    }
}

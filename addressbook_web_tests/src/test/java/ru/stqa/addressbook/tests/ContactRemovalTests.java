package ru.stqa.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactRemovalTests extends TestBase {

    @Test
    public void canRemoveGroup() {
        if (!app.contacts().isContactPresent()){
            app.contacts().createContact(new ContactData("Sergey", "Alexandrovic", "Timakov",
                                                         "test", "", "",  "test", "test", "test", "test", "test",
                                                         "test", "test", "test", "test",
                                                         "test", "test", "test", "test",
                                                         "test", "test", "test"));;
        }
        app.contacts().removeContact();

    }
    // Задание 7 и Задание 8

}

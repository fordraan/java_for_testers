package ru.stqa.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.stqa.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void canCreateContact(){
        app.contacts().createContact(new ContactData("Sergey", "Alexandrovic", "Timakov", "test", "test",
                                                     "test", "test", "test", "test", "test", "test",
                                                     "test", "test", "test", "test",
                                                     "test", "test", "test", "test",
                                                     "test", "test", "test"));

    }

    @Test
    public void canCreateContactThisEmptyName(){
        app.contacts().createContact(new ContactData());

    }

    @Test
    public void canCreateContactWithFirstNameAndLastNameOnly(){
        app.contacts().createContact(new ContactData().withFirstNameAndLastName("Ivan", "Ivanov"));
    }

    @Test
    public void canCreateContactWithFirstNameOnly(){
        app.contacts().createContact(new ContactData().withFirstName("Ivan"));
    }

    @Test
    public void canCreateContactWithMiddleNameOnly(){
        app.contacts().createContact(new ContactData().withMiddleName("Ivan"));
    }

    @Test
    public void canCreateContactWithNameOnly(){
        app.contacts().createContact(new ContactData().withLastName("Ivan"));
    }

    @Test
    public void canCreateContactWithNicknameOnly(){
        app.contacts().createContact(new ContactData().withNickname("Ivan"));
    }

    @Test
    public void canCreateContactWithCompanyOnly(){
        app.contacts().createContact(new ContactData().withCompany("Ivan"));
    }

    @Test
    public void canCreateContactWithAddressOnly(){
        app.contacts().createContact(new ContactData().withAddress("Ivan"));
    }

    @Test
    public void canCreateContactWithHomeOnly(){
        app.contacts().createContact(new ContactData().withHome("Ivan"));
    }

    @Test
    public void canCreateContactWithMobileOnly(){
        app.contacts().createContact(new ContactData().withMobile("Ivan"));
    }

    @Test
    public void canCreateContactWithWorkOnly(){
        app.contacts().createContact(new ContactData().withWork("Ivan"));
    }


    @Test
    public void canCreateContactWithEmailOnly(){
        app.contacts().createContact(new ContactData().withEmail("Ivan"));
    }

    @Test
    public void canCreateContactWithEmail2Only(){
        app.contacts().createContact(new ContactData().withEmail2("Ivan"));
    }

    @Test
    public void canCreateContactWithEmail3Only(){
        app.contacts().createContact(new ContactData().withEmail3("Ivan"));
    }

    @Test
    public void canCreateContactWithEmailAndEmail2AndEmail3Only(){
        app.contacts().createContact(new ContactData().withEmails("Ivan", "Ivan", "Ivan"));
    }

    @Test
    public void canCreateContactWithSomeFields(){
        app.contacts().createContact(new ContactData().withSomeFields("Sergey", "Alexandrovic",
                                                                      "Timakov", "test", "test",
                                                     "test", "test", "test", "test"));

    }

    @Test
    public void canCreateContactWithSomeFields2(){
        app.contacts().createContact(new ContactData().withSomeFields2("Sergey", "Alexandrovic",
                                                                      "Timakov", "test", "test", "test", "test",
                                                                      "test", "test", "test", "test", "test"));

    }

}

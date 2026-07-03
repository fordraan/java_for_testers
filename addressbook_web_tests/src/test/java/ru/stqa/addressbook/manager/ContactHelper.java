package ru.stqa.addressbook.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import ru.stqa.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }


    public void createContact(ContactData contact) {
        initContactCreation();
        fillContactForm(contact);
        submitContactCreation();
        returnToHomePage();

    }

    public void removeContact() {
        openHomePage();
        selectContact();
        removeSelectedContact();
        returnToHomePage();

    }


    private void fillContactForm(ContactData contact) {
        type(By.name("firstname"), contact.first_name());
        type(By.name("middlename"), contact.middle_name());
        type(By.name("lastname"), contact.last_name());
        type(By.name("nickname"), contact.nickname());
        type(By.name("company"), contact.company());
        type(By.name("address"), contact.address());
        type(By.name("home"), contact.home());
        type(By.name("mobile"), contact.mobile());
        type(By.name("work"), contact.work());
        type(By.name("email"), contact.email());
        type(By.name("email2"), contact.email2());
        type(By.name("email3"), contact.email3());

    }

    public void initContactCreation() {

        click(By.linkText("add new"));

    }

    public boolean isContactPresent() {
        openHomePage();
        return manager.IsElementPresent(By.name("selected[]"));
    }


    private void submitContactCreation() {
        click(By.name("submit"));
    }

    private void returnToHomePage() {
        click(By.linkText("home page"));

    }

    private void openHomePage() {
        click(By.linkText("home"));

    }

    private void selectContact() {
        click(By.name("selected[]"));
    }

    private void removeSelectedContact() {
        click(By.name("delete"));
        accept();

    }

    public void accept() {
        try {
            manager.driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {

        }
    }

}

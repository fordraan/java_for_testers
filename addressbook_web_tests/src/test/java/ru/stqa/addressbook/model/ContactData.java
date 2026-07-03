package ru.stqa.addressbook.model;

public record ContactData(String first_name, String middle_name, String  last_name,String company,
                          String address, String nickname, String photo, String title, String home, String mobile, String work,
                          String email,  String email2, String email3, String homepage, String birthday_day, String birthday_month,
                          String birthday_year, String anniversary_day, String anniversary_month, String anniversary_year, String group) {

    public ContactData (){
        this("", "", "", "", "", "", "", "", "",
             "", "", "", "", "", "", "", "", "",
             "", "", "", "");
    }

    public ContactData withFirstNameAndLastName(String firstName, String lastName) {
            return new ContactData(firstName, this.middle_name, lastName, this.nickname, this.company, this.address,  this.photo, this.title,
                                   this.home, this.mobile, this.work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                                   this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                                   this.group);
    }

    public ContactData withFirstName(String firstName) {
        return new ContactData(firstName, this.middle_name, this.last_name, this.nickname, this.company, this.address,  this.photo, this.title,
                               this.home, this.mobile, this.work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withMiddleName(String middleName) {
        return new ContactData(this.first_name, middleName, this.last_name, this.nickname, this.company, this.address,  this.photo, this.title,
                               this.home, this.mobile, this.work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withLastName(String lastName) {
        return new ContactData(this.first_name, this.middle_name, lastName,  this.nickname, this.company, this.address, this.photo, this.title,
                               this.home, this.mobile, this.work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withNickname(String nickname) {
        return new ContactData(this.first_name, this.middle_name, this.last_name,  nickname, this.company, this.address,this.photo, this.title,
                               this.home, this.mobile, this.work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withCompany(String company) {
        return new ContactData(this.first_name, this.middle_name, this.last_name, this.nickname, company, this.address,  this.photo, this.title,
                               this.home, this.mobile, this.work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withAddress(String address) {
        return new ContactData(this.first_name, this.middle_name, this.last_name, this.nickname, this.company, address,  this.photo, this.title,
                               this.home, this.mobile, this.work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withHome(String home) {
        return new ContactData(this.first_name, this.middle_name, this.last_name, this.nickname, this.company, this.address,  this.photo, this.title,
                               home, this.mobile, this.work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withMobile(String mobile) {
        return new ContactData(this.first_name, this.middle_name, this.last_name, this.nickname, this.company, this.address,  this.photo, this.title,
                               this.home, mobile, this.work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withWork(String work) {
        return new ContactData(this.first_name, this.middle_name, this.last_name, this.nickname, this.company, this.address,  this.photo, this.title,
                               this.home, this.mobile, work, this.email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withEmail(String work) {
        return new ContactData(this.first_name, this.middle_name, this.last_name, this.nickname, this.company, this.address,  this.photo, this.title,
                               this.home, this.mobile, this.work, email, this.email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withEmail2(String email2) {
        return new ContactData(this.first_name, this.middle_name, this.last_name, this.nickname, this.company, this.address,  this.photo, this.title,
                               this.home, this.mobile, this.work, this.email, email2, this.email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withEmail3(String email3) {
        return new ContactData(this.first_name, this.middle_name, this.last_name, this.nickname, this.company, this.address,  this.photo, this.title,
                               this.home, this.mobile, this.work, this.email, this.email2, email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withEmails(String email, String email2, String email3) {
        return new ContactData(this.first_name, this.middle_name, this.last_name, this.nickname, this.company, this.address,  this.photo, this.title,
                               this.home, this.mobile, this.work, email, email2, email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withSomeFields(String firstName,String lastName,
                                      String address, String home, String mobile, String work, String email, String email2, String email3) {
        return new ContactData(firstName, this.middle_name, lastName, this.nickname, this.company, address,  this.photo, this.title,
                               home, mobile, work, email, email2, email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }

    public ContactData withSomeFields2(String firstName,String middleName, String lastName, String nickname, String company,
                                      String address, String home, String mobile, String work, String email, String email2, String email3) {
        return new ContactData(firstName, middleName, lastName, nickname, company, address,  this.photo, this.title,
                               home, mobile, work, email, email2, email3, this.homepage, this.birthday_day,
                               this.birthday_month, this.birthday_year, this.anniversary_day, this.anniversary_month, this.anniversary_year,
                               this.group);
    }



}

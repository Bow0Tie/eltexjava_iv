package Ru.eltex.app.Labs.Shop;

import Ru.eltex.app.Labs.Enums.Imena;
import Ru.eltex.app.Labs.Enums.Otchestva;
import Ru.eltex.app.Labs.Enums.Surname;

import java.util.UUID;

public class Credentials {

    private UUID id;
    private Surname surname;
    private Imena name;
    private Otchestva patronymic;
    private String e_mail;

    public Credentials() {
        id = UUID.randomUUID();
    }

    public Credentials(Surname surname, Imena name, Otchestva patronymic, String e_mail) {
        id = UUID.randomUUID();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.e_mail = e_mail;
    }

    void showcredentials() {
        System.out.println("ID пользователя: " + id + "\nИмя: " + name + "\nФамилия: " + surname + "\nОтчество: " + patronymic + "\nE-mail: " + e_mail);
    }

    public UUID getId() {
        return id;
    }

    public Surname getSurname() {
        return surname;
    }

    public void setSurname(Surname surname) {
        this.surname = surname;
    }

    public Imena getName() {
        return name;
    }

    public void setName(Imena name) {
        this.name = name;
    }

    public Otchestva getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(Otchestva patronymic) {
        this.patronymic = patronymic;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

}

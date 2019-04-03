package Shop;

import java.util.UUID;

public class Credentials {

    private UUID id;
    private String surname;
    private String name;
    private String patronymic;
    private String e_mail;

    public Credentials() {
        id = UUID.randomUUID();
    }

    public Credentials(String surname, String name, String patronymic, String e_mail) {
        id = UUID.randomUUID();
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.e_mail = e_mail;
    }
    void showcredentials(){
        System.out.println("ID пользователя " + id + "\nИмя " + name + "\nФамилия " + surname + "\nОтчество " + patronymic + "\nE-mail " + e_mail);
    }

    public UUID getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

}

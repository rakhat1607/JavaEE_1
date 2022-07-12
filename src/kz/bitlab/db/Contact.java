package kz.bitlab.db;

public class Contact {
    private String name;
    private String surname;
    private String age  ;

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public Contact(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

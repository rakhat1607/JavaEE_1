package kz.bitalb.homework_1_2;

public class Users {
    private String name;
    private String surname;
    private String departament;
    private String salary;

    public Users() {
    }

    public Users(String name, String surname, String departament, String salary) {
        this.name = name;
        this.surname = surname;
        this.departament = departament;
        this.salary = salary;
    }

    public String getName() {
        return name;
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

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String  salary) {
        this.salary = salary;
    }
}

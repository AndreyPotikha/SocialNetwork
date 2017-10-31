package fecebook.network.model;

public class User {

    private String name;
    private String surname;
    private int age;
    private String proffesion;

    @Override
    public String toString() {
        return "User"
                + "name: "
                + name
                + " surname: "
                + surname
                + " age: "
                + age;
    }

    public User() {
    }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProffesion() {
        return proffesion;
    }

    public void setProffesion(String proffesion) {
        this.proffesion = proffesion;
    }

    // todo create fields
}

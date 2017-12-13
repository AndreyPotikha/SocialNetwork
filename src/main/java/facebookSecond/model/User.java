package facebookSecond.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbstactEntity{

    private String name;
    private String surname;
    private int age;


    @Override
    public String toString() {
        return "User " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age
                + ", id = " + getId();
    }
  /*  public User() { }*/

   /* public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }*/

   /* public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
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
    }*/
}

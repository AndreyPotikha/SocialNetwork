package tranning.repetition.constructor;

public class Human {

    private String name;
    private String surname;
    private int age;

    public Human() {
        System.out.println("in default Parent constructor");
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        System.out.println("Parent constructor");
    }

    void test() {
        System.out.println("Test");
    }
}

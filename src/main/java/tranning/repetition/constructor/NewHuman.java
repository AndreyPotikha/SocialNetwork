package tranning.repetition.constructor;

public class NewHuman extends Human {

    private String profession;

    public NewHuman() {
        System.out.println("In default child constructor");
    }

    public NewHuman(String name, String surname, int age, String profession) {
        super(name, surname, age);
        this.profession = profession;
        System.out.println(name + " " + surname + " " + age + " " + profession);
    }

    public static void main(String[] args) {
        new NewHuman();
        new NewHuman("Name", "Surname", 20, "developer");
    }

    @Override
    public void test() {
        super.test();
    }
}

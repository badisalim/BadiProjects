package W2.cocreation;

public class Person {

    private String name;

    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void think() {
        System.out.println("I think, therefore I exist.");
    }

    public void introduce() {
        System.out.println("I am " + name);
        System.out.println("I am " + age + " years old.");
    }

}

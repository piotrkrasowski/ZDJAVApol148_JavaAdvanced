package Day03.Reflect.Exercise1;

public class Person <T> {
    private T name;
    private T surname;
    private int age;

    public Person(T name, T surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

}

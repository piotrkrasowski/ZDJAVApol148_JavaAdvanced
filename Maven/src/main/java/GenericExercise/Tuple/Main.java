package GenericExercise.Tuple;

public class Main {
    public static void main(String[] args) {
    stringTest();
    integerTest();
    }
    public static void stringTest() {
        Tuple<String> tuple = new Tuple<>("Testy", "a");
        System.out.println("Left: " + tuple.getLeft());
        System.out.println("Right: " + tuple.getRight());




    }

    public static void integerTest() {
        Tuple<Integer> tuple = new Tuple<>(40,50);
        System.out.println("Left: " + tuple.getLeft());
        System.out.println("Right: " + tuple.getRight());

        System.out.println("Min: " + tuple.getMin());
        System.out.println("Max: " + tuple.getMax());



    }
}

package GenericExercise.Tuple;

public class Main {
    public static void main(String[] args) {
        Tuple<String, String> tuple = new Tuple<>("Test","Jeden");
        System.out.println("Left: "+ tuple.getLeft());
        System.out.println("Right: "+ tuple.getRight());

        tuple.setLeft("Pięć");
        tuple.setRight("Dziewięć");
        System.out.println("Left: "+ tuple.getLeft());
        System.out.println("Right: "+ tuple.getRight());
    }
}

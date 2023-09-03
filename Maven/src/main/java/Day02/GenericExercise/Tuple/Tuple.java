package GenericExercise.Tuple;

public class Tuple <T extends Comparable<T>>  {
    private T left;
    private T right;

    public Tuple(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getLeft() {
        return left;
    }

    public void setLeft(T left) {
        this.left = left;
    }

    public T getRight() {
        return right;
    }

    public void setRight(T right) {
        this.right = right;
    }
    public T getMax() {
        return left.compareTo(right) >= 0? left : right;
    }
    public T getMin() {
        return left.compareTo(right) <= 0? left : right;
    }


}

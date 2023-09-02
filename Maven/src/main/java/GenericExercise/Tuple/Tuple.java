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
        if (right.compareTo(left) >= 0) {
            return right;
        } else {
            return left;
        }
    }
    public T getMin() {
        if (right.compareTo(left) <= 0) {
            return right;
        } else {
            return left;
        }
    }


}

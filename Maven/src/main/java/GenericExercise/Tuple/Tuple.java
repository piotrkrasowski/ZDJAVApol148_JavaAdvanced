package GenericExercise.Tuple;

public class Tuple <T>  {
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
    public Comparable<T> getMin() {
        Comparable<T> leftElement = (Comparable<T>) this.getLeft();
        int result = leftElement.compareTo(this.getRight());
        if (result<=0) {
            return leftElement;
        } else {
            return (Comparable<T>) this.getRight();
        }
    }
    public Comparable<T> getMax() {
        Comparable<T> leftElement = (Comparable<T>) this.getLeft();
        int result = leftElement.compareTo(this.getRight());
        if (result<=0) {
            return (Comparable<T>) this.getRight();
        } else {
            return leftElement;
        }
    }

    @Override
    public String toString() {
        return "Tuple{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}

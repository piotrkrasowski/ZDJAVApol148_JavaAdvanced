package Day03.Reflect;

public class Exercise1 {

    private int item1;
    private double item2;
    private String text;
    private Object object;

    public Exercise1() {
    }

    public Exercise1(int item1, double item2, String text, Object object) {
        this.item1 = item1;
        this.item2 = item2;
        this.text = text;
        this.object = object;
    }

    @SuperMethod(run = true)
    public double addNumber() {
        return item1 + item2;
    }

    public String addStrings(String s1, String s2) {
        return s1 + s2;

    }


}

package kg.geektech.test;

public class CustomMath {

    public String add(int a, int b) {
        return String.valueOf(a + b);
    }

    public String sub(int a, int b) {
        return String.valueOf(a - b);
    }

    public String multiply(int a, int b) {
        return String.valueOf(a * b);
    }

    public String div(int a, int b) {
        if (b == 0) {
            return "нельзя делить на ноль";
        } else {
            return String.valueOf(a / b);
        }
    }
}

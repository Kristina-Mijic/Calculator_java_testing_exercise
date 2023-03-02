package Calculator;

public class Calculator {
    private final double a, b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double saberi() {
        return this.a + this.b;
    }

    public double oduzmi() {
        return a - b;
    }

    public double podeli() {
        return this.a / this.b;
    }

    public double pomnozi() {
        return this.a * this.b;
    }
}

package calc.two;

public class myExeption extends Exception {
    private double result;

    public myExeption(double result) {
        this.result = result;
    }
    public double getResult() {
        return result;
    }
}
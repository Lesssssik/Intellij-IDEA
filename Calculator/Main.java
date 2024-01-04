public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double c = calculator.summa(1, 2);
        Calculator calculator1 = new Calculator();
        double d = calculator1.minus(2, 3);
        Calculator calculator2 = new Calculator();
        double e = calculator2.multiply(3, 5);
        Calculator calculator3 = new Calculator();
        double f = calculator3.divide(6, 3);
        System.out.println(c+"\n"+d+"\n"+e+"\n"+f);
        }

}

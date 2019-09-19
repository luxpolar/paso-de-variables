import ar.com.ada.arithmetic.Arithmetic;
import ar.com.ada.arithmetic.Result;

public class App {
    public static void main(String[] args) {
        Result result1 = new Result();
        Arithmetic arithmetic1 = new Arithmetic();

        arithmetic1.sum(result1, 3.4, 4.1);
        arithmetic1.substraction(result1, 7.0, 3.1);
        arithmetic1.multiplication(result1, 5.0, 8.0);
        arithmetic1.division(result1, 40.0, 5.0);

        System.out.println("Resultado de la suma: " + result1.getResultSum());
        System.out.println("Resultado de la resta: " + result1.getResultSubstraction());
        System.out.println("Resultado de la multiplicación: " + result1.getResultMultiplication());
        System.out.println("Resultado de la división: " + result1.getResultDivision());
    }
}

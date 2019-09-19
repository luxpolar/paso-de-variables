package ar.com.ada.arithmetic;

public class Arithmetic {
    public void sum(Result obj, double a, double b) {
        Double sumResult = a + b;
        obj.setResultSum(sumResult);
    }
    public void substraction(Result obj, double a, double b) {
        Double substractionResult = a - b;
        obj.setResultSubstraction(substractionResult);
    }
    public void multiplication(Result obj, double a, double b) {
        Double multiplicationResult = a * b;
        obj.setResultMultiplication(multiplicationResult);
    }
    public void division(Result obj, double a, double b) {
        Double divisionResult = a / b;
        obj.setResultDivision(divisionResult);
    }
}

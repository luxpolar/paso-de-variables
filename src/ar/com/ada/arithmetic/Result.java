package ar.com.ada.arithmetic;

public class Result {
    private Double resultSum;
    private Double resultSubstraction;
    private Double resultMultiplication;
    private Double resultDivision;

    public Result() {

    }

    public void setResultSum(Double resultSum) {
        this.resultSum = resultSum;
    }
    public void setResultSubstraction(Double resultSubstraction) {
        this.resultSubstraction = resultSubstraction;
    }
    public void setResultMultiplication(Double resultMultiplication) {
        this.resultMultiplication = resultMultiplication;
    }
    public void setResultDivision(Double resultDivision) {
        this.resultDivision = resultDivision;
    }
    public Double getResultSum() {
        return resultSum;
    }
    public Double getResultSubstraction() {
        return resultSubstraction;
    }
    public Double getResultMultiplication() {
        return resultMultiplication;
    }
    public Double getResultDivision() {
        return resultDivision;
    }
}

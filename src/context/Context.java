package context;

import CalcInterface.CalculatorStrategy;

public class Context {
    public CalculatorStrategy calculatorStrategy;

    public Context(CalculatorStrategy calculatorStrategy) {
        this.calculatorStrategy = calculatorStrategy;
    }
    public double calculateNumbers(double num1, double num2){
        return calculatorStrategy.calculate(num1, num2);
    }
}

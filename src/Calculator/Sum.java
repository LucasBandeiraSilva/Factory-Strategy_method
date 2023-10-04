package Calculator;

import CalcInterface.CalculatorStrategy;

public class Sum implements CalculatorStrategy{

    @Override
    public double calculate(double num1, double num2) {
        return num1+num2;
    }
    
}

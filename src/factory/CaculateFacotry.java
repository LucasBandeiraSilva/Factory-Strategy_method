package factory;

import CalcInterface.CalculatorStrategy;
import Calculator.Division;
import Calculator.Multiplication;
import Calculator.Subtraction;
import Calculator.Sum;

public class CaculateFacotry {
    
    public CalculatorStrategy calculatorFactory(String strategy) {
        if("Sum".equalsIgnoreCase(strategy)){
            return new Sum();
        }
        else if("Subtraction".equalsIgnoreCase(strategy)){
            return new Subtraction();
        }else if("multiplication".equalsIgnoreCase(strategy)){
            return new Multiplication();
        }else if("division".equalsIgnoreCase(strategy)){
            return new Division();
        }
        return null;
    }
}

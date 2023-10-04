import CalcInterface.CalculatorStrategy;
import Calculator.Multiplication;
import Calculator.Sum;
import context.Context;
import factory.CaculateFacotry;

public class App {
    public static void main(String[] args) throws Exception {

        //Using only Strategy Method
        Multiplication multiplication = new Multiplication();
        Context multiplicationContext = new Context(multiplication);
        System.out.println("Only Strategy method result: " + multiplicationContext.calculateNumbers(2, 2));


        //Using Facotry Method + Strategy Method
      CaculateFacotry caculateFacotry = new CaculateFacotry();

      CalculatorStrategy sumCalculatorStrategy = caculateFacotry.calculatorFactory("sum");
      Context sumContext = new Context(sumCalculatorStrategy);
      System.out.println("Factory Method + Strategy Method result: " + sumContext.calculateNumbers(2, 2)); 
    }
}

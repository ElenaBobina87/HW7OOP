package model;

import contriller.Example;

public class Calculator implements Sumable, Dividable, Multiplable {
    
    
    public void Calculacion() {
        Example ex = new Example();
        ComplexNumber num1 = ex.GetFirstNum();
        ComplexNumber num2 = ex.GetSecondNum();
        String op = ex.getOperation();
        switch (op) {
            case "S":
                Sum(num1, num2);
                break;
            case "M":
                Multiply(num1, num2);
                break;
            case "D":
                Divide(num1, num2);
                break;
            default:
                System.out.println("Вы ввели неверную операцию");
        }
    }
    

}

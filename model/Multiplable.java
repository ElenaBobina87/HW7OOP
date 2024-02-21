package model;

public interface Multiplable {
    public default void Multiply(ComplexNumber num1, ComplexNumber num2) { 
    double rNum1 = num1.getRPart();
    double cNum1 = num1.getCPart();
    double rNum2 = num2.getRPart();
    double cNum2 = num2.getCPart();
    double resRPart = rNum1 * rNum2 - cNum1 * cNum2;
    double resCPart = cNum1 * rNum2 + rNum1 * cNum2;
    ComplexNumber res = new ComplexNumber(resRPart, resCPart);
    
    System.out.println(num1.toString() + " * " + num2.toString() + " = " + res.toString());
    }
}

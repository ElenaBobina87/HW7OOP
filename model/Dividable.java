package model;

public interface Dividable {
    public default void Divide(ComplexNumber num1, ComplexNumber num2) {
        double rNum1 = num1.getRPart();
        double cNum1 = num1.getCPart();
        double rNum2 = num2.getRPart();
        double cNum2 = num2.getCPart();
        double resRPartUp = rNum1 * rNum2 + cNum1 * cNum2;
        double resCPartUp = cNum1 * rNum2 - rNum1 * cNum2;
        double resDown = rNum2 * rNum2 + cNum2 * cNum2;
        double resRPart = resRPartUp / resDown;
        double resCPart = resCPartUp / resDown;
        ComplexNumber res = new ComplexNumber(resRPart, resCPart);
        
        System.out.println(num1.toString() + " / " + num2.toString() + " = " + res.toString());
    }
}

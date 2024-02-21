package model;

public interface Sumable {

    public default void Sum(ComplexNumber num1, ComplexNumber num2) {
        double rNum1 = num1.getRPart();
        double cNum1 = num1.getCPart();
        double rNum2 = num2.getRPart();
        double cNum2 = num2.getCPart();
        double resRNum = rNum1 + rNum2;
        double resCNum = cNum1 + cNum2;
        ComplexNumber res = new ComplexNumber(resRNum, resCNum);
        
        System.out.println(num1.toString() + " + " + num2.toString() + " = " + res.toString());
    }

    
}

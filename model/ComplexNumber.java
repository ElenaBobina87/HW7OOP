package model;

public class ComplexNumber {
    
    private double rPart;
    private double cPart;

    public ComplexNumber(double rNumber, double cNumber) {
        this.rPart = rNumber;
        this.cPart = cNumber;
    }

    protected double getRPart() {
        return this.rPart;
    }
    
    protected double getCPart() {
        return this.cPart;
    }

    @Override
    public String toString() {
        if (this.cPart > 0) {
            return "(" + String.valueOf(this.rPart) + " " + "+" + " " + String.valueOf(this.cPart) + "i" + ")";
        } else {
            return "(" + String.valueOf(this.rPart) + " " + String.valueOf(this.cPart) + "i" + ")";
        }
        
    }
}

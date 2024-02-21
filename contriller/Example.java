package contriller;



import java.util.Scanner;

import model.ComplexNumber;

public class Example {

    
    Scanner iScanner = new Scanner(System.in);

    public ComplexNumber GetFirstNum() {
        
        ComplexNumber res;
        double rNumber;
        double cNumber;
        String strCPart;
        String strRPart;

        System.out.println("Введите действительную часть первого комплексного числа: ");
        strRPart = iScanner.nextLine();
        rNumber = Double.parseDouble(strRPart);
        System.out.println("Введите мнимую часть первого комплексного числа: ");
        strCPart = iScanner.nextLine();
        
        if (strCPart.charAt(1) == 'i') {
            cNumber = 1;
        } else {
            String cN = "";
            
            for (int i = 1; i < strCPart.length() - 1; i++) {
                cN += strCPart.charAt(i);
            }
            cNumber = Double.parseDouble(cN);
            
        }
        if (strCPart.charAt(0) == '-') {
            cNumber = cNumber * -1;
        }
        
        res = new ComplexNumber(rNumber, cNumber);
        return res;
    } 
    
    public ComplexNumber GetSecondNum() {
       
        ComplexNumber res;
        double rNumber;
        double cNumber;
        String strCPart;
        String strRPart;

        System.out.println("Введите действительную часть второго комплексного числа: ");
        strRPart = iScanner.nextLine();
        rNumber = Double.parseDouble(strRPart);
        System.out.println("Введите мнимую часть второго комплексного числа: ");
        strCPart = iScanner.nextLine();
        if (strCPart.charAt(1) == 'i') {
            cNumber = 1;
        } else {
            String cN = "";
            
            for (int i = 1; i < strCPart.length() - 1; i++) {
                cN += strCPart.charAt(i);
            }
            cNumber = Double.parseDouble(cN);
            
        }
        if (strCPart.charAt(0) == '-') {
            cNumber = cNumber * -1;
        }
        res = new ComplexNumber(rNumber, cNumber);
        return res;
    }

    public String getOperation() {
        System.out.println("Введите S - если хотите сложить числа,");
        System.out.println("Введите M - если хотите умножить числа,");
        System.out.println("Введите D - если хотите первое число разделить на второе.");
        return iScanner.nextLine();
    }

    

    
}

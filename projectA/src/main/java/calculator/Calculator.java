package calculator;


import java.util.Scanner;


public class Calculator {


    
    public int add(int firstNumber, int secondNumber){        
        return firstNumber+secondNumber;
        }

    public int subtract(int firstNumber, int secondNumber){
     	return firstNumber-secondNumber;
     }

    public int multiply(int firstNumber, int secondNumber){
     	return firstNumber*secondNumber;
     }
    
    public int divide(int firstNumber, int secondNumber){
    	return firstNumber/secondNumber;
    }
    
    public static void main(String[] args){

        while(true){

            Calculator calculator = new Calculator();
            Scanner sc = new Scanner(System.in);
            
            int firstNumber = sc.nextInt();
            String operation = sc.next();
            int secondNumber = sc.nextInt();

            if (operation == "+"){calculator.add(firstNumber, secondNumber);}
            if (operation == "-"){calculator.subtract(firstNumber, secondNumber);}
            if (operation == "*"){calculator.multiply(firstNumber, secondNumber);}
            if (operation == "/"){calculator.divide(firstNumber, secondNumber);}

           } 

    }

}
    




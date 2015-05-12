import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.Scanner;


public class Calculator {


    
    public int add(int firstNumber, int secondNumber){        
    	return firstNumber+secondNumber;
        System.out.print(firstNumber+secondNumber);
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

            Scanner sc = new Scanner(System.in);

            int firstNumber = sc.nextInt();
            String operation = sc.next();
            int secondNumber = sc.nextInt();

            if (operation == "+"){add(firstNumber, secondNumber);}
            if (operation == "-"){subtract(firstNumber, secondNumber);}
            if (operation == "*"){multiply(firstNumber, secondNumber);}
            if (operation == "/"){divide(firstNumber, secondNumber);}

           } 

    }

}
    




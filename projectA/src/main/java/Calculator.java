import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


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
    }

}
    




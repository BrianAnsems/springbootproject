import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringBootApp{

	public static void main(String[] args){
        Calculator calculator = new Calculator();
		calculator.add(1,1);
    }

}
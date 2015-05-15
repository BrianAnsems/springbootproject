import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class SumController{

	Calculator calculator = new Calculator();


	@RequestMapping("/sum")
	public int sum(@RequestParam(value="val")int [] valArray){
		return calculator.add(valArray[0],valArray[1]);
	}


        @RequestMapping("/subtract")
	public int subtract(@RequestParam(value="val")int [] valArray){
		return calculator.subtract(valArray[0],valArray[1]);
	}

	@RequestMapping("/multiply")
	public int multiply(@RequestParam(value="val")int [] valArray){
		return calculator.multiply(valArray[0],valArray[1]);
	}
        @RequestMapping("/divide")
	public int divide(@RequestParam(value="val")int [] valArray){
		return calculator.divide(valArray[0],valArray[1]);
	}

	public static void main(String [] args) throws Exception {
		SpringApplication.run(SumController.class, args);
	}

}
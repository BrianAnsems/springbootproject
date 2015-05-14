import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class SumController{

	@RequestMapping(method = RequestMethod.GET)
	public int sum(@RequestParam(value="val")int [] valArray){
		int summed=0;
		for(int i=0; i<valArray.length; i++){
			summed += valArray[i];
		}
		return summed;
	}

	public static void main(String [] args) throws Exception {
		SpringApplication.run(SumController.class, args);
	}

}
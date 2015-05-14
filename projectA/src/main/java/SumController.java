import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class SumController{

	@RequestMapping("/sum")
	public int sum(@RequestParam(value="val")int val){
		return val;
	}

	public static void main(String [] args) throws Exception {
		SpringApplication.run(SumController.class, args);
	}

}
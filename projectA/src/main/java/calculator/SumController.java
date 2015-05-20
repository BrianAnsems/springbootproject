package calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class SumController{

	Calculator calculator = new Calculator();



	@RequestMapping("/sum")
    public String sum(@RequestParam("val") int valOne,@RequestParam("val2") int valTwo, Model model){
        model.addAttribute("answer",calculator.add(valOne,valTwo));
        return "result";
    }


    @RequestMapping("/subtract")
	public String subtract(@RequestParam("val") int valOne,@RequestParam("val2") int valTwo, Model model){
		model.addAttribute("answer",calculator.subtract(valOne,valTwo));
		return "result";
	}

	@RequestMapping("/multiply")
	public String multiply(@RequestParam("val") int valOne,@RequestParam("val2") int valTwo, Model model){
		model.addAttribute("answer",calculator.multiply(valOne,valTwo));
		return "result";
	}
    @RequestMapping("/divide")
	public String divide(@RequestParam("val") int valOne,@RequestParam("val2") int valTwo, Model model){
		model.addAttribute("answer",calculator.divide(valOne,valTwo));
		return "result";
	}


}
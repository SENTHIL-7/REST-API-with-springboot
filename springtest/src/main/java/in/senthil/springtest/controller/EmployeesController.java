package in.senthil.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeesController {
    @RequestMapping(value="/employees" ,method=RequestMethod.GET) 
    @ResponseBody
	public String getEmployee() {
		return "display the Employee details";
	}
}

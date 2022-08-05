package in.senthil.springtest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController// @Controller + @ResponseBody
public class EmployeesController {
    @RequestMapping(value="/employees" ,method=RequestMethod.GET) 
   
	public String getEmployee() {
		return "display the Employee details senthil";
	}
}

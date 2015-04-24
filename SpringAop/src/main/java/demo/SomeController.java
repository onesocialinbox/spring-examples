package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

	@Autowired
	private SomeService someService;
	
	@RequestMapping("/")
	public String someMethod() {
		
		someService.superMethod();
		return "Something";
		
	}
	
}

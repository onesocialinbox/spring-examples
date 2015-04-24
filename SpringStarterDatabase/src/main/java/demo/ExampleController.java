package demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class ExampleController {

	@Autowired
	private UserServiceDao userDao;

	@RequestMapping("/")
	public String helloWorld() {

		return "Hello World!!!";
	}

	@RequestMapping("/users")
	public ModelAndView getAllUsers() {
		List<String> users = userDao.getAllUsers();
		ModelAndView modelView = new ModelAndView("users", "users", users);

		return modelView;
	}

	@RequestMapping("/{name}")
	public String helloWorld(@PathVariable String name) {
		return "Hello !!!" + name;
	}

	@RequestMapping("/simple")
	public ModelAndView simplejsp() {
		ModelAndView modelView = new ModelAndView("simple", "simple", "simple");

		return modelView;
	}

}

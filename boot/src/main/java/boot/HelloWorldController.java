package boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@Autowired
	private Customer cust;
	
	@RequestMapping("/hello/{id}")
	public Customer sayHellow(@PathVariable int id) {
		cust.setId("2");
		cust.setName("vinod");
		cust.setPhone(787979);
		
		return cust;
		
	}

}

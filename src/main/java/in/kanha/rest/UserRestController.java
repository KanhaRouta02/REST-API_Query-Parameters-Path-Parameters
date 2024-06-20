package in.kanha.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.kanha.binding.User;

@RestController
public class UserRestController {

	private Map<Integer, User> map = new HashMap<>();
	
	@PostMapping("/save")
	public String saveUser(@RequestBody User user)
	{
		System.out.println(user);
		
		map.put(user.getId(), user);
		return "saved...";
		
	}
	// Query parameter
//	@GetMapping("/get")
//	public User getById(@RequestParam("id") Integer uid)
//	{
//		User user = map.get(uid); 
//		if(user == null)
//		{
//			return null;
//		}
//		return user;
//	}
	
	// Path parameter
	@GetMapping("/get/{id}")
	public User getByid( @PathVariable  Integer id)
	{
		User user = map.get(id);
		return user;
	}
	
	
	
	
}

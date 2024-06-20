package in.kanha.about;


//===================================
//Query Parameters & Path Parameters
//===================================
//
//=> Query Parameters & Path Parameters are used to send data in URL
//
//
//	QP Ex : https://www.youtube.com/watch?v=8eVaci9WvP8
//
//	PP Ex :  www.ashokitech.com/courses/java
//
//
//Note: When client is sending GET request then client can use Query Params or Path Params to send data to Server
//
//	Ex:  ticket-number, emp-id, book-id, customer-id etc..
//
//Note: GET request will not contain Request Body so we have to use either Query Param or Path Param to send data to server.
//
//
//
//================
//Query Parameters
//================
//
//=> Query Params will represent data in key - value format
//
//=> Query Params will start with '?' symbol
//
//=> Query Params will be seperated using '&' symbol
//
//=> Query Params should present only at end of the URL
//
//=> To read Query Params from URL we will use @RequestParam annotation
//
//
//
//	@GetMapping("/user")
//	public User getUser(@RequestParam("userid") Integer userId) {
//		User user = dataMap.get(userId);
//		return user;
//	}
//
//	URL : http://localhost:8080/user?userid=202&username="kanha";
//
//----------------
//Path Parameters
//----------------
//
//-> To send data to server in the URL
//
//-> Path Param will represent data directley
//
//-> Path Params can present anywhere in the URL
//
//-> Path Param will start with '/' and will be seperated by '/'
//
//-> We need to represent Path Parameters position in the URL pattern like below
//
//			Ex:  @GetMapping("/user/{id}/data")
//
//-> To read Path Parameters we will use @PathVariable annotation
//
//
//	@GetMapping("/user/data/{id}")        
//	public User getUser(@PathVariable("id") Integer userId) {
//		User user = dataMap.get(userId);
//		return user;
//	}
//
//
//	URL : URL : http://localhost:8080/user/data/120

public class Test {

}

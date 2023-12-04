package poc.open.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import poc.open.service.UserService;
import poc.open.entity.User;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/health")
    public String sayHello() {
        
        return "REST API Server up and running";
    }

    @RequestMapping(
        value="/api/add",
        params = {"num1", "num2"},
        method = RequestMethod.GET)
    public String add(@RequestParam Integer num1, @RequestParam Integer num2) {

        String str = "total: " + Integer.toString(num1 + num2);

        System.out.println(str);
        return str;
    }

    @RequestMapping(
        value = "/api/user",
        method = RequestMethod.GET,
        params = {"id"})
    public User getUserById(@RequestParam Long id) {

        String str = ">>>>>>>>> Testing id >>>>>>>>>" + Long.toString(id);
        System.out.println(str);
  
        return userService.getUserById(id);
    }

    @RequestMapping(
        value = "/api/user",
        method = RequestMethod.GET,
        params = {"lastname"})
    public List<User> getUserByLastName(@RequestParam String lastname) {

        String str = ">>>>>>>>> Testing lastname >>>>>>>>>" + lastname;
        System.out.println(str);
  
        return userService.getUserByLastName(lastname);
    }
    
}

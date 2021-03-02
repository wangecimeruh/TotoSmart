package toto.smart.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import toto.smart.repositories.UserInterface;

@Controller
@RestController("/user")
@Slf4j
public class UserController{

    @Autowired
    UserInterface userInterface;


@PostMapping("/create")
 public void create(String userName,String phoneNumber, String email,String password){
    userInterface.create(userName,phoneNumber,email,password);
}

@GetMapping("/adminuser")
public String out(){

    log.info("Hello Hello");
    return "<h1><b>Admin or User</b></h1>";
}

    @GetMapping("/admin")
    public String admin(){

        log.info("Hello Hello");
        return "<h1>Admin</h1>";
    }

    @GetMapping("/user")
    public String all(){
    log.info("Hello Hello");
        return "<h1><b>User</b></h1>";
    }
}

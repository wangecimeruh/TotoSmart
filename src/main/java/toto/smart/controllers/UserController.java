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
 public void create(String name,String phoneNumber, String email,String password){
    userInterface.create(name,phoneNumber,email,password);
}

@GetMapping("/trial")
public String out(){

    log.info("Hello Hello");
    return "Heeeeyyyy over there";
}
}

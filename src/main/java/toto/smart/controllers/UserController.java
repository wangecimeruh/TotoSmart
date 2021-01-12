package toto.smart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import toto.smart.repositories.UserInterface;

@Controller
@RestController("/user")
public class UserController{

    @Autowired
    UserInterface userInterface;


@PostMapping("/create")
 public void create(){
    userInterface.create();
}
}

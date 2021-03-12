package rest.API.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Confirm {

    @GetMapping("/confirm")
    public String confirm(){
        return "Request successful";

    }
}

package rest.API.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import rest.API.repositories.UserInterface;
import rest.API.entities.Customer;

import java.util.Arrays;

@RestController()
@Slf4j
public class UserController{

    @Autowired
    UserInterface userInterface;

    @Autowired
    RestTemplate restTemplate;


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

    @GetMapping("/getHere")
    public String response(){
    return "We got here!!!";
    }


    @GetMapping(value = "/trialSmart")
    public String getProductList() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return restTemplate.exchange("http://localhost:8080/app/rest/v2/entities/starterone_Customer", HttpMethod.GET, entity, String.class).getBody();
    }

        @PostMapping(value = "/saveCustomer")
        public String createProducts(@RequestBody Customer customer) {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<Customer> entity = new HttpEntity<Customer>(customer,headers);

            return restTemplate.exchange(
                    "http://localhost:8080/app/rest/v2/services/starterone_CustomerService/save", HttpMethod.POST, entity, String.class).getBody();
        }


        @DeleteMapping(value = "delete/{id}")
        public String deleteProduct(@PathVariable("id") String id) {
            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            HttpEntity<Customer> entity = new HttpEntity<Customer>(headers);

            return restTemplate.exchange(
                    "http://localhost:8080/app/rest/v2/entities/starterone_Customer"+id, HttpMethod.DELETE, entity, String.class).getBody();
        }
    }



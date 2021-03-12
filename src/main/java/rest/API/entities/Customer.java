package rest.API.entities;

import lombok.Data;

@Data
public class Customer {
    private  String email;
    private String name;
    private String phoneNumber;
    private String plateNumber;
}

package rest.API.entities;
import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
@Table(name = "USERS")
public class Users {
    @Generated
    @Column(name = "ID")
    @Id
    private  int  id;

    @Column(name = "USER_NAME")
    private  String  userName;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "ROLES")
    private String roles;

    @Column(name = "ACTIVE")
    private Boolean active;




}

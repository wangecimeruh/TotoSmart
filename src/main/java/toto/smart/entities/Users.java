package toto.smart.entities;
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
    private  String  name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "PASSWORD")
    private String password;

    @Transient
    @Column(name = "PASSWORD_REAPEAT")
    private String passwordRepeat;


}

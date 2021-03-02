package toto.smart.services;

import org.springframework.stereotype.Service;
import toto.smart.entities.Users;
import toto.smart.repositories.JPA.UserInterfaceJPA;
import toto.smart.repositories.UserInterface;

@Service
public class UserService implements UserInterface {


    private final UserInterfaceJPA userInterfaceJPA;

    public UserService(UserInterfaceJPA userInterfaceJPA) {
        this.userInterfaceJPA = userInterfaceJPA;
    }

    @Override
    public void create(String userName,String phoneNumber, String email, String password) {
        Users user=null;
        user.setUserName(userName);
        user.setPhoneNumber(phoneNumber);
        user.setEmail(email);
        user.setPassword(password);
        userInterfaceJPA.save(user);


    }
}

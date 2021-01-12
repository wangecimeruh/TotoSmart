package toto.smart.services;


import org.springframework.stereotype.Service;
import toto.smart.repositories.JPA.UserInterfaceJPA;
import toto.smart.repositories.UserInterface;

@Service
public class UserService implements UserInterface {


    private final UserInterfaceJPA userInterfaceJPA;

    public UserService(UserInterfaceJPA userInterfaceJPA) {
        this.userInterfaceJPA = userInterfaceJPA;
    }

    @Override
    public void create() {


    }
}

package toto.smart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import toto.smart.entities.MyUserDetails;
import toto.smart.entities.Users;
import toto.smart.repositories.JPA.UserInterfaceJPA;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    UserInterfaceJPA userInterfaceJPA;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

//        return new MyUserDetails(s);

        //you can call your repository method here the jpa one to return what you actually require
        Optional<Users>user = userInterfaceJPA.findByUserName(userName);
        user.orElseThrow(()->new UsernameNotFoundException("User not Found" + userName));

        return user.map(MyUserDetails::new).get();


    }
}

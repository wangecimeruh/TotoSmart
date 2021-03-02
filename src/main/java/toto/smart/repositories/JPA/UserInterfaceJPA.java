package toto.smart.repositories.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toto.smart.entities.Users;

import java.util.Optional;

@Repository
public interface UserInterfaceJPA extends JpaRepository<Users, Integer> {
    Optional<Users> findByUserName(String userName);

}

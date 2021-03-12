package rest.API.repositories.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest.API.entities.Users;

import java.util.Optional;

@Repository
public interface UserInterfaceJPA extends JpaRepository<Users, Integer> {
    Optional<Users> findByUserName(String userName);

}

package toto.smart.repositories.JPA;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toto.smart.entities.Users;

@Repository
public interface UserInterfaceJPA extends JpaRepository<Users, Integer> {
}

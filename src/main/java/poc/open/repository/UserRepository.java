package poc.open.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import poc.open.entity.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>{

    User findById(Long id);

    List<User> findByLastName(String lastname);
    
}

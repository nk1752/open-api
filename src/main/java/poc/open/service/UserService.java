package poc.open.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import poc.open.repository.UserRepository;
import poc.open.entity.User;


import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUserById(Long id) {
        return userRepository.findById(id);
    }

    public List<User> getUserByLastName(String lastname) {
        return userRepository.findByLastName(lastname);
    }
    
}

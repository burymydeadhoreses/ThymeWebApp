package io.github.burymydeadhoreses.thymewebapp.services;

import io.github.burymydeadhoreses.thymewebapp.models.User;
import io.github.burymydeadhoreses.thymewebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> list() {
        return  userRepository.list();
    }
}

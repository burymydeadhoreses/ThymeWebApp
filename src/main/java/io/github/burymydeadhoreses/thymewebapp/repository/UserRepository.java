package io.github.burymydeadhoreses.thymewebapp.repository;

import io.github.burymydeadhoreses.thymewebapp.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> users = new ArrayList<>();

    public UserRepository() {
        users.add(new User("celestialgaze"));
        users.add(new User("burymydeadhoreses"));
        users.add(new User("slizzz"));
    }

    public List<User> list() {
        return List.copyOf(users);
    }
}

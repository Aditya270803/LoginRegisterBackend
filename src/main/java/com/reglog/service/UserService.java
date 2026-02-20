package com.reglog.service;

import java.util.Optional;
import org.springframework.stereotype.Service;
import com.reglog.entity.Users;
import com.reglog.repo.UserRepository;
import com.reglog.requests.LoginRequest;

@Service
public class UserService {

    final UserRepository userrepository;

    public UserService(UserRepository userrepository) {
        this.userrepository = userrepository;
    }

    public Users addUser(Users user) {
        return userrepository.save(user);
    }

    public Boolean loginUser(LoginRequest loginUser) {

        Optional<Users> optionalUser = userrepository.findByEmail(loginUser.getEmail());

        if (optionalUser.isEmpty()) {
            return false;
        }

        Users user = optionalUser.get();

        return user.getPassword().equals(loginUser.getPassword());
    }
}

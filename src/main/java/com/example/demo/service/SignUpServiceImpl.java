package com.example.demo.service;

import com.example.demo.dto.SignUpUserDTO;
import com.example.demo.model.User;
import com.example.demo.model.enums.Role;
import com.example.demo.model.enums.State;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignUpServiceImpl implements SignUpService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void signUp(SignUpUserDTO signUpUserDTO) {

        User user =User.builder()
                .login(signUpUserDTO.getEmail())
                .hashPassword(passwordEncoder.encode(signUpUserDTO.getPassword()))
                .role(Role.USER)
                .state(State.ACTIVE).build();
        userRepository.save(user);

    }
}

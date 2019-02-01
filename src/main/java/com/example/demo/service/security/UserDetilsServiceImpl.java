package com.example.demo.service.security;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.security.configs.detiles.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

public class UserDetilsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
       return new UserDetailsImpl(userRepository.findOneByLogin(login).orElseThrow(IllegalArgumentException::new));
    }
}

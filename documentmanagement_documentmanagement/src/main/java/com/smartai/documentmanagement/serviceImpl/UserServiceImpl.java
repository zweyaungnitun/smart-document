package com.smartai.documentmanagement.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.smartai.documentmanagement.entity.User;
import com.smartai.documentmanagement.repository.UserRepository;
import com.smartai.documentmanagement.service.UserService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    public final UserRepository userRepository;
    @Override
    public User save(User user) {
       return userRepository.save(user);
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User update(Long id,User userDetails) {
        return userRepository.findById(id)
                .map(user -> {
                    user.setName(userDetails.getName());
                    user.setPassword(userDetails.getPassword());
                    user.setEmail(userDetails.getEmail());
                    user.setRole(userDetails.getRole());
                    return userRepository.save(user);
                }).orElseThrow(()-> new RuntimeException("User not found!"));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    
}

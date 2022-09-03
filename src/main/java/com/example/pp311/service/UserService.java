package com.example.pp311.service;



import com.example.pp311.model.User;

import java.util.List;

public interface UserService {

    void save(User user);
    void update(User user);
    void delete(int id);
    User getUser(int id);
    List<User> getAllUser();
}

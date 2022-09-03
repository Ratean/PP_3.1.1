package com.example.pp311.dao;



import com.example.pp311.model.User;

import java.util.List;

public interface UserDAO {

    void save(User user);
    void update(User user);
    void delete(User user);
    User getUser(int id);
    List<User> getAllUser();
}

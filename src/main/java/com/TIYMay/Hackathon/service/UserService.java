package com.TIYMay.Hackathon.service;

import com.TIYMay.Hackathon.model.User;

import java.util.List;

/**
 * Created by duhlig on 8/9/17.
 */
public interface UserService {
    User add(User user);
    User getById(int id);
    List<User> get();
    User update(User user);
    void delete(int id);
}

package Practise5.service;

import Practise5.model.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    void showUsers();
    void removeUser(User user);
    void updateUser(int index, User user);
    List<User> getUsers();
}

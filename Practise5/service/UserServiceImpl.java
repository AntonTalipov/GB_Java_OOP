package Practise5.service;

import Practise5.model.User;
import Practise5.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository userRepository = new UserRepository();
    @Override
    public void saveUser(User user) {
        if(user != null){
            userRepository.saveUser(user);
        }else {
            System.out.println("User is null");
        }
    }
    public void showUsers(){
        userRepository.showUsers();
    }

    @Override
    public void removeUser(User user) {
        if(user != null){
        userRepository.removeUser(user);
    }else {
        System.out.println("User is null");
    }
    }

    @Override
    public void updateUser(int index, User user) {
        if(user != null){
            userRepository.updateUser(index, user);
        }else {
            System.out.println("User is null");
        }
    }

    @Override
    public List<User> getUsers() {
        return userRepository.getUsers();
    }

}

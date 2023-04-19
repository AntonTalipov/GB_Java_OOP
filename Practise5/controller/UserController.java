package Practise5.controller;

import Practise5.model.User;
import Practise5.service.UserService;
import Practise5.service.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

public class UserController {
    private UserService userService = new UserServiceImpl();
//    public void saveUser(String name, int age){
//        userService.saveUser(new User(name, age));
//    }
    public void saveUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data");
        userService.saveUser(new User(scanner.nextLine(), scanner.nextInt()));
    }
    public void showUsers(){
        userService.showUsers();
    }
    public void removeUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for delete");
        userService.removeUser(userService.getUsers().get(scanner.nextInt()));
    }
    public void updateUser(){
        System.out.println("number of change");
        Scanner scanner = new Scanner(System.in);
        System.out.println("New data");
        Scanner scanner1 = new Scanner(System.in);
        userService.updateUser(scanner.nextInt(),(new User(scanner1.nextLine(),scanner1.nextInt())));
    }
    public List<User> getUsers(){
        return userService.getUsers();
    }

}

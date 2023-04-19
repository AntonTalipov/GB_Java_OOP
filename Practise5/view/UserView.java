package Practise5.view;


import Practise5.controller.UserController;
import Practise5.model.User;
import Practise5.repository.UserRepository;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
//        UserController userController = new UserController();
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter your data");
//        userController.saveUser(scanner1.nextLine(), scanner1.nextInt());
//        userController.showUsers();
//        Scanner scanner2 = new Scanner(System.in);
//        userController.saveUser(scanner2.nextLine(), scanner2.nextInt());
//        userController.showUsers();
//        Scanner scanner3 = new Scanner(System.in);
//        userController.removeUser(userController.getUsers().get(scanner3.nextInt()));
//        userController.showUsers();
//        Scanner scanner4 = new Scanner(System.in);
//        userController.saveUser(scanner4.nextLine(), scanner4.nextInt());
//        userController.showUsers();
//        Scanner scanner5 = new Scanner(System.in);
//        Scanner scanner6 = new Scanner(System.in);
//        userController.updateUser(scanner5.nextInt(),(new User(scanner6.nextLine(),scanner6.nextInt())));
//        userController.showUsers();
          UserController userController = new UserController();
          userController.saveUser();
          userController.saveUser();
          userController.saveUser();
          userController.showUsers();
          userController.removeUser();
          userController.showUsers();
          userController.updateUser();
          userController.showUsers();

    }
}

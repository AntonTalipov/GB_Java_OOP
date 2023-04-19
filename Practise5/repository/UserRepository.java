package Practise5.repository;

import Practise5.model.User;


import java.util.ArrayList;
import java.util.List;
//Добавить операции удаления, изменения и вывода пользователей

public class UserRepository<T extends User> {
    private List<User> users = new ArrayList<>();


    public List<User> getUsers() {
        return users;
    }

    public void showUsers(){
        System.out.println(users);
    }

    public void saveUser(User user){
        this.users.add(user);
    }
    public void removeUser(User user){
        users.remove(user);
    }
    public void updateUser(int index, User user){
        users.set(index,user);
    }
//    public void saveUser(User user){
//        try(FileWriter fileWriter = new FileWriter("user.txt", true)){
//            fileWriter.write(user.toString()+" ");
//        }catch (Exception e){
//            System.out.println("error in repo");
//        }
//    }
}

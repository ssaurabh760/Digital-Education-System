/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

import Business.User.User;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author nivcodes
 */
public class UserManager {
    private ArrayList<User> UserList;
    private static int total_user_count=5;
    public UserManager() {
        UserList = new ArrayList<User>();
    }

    public ArrayList<User> getUserList() {
        return UserList;
    }

    public void setUserList(ArrayList<User> UserList) {
        this.UserList = UserList;
    }
    

    private void updateUsercount(){
        total_user_count++;
    }

    public User addNewUser(){
        User newUser = new User();
        newUser.setId(total_user_count);
        updateUsercount();
        UserList.add(newUser);
        return newUser;
               
    }
    
    public int totalUserCount(){
        return UserList.size();
    }
    
    public User validateAssignUser(String name, String password){
        User u = findUserbyName(name);
        if(u.isCorrectPassword(password)){
            return u;
        }
        return null;
    }
    
    public User findUserbyName(String val){
        User us = new User();
        for (User u : UserList){
            if (u.getName().equals(val)){
                us = u;
            }
        }
        return us;
    }
    
    public User findUserbyId(int id){
        User us = new User();
        for (User u : UserList){
            if (u.getId() == id){
                us = u;
            }
        }
        return us;
    }

    public void updateUser(User u){
        User oldUser = findUserbyId(u.getId());
        UserList.remove(oldUser);
        UserList.add(u);
    }
    
    
    public void createAdmin(){
        User u = new User();
        u.setId(1);
        u.setName("admin");
        u.setEmail("admin@email.com");
        u.setRoleAdmin();
        u.updatePassword("password");
        UserList.add(u);
    }
    public void createStudent(){
        User u = new User();
        u.setId(2);
        u.setName("dstudent");
        u.setEmail("student@email.com");
        u.setRoleStudent();
        u.updatePassword("password");
        UserList.add(u);
    }
    public void createProfessor(){
        User u = new User();
        u.setId(3);
        u.setName("dprofessor");
        u.setEmail("professor@email.com");
        u.setRoleProfessor();
        u.updatePassword("password");
        UserList.add(u);
    }
    public void createCauthority(){
        User u = new User();
        u.setId(4);
        u.setName("cauthority");
        u.setEmail("cauthority@email.com");
        u.setRoleCauthority();
        u.updatePassword("password");
        UserList.add(u);
        
    }
    
    public ArrayList<User> getStudentList() {
        ArrayList<User> studentList = (ArrayList<User>) UserList.stream().filter(user -> user.getRole().contains("student")).collect(Collectors.toList());
        return studentList;
    }
    
        public ArrayList<User> getProfessorList() {
        ArrayList<User> professorList = (ArrayList<User>) UserList.stream().filter(user -> user.getRole().contains("professor")).collect(Collectors.toList());
        return professorList;
    }
}

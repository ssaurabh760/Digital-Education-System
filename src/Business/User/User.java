/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.User;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author nivcodes
 */
public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String role;
    private String description;
    private String specialty;
    ArrayList<Integer> rating = new ArrayList<>();
    
    public User() {
        this.name = null;
        this.password = null;
        this.rating.add(0);
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public boolean updateDetails(String n, String e, String d, String ps){
        this.name = n;
        this.email = e;
        this.description = d;
        boolean res = updatePassword(ps);
        return res;
    }
    
    public boolean updatePassword(String ps){
        String psHash = hashPassword(ps);
        if (ps.length() <= 1){
            return false;
        }else{
            this.password = psHash;
            return true;
        }
    }
    
    private String hashPassword(String ps){
        String dgt = null;
        try{
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(ps.getBytes());
            byte[] h = m.digest();
            StringBuilder sb = new StringBuilder(2*h.length);
            for(byte b: h){
                sb.append(String.format("%02x", b & 0xff)); 
            }
            dgt = sb.toString();
        }catch(NoSuchAlgorithmException ex) {
        }
        
        return dgt;
    }
    public boolean islogged(){
        return (name != null);
    }
    
    public boolean isCorrectPassword(String ps){
        if ((ps.length() <= 1) || (password == null)){
            return false;
        }else{
            String psHash = hashPassword(ps);
            boolean res = password.equals(psHash);
            return(res);
        }
    }
    
    public boolean isAdmin(){
        return (this.role.equals("admin"));
    }
    
    public boolean isStudent(){
        return (this.role.equals("student"));
    }

    public boolean isProfessor(){
        return (this.role.equals("professor"));
    }
    
    public boolean isCAuthority(){
        return (this.role.equals("cauthority"));
    }
    
    public boolean isEmployee(){
        return (this.role.equals("employee"));
    }
    
    public void setRoleAdmin(){
        this.role = "admin";
    }
    
    public void setRoleStudent(){
        this.role = "student";
    }
    
    public void setRoleEmployee(){
        this.role = "employee";
    }

    public void setRoleProfessor(){
        this.role = "professor";
    }
    
    public void setRoleCauthority(){
        this.role = "cauthority";
    }
    
    public void updateRole(boolean isProf){
        if (isProf){
            setRoleProfessor();
        }else{
            setRoleStudent();
        }
    }
    
    public String RatingCount(){
        return String.valueOf(this.rating.size());
    }

    public double getRating() {
        List<Integer> ra = new ArrayList<>(this.rating);
        double sum = ra.stream()
                .mapToDouble(a -> a)
                .sum();
        double avg = (sum/this.rating.size());

        
        return Math.round(avg);
    }
    
    public void addRating(int a){
        this.rating.add(a);
    }
    

    public void setRating(ArrayList<Integer> rating) {
        this.rating = rating;
    }
    
    public void generateRatings(){
        ArrayList<Integer> randomList = new ArrayList<>();
        Random random = new Random();
        int min = 1;     // Minimum value (inclusive)
        int max = 100;   // Maximum value (exclusive)
        int size = 20;   // Size of the ArrayList

        for (int i = 0; i < size; i++) {
            int randomInt = random.nextInt(max - min) + min;
            randomList.add(randomInt);
        }

        this.rating.addAll(randomList);
    }
    
    

    @Override
    public String toString() {
        return name;
    }
}

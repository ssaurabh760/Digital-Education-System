/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.User.User;

/**
 *
 * @author nivcodes
 */
public class Company {
    
    String name;
    String location;
    User employee;

    public Company() {
    }

    public Company(String name, String location, User employee) {
        this.name = name;
        this.location = location;
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getEmployee() {
        return employee;
    }

    public void setEmployee(User employee) {
        this.employee = employee;
    }
    
    @Override
    public String toString() {
        return ("Name: " + name + ", location: " + location + ", employee: " + employee);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

/**
 *
 * @author saurabhsrivastava
 */
public class Course {
   private static int total_course_count=1;
   private String coursename;
   private Double price;
   private int credit;
   private String code;
   private int id;

    public Course() {
        this.id = total_course_count;
        total_course_count++;
    }

    public int getId() {
        return id;
    }
    
    

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
 
    @Override
    public String toString() {
        return (coursename);
    }

}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Course.Course;
import java.util.ArrayList;

/**
 *
 * @author saurabhsrivastava
 */
public class CourseCatalog {
    
    private String specialty;
    ArrayList<Course> courselist;
    
    public CourseCatalog(String specialty){
        this.specialty = specialty;
        this.courselist = new ArrayList();
       
    }
    public CourseCatalog(){
        this.courselist = new ArrayList();
    
    
    }
    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public ArrayList<Course> getCourselist() {
        return courselist;
    }

    public void setCourselist(ArrayList<Course> courselist) {
        this.courselist = courselist;
    }
    
   public Course addNewCourse(){
       Course NewCourse = new Course();
       courselist.add(NewCourse);
       return NewCourse;
   }
   
      public void addNewCourse(Course course){
       courselist.add(course);
   }
   
   public Course findCoursebyCode(String c){
       Course ce = new Course();
        for (Course u : courselist){
            if (u.getCode().equals(c)){
                ce = u;
            }
        }
        return ce;
   }
   
   public Course findCoursebyId(int i){
       Course ce = new Course();
        for (Course u : courselist){
            if (u.getId() == i){
                ce = u;
            }
        }
        return ce;
   }
   
   
   public void updateCourse(Course c){
       Course oldC = findCoursebyId(c.getId());
       courselist.remove(oldC);
       courselist.add(c);
       
   }
}

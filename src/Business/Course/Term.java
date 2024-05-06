/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Course.CourseOffering;
import Business.Course.Course;
import Business.User.User;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author saurabhsrivastava
 */
public class Term {
    HashMap<User, ArrayList<Course>> ProfessorCourseMap = new HashMap<>();

    public HashMap<User, ArrayList<Course>> getProfessorCourseMap() {
        return ProfessorCourseMap;
    }

    public void setProfessorCourseMap(HashMap<User, ArrayList<Course>> ProfessorCourseMap) {
        this.ProfessorCourseMap = ProfessorCourseMap;
    }
    
    private String name;
    ArrayList<CourseOffering> colist;

    public Term(String name) {
        this.name = name;
        colist = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        return (name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<CourseOffering> getColist() {
        return colist;
    }

    public void setColist(ArrayList<CourseOffering> colist) {
        this.colist = colist;
    }
     
    public CourseOffering addNewCourseOffering(Course c){
       CourseOffering o = new CourseOffering(c, this);
       colist.add(o);
       return o;
    }
    
    public CourseOffering addNewCourseOffering(Course c, User professor){
       CourseOffering o = new CourseOffering(c, this);
       o.setProfessor(professor);
       colist.add(o);
       return o;
    }
    
    public CourseOffering findCourseOfferingbyId(int i){
        CourseOffering ce = new CourseOffering();
        for (CourseOffering u : colist){
            if (u.getId() == i){
                ce = u;
            }
        }
        return ce;
    }
    
    public CourseOffering findCourseOfferingbyName(String nam){
        CourseOffering ce = new CourseOffering();
        for (CourseOffering u : colist){
            if (u.getCourseName().equals(nam)){
                ce = u;
            }
        }
        return ce;
   }
   
   
    public void updateCourse(CourseOffering c){
       CourseOffering oldC = findCourseOfferingbyId(c.getId());
       colist.remove(oldC);
       colist.add(c);
       
   }
    
}

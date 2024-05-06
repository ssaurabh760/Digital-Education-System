/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Course.Course;
import Business.Feedback;
import Business.User.User;
import java.util.ArrayList;

/**
 *
 * @author saurabhsrivastava
 */
public class CourseOffering {
    private static int total_offer_count=1;
    private int id;
    private String language;
    private boolean subtitle;
    private int ranking;
    ArrayList<Feedback> feedbacks = new ArrayList<>();
    ArrayList<User> students = new ArrayList<>();
    String specialty;

    private String schedule;
    Course course;
    Term term;
    User Professor;
    
    
    public CourseOffering() {
        this.schedule = "Self-paced";
    }

    public CourseOffering(Course course, Term term) {
        this.id = total_offer_count;
        total_offer_count++;
        schedule = "Self-paced";
        this.course = course;
        this.term = term;
        
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public ArrayList<User> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<User> students) {
        this.students = students;
    }
    
    public void addNewStudent(User st){
        students.add(st);
    }
    
    public User findStudent(){
        User us = new User();
        for (User u : students){
            if (u.getId() == id){
                us = u;
            }
        }
        return us;
    }
    
    
    @Override
    public String toString() {
        return (String.valueOf(course));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isSubtitle() {
        return subtitle;
    }

    public void setSubtitle(boolean subtitle) {
        this.subtitle = subtitle;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public Course getCourse() {
        return course;
    }
    
    public String getCourseName(){
        return course.getCoursename();
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    
    
    
    public ArrayList<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(ArrayList<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }
   
    public Feedback addNewFeedback(){
        Feedback f = new Feedback();
        f.setRating(5);
        feedbacks.add(f);
        return f;
    }

    public Term getTerm() {
        return term;
    }

    public void setTerm(Term term) {
        this.term = term;
    }

    public User getProfessor() {
        return Professor;
    }

    public void setProfessor(User Professor) {
        this.Professor = Professor;
    }
    
}

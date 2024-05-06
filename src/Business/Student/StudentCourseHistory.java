/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Course.CourseOffering;
import Business.User.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author nivcodes
 */
public class StudentCourseHistory {
    User student;
    HashMap<CourseOffering, ArrayList<Double>> coursework = new HashMap<>();
    private boolean approved;

    public StudentCourseHistory(User student) {
        this.student = student;
        this.approved = false;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }
    
    public void approveStudent(){
        this.approved = true;
    }
    
    

    public HashMap<CourseOffering, ArrayList<Double>> getCoursework() {
        return coursework;
    }
    
    public ArrayList<CourseOffering> getCourseWork(){
        ArrayList<CourseOffering> keysList = new ArrayList<>();
        keysList.addAll(coursework.keySet());
        return keysList;
    }

    public void setCoursework(HashMap<CourseOffering, ArrayList<Double>> coursework) {
        this.coursework = coursework;
    }

    public void EnrollNewCourse(CourseOffering c){
        ArrayList<Double> i_grade = new ArrayList<>();
        i_grade.add(0.00);
        this.coursework.put(c, i_grade);
    }
    
    public void updateGrade(CourseOffering c, Double g){
        this.coursework.get(c).add(g);
    }
    
    public Double getFinalGrade(CourseOffering c){
        List<Double> marks = new ArrayList<>(this.coursework.get(c));
        double avg = marks.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
        
        return Math.round(avg*100.0)/100.0;
    }
    
    public int getCourseCount(){
        return coursework.size();
    }
    
    public int getcompletedCourseCount(){
        int coursecount = 0;
        for (Map.Entry<CourseOffering, ArrayList<Double>> entry : coursework.entrySet()) {
            
            CourseOffering c = entry.getKey();
            String t_name = c.getTerm().getName();
            if(t_name.contains("Spring")){
                coursecount++;
            }
        }
        return coursecount;
    }
    
    public Double getGPA(){
        int coursecount = coursework.size();
        if (coursecount == 0){
            return 0.0;
        }
        Double total_g = 0.0;
        for (Map.Entry<CourseOffering, ArrayList<Double>> entry : coursework.entrySet()) {
            CourseOffering c = entry.getKey();
            total_g+=getFinalGrade(c);
        }
        return Math.round((total_g/coursecount)*100.0)/100.0;
    }
    
    public Double getGPAfbySem(String term){
        
        
        int coursecount = 0;
        Double total_g = 0.0;
        for (Map.Entry<CourseOffering, ArrayList<Double>> entry : coursework.entrySet()) {
            
            CourseOffering c = entry.getKey();
            String t_name = c.getTerm().getName();
            if(t_name.equals(term)){
                total_g+=getFinalGrade(c);
                coursecount++;
            }
        }
        if (coursecount == 0){
            return 0.0;
        }
        return Math.round((total_g/coursecount)*100.0)/100.0;
    }
    
    public HashMap<String, String> TranscriptbySem(String term){
        HashMap<String, String> t = new HashMap<>();
        for (Map.Entry<CourseOffering, ArrayList<Double>> entry : coursework.entrySet()) {
            CourseOffering c = entry.getKey();
            String t_name = c.getTerm().getName();
            if(t_name.equals(term)){
                t.put(c.getCourseName(), String.format("%.2f",getFinalGrade(c)));
            }
        }
        
        return t;
    }
    
    public ArrayList<Double> generateGrades(){
        ArrayList<Double> randomList = new ArrayList<>();
        Random random = new Random();
        double min = 1.0; // Minimum value
        double max = 10.0; // Maximum value
        int size = 20; // Size of the ArrayList
        
        for (int i = 0; i < size; i++) {
            double randomDouble = min + (max - min) * random.nextDouble();
            randomList.add(randomDouble);
        }
        
        return randomList;
    }
    
    public void setRandomGrades(CourseOffering c){
        this.coursework.put(c, generateGrades());
    }
    
    @Override
    public String toString() {
        return this.student.getName();
    }
}

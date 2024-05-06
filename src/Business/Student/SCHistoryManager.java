/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.User.User;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author nivcodes
 */
public class SCHistoryManager {
    
    HashMap<User, StudentCourseHistory> studentCourseHisList = new HashMap<>();

    public SCHistoryManager() {
    }

    public StudentCourseHistory EnrollNewStudent(User st){
        StudentCourseHistory stch = new StudentCourseHistory(st);
        this.studentCourseHisList.put(st, stch);
        return stch;
    }

    public StudentCourseHistory findHistory(User st){
        return this.studentCourseHisList.get(st);
    }
    
    public void updateHistory(User st, StudentCourseHistory stch){
        studentCourseHisList.put(st, stch);
    }
    
    public HashMap<User, StudentCourseHistory> getStudentCourseHisList() {
        return studentCourseHisList;
    }

    public void setStudentCourseHisList(HashMap<User, StudentCourseHistory> studentCourseHisList) {
        this.studentCourseHisList = studentCourseHisList;
    }
    
}

package com.example.lessontooth.classtask;

import java.util.HashMap;
import java.util.Map;

public class StudentGrade {

    public String name;
    public int age;

    HashMap<String, Double> grades = new HashMap<String, Double>();

    public StudentGrade(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setGrade(String subjectName, Double grade){
        grades.put(subjectName, grade);
    }

    public Map getGrade(){
        return  grades;
    }

    public Double calculateCgpa(){
        Double gradeSum = 0.0;
        Integer countSubject =0;
        for (Double i : grades.values()) {
            gradeSum += i;
            countSubject++;
        }

        Double cgpa = gradeSum/countSubject;

        return  cgpa;
    }


}

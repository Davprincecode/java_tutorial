package com.example.lessontooth.classtask;

public class Student {
    //Student Management: Create a Student class with a constructor for
    //name, age, and grade, plus methods to calculate GPA or display details.

    public String name;
    public int age;
    public double grade;
    public String subjectName;

    public Student(String name, int age, String subjectName, double grade){
      this.name = name;
      this.age = age;
      this.subjectName = subjectName;
     this.grade = grade;
    }

    public void getCgpa(){
     System.out.println(name);
     System.out.println(subjectName + " " +  "==" + " " + grade);
    }


}

package com.example.lessontooth;

import com.example.lessontooth.assignment.BankA;
import com.example.lessontooth.classtask.ModifierClass;
import com.example.lessontooth.classtask.Student;
import com.example.lessontooth.classtask.StudentGrade;
import com.example.lessontooth.classtask.Weather;
import com.example.lessontooth.task3.PhoneBook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;
import java.util.stream.Collectors;

import static org.springframework.util.StringUtils.split;
import static org.springframework.util.StringUtils.toStringArray;

@SpringBootApplication
public class LessontoothApplication {

    public static void main(String[] args) {

        int[] degree = {10, 15, 20, 21, 40, 45, 11, 12};

        Weather temperate = new Weather();

        for (int degreeNumber : degree){
            temperate.setWeather(degreeNumber);
            System.out.println(temperate.getWeather());
        }

        Weather temp = new Weather(20);

        System.out.println(temp.getWeather());


        PhoneBook phone = new PhoneBook();

        phone.setNumber("+234818345646", "dav");
        phone.getNumber();

        Student student = new Student("adeoke sola", 25, "csc 301", 4.5);

        student.getCgpa();

        StudentGrade grade = new StudentGrade("salako ahmed", 30);

        grade.setGrade("csc 301", 60.5);
        grade.setGrade("csc 302", 70.0);
        grade.setGrade("csc 303", 80.0);
        grade.setGrade("csc 304", 90.0);
        grade.setGrade("csc 305", 40.5);

        System.out.println(grade.calculateCgpa());

        System.out.println(grade.getGrade());

        BankA bank = new BankA("2838839", 0.0);
        bank.deposit(1000.0);
        bank.withdraw(100.0);
        bank.balance();
        bank.withdraw(901.0);


    };

}

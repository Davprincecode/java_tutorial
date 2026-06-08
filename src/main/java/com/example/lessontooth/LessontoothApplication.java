package com.example.lessontooth;

import com.example.lessontooth.task3.PhoneBook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class LessontoothApplication {

    public static void main(String[] args) {
//        System.out.println("hello world");
//        SpringApplication.run(LessontoothApplication.class, args);

        //Scanner myObj = new Scanner(System.in);
        //String userName;

        // Enter username and press Enter
        //System.out.println("Enter username");
        //userName = myObj.nextLine();

        //System.out.println("Username is: " + userName);

        //System.out.println("Enter street");
        //String street = myObj.nextLine();

        // System.out.println("Street is: " + street);

//        PhoneBook book = new PhoneBook();
//
//        book.setNumber("8138457885", "obafemi david");
//        book.getNumber();
//
//        book.setNumber("2908292028", "tinubu");
//        book.getNumber();


/*
        List<String> data = new ArrayList();
        data.add("hello");
        data.add("world");

        System.out.println(data.size());

        for(int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        };

        System.out.println("we are good");*/

        //0,1,2,3,4,5 using for loop
        System.out.println("================= task 1 ==============================");
        for (int i = 0; i<=5; i++){
            System.out.println(i);
        }

        //1,2,3,4,5 using for loop
        System.out.println("================= task 2 ==============================");
        for (int i = 1; i<=5; i++){
            System.out.println(i);
        }

        // 0, 5, 10, 15, 20 using for loop
       System.out.println("================= task 3 ==============================");
        for (int x = 0; x <= 20; x+=5){
            System.out.println(x);
        }

        System.out.println("================= example ==============================");

        // Outer loop
        // multiplication table
        for (int i = 1; i <= 4; i++) {

            System.out.println("multiplication table : " + i);
            for (int j = 1; j <= 12; j++) {
                System.out.println( i + " " + "*" + " " + j  + " " + "=" + i * j);
            }

        }

    }

}

package com.example.lessontooth;

import com.example.lessontooth.task3.PhoneBook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class LessontoothApplication {

    public static void main(String[] args) {
//        System.out.println("hello world");
//        SpringApplication.run(LessontoothApplication.class, args);

        Scanner myObj = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();

        System.out.println("Username is: " + userName);

        System.out.println("Enter street");
        String street = myObj.nextLine();

        System.out.println("Street is: " + street);

//        PhoneBook book = new PhoneBook();
//
//        book.setNumber("8138457885", "obafemi david");
//        book.getNumber();
//
//        book.setNumber("2908292028", "tinubu");
//        book.getNumber();


    }

}

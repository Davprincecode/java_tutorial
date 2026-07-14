package com.example.lessontooth;

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

        System.out.println("================= nested for loop ==============================");
        // Outer loop
        // multiplication table
        for (int i = 1; i <= 4; i++) {
            System.out.println("multiplication table : " + i);
            for (int j = 1; j <= 12; j++) {
                System.out.println( i + " " + "*" + " " + j  + " " + "=" + i * j);
            }
        }

        System.out.println("========================== decreament ============");
        // 5,4,3,2,1

        for(int i =5; i >= 1; i--){
           System.out.println(i);
        }

        System.out.println("===============  for each loop ========");

        String[] cars = {"bmw", "toyota", "suv", "highlander", "vold", "volvo"};

        for (String data : cars) {
          System.out.println(data);
        }

        System.out.println("==================calculate the sum of all number in the collection");

        int[] numbers = {2, 5, 6,8,6,5};

        int total = 0;

        for (int data: numbers) {
            //total = total + data;
           total += data;

        }
        System.out.println(total);


        System.out.println("=============================== for-each loop to count how many vowels are in a given word. =====================");

        //for-each loop to count how many vowels are in a given word.

        String myWord = "baby";

        String[] myChar = myWord.split("");
        int count = 0;
        //a,e,i,o,u
        for (String data : myChar) {

            if (data.equals("a") || data.equals("e") || data.equals("i") || data.equals("o") || data.equals("u")){
                count +=1;
            }
        }

        System.out.println(count);

        System.out.println("=============find largest number================");


        int max= 0;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest number: " + max);

        System.out.println(" ============= find even number ================");

        int  divisible = 0;
        for  (int num : numbers) {
            if (num % 2 == 0) {
                divisible++;
                System.out.println(num);

            }
        }

        System.out.println("Reverse string: Use a for-each loop to reverse the characters in a string.");

        String myString = "baby";

        String[] myCharacter = myString.split("");

        List<String> myReverseWord = new ArrayList<>();

        for (String my_char : myCharacter) {
            myReverseWord.add(0, my_char);
        }
        System.out.println(myReverseWord);

        //collection
        // mutable(changeable) and immutable (unchangeable)
        // ordered (well arrange in memory) and unordered (not arrange)
        // duplicate(allow duplicate value) and not duplicate (dont allow dupplicate value)

        System.out.println("============= set questions ==============");
        //Given an array of integers, print only the unique values.
        int[] myNum = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8};

        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int varBle : myNum) {
            uniqueNumbers.add(varBle);
        }

        System.out.println(uniqueNumbers);


        System.out.println("Intersection of sets: Find common elements between two list");

        List<Integer> myNum1 = new ArrayList<>(List.of(1, 2, 6, 8, 8));
        List<Integer> myNum2 = new ArrayList<>(List.of(1, 2, 3, 8, 8));
        myNum1.addAll(myNum2);
        // set
        Set<Integer> notDuplicate = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (Integer iDontKnow : myNum1) {
            if (!notDuplicate.add(iDontKnow)){
                intersectionSet.add(iDontKnow);
            };
        }

        System.out.println(intersectionSet);

     System.out.println("Union of sets: Combine two lists and remove duplicates");

        List<Integer> num1 = new ArrayList<>(List.of(1, 2, 6, 8, 8));
        List<Integer> num2 = new ArrayList<>(List.of(1, 2, 3, 8, 8));
        num1.addAll(num2);

        Set<Integer> unionSet = new HashSet<>();

        for (Integer union : num1){
            unionSet.add(union);
        }
        System.out.println(unionSet);

    };

}

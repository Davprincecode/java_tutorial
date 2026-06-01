package com.example.lessontooth.task3;

public class PhoneBook {

//    store number, store name, get phonenumber , get phonenumber by name , get phoneName by number,

     String userNumber;
     String userName;


    public void setNumber(String userNumber, String userName){
        this.userNumber = userNumber;
        this.userName = userName;
    }

    public void getNumber(){
        System.out.println(this.userNumber);
        System.out.println(this.userName);
    }


}

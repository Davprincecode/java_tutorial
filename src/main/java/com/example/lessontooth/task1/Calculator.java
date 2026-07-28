package com.example.lessontooth.task1;

public class Calculator {
    int[] numbers = {2, 5, 6,8,6,5};
    public  void totalSum(){

        int total = 0;
        for (int data: numbers) {
            total += data;
        }
        System.out.println(total);
    }

    public  void largestNumber(){
        int max= 0;

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number: " + max);
    }

    public void evenNumber(){
        int  divisible = 0;
        for  (int num : numbers) {
            if (num % 2 == 0) {
                divisible++;
                System.out.println(num);
            }
        }
    }


}

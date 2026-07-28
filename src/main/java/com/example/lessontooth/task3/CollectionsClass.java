package com.example.lessontooth.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsClass {
    int[] myNum = {1, 2, 3, 4, 5, 5, 6, 7, 8, 8};
    public void uniqueValue(){
        //Given an array of integers, print only the unique values
        Set<Integer> uniqueNumbers = new HashSet<>();

        for(int varBle : myNum) {
            uniqueNumbers.add(varBle);
        }
        System.out.println(uniqueNumbers);
    }

    public void intersection() {
        System.out.println("Intersection of sets: Find common elements between two list");
        List<Integer> myNum1 = new ArrayList<>(List.of(1, 2, 6, 8, 8));
        List<Integer> myNum2 = new ArrayList<>(List.of(1, 2, 3, 8, 8));
        myNum1.addAll(myNum2);
        Set<Integer> notDuplicate = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();
        for (Integer iDontKnow : myNum1) {
            if (!notDuplicate.add(iDontKnow)){
                intersectionSet.add(iDontKnow);
            };
        }
        System.out.println(intersectionSet);
    }
    public void unionSet(){
        System.out.println("Union of sets: Combine two lists and remove duplicates");
        List<Integer> num1 = new ArrayList<>(List.of(1, 2, 6, 8, 8));
        List<Integer> num2 = new ArrayList<>(List.of(1, 2, 3, 8, 8));
        num1.addAll(num2);
        Set<Integer> unionSet = new HashSet<>();
        for (Integer union : num1){
            unionSet.add(union);
        }
        System.out.println(unionSet);
    }

}

package com.example.lessontooth.task2;

import java.util.ArrayList;
import java.util.List;

public class CharClass {
   public  String myWord = "baby";
    public void charCount(){

        String[] myChar = myWord.split("");
        int count = 0;
        //a,e,i,o,u
        for (String data : myChar) {

            if (data.equals("a") || data.equals("e") || data.equals("i") || data.equals("o") || data.equals("u")){
                count +=1;
            }
        }
        System.out.println(count);
    }

    public  void reverseChar(){

        String[] myCharacter = myWord.split("");

        List<String> myReverseWord = new ArrayList<>();

        for (String my_char : myCharacter) {
            myReverseWord.add(0, my_char);
        }
        System.out.println(myReverseWord);
    }
}

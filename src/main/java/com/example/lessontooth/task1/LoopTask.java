package com.example.lessontooth.task1;

public class LoopTask {

    public void normalLoop(){
        for (int i = 0; i<=5; i++){
            System.out.println(i);
        }
    }
    public void normalDecreaseLoop(){
        for(int i =5; i >= 1; i--){
            System.out.println(i);
        }
    }
    public  void normal2DLoop(){
        for (int i = 1; i <= 4; i++) {
            System.out.println("multiplication table : " + i);
            for (int j = 1; j <= 12; j++) {
                System.out.println( i + " " + "*" + " " + j  + " " + "=" + i * j);
            }
        }
    }

    public void forEachLoop(){
        String[] cars = {"bmw", "toyota", "suv", "highlander", "vold", "volvo"};

        for (String data : cars) {
            System.out.println(data);
        }
    }
}

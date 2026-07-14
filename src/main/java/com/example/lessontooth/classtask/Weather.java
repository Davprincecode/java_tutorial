package com.example.lessontooth.classtask;

public class Weather {


    public String cold = "cold weather";

    public String normal = "normal weather";

    public String tooHot = "Too hot weather";

    public Integer temperatureDegree;

    public Weather(){

    }

    public Weather(Integer degree){
        temperatureDegree = degree;
    }

    public void setWeather(Integer degree){
        temperatureDegree = degree;
    }

    public String getWeather(){
        if (temperatureDegree < 10){
            return  temperatureDegree + "c" + " " + "=" + " " + cold;
        } else if (temperatureDegree <= 25) {
            return   temperatureDegree + "c" + " " + "=" + " " + normal;
        }else {
            return    temperatureDegree + "c" + " " + "=" + " " + tooHot;
        }
    }

}

package com.scaler.introOOP;

public class Student {

    //Data attributes
    public String name;
    public int age;
    public int gradYear;
    public String course;

    void raiseHR(){
        System.out.println("raiseHR");
    }

    private void rateClass(){
        System.out.println("rateClass");
    }

    public  void printDetails(){
        System.out.println("name :" +name);
        System.out.println("age : " +age);
        System.out.println("gradYear: " +gradYear);
        System.out.println("course: " +course);

    }

}

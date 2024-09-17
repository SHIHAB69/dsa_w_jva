package com.sihab.projects;

import java.util.List;

public class Lesson1 {

    public static void main(String[] args) {

            MethodOverLoading sum =  new MethodOverLoading(30, "Anaros","yellow");


    }


    static class MethodOverLoading{

        MethodOverLoading(int age, String name, String color){
                System.out.println(name + " " + color+" " + age);
     }

        MethodOverLoading(int height, String food){
            System.out.println(height + " " + food);
     } MethodOverLoading(int height, List food){
            System.out.println(height + " " + food);
     } MethodOverLoading(int height, double food){
            System.out.println(height + " " + food);
     } MethodOverLoading(int height, float food){
            System.out.println(height + " " + food);
     } MethodOverLoading(int height, int food){
            System.out.println(height + " " + food);
     }

    }












   static class Human{
        String color;
        String name;
        String eyeColor;
        float height;
        int age;
        Human(String color, String name, String eyeColor, float height, int age){
            this.color = color;
            this.height = height;
            this.name = name;
            this.eyeColor = eyeColor;
            this.age = age;
            System.out.println("Constructor is called ");
        }
    }
}

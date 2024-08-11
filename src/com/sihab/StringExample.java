package com.sihab;

public class StringExample {
    public static void main(String[] args) {

//    String msg = greet();
//        System.out.println(msg);
        String personalized = myGreet("Sihab");
        System.out.println(personalized);
    }

     static String myGreet(String greet) {
            String msg = "Hello " + greet;
            return  msg;
    }

    static  String greet(){
        String hi = "hello world";
        return hi;
    }

}

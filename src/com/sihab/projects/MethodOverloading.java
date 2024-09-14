package com.sihab.projects;

public class MethodOverloading {
    public void main(String[] args) {
        Gonit g= new Gonit();
        g.sum(2,3);
    }

    public class Gonit{
        Gonit(int a, int b){

        }
        Gonit(){

        }
        void sum(int a,int b){
            System.out.println(a+" " +b);
        }
        void sum(){
            System.out.println("Funtion called without parameter");
        }

    }
}

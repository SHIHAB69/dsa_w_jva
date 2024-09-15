package com.sihab.projects;

public class ConsTructorOverloading {
    public void main(String[] args) {
        Constructor ct1 = new Constructor();
        Constructor ct2 = new Constructor(12,13);
    }

    public class Constructor{
        Constructor(int a, int b){
            System.out.println(a + " " + b);
        }
        Constructor(){
            System.out.println("Without Parameter Constructor");
        }
    }
}

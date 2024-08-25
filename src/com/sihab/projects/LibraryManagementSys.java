package com.sihab.projects;

import java.util.Scanner;

public class LibraryManagementSys {

    public static void main(String[] args) {

    }

    class Person {
        int id;
        String name;
        String address;
        int phoneNo;
        Scanner in = new Scanner(System.in);

        class Human {
            int id;
            String name;
            String address;
            int phoneNo;
            Scanner in = new Scanner(System.in);

            public Human() {
                id = in.nextInt();
                name = in.next();
                address= in.next();
                phoneNo = in.nextInt();
            }
        }
    }
}


 
 


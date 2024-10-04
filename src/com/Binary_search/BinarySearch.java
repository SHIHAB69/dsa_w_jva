package com.Binary_search;


     class BinarySearch{
         public class jigSaw {
             int instance = 5;
             static int check = 12;

             public void puzzle1(){
                 int rubics = 100;
                 check = 15;
                 System.out.println(rubics);
                 System.out.println(instance);
                 System.out.println(check);

             }
         }

         public class Sudoku extends jigSaw {
             public void puzzle2(){
                 int rubics = 200;
                 instance = 9;
                 System.out.println(rubics);
                 System.out.println(instance);
                 System.out.println(check);
                 instance += 2;
             }
         }

         public class Chess extends Sudoku{
             public void puzzle2(){
                 super.puzzle2();
                 int rubics = 300;
                 System.out.println(rubics);
                 System.out.println(instance);
                 System.out.println(check);
                 instance += 2;
             }
         }

         public void main(String[] args) {
             Chess solve1 = new Chess();
             Chess solve2 = new Chess();

             solve1.puzzle1();
             solve2.puzzle2();
             System.out.println("Instance vvalue after puzzle2" + solve1.instance);

         }
     }








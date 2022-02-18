package com.company;

import java.util.Scanner;


        public class Main {


            public static void main(String[] args) {

                int a,b ;

                double c ;
                Scanner kenar = new Scanner(System.in);

                System.out.print("a kenarını giriniz=");
                a = kenar.nextInt();
                System.out.print("b kenarını giriniz=");
                b = kenar.nextInt();
                c = Math.sqrt((a*a)+(b*b));



                System.out.println("Alan="+(a*b)/2);

                System.out.println("Hipotenüs="+c);
                System.out.println("çevre="+(a+b+c));



    }
}

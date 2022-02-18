package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kubi= new Scanner(System.in);
        double r , pi=3.14;
        System.out.print("Yarıçapı giriniz=");
        r = kubi.nextDouble();
        double alan =r*r*pi;
        double cevre=2*pi*r;
        System.out.println("Dairenin alanı="+alan);
        System.out.println("Dairenin çevresi="+cevre);
    }
}

package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner kubi= new Scanner(System.in);
        double r , pi=3.14 ,a;
        System.out.print("Yarıçapı giriniz=");
        r = kubi.nextDouble();
        System.out.print("merkez açısınını giriniz=");
        a = kubi.nextDouble();
        double alan =r*r*pi;
        double cevre=2*pi*r;
        double daire=(pi*(r*r)*a) / 360;
        System.out.println("Dairenin alanı="+alan);
        System.out.println("Dairenin çevresi="+cevre);
        System.out.println("daire dilimi alanı="+daire);
    }
}

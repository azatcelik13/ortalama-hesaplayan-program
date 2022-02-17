package com.company;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        double kdvtutari ;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutarı giriniz=");
        kdvtutari = input.nextDouble();

        double kdvli = (kdvtutari*0.18+kdvtutari);

        System.out.println("Kdvli tutar="+kdvli);

        System.out.println("Kdvsiz tutar="+kdvtutari);

        System.out.println("KdV ORANI = 0.18");

        System.out.println("Kdv tutari="+kdvtutari*0.18);

    }
}

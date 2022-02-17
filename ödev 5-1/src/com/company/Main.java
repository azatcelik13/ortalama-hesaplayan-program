package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int mat,turkce,fizik,kimya,muzik,tarih;
        Scanner input = new Scanner(System.in);

        System.out.print("mat notunu giriniz=");
        mat = input.nextInt();

        System.out.print("fizik notunu giriniz=");
        fizik = input.nextInt();

        System.out.print("turkce notunu giriniz=");
        turkce = input.nextInt();

        System.out.print("kimya notunu giriniz=");
        kimya = input.nextInt();

        System.out.print("muzik notunu giriniz=");
        muzik= input.nextInt();

        System.out.print("tarih notunu giriniz=");
        tarih = input.nextInt();

        int  toplam = (mat+fizik+kimya+turkce+muzik+tarih);
        double sonuc = toplam/6.0;


        System.out.println("Not ortalamanız: " + sonuc);


        System.out.print("NOT ORTALAMANIZ=" +sonuc);

        System.out.println(sonuc > 60 ? "Sınıfı geçtiniz" : "Sınıfta kaldınız");


    }
}

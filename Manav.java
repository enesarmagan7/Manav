package Letcode;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Manav {

    public static void main(String[] args) {
        double armut=2.14;
        double elma=3.67;
        double domates=1.11;
        double muz=0.95;
        double patlıcan=5.00;
        double total=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Armut kaç kilo ? ");
        double kilo=scan.nextDouble();
        total+=kilo*armut;
        System.out.println("Elma kaç kilo ? ");
        kilo=scan.nextDouble();
        total+=kilo*elma;
        System.out.println("Domates kaç kilo ?");
         kilo=scan.nextDouble();
        total+=kilo*domates;
        System.out.println("Muz kaç kilo ?");
         kilo=scan.nextDouble();
        total+=kilo*muz;
        System.out.println("Patlıcan kaç kilo ?");
         kilo=scan.nextDouble();
        total+=kilo*patlıcan;

        System.out.println("Toplam tutar: "+ total);
    }
}

package com.mycompany.tugas1;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        double r, t;
        final double PHI = 3.14;
        double luasTabung, volTabung;
        
        Scanner scanInput = new Scanner(System.in);
        
        System.out.print("Diameter: ");
        r = scanInput.nextDouble();
        System.out.print("Tinggi: ");
        t = scanInput.nextDouble();
        
        luasTabung = 2 * (PHI * r * r) + (2 * PHI * r * t);
        volTabung = (PHI * r * r) * t;
        
        System.out.println("Luas Tabung = " + luasTabung);
        System.out.println("Volume Tabung = " + volTabung);
    }
}

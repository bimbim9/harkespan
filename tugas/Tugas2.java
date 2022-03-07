package com.mycompany.tugas1;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a, t;
        double luas;
        
        System.out.print("Diameter : ");
        a=input.nextInt();
        System.out.print("Tinggi : ");
        t=input.nextInt();
        
        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
    }  
}
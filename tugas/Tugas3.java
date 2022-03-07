package com.mycompany.tugas1;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
    double k, r, phi = 3.14;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Diameter: ");
    r = scan.nextDouble();
    k = 2 * phi * r;
    System.out.println("Keliling Lingkaran adalah " + String.format("%.2f", k));
  }
}

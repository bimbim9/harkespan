#Tugas PBO Point 2.A

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

#Tugas PBO Point 2.B

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

#Tugas PBO Point 2.C

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

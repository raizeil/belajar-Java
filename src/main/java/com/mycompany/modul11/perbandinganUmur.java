package com.mycompany.modul11;// package modul11
import java.util.Scanner;// import scanner
public class perbandinganUmur {// class perbandinganUmur
    public static void main(String[] args) {// main class
     
     Scanner input = new Scanner(System.in);//  buat inputan scanner baru
     System.out.println("Masukan nama :");// menampilkan "Masukan nama
     String nama1 = input.nextLine();// input variable nama1
     System.out.println("Masukan Umur :");// menampilkan "Masukan umur" 
     int umur1 =input.nextInt(); // input variable umur1
     System.out.println("Masukan nama :");// menampilkan "Masukan nama" 
     String nama2 = input.next();// input variable nama2
     System.out.println("Masukan umur :");// menampilkan "Masukan umur" 
     int umur2 = input.nextInt();// input variable umur2
     if (umur1 < umur2){// jika variabel umur1 lebih kecil dari variabel umur2
            System.out.println(nama2+" lebih tua dari "+ nama1);
            // menampilkan hasil variable nama2 "lebih tua dari" hasil variabel nama1
     }else {// kalo engga menjalankan program dibawah
            System.out.print(nama1+ " lebih tua dari "+ nama2);
            // menampilkan hasil variable nama1 "lebih tua dari" hasil variabel nama2
            } 
    }  
}
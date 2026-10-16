package com.mycompany.modul11;// package modul11
import java.util.Scanner;// import scanner
public class badanIdeal {// class badanIdeal
    public static void main(String[] args) {//main class
        Scanner input = new Scanner(System.in);// buat inputan scanner baru 
        System.out.print("Masukkan Tinggi Badan (cm): ");// menampilkan "Tinggi Badan (cm) :"
        int tinggi = input.nextInt();// input variabel scanner baru 
        System.out.print("Masukkan Berat Badan (kg): ");// menampilkan "Berat Badan (kg):"
        
        int berat = input.nextInt();// buat variabel berat
        int bbi = tinggi - berat;// buat variabel bbi

        if (bbi < 90) {// jika nilai bbi kurang dari 90
            System.out.println("Kurus");// menampilkan "Kurus"
        } else if (90<= bbi && bbi <=110) {
          // jika nilai bbi kurang dari sama 90 dan kurang dari sama 110
            System.out.println("Berat badan ideal");
            // menampilkan "Berat badan ideal"
        } else {// jika nilai bbi lebih dari 110
            System.out.println("Gemuk");// menampilkan "Gemuk"
        }
    }
}

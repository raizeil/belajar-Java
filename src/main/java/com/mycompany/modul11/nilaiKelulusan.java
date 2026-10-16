package com.mycompany.modul11;// package modul11
import java.util.Scanner;// import scanner
public class nilaiKelulusan {// class nilaiKelulusan
    public static void main(String[] args) {// main class
        Scanner scanner = new Scanner(System.in);// buat inputan scanner
        System.out.print("Masukkan nilai: ");// menampilkan "Masukan nilai :"
        int nilai = scanner.nextInt();// input variabel scanner baru 
        String grade;

        if (nilai >= 80) {// jika nilai lebih dari sama 80
            grade = "A For Amazing";// menampilkan "A for Amazing"
        } else if (65 <= nilai && nilai < 80) {
          // jika nilai lebih dari sama 65 dan kurang dari 80
            grade = "B For Biasa aja";// menampilkan "B for Biasa aja"
        } else if (55 <= nilai && nilai < 65) {
          // jika nilai lebih dari sama 55 dan kurang dari 65
            grade = "C For Cumlaude";// menampilkan "C for Cumlaude"
        } else if (50 <= nilai && nilai < 55) {
          // jika nilai lebih dari sama 50 dan kurang dari 55
            grade = "D For Davin";// menampilkan "D for Davin"
        } else {// jika nilai kurang dari 50
            grade = "E For Engeneer";// menampilkan "E for Engeneering"
        }
        System.out.println("Nilai: " + nilai);
        //menampilkan "nilai :" dan variable nilai
        System.out.println("Grade: " + grade);
        //menampilkan "nilai :" dan variable nilai
}}

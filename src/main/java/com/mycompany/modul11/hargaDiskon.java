package com.mycompany.modul11;// package modul11
import java.util.Scanner;// import scanner
public class hargaDiskon {// class hargaDiskon
    public static void main(String[] args) {// main class
        Scanner input = new Scanner(System.in);// buat inputan scanner
        System.out.print("Masukkan jumlah barang: ");
        // menampilkan "Masukan jumlah barang :"
        int jumlahBarang = input.nextInt();//buat variabel jumlahBarang
        int hargaBarang = 100000; // buat variabel Harga per barang
        int totalHarga = jumlahBarang * hargaBarang;// buat variabel total harga 
        
        if (totalHarga >= 1000000) {// jika total harga lebih dari sama 1000000
            double diskon = totalHarga * 0.1; // Diskon 10%
            totalHarga -= diskon;
            System.out.println("Anda mendapatkan diskon 10%!");
            // menampilkan "Anda mendapatkan diskon 10%!"
        }
        System.out.println("Total harga: " + totalHarga);  
        // menampilkan "Total harga: " dengan variabel total harga
    }
}

 
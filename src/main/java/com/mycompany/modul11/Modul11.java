package com.mycompany.modul11;

import java.util.Scanner;

public class Modul11 {

    public static void main(String[] args) {
       System.out.println("Masukan Angka bulat *bukan negatif");

        Scanner input = new Scanner(System.in);
        int values = input.nextInt();
            
            if (values %  2 == 0){
                System.out.print("Genap");
               
            } else {
                System.out.print("Ganjil");
            }
    }
}

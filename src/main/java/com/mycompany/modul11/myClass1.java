package com.mycompany.modul11;// package modul11
public class myClass1 {// class myClass1
    public static void main(String s[]){// main class
 boolean a, b, c;// variabel boolean a, b, c
 a = b = c = true;// a, b, c adalah bernilai benar 
 if( !a || ( b && c ) ){
 // jika negasi a atau (b dan c)dahulu
 System.out.println("If executed");
 //menampilkan variabel a "If executed"
 }else{// jika tidak terjadi negasi a atau (b dan c)dahulu
 System.out.println("else executed");
 //menampilkan variabel a "else executed"
 }
 }
}

package com.syifa.tugas5;

import java.util.Scanner;

public class Soal1 {

        static void cetakKalimat(int jumlahPerulangan) {
        for (int i = 1; i <= jumlahPerulangan; i++) {
            System.out.println("Saya senang belajar bahasa Java");
            }
        }
        
        public static void main(String args[]) {
        Scanner inputObj = new Scanner(System.in);
        
        System.out.print("Masukkan banyak perulangan : ");
        int n = inputObj.nextInt();
       
        cetakKalimat(n);
        }
}

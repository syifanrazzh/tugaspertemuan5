package com.syifa.tugas5;

import java.util.Scanner;

public class Soal2 {

    static int jumlahBilGenap(int batasAwal, int batasAkhir) {
        int jumlah = 0;
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 0) { 
                jumlah += i;
            }
        }
        return jumlah;
    }

    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = inputObj.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = inputObj.nextInt();
  
        System.out.println("Jumlah deret bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + jumlahBilGenap(batasAwal, batasAkhir));
    
    }
}
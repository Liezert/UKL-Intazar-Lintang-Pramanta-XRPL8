package Paket2;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen Fibbonacci: ");
        int jumlahfib = sc.nextInt();

        sc.close();
        
        int angka1 = 0;
        int angka2 = 1;
        
        int countGanjil = 0;
        int countGenap = 0;
        
        System.out.println("Deret fibonacci: ");
        for (int i = 1; i <= jumlahfib; i++) {
            System.out.print(angka1 + " ");
            if (angka1 % 2 == 0) {
                countGenap++;
            } else{
                countGanjil++;
            }

            int angkaselanjutnya;
            angkaselanjutnya = angka1 + angka2;

            angka1 = angka2;
            angka2 = angkaselanjutnya;
        }

        System.out.println("\n");
        System.out.println("Jumlah bilangan Ganjil : " + countGanjil);
        System.out.println("Jumlah bilangan Genap : " + countGenap);
        sc.close();
    }
}

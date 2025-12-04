package Paket2;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Faktorial anda: ");
        int angkaFaktorial = sc.nextInt();

        int hasil = 1;

        for (int i = 1; i <= angkaFaktorial; i++) {
            hasil *= i;
        }

        System.out.println("Hasil dari faktorial " + angkaFaktorial + " adalah: " + hasil);

        sc.close();
    }
}

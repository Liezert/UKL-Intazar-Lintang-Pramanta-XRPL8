package Paket2;

import java.util.Random;
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rndm = new Random();

        int randomAngka = rndm.nextInt(100) + 1;

        int tebakanUser = 0;
        while (tebakanUser != randomAngka) {
            System.out.println("Masukkan angka:");
            tebakanUser = sc.nextInt();
            System.out.println("====================================");
            if (tebakanUser > randomAngka) {
                System.out.println("Angka anda teralalu tinggi!");
            } else if (tebakanUser < randomAngka) {
                System.out.println("Angka anda teralalu rendah!");
            }
            System.out.println("====================================");
            System.out.println("Jawabannya adalah : " + randomAngka );
        }
        System.out.println("Selamat kamu menang!");
        sc.close();
    }
}

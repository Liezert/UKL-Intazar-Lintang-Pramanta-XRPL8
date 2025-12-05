package Paket2;

import java.util.*;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rndm = new Random();

        int randomAngka = rndm.nextInt(100) + 1;

        ArrayList<Integer> riwayat = new ArrayList<>();

        int tebakanUser = 0;
        
        while (tebakanUser != randomAngka) {
            System.out.print("Masukkan angka: ");
            tebakanUser = sc.nextInt();
            riwayat.add(tebakanUser);
            if (tebakanUser > randomAngka) {
                System.out.println("Angka anda teralalu tinggi!");
                System.out.println("====================================");
            } else if (tebakanUser < randomAngka) {
                System.out.println("Angka anda teralalu rendah!");
                System.out.println("====================================");
            }
        }

        System.out.println("Selamat kamu menang!");
        System.out.println("");
        System.out.println("Ini adalah riwayat input anda:");
        for (int i : riwayat) {
            System.out.print(i + " ");
    }
        
        sc.close();
    }
}

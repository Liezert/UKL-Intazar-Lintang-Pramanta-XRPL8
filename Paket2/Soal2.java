package Paket2;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = sc.nextInt();

        for (int i = angka ; i >= 1; i--) {
            if (i == 1) {
                System.out.println( i + ". Saya senang");
            } else {
                int bilanganhasil = i % 4;
                String statement= ""; 
                switch (bilanganhasil) {
                    case 0:
                        statement =("saya anak 33");
                        break;
                    case 1:
                        statement = ("saya anak wikusama");
                        break;
                    case 2:
                        statement = ("saya anak moklet");
                        break;
                    case 3:
                        statement = ("saya anak wikusama");
                        break;
                    }
                    System.out.println(i + ". " + statement);
                }
            }
        sc.close();
    }
}
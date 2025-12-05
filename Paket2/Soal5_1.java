package Paket2;
import java.util.*;

public class Soal5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang mau di input: ");
        int inputAngka = sc.nextInt(),count; 
        
        int [] angkalist = new int[inputAngka];
        HashSet <Integer> counter = new HashSet<>();
        
        for (int i = 0; i < inputAngka; i++) {
            System.out.println( "Masukkan angka ke " + (i + 1) + ": ");
            angkalist[i] = sc.nextInt();
            counter.add(angkalist[i]);
        }
        for (Integer i : counter) {
            count = 0;
            for (Integer j : angkalist) {
                if (i==j) {
                    count++;
                }
            }
            System.out.println("Angka " + i + " muncul " + count + "Kali");
        }
        sc.close();
    }
}


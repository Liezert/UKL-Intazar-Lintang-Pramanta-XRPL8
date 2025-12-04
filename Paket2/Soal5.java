package Paket2;

import java.util.HashMap;
import java.util.Map;

public class Soal5 {

    public static void hitungFrekuensi (int[] arr){
        Map<Integer, Integer> frekuensiMap = new HashMap<>();

        for (int elemen : arr) {
            int hitungan = frekuensiMap.getOrDefault(elemen,0);
            frekuensiMap.put(elemen, hitungan + 1);
        }
        
        for (Map.Entry <Integer, Integer> entry : frekuensiMap.entrySet()) {
            int elemen = entry.getKey();
            int hitungan = entry.getValue();
            System.out.println(elemen + " muncul " + hitungan + " kali");
        }
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 2, 3, 3, 3, 4};
        hitungFrekuensi(arr);
    }
}
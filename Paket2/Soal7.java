package Paket2;

import java.util.*;

public class Soal7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Photobooth: ");
        int jumlahPesananPaket = sc.nextInt();
        sc.nextLine();

        //array
        String[] namaPaket = new String[jumlahPesananPaket];
        int[] biayaProduksi = new int[jumlahPesananPaket];
        int[] hargaJual = new int[jumlahPesananPaket];
        int[] jumlahEvent = new int[jumlahPesananPaket];
        
        int[] totalBiayaProduksi = new int[jumlahPesananPaket];
        int[] totalPendapatan = new int[jumlahPesananPaket];
        int[] labarugi = new int[jumlahPesananPaket];
        String[] status = new String[jumlahPesananPaket];

        int totalNilaiKeleuruhan = 0;
        int labaTertinggi = Integer.MIN_VALUE;
        String namaLabaTertinggi = "";
        
        for (int i = 0; i < jumlahPesananPaket; i++) {
            
            System.out.println("=".repeat(30));
            System.out.print("Masukkan nama paket ke " + (i + 1) + ": ");
            namaPaket[i] = sc.nextLine();
            
            System.out.print("Biaya produksi per event: ");
            biayaProduksi[i] = sc.nextInt();
            
            System.out.print("Biaya jual per bungkus: ");
            hargaJual[i] = sc.nextInt();
            
            System.out.print("Jumlah terjual: ");
            jumlahEvent[i] = sc.nextInt();
            sc.nextLine();

            totalBiayaProduksi[i] = biayaProduksi[i] * jumlahEvent[i]; //B.Produksi * jumlah
            totalPendapatan[i] = hargaJual[i] * jumlahEvent[i]; //Harga * jumlah
            labarugi[i] = totalPendapatan[i] - totalBiayaProduksi[i]; // profit - modal 
            totalNilaiKeleuruhan += labarugi[i];

            if (labarugi[i] > 0) {
                status[i] = "Laba";
            } else if (labarugi[i] < 0) {
                status[i] = "Rugi";
            } else {
                status[i] = "Impas";
            }

            if (labarugi[i] > labaTertinggi) {
                labaTertinggi = labarugi[i];
                namaLabaTertinggi = namaPaket[i];
            }
        }

        System.out.println("\n" + "=".repeat(100));
        System.out.println("Nama Paket Photobooth | Total Biaya Produksi | Total Pendapatan | Laba/Rugi | Status");
        System.out.println("=".repeat(100));

        for (int i = 0; i < jumlahPesananPaket; i++) {
            System.out.printf("%-20s | Rp%,18d | Rp%,14d | Rp%,9d | %s\n",
                namaPaket[i], totalBiayaProduksi[i], totalPendapatan[i], labarugi[i], status[i]);
        }

        System.out.println("=".repeat(100));
        System.out.printf("Total Laba/Rugi Keseluruhan: Rp. %,d\n", totalNilaiKeleuruhan);
        
        if (jumlahPesananPaket > 0) {
            System.out.println("Cookies dengan Laba Tertinggi: " + namaLabaTertinggi + " (Rp" + String.format("%,d", labaTertinggi) + ")");
        } else {
            System.out.println("Tidak ada data Photobooth yang dimasukkan.");
        }
        sc.close();
    }
}
package Paket2;

import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print ("Masukkan nama pelanggan: ");
        String namaPelanggan = sc.nextLine();
        
        System.out.print("Pilih Golongan listrik: ");
        String golonganListrik = sc.next();
        
        int tarif = 0;
        switch (golonganListrik) {
            case "A":
                tarif = 1200;
                break;
        
            case "B":
                tarif = 1500;
                break;
        
            case "C":
                tarif = 1800;
                break;
        
            default:
                System.out.println("Jenis golongan listrik anda tidak tersedia!");
                tarif = 0;
                sc.close();
                return;
        }

        System.out.print("Jumlah pemakaian listrik: ");
        int jumlahListrik = sc.nextInt();

        sc.close();

        int biayaAwal = 0;

        biayaAwal = jumlahListrik * tarif;
        double total = biayaAwal;
        double pajak = 0;

        if (jumlahListrik > 500) {
            pajak = biayaAwal * 0.10;
            System.out.println("Biaya tambahan anda sebesar 10%");
            total = biayaAwal + pajak;
        } else {
            total = biayaAwal;
        }

        //output
        System.out.println("======================================");
        System.out.println("Struk Tarif Biaya Listrik");
        System.out.println("======================================");
        System.out.println("Nama pelanggan: "+ namaPelanggan);
        System.out.println("Goloangan Listrik: " + golonganListrik );
        System.out.println("Pemakaian Listrik: " +  jumlahListrik + "Kwh");
        if (pajak > 0) {
            System.out.println("Total Tagihan Awal: Rp." + biayaAwal);
        }
        System.out.println("Total Tagihan Akhir: Rp." + total);
        System.out.println("======================================");

    }
}

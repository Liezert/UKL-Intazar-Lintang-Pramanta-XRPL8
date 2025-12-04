# UKL-Intazar-Lintang-Pramanta-XRPL8

**Nama: Intazar Lintang Pramanta**
**Kelas: XRPL8**
**Absen: 14**

## Basic mehtod Java

### public static void main(String[] args)
**Kita bedah satu persatu makna dari baris kode ini**
``` java
public static void main(String[] args)
```
**`public`: Agar dapat mengakses dan memanggil method tersebut dari mana saja.**

**`static`: Agar dapat memanggil method tanpa perlu membuat objek dari kelas tersebut.**

**contoh `static`:**
```java
public class Matematika
public static int tambah(int a, int b){
    return a + b; 
}

public static void main(String[] args) {
        int hasilTambah = Matematika.tambah(10, 5);  
        //jadi tinggal memanggil class + variabelnya saja.
        System.out.println("Hasil Tambah: " + hasilTambah);
}
```

**`void`: Method void pada main adalah, dapat menjalankan kode yang ada di `main`, dan sebagai hasil akhir.**

**ada juga fungsi void pada `class` lain, yakni dapat digunakan sebagai pemanggil method yang ada di class `ContohVoid`, lalu di eksekusi di `main`.**

**Contoh `void`:**
``` java
public class ContohVoid {
    public static void salam() {
        System.out.println("Halo! Ini adalah method yang tidak mengembalikan nilai.");
    }

    public static void main(String[] args) {
        salam(); 
        /* Memanggil method void, maka akan otomatis output 
        yang dikeluarkan di dalam method tersebut hanya mencetak */
    }
}
```

**Sedangkan pada non-void, fungsinya kita ubah dalam `main`, contohnya seperti ini:**

```java
public class DemoMethod {
    // METHOD NON-VOID (di sini menggunakan tipe 'int')
    // Tugas: Melakukan perhitungan dan MENGEMBALIKAN hasil.
    // Tanda: Menggunakan tipe data spesifik ('int') dan HARUS memiliki pernyataan 'return'.
    public static int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas; // Wajib mengembalikan nilai bertipe int
    }

    public static void main(String[] args) {
        // --- PENGGUNAAN METHOD NON-VOID ---
        int p = 10;
        int l = 5;
        
        // 1. Menangkap nilai yang dikembalikan dan menyimpannya di variabel baru
        int hasilLuas = hitungLuas(p, l); 
        
        System.out.println("Panjang: " + p + ", Lebar: " + l);
        System.out.println("Hasil Luas (dari method): " + hasilLuas); // Output: 50
    }
}
```

**intinya, non-void memiliki method `return` sebagai pengembalian nilai kepada method `main` yang telah kita panggil.**

**`main`: Ini adalah nama method standar yang telah ditetapkan sebagai  eksekusi program utama, jadi method ini sebagai titik awal sebagai  menjalankan seluruh kode di dalam class.**

**`(String[] args)`: Parameter ini memungkinkan program menerima argumen baris perintah saat program dijalankan.**

## Return pada java
**Lalu terdapat fungsi `return`, yang berfungsi sebagai mengembalikan nilai dari method yang dipanggil**

**Contoh `return` pada Java:**
```java
public int hitungLuas(int panjang, int lebar) {
    int luas = panjang * lebar;
    return luas; 
    // Mengembalikan nilai 'luas' 
    // (contoh juga dari non-void)
}
```

##





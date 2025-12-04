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

**`void`: Agar method ini tidak mengembalikan nilai apa pun kepada JVM setelah program selesai berjalan.**

**Contoh `void`:**
``` java
public class ContohVoid {
    public static void salam() {
        System.out.println("Halo! Ini adalah method yang tidak mengembalikan nilai.");
    }

    public static void main(String[] args) {
        salam(); 
        /* Memanggil method void, maka akan otomatis output 
        apa yang dikeluarkan di dalam method tersebut */
    }
}
```

**`main`: Ini adalah nama method standar yang telah ditetapkan sebagai  eksekusi program utama, jadi method ini sebagai titik awal sebagai  menjalankan seluruh kode di dalam class.**

**`(String[] args)`: Parameter ini memungkinkan program menerima argumen baris perintah saat program dijalankan.**

**`String[]`**





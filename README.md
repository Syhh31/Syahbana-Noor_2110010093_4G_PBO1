# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data ktp menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nik dan nama, dan memberikan output berupa informasi detail dari nik tersebut seperti kode provinsi, kode kota, kode kecamatan, tanggal lahir, bulan lahir, tahun lahir dan no urut pendaftaran.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `KTP`, `KTPData`, dan `KTPMain` adalah contoh dari class.

```bash
public class KTP {
    ...
}

public class KTPData extends KTP {
    ...
}

public class KTPMain {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `ktp[i] = new KTPData(nik, nama);` adalah contoh pembuatan object.

```bash
ktp[i] = new KTPData(nik, nama);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nik` dan `nama` adalah contoh atribut.

```bash
String nik;
String nama;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `KTP` dan `KTPData`.

```bash
public KTP(String nik, String nama) {
    this.nik = nik;
    this.nama = nama;
}

public KTPData(String nik, String nama) {
    super(nik, nama);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNik` dan `setNama` adalah contoh method mutator.

```bash
public void setNik(String nik) {
    this.nik = nik;
}

public void setNama(String nama) {
    this.nama = nama;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNik`, `getNama`, `getKodeProvinsi`, `getKodeKota`, `getKodeKecamatan`,`getTgl_Lahir`,`getBln_Lahir`, `getThn_Lahir`, dan `getKodePendaftaran` adalah contoh method accessor.

```bash
public String getNik() {
    return nik;
}

public String getNama() {
    return nama;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nik` dan `nama` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nik;
private String nama;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `KTPData` mewarisi `KTP` dengan sintaks `extends`.

```bash
public class KTPData extends KTP {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `KTP` merupakan overloading method `displayInfo` dan `displayInfo` di `KTPData` merupakan override dari method `displayInfo` di `KTP`.

```bash
public String displayInfo(String Alamat) {
    return displayInfo() + "\nAlamat: " + Alamat;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getKodeKecamatan` dan seleksi `switch` dalam method `getTgl_Lahir`.

```bash
public String getKodeKecamatan() {
    if(getNik().substring(4, 6).equals("01")){
        return "Banjarmasin Selatan";
    } else {
        return "Banjarmasin lain";
    }

    //return getNik().substring(4, 6).equals("01") ? "Banjarmasin Selatan" : "Banjarmasin lain";
}

public String getTgl_Lahir() {
    switch(getNik().substring(6, 8)) {
	case "01":
                return "Tanggal 1";
            case "02":
                return "Tanggal 2";
            case "03":
                return "Tanggal 3";
            case "04":
                return "Tanggal 4";
            case "05":
                return "Tanggal 5";
            case "06":
                return "Tanggal 6";
            case "07":
                return "Tanggal 7";
            case "08":
                return "Tanggal 8";
            case "09":
                return "Tanggal 9";
            case "10":
                return "Tanggal 10";
            case "11":
                return "Tanggal 11";
            case "12":
                return "Tanggal 12";
            case "13":
                return "Tanggal 13";
            case "14":
                return "Tanggal 14";
            case "15":
                return "Tanggal 15";
            case "16":
                return "Tanggal 16";
            case "17":
                return "Tanggal 17";
            case "18":
                return "Tanggal 18";
            case "19":
                return "Tanggal 19";
            case "20":
                return "Tanggal 20";
            case "21":
                return "Tanggal 21";
            case "22":
                return "Tanggal 22";
            case "23":
                return "Tanggal 23";
            case "24":
                return "Tanggal 24";
            case "25":
                return "Tanggal 25";
            case "26":
                return "Tanggal 26";
            case "27":
                return "Tanggal 27";
            case "28":
                return "Tanggal 28";
            case "29":
                return "Tanggal 29";
            case "30":
                return "Tanggal 30";
            case "31":
                return "Tanggal 31";
            default:
                return "Tanggal Tidak Ada";
	
    }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < ktp.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan NIK ke-" + (i + 1) + ": ");
String nik = scanner.nextLine();

System.out.println("\nData KTP:");
System.out.println(ktp.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `KTPData[] ktp = new KTPData[2];` adalah contoh penggunaan array.

```bash
KTPData[] ktp = new KTPData[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Syahbana Noor
NPM: 2110010093

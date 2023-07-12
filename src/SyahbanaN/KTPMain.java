package SyahbanaN;

import java.util.Scanner;

public class KTPMain {

    public static void main(String[] args) {
        // object
//        KTP ktp = new KTP("6371013108030001", "SYAHBANA NOOR");
//        
//        
//        System.out.println(ktp.displayInfo());
//        System.out.println(ktp.displayInfo("Kelayan"));


        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);

        // array
        KTPData[] ktp = new KTPData[2];

        // perulangan
            for (int i = 0; i < ktp.length; i++) {
                System.out.print("Masukan NIK " + (i + 1) + ": ");
                String nik = scanner.nextLine();
                System.out.print("Masukan Nama " + (i + 1) + ": ");
                String nama = scanner.nextLine();

            // objek
                ktp[i] = new KTPData(nik, nama);
            }

        //perulangan
            for (KTPData data : ktp) {
                System.out.println("");
                System.out.println("=========================");
                System.out.println("Data KTP");
                System.out.println(data.displayInfo());
            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Kesalahan Format NIK : "+e.getMessage());
        }catch (Exception e){
            System.out.println("Kesalahan Umum : "+e.getMessage());
        }
    }
}
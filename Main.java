package com.mycompany.posttest1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> namakomponen = new ArrayList<>();
        ArrayList<Double> hargakomponen = new ArrayList<>(); 
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("*** Daftar Harga Komponen Komputer ***");
            System.out.println("1. Buat List Komponen");
            System.out.println("2. Lihat List Komponen");
            System.out.println("3. Update List Komponen");
            System.out.println("4. Hapus List Komponen");
            System.out.println("5. Hitung Total Harga Komponen");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama komponen: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan harga komponen: ");
                    double harga = input.nextDouble(); 
                    input.nextLine();
                    namakomponen.add(nama);
                    hargakomponen.add(harga);
                    System.out.println("Komponen berhasil ditambahkan");
                    break;

                case 2:
                    System.out.println("=== Daftar Komponen ===");
                    if (namakomponen.isEmpty()) {
                        System.out.println("Kosong");
                    } else {
                        for (int i = 0; i < namakomponen.size(); i++) {
                            System.out.println((i + 1) + ". " + namakomponen.get(i) +
                                    " | Harga: Rp" + String.format("%,.2f", hargakomponen.get(i)));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor komponen yang ingin diupdate: ");
                    int update = input.nextInt();
                    input.nextLine();
                    if (update > 0 && update <= namakomponen.size()) {
                        System.out.print("Masukkan nama baru: ");
                        String namabaru = input.nextLine();
                        System.out.print("Masukkan harga baru: ");
                        double hargabaru = input.nextDouble();
                        input.nextLine();

                        namakomponen.set(update - 1, namabaru);
                        hargakomponen.set(update - 1, hargabaru);

                        System.out.println("Komponen berhasil diupdate");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nomor komponen yang ingin dihapus: ");
                    int hapus = input.nextInt();
                    input.nextLine();
                    if (hapus > 0 && hapus <= namakomponen.size()) {
                        namakomponen.remove(hapus - 1);
                        hargakomponen.remove(hapus - 1);
                        System.out.println("Komponen berhasil dihapus");
                    } else {
                        System.out.println("Nomor tidak valid.");
                    }
                    break;
                    
                case 5:
                    double total = 0;
                    for (int i = 0; i < hargakomponen.size(); i++) {
                        total += hargakomponen.get(i);
                    }
                    System.out.println("Total harga semua komponen: Rp" + String.format("%,.2f", total));
                    break;

                case 6:
                    System.out.println("Babay");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 6);
    }
}
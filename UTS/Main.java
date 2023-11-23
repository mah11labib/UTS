/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {
private static Hewan createHewan(String nama, int jumlahKaki, String suara) {
        return new Hewan(nama, jumlahKaki, suara);
    }

    private static JenisHewanKarnivora createJenisHewan(String nama, int jumlahKaki, String suara, String jenisHewan) {
        return new JenisHewanKarnivora(nama, jumlahKaki, suara, jenisHewan);
    }

    private static Hewan inputHewan(Scanner scanner) {
        System.out.print("Masukkan nama hewan: ");
        String namaHewan = scanner.nextLine();
        System.out.print("Masukkan jumlah kaki hewan: ");
        int jumlahKakiHewan = scanner.nextInt();
        scanner.nextLine(); // konsumsi karakter newline
        System.out.print("Masukkan suara hewan: ");
        String suaraHewan = scanner.nextLine();

        System.out.print("Masukkan jenis hewan karnivora : ");
        String jenisHewanKarnivora = scanner.nextLine();
        if (jenisHewanKarnivora.isEmpty()) {
            return createHewan(namaHewan, jumlahKakiHewan, suaraHewan);
        } else {
            return createJenisHewan(namaHewan, jumlahKakiHewan, suaraHewan, jenisHewanKarnivora);
        }
         
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Hewan> daftarHewan = new ArrayList<>();

        boolean tambahHewan = true;

        while (tambahHewan) {
            Hewan hewan = inputHewan(scanner);
            daftarHewan.add(hewan);
            
            System.out.println("\nInformasi Hewan:");
            System.out.println("Nama: " + hewan.getNama());
            System.out.println("Jumlah Kaki: " + hewan.getJumlahKaki());
            System.out.println("Suara: " + hewan.getSuara());
            hewan.makanan();
            
            if (hewan instanceof JenisHewanKarnivora) {
                JenisHewanKarnivora jenisHewanObj = (JenisHewanKarnivora) hewan;
                System.out.println("Jenis Hewan: " + jenisHewanObj.getJenisHewan());
             }
            scanner.nextLine(); // untuk memberi jarak
            
            daftarHewan.add(hewan);
            
            System.out.print("Tambahkan hewan lain? (y/t): ");
            String jawaban = scanner.nextLine();
            tambahHewan = jawaban.equalsIgnoreCase("y");
            
        }

       // Tampilkan informasi untuk setiap hewan dalam daftar
        for (Hewan hewan : daftarHewan) {
            System.out.println("\nInformasi Hewan:");
            System.out.println("Nama: " + hewan.getNama());
            System.out.println("Jumlah Kaki: " + hewan.getJumlahKaki());
            System.out.println("Suara: " + hewan.getSuara());
            hewan.makanan();
            
            if (hewan instanceof JenisHewanKarnivora jenisHewanObj) {
                System.out.println("Jenis Hewan: " + jenisHewanObj.getJenisHewan());
             }
    }
}
}
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
public class Hewan {
    String nama;
    private int jumlahKaki;
    private String suara;

    public Hewan(String nama, int jumlahKaki, String suara) {
        this.nama = nama;
        this.jumlahKaki = jumlahKaki;
        this.suara = suara;
    }
    public String getNama() {
        return nama;
    }

    public int getJumlahKaki() {
        return jumlahKaki;
    }

    public String getSuara() {
        return suara;
    }


     public void makanan() {
        System.out.println("Makanan : Daging");
}
}
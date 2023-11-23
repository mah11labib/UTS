/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author user
 */
public class JenisHewanKarnivora extends Hewan {
    String jenishewan;

    public JenisHewanKarnivora(String nama, int jumlahKaki, String suara, String jenishewan) {
        super(nama, jumlahKaki, suara);
        this.jenishewan = jenishewan;
    }

    // Override method makanan untuk jenishewankarnivora
    @Override
    public void makanan() {
        System.out.println("Makanan " + nama + " : " + "Daging");
}
    public String getJenisHewan() {
        return jenishewan;
    }
}




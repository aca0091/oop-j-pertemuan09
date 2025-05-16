/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan09;

/**
 *
 * @author Ni Kadek Candra Dewi
 * 2301010091
 * Tgl : 16 mei 2025
 */
public class Pertemuan09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       mhsturunan rahma = new mhsturunan();
        rahma.setNIM("2301010091");
        rahma.setJKEL("P");
        rahma.setNAMA("ACAAAAAAA");
        
        System.out.println("Data mahasiswa");
        System.out.printf("Nama             : %s\n", rahma.nama);
        System.out.printf("Nim              : %s\n", rahma.getNIM());
        System.out.printf("Jenis Kelamin    : %s\n", rahma.getJKEL());
    }
    
}

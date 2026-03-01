/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mimd;

/**
 *
 * @author solthera
 */
public class MIMD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dokumen = "Laporan Tahun";
        
        int[] angka = {10, 20, 30};
        
        Thread task1 = new Thread(() -> {
            System.out.println("Prosesor 1: Mencetak " + dokumen);
        });
        
        Thread task2 = new Thread(() -> {
            int total = 0;
            for (int n : angka) total += n;
            System.out.println("Prosesor 2: Hasil hitung = " + total);
        });
        
        task1.start();
        task2.start();
    }
    
}

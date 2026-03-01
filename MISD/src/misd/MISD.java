/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package misd;

import java.util.Scanner;

/**
 *
 * @author solthera
 */
public class MISD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner suhu = new Scanner(System.in);
        
        System.out.print("Masukan suhu: ");
        final float sensorSuhu = suhu.nextFloat();
        
        // Intruksi 1: Cek Batas Keamanan
        Thread intruksiKeamanan = new Thread(() -> {
           if (sensorSuhu > 100){
               System.out.println("[Instruksi 1] Status: BAHAYA! Suhu terlalu tinggi.");
           } else {
               System.out.println("[Instruksi 1] Status: Suhu normal");
           }
        });
        
        // Intruksi 2: Konversi Satuan
        Thread intruksiSatuan = new Thread(() -> {
           double fahrenheit = (sensorSuhu * 9.0/5.0) + 32;
           System.out.println("[Instruksi 2] Konversi: " + fahrenheit + " F");
        });
        
        // Instruksi 3: Klasifikasi Status
        Thread instruksiLog = new Thread(() -> {
           String kategori = (sensorSuhu < 100) ? "Normal" : "Overheat";
           System.out.println("[Instruksi 3] Kategori: " + kategori);
        });
        
        intruksiKeamanan.start();
        intruksiSatuan.start();
        instruksiLog.start();
        
    }
    
}

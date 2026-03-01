/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simd;

/**
 *
 * @author solthera
 */
public class SIMD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {5, 4, 3, 2, 1};
        int[] c = {3, 2, 4, 1, 5};
        int[] total = new int[a.length];;
        
        for (int i = 0; i < a.length; i++){
            total[i] =  a[i] + b[i] + c[i];
            System.out.println(total[i]);
        }
    }
    
}

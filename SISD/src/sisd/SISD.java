/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sisd;

/**
 *
 * @author solthera
 */
public class SISD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += numbers[i] * 2;
            System.out.println(numbers[i]);
        }
    }
    
}

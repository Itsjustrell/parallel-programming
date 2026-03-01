/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parallel;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author solthera
 */
public class Parallel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        numbers.parallelStream().map(n -> n * n).forEach(result -> System.out.println(Thread.currentThread().getName() + ": " + result));
    }
    
}

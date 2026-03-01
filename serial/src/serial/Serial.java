/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serial;

/**
 *
 * @author solthera
 */
public class Serial {

    /**
     * @param args the command line arguments
     */
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {

            System.out.println("Iteration-" + (left + 1));
            System.out.println("Left index " + left + " = " + input.charAt(left));
            System.out.println("Right index " + right + " = " + input.charAt(right));
            System.out.println("");

            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "kasur ini rusak";

        boolean result = isPalindrome(text);
        System.out.println("Is palindrome? " + result);
    }

}

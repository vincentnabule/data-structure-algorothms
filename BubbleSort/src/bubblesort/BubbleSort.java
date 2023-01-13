/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author Nabuletion
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {9, 7, 2, 1, 5, 0, -1};
        int temp;
        
        System.out.println("Array before sort: "+ Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[j - 1] > numbers[j]) {

                    temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("Array after sort: "+Arrays.toString(numbers));
    }
}

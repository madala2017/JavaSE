package eightfeatures.parallelarraysorting.demo;

import java.util.Arrays;

public class ParallelArraySortingExample {

    public static void main(String[] args) {

        int[] arr = {5,8,1,0,6,9};
        for (int i : arr) {
            System.out.print(i +" ");
        }

        Arrays.parallelSort(arr);
        System.out.println("\nArray slements after sorting");
        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
}

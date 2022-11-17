package org.example;
import java.util.Arrays;


import java.util.Arrays;

public class App {

    public static void main( String[] args )
    {
        System.out.println("Task");
        int[] mas = {3,2,4,5,6};
        System.out.println(Arrays.toString(mas));
        Functions.bubbleSort(mas);
        System.out.println("Sorted it");
        System.out.println(Arrays.toString(mas));
        Functions.binarySearch(mas, 5);
    }

    public static void outPut(int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }

}
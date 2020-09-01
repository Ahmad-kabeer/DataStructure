package com.company;

import org.jetbrains.annotations.NotNull;

public class InsertionSort {
    static void InsertinSortAscending(int[] array){
        System.out.println("Here is your array in ascending order");
        for(int j=1;j< array.length;j++){
            int NewElement=array[j];
            int i;
            for ( i = j; i >0 && NewElement<array[i-1]; i--) {
                array[i]=array[i-1];
            }
            array[i]=NewElement;
        }
        for (int item:array) {
            System.out.print(item+" , ");
        }
    }

    static void InsertinSortDescending(int[] array){
        System.out.println("\nHere is your array in descending order");
        for(int j=1;j< array.length;j++){
            int NewElement=array[j];
            int i;
            for ( i = j; i >0 && NewElement>array[i-1]; i--) {
                array[i]=array[i-1];
            }
            array[i]=NewElement;
        }
        for (int item:array) {
            System.out.print(item+" , ");
        }
    }

    public  static void main(String[] arg){

        int[] arr={34,23,-9,12,456,-5,1};
        InsertinSortAscending(arr);
        InsertinSortDescending(arr);
    }
}

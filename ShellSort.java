package com.company;

public class ShellSort {
    static void ShellSort(int[] array,int length){
        System.out.println("Array in Ascending Order");
        for (int gap =length/2 ; gap >0 ; gap /=2) {
            for (int i = gap; i < length; i++) {
                int NewElement=array[i];
                int j=i;
                while (j>=gap && NewElement<array[j-gap]){
                    array[j]=array[j-gap];
                    j-=gap;
                }
                array[j]=NewElement;
            }
        }
        for (int item:array){
            System.out.print(item+", ");
        }
    }

    public static void main(String[] arg){
        int[] arr={12,7,-9,6,23,11,55};
        ShellSort(arr, arr.length);
    }
}

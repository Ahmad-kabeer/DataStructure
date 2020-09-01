package com.company;

public class SelectionSort {

    static void swap(int[] array,int element1,int element2){
        int temp=array[element1];
        array[element1]=array[element2];
        array[element2]=temp;
    }

    static void SelectionSortAscending(int[] array){
        System.out.println("here is your array in ascending order");
        for(int i=array.length-1;i>0;i--){
            int initial=0;
            for(int j=1;j<=i;j++){
                if(array[initial]<array[j]){
                    initial=j;
                }
                swap(array,initial,i);
            }
        }
        for (int item:array) {
            System.out.print(item+" , ");
        }
    }

    static void SelectionSortDescending(int[] array){
        System.out.println("\nhere is your array in Descending order");
        for(int i=array.length-1;i>0;i--){
            int initial=0;
            for(int j=1;j<=i;j++){
                if(array[initial]>array[j]){
                    initial=j;
                }
                swap(array,initial,i);
            }
        }
        for (int item:array) {
            System.out.print(item+" , ");
        }
    }

    public static void main(String[] arg){
        int[] arr={12,24,4564,11,-5,-12,0};
        SelectionSortAscending(arr);
        SelectionSortDescending(arr);

    }
}

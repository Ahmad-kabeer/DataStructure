package com.company;

import java.util.Scanner;

public class BubbleSort {

    static void BubbleShortAscending(int[] array){
        System.out.println("here is your shorted array in ascending order ");
        for(int j=array.length-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(array[i]>array[i+1]){
                    swap(array,i);
                }
            }
        }
        for(int i=0;i< array.length;i++){
            System.out.print(array[i] +" ");
        }
    }

    static void BubbleShortDescending(int[] array){

        System.out.println("\nhere is your shorted array in Descending order ");
        for(int j=array.length-1;j>0;j--){
            for(int i=0;i<j;i++){
                if(array[i]<array[i+1]){
                    swap(array,i);
                }
            }
        }
        for(int i=0;i< array.length;i++){
            System.out.print(array[i] +" ");
        }
    }
    static void swap(int[] array,int i){
        int temp;
        temp=array[i];
        array[i]=array[i+1];
        array[i+1]=temp;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("please enter the "+ arr.length +" element");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }

        BubbleShortAscending(arr);
        BubbleShortDescending(arr);

    }
}


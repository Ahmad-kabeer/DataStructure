package com.company;

public class QuickSort {
    static  void QuickSort(int[] input,int start,int end){
        if(end-start<2){
            return;
        }
        int pivotIndex=partition(input,start,end);
        QuickSort(input, start, pivotIndex);
        QuickSort(input, pivotIndex+1, end);
    }

    private static int partition(int[] input, int start, int end) {
        int pivot=input[start];
        int i=start;
        int j=end;
        while(i<j){
            while (i<j && input[--j]>=pivot);
            if (i<j){
                input[i]=input[j];
            }
            while (i<j && input[++i]<=pivot);
            if (i<j){
                input[j]=input[i];
            }
        }
        input[j]=pivot;
        return j;
    }


    public static void main(String[] arg){
        int[] arr={56,3,0,12,-1,23,6};
        QuickSort(arr,0, arr.length);

        for (int item:arr) {
            System.out.print(item+" ,");
        }
    }
}

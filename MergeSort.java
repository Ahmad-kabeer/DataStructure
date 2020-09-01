package com.company;

public class MergeSort {
    static void Splitting(int[] input,int start,int end){
        if(end-start<2){
            return;
        }
        int mid=(start+end)/2;
        Splitting(input,start,mid);
        Splitting(input,mid,end);
        Merge(input,start,mid,end);
    }

    static void Merge(int[] input,int start,int mid,int end){
        if(input[mid-1]<=input[mid]){
            return;
        }
        int i=start;
        int j=mid;
        int tempIndex=0;
        int[] temp=new int[end-start];
        while(i<mid && j<end){
            temp[tempIndex++]=input[i]<=input[j]?input[i++]:input[j++];
        }
        System.arraycopy(input, i,input,start+tempIndex,mid-i);
        System.arraycopy(temp,0,input,start,tempIndex);
    }
    public static void main(String[] arg){
        int[] arr={56,3,0,12,-1,23,6};
        int start=0;
        int end= arr.length;
        Splitting(arr,start,end);
        for (int item:arr) {
            System.out.print(item+" ,");
        }
    }
}

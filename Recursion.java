package com.company;

public class Recursion {
    static float FactorialUsingLoop(int value){              // factorial with loop
        int sum=1;
        for (int i = 1; i <=value; i++) {
            sum=sum*i;
        }
        return sum;
    }

    static float FactorialUsingRecursion(int value){
        if(value>=1){
            return value*FactorialUsingRecursion(value-1);
        }
        else{
            return 1;
        }
    }

        public static void main(String[] args) {
        float result=FactorialUsingRecursion(10);
        System.out.println("FactorialUsingRecursion:" +" "+result);
        float result1=FactorialUsingLoop(10);
        System.out.println("FactorialUsingLoop:" +" "+result1);
    }
}

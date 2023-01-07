package com.second_largest;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {8,6,7,4,2,5,1};
        int temp = 0;
        for(int i = 0; i < arr.length; i++) //8//5
        {
            for(int j = i+1; j < arr.length; j++) //
            {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        int a = arr.length - 2;
        System.out.println(Arrays.toString(arr));
        System.out.println("The second largest number is "+arr[a]);
        System.out.println("The second smallest number is "+arr[1]);
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập số tiền: ");
            arr[i] = scanner.nextInt();
        }
        int max=arr[0];
        for(int j=0;j<arr.length;j++)
        {
            if(max<arr[j])
            {
               max=arr[j] ;
            }
        }
        System.out.println("Số tiền lớn nhất là: "+max);
    }
}

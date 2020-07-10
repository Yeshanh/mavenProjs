package com.mycompany.proj.service;

import com.mycompany.proj.core.BubbleSorter;
import com.mycompany.proj.core.InsertionSort;
import com.mycompany.proj.core.SelectSorter;
import com.mycompany.proj.core.Sorter;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GetData {
    public static void main( String[] args )
    {
        int myList[] = new int[]{0,0,0,0,0};
        int result[];
        int result2[];
        int result3[];

        int val;
        int val2;
        int val3;
        int userValue;

        Scanner sc=new Scanner(System.in);
        Sorter bubbleSorter = new BubbleSorter();
        Sorter selectionSorter = new SelectSorter();
        Sorter insertionSorter = new InsertionSort();


        for (int x = 0; x < 5; x++){
            System.out.println("Enter a number");
            userValue = sc.nextInt();
            myList[x] = userValue;
        }


        long start1 = System.nanoTime();
        result = insertionSorter.sort(myList);
        long end1 = System.nanoTime();
        long timeInMillis = TimeUnit.NANOSECONDS.convert(end1 - start1, TimeUnit.NANOSECONDS);

        long start2 = System.nanoTime();
        result2 = bubbleSorter.sort(myList);
        long end2 = System.nanoTime();
        long timeInMillis2 = TimeUnit.NANOSECONDS.convert(end2 - start2, TimeUnit.NANOSECONDS);

        long start3 = System.nanoTime();
        result3 = selectionSorter.sort(myList);
        long end3 = System.nanoTime();
        long timeInMillis3 = TimeUnit.NANOSECONDS.convert(end3 - start3, TimeUnit.NANOSECONDS);


        System.out.println(" Time taken for insertion sort: " + timeInMillis);
        System.out.println(" For insertion sort: ");

        for (int x = 0; x < 5; x++){
            val = result[x];
            System.out.println(String.valueOf(val));
        }

        System.out.println(" Time taken for bubble sort: " + timeInMillis2);
        System.out.println(" For bubble sort: ");

        for (int x = 0; x < 5; x++){
            val2 = result2[x];
            System.out.println(String.valueOf(val2));
        }

        System.out.println(" Time taken for selection sort: " + timeInMillis3);
        System.out.println(" For selection sort: ");
        for (int x = 0; x < 5; x++){
            val3 = result3[x];
            System.out.println(String.valueOf(val3));
        }

    }


}

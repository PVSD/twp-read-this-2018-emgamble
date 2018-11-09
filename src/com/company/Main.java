package com.company;
import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args)throws IOException {

        Scanner s = new Scanner(new File("Imports.txt" ));
        int maxIndex = -1;

        String fName [] = new String[30];
        String lName [] = new String[30];
        int abs [] = new int [30];
        int grades [] = new int[30];


        s.nextLine();
        while(s.hasNext()) {
            maxIndex++;
            fName[maxIndex] = s.next();
            lName[maxIndex] = s.next();
            grades[maxIndex]= s.nextInt();
            abs[maxIndex]= s.nextInt();
        }


        int sum = 0;
        for(int a : grades)
            sum = sum + a;
        int average = (sum/grades.length);
        System.out.println("The class average is a " + average + "%");


        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;
        for(int i : grades){
            if (i >= 90)
                A++;
            else if (i >= 80)
                B++;
            else if (i >= 70)
                C++;
            else if (i >= 60)
                D++;
            else
                F++;
        }
        System.out.println("There are " + A + "A's"+ B + "B's"+
                C + "C's"+ D + "D's"+ F + "F's");




    }
}

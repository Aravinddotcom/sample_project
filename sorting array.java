package com.opencodeonce;

//find the any number of largest element in array
import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number;
        int temp;
        number=sc.nextInt();
        int array[]=new int[number];

        for(int i=0;i<number;i++){
            array[i]=sc.nextInt();
        }

        //sorting the order
        for(int i=0;i<number;i++){
            for(int j=i+1;j<number;j++){
                if(array[i]<array[j]){
                    //swaping
                temp=array[i];  //storing array[i] values in temp
                array[i]=array[j]; //storing array[j] values in array[i]
                array[j]=temp; //storing temp value in array[j]
                }
            }
            System.out.print(array[i]+",");
        }
        System.out.println(" ");
        System.out.println("The largest element: "+array[1]);
    }
}
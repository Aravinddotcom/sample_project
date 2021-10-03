package com.opencodeonce;
 import java.util.*;
 public class Main {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the age:");
         int age =sc.nextInt();
         boolean iseligible= age>=18 && age<24;
         System.out.println("Did I Eligible :"+iseligible);

     }
 }
package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // setting an array of length-10.

        String[]item = new String[10];
        String temp = " ";

        System.out.println("Enter your words");
        for(int i =0; i<10; i++){

            temp = sc.nextLine();

            if(temp .equalsIgnoreCase("history")){
                for(int j = 0; j<i ; j++){
                    System.out.println(item[j]);
                }
            }else{
                item[i]= temp;
            }

        }


    }
}

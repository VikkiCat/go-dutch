package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        int billAmount;
        int person;
        int partToPay;

        Scanner scan = new Scanner(System.in);
        billAmount = scan.nextInt();
        person = scan.nextInt();

        if(billAmount<0){
            System.out.println("Bill total amount cannot be negative");
        }
        if(person<=0){
            System.out.println("Number of friends cannot be negative or zero");
        }
        if(billAmount>=0&&person>0)  {
            billAmount += (10*billAmount)/100;
            partToPay = billAmount/person;
            System.out.println(partToPay);
        }
    }
}

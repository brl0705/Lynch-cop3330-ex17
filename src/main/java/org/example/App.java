package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Are you a Male or Female? (M/F)");
        String gender = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("How many ounces of alcohol did you have?");
        int ounces = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("How much do you weigh?");
        int weight = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.println("How many hours since your last drink?");
        int time = input4.nextInt();

        double x=ounces*5.14;
        double z=.015*time;

        if(gender.equals("M")){
            double my=weight*.73;
            double temp = x/my;
            double bac = temp - z;
            if(bac < 0.08){
                System.out.println("You can legally drive. With a bac of " + bac);
            }
            else{
                System.out.println("You cannot legally drive. With a bac of "+ bac);
            }


        }
        else if(gender.equals("F")){
            double fy=weight*.66;
            double temp = x/fy;
            double bac = temp - z;
            if(bac < 0.08){
                System.out.println("You can legally drive. With a bac of " +bac);
            }
            else{
                System.out.println("You cannot legally drive. With a bac of " +bac);
            }

        }
    }
}

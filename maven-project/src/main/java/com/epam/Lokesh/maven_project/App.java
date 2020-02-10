package com.epam.Lokesh.maven_project;

import com.epam.Lokesh.maven_project.chocolates.Chocolate;
import com.epam.Lokesh.maven_project.chocolates.Cadbury;
import com.epam.Lokesh.maven_project.chocolates.BarChocolate;
import com.epam.Lokesh.maven_project.chocolates.Galaxy;
import com.epam.Lokesh.maven_project.gift.Gift;
import com.epam.Lokesh.maven_project.sweets.Sweets;
import com.epam.Lokesh.maven_project.sweets.Gulabjamun;
import com.epam.Lokesh.maven_project.sweets.SabudanaSweet;
import com.epam.Lokesh.maven_project.sweets.Rasmalai;
import com.epam.Lokesh.maven_project.sweets.Rajbhog;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choice;
        Scanner io=new Scanner(System.in);
        System.out.println("Getting chocolates....");
        Chocolate chocolate1=new Cadbury("Cadbury Dairy Milk",60,20);
        Chocolate chocolate2=new BarChocolate("Barone",30,20);
        Chocolate chocolate3=new Galaxy("Galaxy",50,20);
        System.out.println("Getting Sweets....");
        Sweets sweets1=new Gulabjamun("Gulabjamun",300,200);
        Sweets sweets2=new SabudanaSweet("SabudanaSweet",300,100);
        Sweets sweets3=new Rasmalai("Rasmalai",300,100);
        Sweets sweets4=new Rajbhog("Rajbhog",400,100);
        Gift gift=new Gift();
        gift.addChocolates(chocolate1,chocolate2,chocolate3);
        gift.addSweets(sweets1,sweets2,sweets3,sweets4);
        System.out.println("Sorting items in gift according to price");
        gift.sort();
        System.out.println("Total Weight of Gifts : "+gift.findTotalWeight());
        do
        {
        	System.out.println("<==============Happy New Year Gifts=============> ");
            System.out.println("Enter '1' to view all candies : ");
            System.out.println("Enter '2' to view all sweets : ");
            System.out.println("Enter '3' to know most expensive chocolate and sweets : ");
            choice=io.nextInt();
            switch(choice)
            {
                case 1:
                ArrayList<Chocolate> arrayList=gift.getChocolates();
                for (Chocolate c:arrayList) {
                    System.out.println(c.toString());
                }
                break;
                case 2:
                ArrayList<Sweets> arrayList1=gift.getSweets();
                for (Sweets s:arrayList1){
                    System.out.println(s.toString());
                }
                break;
                case 3:
                System.out.println("The Expensive Chocolate : "+mostExpensive(gift.getChocolates()));
                System.out.println("The Expensive Sweet : "+mostExpensive(gift.getSweets()));
                default:
                System.out.println("Please enter a valid option!!");
                break;
            }
        }
        while(choice < 4);
        io.close();
    }
    private static <T> String mostExpensive(ArrayList<T> arrayList){
        return arrayList.get(0).toString();
    }
}
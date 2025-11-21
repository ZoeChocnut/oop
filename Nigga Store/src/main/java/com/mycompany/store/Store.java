/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.store;

/**
 *
 * @author ZoeFortuno
 */



import java.util.*;

public class Store {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Inventory i=new Inventory();
        int x=0;

        while(true){
            System.out.println("1 order");
            System.out.println("2 see order");
            System.out.println("3 finalize");
            System.out.println("4 add from store");
            System.out.println("5 see store");
            System.out.println("6 exit");
            System.out.print("> ");
            try{x=Integer.parseInt(s.nextLine());}catch(Exception e){}

            if(x==1){
                System.out.print("name: ");
                String n=s.nextLine();
                System.out.print("qty: ");
                int q=Integer.parseInt(s.nextLine());
                i.ord(n,q);
            } else if(x==2){
                i.seeOrd();
            } else if(x==3){
                i.fin();
            } else if(x==4){
                System.out.print("name: ");
                String n=s.nextLine();
                System.out.print("qty: ");
                int q=Integer.parseInt(s.nextLine());
                i.add(n,q);
            } else if(x==5){
                i.see();
            } else if(x==6){
                break;
            } else{
                System.out.println("???");
            }
        }
    }
}


package com.mycompany.store;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ZoeFortuno
 */



import java.util.*;

public class Inventory {
    HashMap<String,Integer> sup=new HashMap<>();
    HashMap<String,Integer> st=new HashMap<>();

    public void ord(String x,int y){
        if(y<=0)return;
        if(sup.containsKey(x)){
            sup.put(x,sup.get(x)+y);
        } else{
            sup.put(x,y);
        }
    }

    public void seeOrd(){
        if(sup.isEmpty()){
            System.out.println("none");
        } else{
            for(String k:sup.keySet()){
                System.out.println(k+" "+sup.get(k));
            }
        }
    }

    public void fin(){
        if(sup.isEmpty()){
            System.out.println("no orders");
            return;
        }
        for(String k:sup.keySet()){
            int z=sup.get(k);
            if(st.containsKey(k)){
                st.put(k,st.get(k)+z);
            } else{
                st.put(k,z);
            }
        }
        sup.clear();
        System.out.println("final ok");
    }

    public void add(String a,int b){
        if(b<=0)return;

        if(!st.containsKey(a)){
            System.out.println("none in store");
            return;
        }

        int z=st.get(a);

        if(b>z){
            System.out.println("not enough "+a+" have "+z);
            return;
        }

        st.put(a,z-b);
        System.out.println("took "+b+" left "+(z-b));
    }

    public void see(){
        if(st.isEmpty()){
            System.out.println("empty");
            return;
        }
        for(String h:st.keySet()){
            System.out.println(h+" = "+st.get(h));
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dado;

/**
 *
 * @author alex
 */
public class NewMain {
    private static byte f;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        f=9;
        Dado d1 = new Dado(f);
        Dado d2 = new Dado();
        for (int i = 0; i < 100; i++) {
            System.out.println(d1.lancio()+"/"+d2.lancio());
        }
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(d2.equals(d1));
    }
    public static void tet(){
        System.out.println(f);
    }
        public void test(){
        System.out.println(f-5);
    }

}
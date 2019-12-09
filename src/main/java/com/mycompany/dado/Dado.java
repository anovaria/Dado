/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dado;
import java.util.Random;
/**
 *
 * @author alex
 */
public class Dado {
    private byte numeroFacce;
    private Random random ;
    public Dado(){
        //numeroFacce=6;
        // per chiamare un altro costruttore con stesso nome si usa this 
        this((byte)6);
        
    }
    public Dado(byte numeroFacce) {
        random = new Random();
        this.numeroFacce = numeroFacce;
    }
    public byte lancio(){

        return (byte) (random.nextInt(numeroFacce)+1);
    }

    @Override
    public String toString() {
        return "NUM. FACCE:"+numeroFacce;

    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.numeroFacce;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dado other = (Dado) obj;
        return this.numeroFacce == other.numeroFacce; 
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.capitulo3.constructores;

/**
 *
 * @author T
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Pelicula p=new Pelicula();
     //p.setTitulo("Dracula endemoniado");
     //p.setDuracion(120);
     System.out.println(p.getTitulo());
     System.out.println(p.getDuracion());
    }
    
}

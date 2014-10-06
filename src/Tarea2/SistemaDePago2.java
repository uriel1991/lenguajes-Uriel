/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;
import com.capitulo1.abstraccion.*;
import Tarea2.Usuario;
import Tarea2.Pago;

/**
 *
 * @author Uriel
 */
public class SistemaDePago2 {
    public static void main(String args[]){
     Usuario u = new Usuario();
     u.setNombre("Jorge");
     u.setHorasTrabajadas(70);
     u.setSueldo(4000); 
     Pago p=new Pago();
     p.hacerPago(u);
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2;

/**
 *
 * @author Uriel
 */
public class Pago {
    public float hacerPago(Usuario u){
        
        float pago=u.getHorasTrabajadas()*u.getSueldo();
        System.out.println("Quincena pagada a:"+u.getNombre() +", por la cantidad mensual de : "+pago);
        return pago;
        
    }
    
}

package com.mycompany.itv;

import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VictorNavajas-Alumno
 */
public class VehiculoComparator implements Comparator <Vehiculo> {
    
    @Override
    public int compare(Vehiculo Vehiculo1,Vehiculo Vehiculo2){
         String p1 = String.valueOf(Vehiculo1.getPrioridad());
         String p2 = String.valueOf(Vehiculo2.getPrioridad());
        return p1.compareTo(p2);
    }
    
}

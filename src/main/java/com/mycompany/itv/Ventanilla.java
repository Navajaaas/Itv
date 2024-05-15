package com.mycompany.itv;


import com.mycompany.itv.Vehiculo;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VictorNavajas-Alumno
 */
public class Ventanilla { 
    public PriorityQueue<Vehiculo> colaVehiculos;
    
    public Ventanilla(Comparator<Vehiculo>comparator){
        colaVehiculos = new PriorityQueue<Vehiculo>(comparator);
    }
    public void llegaVehiculo(Vehiculo vehiculo){
         colaVehiculos.add(vehiculo);
    }
    public Vehiculo atiendeVehiculo(Vehiculo vehiculo){
        return colaVehiculos.poll();
    }
}

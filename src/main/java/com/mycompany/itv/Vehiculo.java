/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.itv;

/**
 *
 * @author VictorNavajas-Alumno
 */
public class Vehiculo{
    
    private int prioridad;
    private String matricula;
    private String marca;
    private String modelo;

    public Vehiculo() {
        
    } 

    public Vehiculo(int prioridad, String matricula, String marca, String modelo) {
        this.prioridad = prioridad;
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
   
    public int getPrioridad() {
        return prioridad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}


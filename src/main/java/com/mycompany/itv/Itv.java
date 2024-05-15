/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.itv;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author VictorNavajas-Alumno
 */
public class Itv {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        VehiculoComparator comparador = new VehiculoComparator();
        Ventanilla ventanilla = new Ventanilla(comparador);
        Vehiculo vehiculo = new Vehiculo();

        while (true) {
            System.out.println("Escoja una opción:\n"
                    + "1. añadir un nuevo vehiculo a la cola\n"
                    + "2. atender siguente\n"
                    + "3. mostrar cola\n"
                    + "4. Exit\n"
                    + "escoge tu opcion (1-4):");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Prioridad:");
                    int priority = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(" matricula:");
                    String matricula = scanner.next();
                    System.out.println(" marca:");
                    String marca = scanner.next();
                    System.out.println(" modelo:");
                    String modelo = scanner.next();
                    
                 
                    vehiculo.setPrioridad(priority);
                    vehiculo.setMatricula(matricula);
                    vehiculo.setMarca(marca);
                    vehiculo.setModelo(modelo);
 
                    ventanilla.llegaVehiculo(vehiculo);

                    
                }
                case 2 -> {
                    if (ventanilla.colaVehiculos.isEmpty()) {
                        System.out.println("La cola esta vacía");
                    } else {
                        System.out.println("siguente Vehiculo");
                        Vehiculo nextVehicle = ventanilla.atiendeVehiculo(null);
                        if (nextVehicle != null) {
                            System.out.println("Siguente vehicle: " + nextVehicle.getMarca() + " " + nextVehicle.getModelo() + " con priority " + nextVehicle.getPrioridad());
                        } else {
                            System.out.println("Error: no hay siguente vehiculo");
                        }
                    }
                    break;
                }
                case 3 -> {

                    System.out.println("Cola Actual:");
                    for (Iterator<Vehiculo> it = ventanilla.colaVehiculos.iterator(); it.hasNext();) {
                        vehiculo = it.next();
                        System.out.println("Priority: " + vehiculo.getPrioridad() + ", Matricula: " + vehiculo.getMatricula() + ", Marca: " + vehiculo.getMarca() + ", Modelo: " + vehiculo.getModelo());
                    }
                }

                case 4 -> {

                    scanner.close();
                    return;
                }
                default ->
                    System.out.println("Opcion invalida. Escoge un numero del 1-4");
            }
        }

    }
}

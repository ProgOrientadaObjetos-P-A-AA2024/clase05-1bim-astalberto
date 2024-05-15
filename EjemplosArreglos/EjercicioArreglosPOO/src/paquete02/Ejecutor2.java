/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import paquete01.LibretaCalificacion;

/**
 *
 * @author utpl
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        double[] notas = {10, 9, 8, 10};
        LibretaCalificacion libreta01 = new LibretaCalificacion("Maria", notas);
        libreta01.establecerPromedio();
        // Explicar que pasa si comento
        libreta01.establecerPromedioCualitativo();
        // Si se comenta la linea 20 el codigo compilara sin ningun problema,
        // Pero promedioCualitativo no tendra asignado un valor y al ejecutar el
        // codigo se imprimira con un valor nulo 
        System.out.printf("%s", libreta01);

    }

}

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
        LibretaCalificacion libreta = new LibretaCalificacion("Maria", notas);
        libreta.establecerPromedio();
        libreta.establecerPromedioCualitativo();
        System.out.printf("%s", libreta);

    }

}

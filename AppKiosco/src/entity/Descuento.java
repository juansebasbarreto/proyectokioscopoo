package entity;

import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NICOLAS
 */
public abstract class Descuento {
    private double porcentaje;

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Descuento(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Descuento() {
    }
    
    public abstract double calcularTotal(double valor, HashMap <Integer,Libro> saga);
    
    
}

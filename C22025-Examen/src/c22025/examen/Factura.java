/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.examen;

/**
 *
 * @author viti
 */
public class Factura {
    
    // Atributos
    private double montoTotal;
    private int auto;
    private int cons;
    private int elec;
    
    //contructor 1
    public Factura() {
    }
    //constructor 2
    public Factura(double montoTotal, int auto, int cons, int elec) {
        this.montoTotal = montoTotal;
        this.auto = auto;
        this.cons = cons;
        this.elec = elec;
    }

    //setter y getter
    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getAuto() {
        return auto;
    }

    public void setAuto(int auto) {
        this.auto = auto;
    }

    public int getCons() {
        return cons;
    }

    public void setCons(int cons) {
        this.cons = cons;
    }

    public int getElec() {
        return elec;
    }

    public void setElec(int elec) {
        this.elec = elec;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c22025.examen;

/**
 *
 * @author viti
 */
public class Agente {
    //atributos
    private String nombre; // Se solicita
    private String codigo; // Se solicita
    private int mes; // se solicita
    private double totalFacturaMes; // Se calcula
    private double comision; // Se calcula
    private boolean objetivo; // se calcula
    private int puntosMes; // se calcula
    private boolean carro; // se solicita
    private String sucursal; // se solicita
    //constructor
    public Agente() {
    }

    public Agente(String nombre, String codigo, int mes, double totalFacturaMes, double comision, boolean objetivo, int puntosMes, boolean carro, String sucursal) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.mes = mes;
        this.totalFacturaMes = totalFacturaMes;
        this.comision = comision;
        this.objetivo = objetivo;
        this.puntosMes = puntosMes;
        this.carro = carro;
        this.sucursal = sucursal;
    }

   
    
   
    //setter y getters;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getTotalFacturaMes() {
        return totalFacturaMes;
    }

    public void setTotalFacturaMes(double totalFacturaMes) {
        this.totalFacturaMes = totalFacturaMes;
    }

    public boolean isObjetivo() {
        return objetivo;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public void setObjetivo(boolean objetivo) {
        this.objetivo = objetivo;
    }

    public int getPuntosMes() {
        return puntosMes;
    }

    public void setPuntosMes(int puntosMes) {
        this.puntosMes = puntosMes;
    }

    public boolean isCarro() {
        return carro;
    }

    public void setCarro(boolean carro) {
        this.carro = carro;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getMesString(){
        String  result="";
        switch (mes) {
            case 1:
                result= "enero";
                break;
            ///...    
                
            default:
                
        }
        return result;
    
    }
    
    public String resutaldo(){
        String res="El agente vendedor " + nombre + " Código " + codigo + " en el mes " + this.getMesString();
        res += res + "\n Vendio un total de " + totalFacturaMes;
        res += res + "\n ... ";
        
        return res;
    }
    
    public void calculaMontototal(Factura factura){
        totalFacturaMes+=totalFacturaMes+factura.getMontoTotal(); //
    }
    
    
    public void calculaComision(Factura factura){
        
        if (factura.getAuto()>0 && factura.getCons() > 0 && factura.getElec()> 0)
            comision=comision+factura.getMontoTotal()*0.1;
        /// ...    
    }
    
    public void calculaPuntos(Factura factura ){
          if (factura.getAuto()>0 && factura.getCons() > 0 && factura.getElec()> 0)
            puntosMes +=2;
    
    }
    
    public void calculaBonoExtra (int cantidadFactura){
        if (totalFacturaMes>30000 || cantidadFactura > 3)
            objetivo=true;
    }
    
}

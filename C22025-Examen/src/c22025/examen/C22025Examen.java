/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025.examen;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22025Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Agente agente = new Agente();
        agente=solDataAgente();
        solFacturas(agente);
        JOptionPane.showMessageDialog(null, agente.resutaldo());
    }
    
    public static Agente solDataAgente(){
        Agente agente = new Agente();
        agente.setNombre(JOptionPane.showInputDialog("Digete el nombre"));
        agente.setCodigo(JOptionPane.showInputDialog("Digete el codig"));
        agente.setMes(Integer.parseInt(JOptionPane.showInputDialog("Digete el mes")));
        String bandera = JOptionPane.showInputDialog("Tiene carro si o no");
        if (bandera.toLowerCase().equals("si") )
            agente.setCarro(true);
        else 
            agente.setCarro(false);
        agente.setSucursal(JOptionPane.showInputDialog("Digete el Sucursal"));
        return agente;
    }
    
    
    public static void solFacturas(Agente agente){
        int cantidadFactura =0;
        cantidadFactura= Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de facturas"));
        for (int i = 0; i < cantidadFactura; i++) {
            
            //int auto, int cons, int elec
            Double monto = Double.parseDouble(JOptionPane.showInputDialog( "Digite el monto de la factura"));
            int auto=Integer.parseInt(JOptionPane.showInputDialog( "Digite la cantidad de automotriz"));
            int cons=Integer.parseInt(JOptionPane.showInputDialog( "Digite la cantidad de construccion"));
            int elec=Integer.parseInt(JOptionPane.showInputDialog( "Digite la cantidad de electrico"));
            Factura factura =  new Factura(monto, auto, cons, elec);
            agente.calculaBonoExtra(cantidadFactura);
            agente.calculaComision(factura);
            agente.calculaMontototal(factura);
            agente.calculaPuntos(factura);
        }
        
    
    }
    
    
    
}

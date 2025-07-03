/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025.clase8;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22025Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int notas[] = new int[3];
        JOptionPane.showMessageDialog(null, notas.length);
        //solicitaDataArreglo(notas, "Digite la nota del estudiante ");
        int edades[] = new int [5];
        //solicitaDataArreglo(edades, "Digite la edad ");
               
        notas[2]=3;
        //notas[3]=3; /// esto da error
        imprimeDataArreglo(edades);
        imprimeDataArreglo(notas);*/
        int fila=2;
        int columna=3;
        String ropa[][]= new String [fila][columna];
        solicitaDataMatrix(ropa, fila, columna);
        imprimeDataMatrix(ropa, fila, columna);
    }
    
    public static void solicitaDataMatrix(String [][] matrix, int fila, int columna){
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                matrix[i][j]=JOptionPane.showInputDialog("Digite la ropa");
            }
        }
    }
    
    public static void imprimeDataMatrix(String [][] matrix, int fila, int columna){
        String res="";
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                res += matrix[i][j]+",";
            }
            res+= "\n";
        }
        
        
        JOptionPane.showMessageDialog(null, res);
        
    }
    
    
    public static void solicitaDataArreglo(int[] arreglo, String texto){
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog(texto + i));
        }
    }
    
    public static void imprimeDataArreglo (int [] arreglo){
        String resultado ="";
        for (int i = 0; i < arreglo.length; i++) {
            resultado+=arreglo[i]+",";  
        }
        JOptionPane.showMessageDialog(null, resultado);
    
    }
    
}

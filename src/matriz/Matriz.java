/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

/**
 *
 * @author Cano
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int matriz [][]=new int [5][5]; //declaracion de variable y se asigna el tamaño
        int dato=1; // se declara variable dato
        for(int i=0;i<matriz.length;i++){ //filas
            for (int j=0;j<matriz[i].length;j++){ // columnas
                matriz [i][j]=dato;
                dato++; // va incrementando de 1 en 1
        
            }    
         }      
         for(int i=0;i<matriz.length;i++){ //filaas
             for (int j=0; j<matriz[i].length; j++){ // columnas
                  System.out.print("\t"+matriz[i][j]); // Se ´imprime la matriz con un tabulador
             }
             System.out.println("");// dibuja una nueva linea cada que se imprime la matriz
        }
         
        int diagonalPrin[] = new int [matriz.length]; // se declaran las diagonales tipo arreglo
        int diagonalSecu[] = new int [matriz.length]; 
        for (int i=0;i<matriz.length;i++){
            for (int j=0; j<matriz[i].length; j++){
                if(i==j){ // se cumple una condicion si i es igual a j
                diagonalPrin[i]=matriz[i][j];
                }
                if ((i+j) == matriz.length-1){ 
                    diagonalSecu[i]=matriz[i][j];
                }
            }
    
        }
        int suma=0; // se declara la variable suma
        System.out.println("Diagonal Principal");
        for (int elemento:diagonalPrin){//Se usa for-each para repetir datos de un array mas rapido y facil
             System.out.print("\t" +elemento);
             suma=suma+elemento;
        }
        System.out.print(" Total suma = "+suma);
        System.out.println("");
        
        suma=0; // se declara la variable suma
        System.out.println("\nDiagonal Secundaria");
        for (int elemento:diagonalSecu){
             System.out.print("\t" +elemento);
             suma=suma+elemento;
        }
        System.out.print(" Total suma = "+suma);
        System.out.println("");
        
    } 
       

}

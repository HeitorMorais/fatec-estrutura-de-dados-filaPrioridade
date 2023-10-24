/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fila_prioridade;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        FilaPrioridade fila = new FilaPrioridade();
        fila.enfileirar("A", 1);
        fila.enfileirar("B", 3);
        fila.enfileirar("C", 2);
        fila.enfileirar("D", 4);
        while(!fila.estaVazia()){
            System.out.println(fila.desenfileirar());
        }
    }
    
    
    
}

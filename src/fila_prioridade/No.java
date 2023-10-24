/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila_prioridade;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class No {
    private Object info;
    public int prioridade;
    public No prox;
    
    public No(Object info, int prioridade){
        this.info = info;
        this.prioridade = prioridade;
    }
    
    public Object getInfo(){
        return info;
    }
}

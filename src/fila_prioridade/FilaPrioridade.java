/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fila_prioridade;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class FilaPrioridade {

    private No inicio;
    private No fim;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public Object inicio() {
        if (estaVazia()) {
            return null;
        }
        return this.inicio.getInfo();
    }

    public void enfileirar(Object info, int prioridade) {
        No no = new No(info, prioridade);
        if (estaVazia()) {
            inicio = no;
            fim = no;

        } else {
            No atual = inicio;
            int tamanhoVariavel = tamanho;
            while (tamanhoVariavel > 0) {
                if (prioridade > inicio.prioridade) {
                    No variavel = inicio;
                    inicio = no;
                    inicio.prox = variavel;
                    break;
                }
                if (prioridade <= fim.prioridade && atual.prox == null) {
                    fim.prox = no;
                    fim = no;
                    break;
                }

                if (no.prioridade > atual.prioridade) {
                    no.prox = atual;
                    break;
                }
                if (no.prioridade <= atual.prioridade && atual.prox.prioridade < no.prioridade) {
                    No variavel = atual.prox;
                    atual.prox = no;
                    no.prox = variavel;
                    break;
                }
                if (no.prioridade < atual.prioridade && atual.prox != null) {
                    atual = atual.prox;
                }
                tamanhoVariavel--;
            }

        }

        tamanho++;
    }

    public Object desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        Object info = inicio.getInfo();
        inicio = inicio.prox;
        tamanho--;
        return info;
    }
}

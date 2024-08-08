/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial2;

import java.util.ArrayList;


/**
 *
 * @author ESTUDIANTE
 */
public class Pedido {
    public ArrayList<String> ListaPedido;
    public Cliente cliente;
    
    
    

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        
    }
    
    public void alimentos(String todo) {
        this.ListaPedido.add(todo);
    }

    public ArrayList<String> getLista() {
        return ListaPedido;
    }
    
    
    
    
}

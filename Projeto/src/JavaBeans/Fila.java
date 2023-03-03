/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaBeans;

import java.util.ArrayList;

/**
 *
 * @author alunos
 */
public class Fila {
    
    ArrayList dados;
    
    public Fila() {
        dados = new ArrayList();
    }
    
    public void queue(Jogadores oponente) {
        dados.add(oponente);
    }
    public Object dequeue(int index) {
        Object temp = dados.get(index);
        dados.remove(index);
        return temp;
    }
    
    public boolean isEmpty() {
        
        if (dados.isEmpty()) {
            return true;
        }
        
        else {
            return false;
        }
    }
    
    public int size(){
        return dados.size();
    }
    
    
    public boolean hasMoreElements() {
        if (dados.size()>0)
            return true;
        
        else {
            return false;
        }
    }
     
    }

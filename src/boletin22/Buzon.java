/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.util.ArrayList;

/**
 *
 * @author fojomars
 */
public class Buzon {
    private ArrayList<Correo> lista;
    public Buzon(ArrayList<Correo> lista) {
        this.lista = lista;
    }
    
    public int numeroDeCorreos(){
        return lista.size();
    }
    
    public void engade(Correo c){
        lista.add(c);
    }
    
    public boolean porLer(){
        boolean comprobar = true;
        for(Correo c : lista){
            if(c.isLeido()==false){
                comprobar = false;
            }
        }
        return comprobar;
    }
    
    public String amosaPrimerNoLeido(){
        for(Correo c : lista){
            if(c.isLeido()==false){
                return c.getMensaje();
            }
        }
        return "No hay mensajes por leer";
    }
    
    public String amosa(int k){
        return lista.get(k).getMensaje();
    }
    
    public void elimina(int k){
        lista.remove(k);
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author range
 */
public class Memento {

    protected String estado;

    public Memento(String texto) {
        estado = texto;
    }

    public String getTextoSalto() {
        return estado;
    }

}

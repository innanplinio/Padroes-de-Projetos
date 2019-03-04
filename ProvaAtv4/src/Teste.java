/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author range
 */
public class Teste {
    
    public static void main(String[] args){
        Oraculo o = Oraculo.getInstancia();
        System.out.println("Dia do fim do mundo: "+o.getFimMundo().getTime());
        System.out.println("Hoje chove? " +o.isHojeChove());
    }
    
}

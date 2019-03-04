/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author range
 */
public class Main {

    public static void main(String[] args) {
        Consulta c = new Consulta();
        c.adicionarValor("1 real\n");
        c.adicionarValor("2 reais\n");
        c.adicionarValor("3 reais\n");
        c.adicionarValor("4 reais\n");
        c.adicionarValor("5 reais\n");
        c.mostrarValor();
        c.desfazerValor();
        c.mostrarValor();
        c.desfazerValor();
        c.mostrarValor();
        c.desfazerValor();
        c.mostrarValor();

    }
}

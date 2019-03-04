/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author range
 */
public class App {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setRaiva(20);
        System.out.println(pessoa.evolui());
        pessoa.setRaiva(90);
        System.out.println(pessoa.evolui());

    }

}

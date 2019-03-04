/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author range
 */
public class Pessoa {

    private int raiva = 0;
    private Estado estado = new Civilizado();

    public int getRaiva() {
        return raiva;
    }

    public String evolui() {
        return estado.evolui();
    }

    public void setRaiva(int raiva) {
        this.raiva = raiva;
        if (raiva > 80) {
            estado = new Selvagem();
        } else {
            estado = new Civilizado();
        }
    }

}

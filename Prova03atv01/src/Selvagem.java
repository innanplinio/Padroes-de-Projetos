/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author range
 */
public class Selvagem implements Estado {

    private String regeneracao = "40%";
    private String agilidade = "60%";
    private String resistencia = "75%";

    @Override
    public String evolui() {
        return "Estado Selvagem!!   \n\nRegeneracao:  " + regeneracao + "\nAgilidade: " + agilidade + "\nResistencia: " + resistencia;
    }

}

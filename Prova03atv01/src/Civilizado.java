/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author range
 */
public class Civilizado implements Estado {

    private String raciocinioDedutivo = "50%";
    private String grauObservacao = "50%";

    @Override
    public String evolui() {
        return "Estado Civilizado!! \n\nRaciocinio dedutivo: " + raciocinioDedutivo + "\nGrau de Observacao: " + grauObservacao + "\n\n";
    }
}

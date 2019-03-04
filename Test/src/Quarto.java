
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author range
 */
public class Quarto {

    List<Movel> movel = new ArrayList<Movel>();

    public Quarto() {
        movel.add(new Cama());
        movel.add(new GuardaRoupa());
    }

    public Movel getMovel(int id) {
        if (movel.size() > id) {
            return movel.get(id);
        } else {
            return null;
        }
    }
    
    public Movel addMovel(int quant){
       for(int i=0;i<quant;i++){
           movel.add(new Cama());
       }
       return movel.get(quant);
    }

}

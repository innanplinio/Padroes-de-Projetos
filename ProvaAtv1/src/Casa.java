
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author range
 */
public abstract class Casa {

    protected ArrayList<Comodo> comodos = new ArrayList();
    protected int tamQuintal, tamJardim;

    @Override
    public String toString() {
        String dados = "";
        int quartos = 0, salas = 0, banheiros = 0, cozinha = 0, copa = 0;
        for(Comodo c: comodos) {
            if(c instanceof Quarto) quartos++;
            if(c instanceof Sala) salas++;
            if(c instanceof Banheiro) banheiros++;
            if(c instanceof Cozinha) cozinha++;
            if(c instanceof Copa) copa++;
        }
        dados = "Quartos: "+quartos+" Salas: "+salas+" Banheiros: "+banheiros+" Cozinhas: "+cozinha+" Copas: "+copa+" Tam Jardim: "+tamJardim+" Tam Quintal: "+tamQuintal;
        return dados; //To change body of generated methods, choose Tools | Templates.
    }
    
    

}

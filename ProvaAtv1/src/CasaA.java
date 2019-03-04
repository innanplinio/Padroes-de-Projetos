
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
public class CasaA extends Casa {

    public CasaA() {
        comodos.add(new Sala());
        comodos.add(new Banheiro());
        comodos.add(new Cozinha());
        comodos.add(new Quarto());
        comodos.add(new Quarto());
        this.tamJardim = 0;
        this.tamQuintal = 0;
    }

    public ArrayList<Comodo> getComodos() {
        return comodos;
    }

    public void setComodos(ArrayList<Comodo> comodos) {
        this.comodos = comodos;
    }

    public int getTamQuintal() {
        return tamQuintal;
    }

    public void setTamQuintal(int tamQuintal) {
        this.tamQuintal = tamQuintal;
    }

    public int getTamJardim() {
        return tamJardim;
    }

    public void setTamJardim(int tamJardim) {
        this.tamJardim = tamJardim;
    }
}

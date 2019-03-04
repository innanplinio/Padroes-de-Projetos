
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author range
 */
public class Oraculo {

    private Calendar fimMundo;
    private boolean hojeChove = true;
    private static Oraculo instancia;

    public static Oraculo getInstancia() {
        if (instancia == null) {
            instancia = new Oraculo();
        }
        return instancia;
    }

    public Calendar getFimMundo() {
        this.fimMundo = Calendar.getInstance();
        this.fimMundo.set(2012, 12, 22);
        return fimMundo;
    }

    public void setFimMundo(Calendar fimMundo) {
        this.fimMundo = fimMundo;
    }

    public boolean isHojeChove() {
        return hojeChove;
    }

    public void setHojeChove(boolean hojeChove) {
        this.hojeChove = hojeChove;
    }

}

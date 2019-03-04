
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
public class CareTaker {

    protected ArrayList<Memento> estados;

    public CareTaker() {
        estados = new ArrayList<Memento>();
    }

    public void adicionarMemento(Memento mem) {
        estados.add(mem);
    }

    public Memento getUltimoEstadoSalvo() {
        if (estados.size() <= 0) {
            return new Memento("");
        }
        Memento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
}

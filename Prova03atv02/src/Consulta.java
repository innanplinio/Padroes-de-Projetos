
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
public class Consulta {

    Calendar data;
    String paciente;
    String sintomas;
    String tratamento;

    protected String texto;
    CareTaker careTaker;

    public Consulta() {
        careTaker = new CareTaker();
        texto = new String();
    }

    public void adicionarValor(String novoTexto) {
        tratamento = novoTexto;
        careTaker.adicionarMemento(new Memento(texto));
        texto = novoTexto;
    }

    public void desfazerValor() {
        tratamento = careTaker.getUltimoEstadoSalvo().getTextoSalto();
    }

    public void mostrarValor() {
        System.out.println(tratamento);
    }

}

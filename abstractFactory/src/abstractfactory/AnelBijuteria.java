/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author range
 */
public class AnelBijuteria extends Anel implements Bijuteria{
	private int tipoPedra;
	private int qtdPedra;
	public int getTipoPedra() {
		return tipoPedra;
	}
	public void setTipoPedra(int tipoPedra) {
		this.tipoPedra = tipoPedra;
	}
	public int getQtdPedra() {
		return qtdPedra;
	}
	public void setQtdPedra(int qtdPedra) {
		this.qtdPedra = qtdPedra;
	}
	
	
}


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
public class AnelOuro extends Anel implements Ouro{
	private int tipoPreciosa;
	private int qtdPreciosa;
	public int getTipoPreciosa() {
		return tipoPreciosa;
	}
	public void setTipoPreciosa(int tipoPreciosa) {
		this.tipoPreciosa = tipoPreciosa;
	}
	public int getQtdPreciosa() {
		return qtdPreciosa;
	}
	public void setQtdPreciosa(int qtdPreciosa) {
		this.qtdPreciosa = qtdPreciosa;
	}
}


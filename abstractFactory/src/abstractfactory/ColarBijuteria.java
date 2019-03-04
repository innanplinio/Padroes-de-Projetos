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
public class ColarBijuteria extends Colar implements Bijuteria{
	private int tipoMaterial;

	public int getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(int tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
	
}


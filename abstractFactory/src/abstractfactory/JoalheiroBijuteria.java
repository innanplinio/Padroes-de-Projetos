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
public class JoalheiroBijuteria implements InterfaceJoalheiroBijuteria<ColarBijuteria, AnelBijuteria>{

	@Override
	public ColarBijuteria novoColar() {
		          System.out.println("Colar de Bijuteria Criado.");
		return null;
	}

	@Override
	public AnelBijuteria novoAnel() {
		          System.out.println("Anel de Bijuteria Criado.");
		return null;
	}

}


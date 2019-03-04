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
public class JoalheiroOuro implements InterfaceJoalheiroOuro<ColarOuro, AnelOuro>{
@Override
	public ColarOuro novoColar() {
		System.out.println("Colar de Ouro criado ");
		return null;
	}

	@Override
	public AnelOuro novoAnel() {
		System.out.println("Anel de Ouro criado ");
		return null;
	}

}


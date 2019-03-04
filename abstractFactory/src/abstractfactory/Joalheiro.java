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
public interface Joalheiro <C extends Colar, A extends Anel>{
	public C novoColar();
	public A novoAnel ();
}


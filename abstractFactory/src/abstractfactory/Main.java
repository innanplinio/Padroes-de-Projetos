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
public class Main {

    
    public static void main(String[] args) {
        
                JoalheiroOuro jo = new JoalheiroOuro();
		ColarOuro co = new ColarOuro();
		co.setQtd(5);
		co.setQuilate(17);
		jo.novoColar();
		System.out.println(co.getQtd() + "  Colares com   " +  co.getQuilate() + "  quilates");
		
		
		AnelOuro ao = new AnelOuro();
		ao.setQtdPreciosa(6);
		ao.setTipoPreciosa(1);
		jo.novoAnel();
		System.out.println(ao.getQtdPreciosa() + "  anéis do tipo   " +  ao.getTipoPreciosa());
	
		JoalheiroBijuteria jb = new JoalheiroBijuteria();
		ColarBijuteria cb = new ColarBijuteria();
		cb.setQtd(5);
		cb.setTipoMaterial(17);
		jb.novoColar();
		System.out.println(cb.getQtd() + "  Colares com material do tipo  " +  cb.getTipoMaterial());
		
		
		AnelBijuteria ab = new AnelBijuteria();
		ab.setQtdPedra(6);
		ab.setTipoPedra(15);
		jb.novoAnel();
		System.out.println(ab.getQtdPedra() + "  Colares com material do tipo  " +  ab.getTipoPedra());
	
    }
    
}

package abstractFactory;

public interface Joalheiro <C extends Colar, A extends Anel>{
	public C novoColar();
	public A novoAnel ();
}

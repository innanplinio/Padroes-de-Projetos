package abstractFactory;

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

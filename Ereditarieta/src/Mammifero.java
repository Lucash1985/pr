
public class Mammifero extends Animale {
	
	protected boolean haPelo;
	public Mammifero(String nome, int eta, boolean haPelo)
	{
		super(nome,eta);
		this.haPelo = haPelo;
	}
	public void emettiSuono() {
		System.out.println("il mammifero fa un suono");
	}

}

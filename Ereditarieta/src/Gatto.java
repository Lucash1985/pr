
public class Gatto extends Mammifero  {
	protected int vite;
	public Gatto(String nome, int eta, boolean haPelo, int vite)
	{
		super(nome, eta,haPelo);
		this.vite = vite;
	}
	@Override
	public void emettiSuono() {
		// TODO Auto-generated method stub
		System.out.println("miagola");
	}

}

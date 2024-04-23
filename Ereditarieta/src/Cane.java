import java.util.Scanner;

public class Cane extends Mammifero  {
	protected String razza;
	public Cane(String nome, int eta, boolean haPelo, String razza)
	{
		super(nome, eta,haPelo);
		this.razza = razza;
	}

	@Override
	 public void emettiSuono()
	 {
		 System.out.println("abbaia");
	 }
	 public boolean Scodinzola() {
		 Scanner a = new Scanner(System.in);System.out.println("come sta il piccoletto? ");
		 String f = a.next();
		 
		 if(f .equals("contento") ) {
			 System.out.println("è contento!!");
			 return true;
		 }
		 return false;
		 
	 }
}
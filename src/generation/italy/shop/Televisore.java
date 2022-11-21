package generation.italy.shop;

public class Televisore extends Prodotto {

 	// attributi
 	private int altezza;
 	private int larghezza;
 	private boolean smart;

 	// costruttore
 	public Televisore(int codice, String nome, String marca, int prezzo, 
 			int iva, int altezza, int larghezza, boolean smart) {
 		super(codice, nome, marca, prezzo, iva);
 		
 		this.altezza = altezza;
 		this.larghezza = larghezza;
 		this.smart = smart;
 	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getLarghezza() {
		return larghezza;
	}

	public void setLarghezza(int larghezza) {
		this.larghezza = larghezza;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
 	
 	@Override
 	public String toString() {
 		
 		return super.toString()+ " Dimensioni- " + "h:"+ altezza + " l:"+ larghezza
 				+ " IsSmart: " + (isSmart() ? "si " : "no");
 	}

 	

 }


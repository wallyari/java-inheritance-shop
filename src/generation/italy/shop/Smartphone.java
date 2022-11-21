package generation.italy.shop;

public class Smartphone extends Prodotto {

 	// attributi
 	private String imei;
 	private int memoria;

 	// costruttore
 	public Smartphone(int codice, String nome, String marca, int prezzo, int iva, String imei, int memoria) {
 		super(codice, nome, marca, prezzo, iva);
 		this.imei = imei;
 		this.memoria = memoria;

 	}

 	// getter e setter
 	public int getMemoria() {
 		return memoria;
 	}

 	public void setMemoria(int memoria) {
 		this.memoria = memoria;
 	}

 	public String getImei() {
 		return imei;
 	}

 	// override
 	@Override
 	public String toString() {
 		return super.toString() + " - " + "IMEI: " + imei + " - " + "Memoria di: " + memoria + "GB";
 	}

 }

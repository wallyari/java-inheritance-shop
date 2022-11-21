package generation.italy.shop;


public class Prodotto {


	// attributi
	private int codice;
	private String nome;
	private String marca;
	private int prezzo;
	private int iva;

	// costruttore
	public Prodotto(int codice, String nome, String marca, int prezzo, int iva) {
		super();
		this.codice = codice;
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.iva = iva;
	}

	// getter e setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrezzo() {
		return prezzo;
	}

	void setPrezzo(int prezzo) {
		if (prezzo < 0) {
			this.prezzo =- prezzo;
		} else {
			this.prezzo = prezzo;
		}

	}

	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

	public int getCodice() {
		return codice;
	}

	// metodi
	public double calcolaPrezzoConIva() {
		return prezzo + prezzo * iva / 100;
	}

	// override
	@Override
	public String toString() {
		return "Hai acquistato il prodotto " + nome + " della marca " + marca + " al prezzo di "
				+ calcolaPrezzoConIva()+ " euro";
	}
	


}

public class Fita {
	public static final int NORMAL = 0;
	public static final int LANCAMENTO = 1;
	public static final int INFANTIL = 2;
	private String titulo;
	private int CodigoDePreco;

	public Fita(String titulo, int CodigoDePreco) {
		this.titulo = titulo;
		this.CodigoDePreco = CodigoDePreco;
	}

	public String gettitulo() {
		return titulo;
	}

	public int getCodigoDePreco() {
		return CodigoDePreco;
	}

	public void setCodigoDePreco(int CodigoDePreco) {
		this.CodigoDePreco = CodigoDePreco;
	}
}

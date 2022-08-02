
public class Motorista extends Fucionario {

	private String cnh;
	private String placaAutomovel;
	
	public Motorista(int mat, String nm, double sal, String cnh, String placa) {
		super(mat, nm, sal);
		this.cnh = cnh;
		this.placaAutomovel = placa;
	}

	public String getCnh() {
		return cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public String getPlacaAutomovel() {
		return placaAutomovel;
	}

	public void setPlacaAutomovel(String placaAutomovel) {
		this.placaAutomovel = placaAutomovel;
	}
}

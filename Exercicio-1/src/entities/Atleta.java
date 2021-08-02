package entities;

public class Atleta {

	private String nome;
	private String pais;
	private int distanciaArremeso;
	
	public Atleta() {
	}

	public Atleta(String nome, String pais, int distanciaArremeso) {
		this.nome = nome;
		this.pais = pais;
		this.distanciaArremeso = distanciaArremeso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getDistanciaArremeso() {
		return distanciaArremeso;
	}

	public void setDistanciaArremeso(int distanciaArremeso) {
		this.distanciaArremeso = distanciaArremeso;
	}
	

	
}

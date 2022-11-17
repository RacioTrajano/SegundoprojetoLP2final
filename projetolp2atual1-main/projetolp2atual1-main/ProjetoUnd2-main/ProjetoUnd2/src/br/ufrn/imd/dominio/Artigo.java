package br.ufrn.imd.dominio;
public class Artigo extends ItemAcervo{
	
	public Artigo() {
		
	}
	
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		
		return "Artigo(s): \n" +"Título: " + titulo + " Tipo: " + tipo;
	}
	
}

package br.ufrn.imd.dominio;

public class Revista extends ItemAcervo{

	public Revista() {
		
	}
	
	private String tema;

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}
	
	@Override
	public String toString() {
		
		return "Revista(s): \n" +"T�tulo: " + titulo + " Tema: " + tema;
	}
	
}

package org.cuatrovientos.fourparty;

public class Song extends MediaFile{
	
	private String author;

	
	public Song(String titulo, String author, int duracion) {
		// TODO
	}

	public Song(String titulo, String duracion, String author) {
		// TODO
	}
	
	@Override
	public String toString() {
		return  "Song: "+"/n"+super.toString()+"Autor : "+author;
	}
	
}
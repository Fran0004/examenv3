package org.cuatrovientos.fourparty;


public class Film extends MediaFile{
	
	private String director;
	private String gender;	
	
	public Film(String title, int duracion, String director, String gender) {
		// TODO
	}

	public Film(String title, String duration,  String director, String gender) {
		// TODO
	}
	

	@Override
	public String toString() {
		return "Film: "+  super.toString()+"Director : " + director +"/n"+ "Gender : " + gender ;
	}
	
	
}
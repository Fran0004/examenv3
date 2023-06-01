package org.cuatrovientos.fourparty;

import java.util.Spliterator;

public abstract class  MediaFile {

	public String title;
	private int duration;
	
	
	public static int toSeconds(String dura){
		
		String[] tiempo = new String[1];
		int h=0 ;
		int m=0;
		int s =0;
		tiempo = dura.split(":");
		
		Integer.parseInt(tiempo[0],h);
		Integer.parseInt(tiempo[1],m);
		
		h=h*3600;
		m=m*60;
		s=m+h;
		
		return s;
	}

	
	@Override
	public String toString() {
		return "Titulo : "+title+"/n"+"Duracion : "+duration+"/n";
	}
	
}



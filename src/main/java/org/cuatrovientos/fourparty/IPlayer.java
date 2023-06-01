package org.cuatrovientos.fourparty;

public interface IPlayer {

	public void newFile(MediaFile m);
	
	public void removeFile(String title);
	
	public MediaFile searchFile(String titulo);
	
	public void showFiles();
	
	
}

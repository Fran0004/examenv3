package org.cuatrovientos.fourparty;

import java.util.ArrayList;

public class MediaCenter implements IPlayer {
	
	private ArrayList<MediaFile> playlist = new ArrayList<MediaFile>();
	
	
	public void newFile(MediaFile m) {
		// TODO
		playlist.add(m);
	}

	public void removeFile(String title) {
		// TODO	
		for (MediaFile mediaFile : playlist) {
			if (mediaFile.title == title) {
				playlist.remove(mediaFile);
			}
		}
	}

	public MediaFile searchFile(String titulo) {
		// TODO
		
		for (MediaFile mediaFile : playlist) {
			if (mediaFile.title == titulo) {
				return mediaFile;
			}
		}
		return null;
	}

	public void showFiles() {
		// TODO
		for (MediaFile mediaFile : playlist) {
			mediaFile.toString();
		}
		
	}


		
}

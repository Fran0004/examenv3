package org.cuatrovientos.fourparty;

import java.util.Scanner;

/**
 * Main App for the MediaCenter project
 * 
 * @author Cuatrovientos
 */
public class App {
	private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int option = 0;
		MediaCenter player = new MediaCenter();
		FileType fileType = FileType.SONG;

		do {
			fileType = choosePlayerType();				
			showMenu();
			option = getOption();
			doAction(option, player, fileType);

		} while (option != 5);
	}

	/**
	 * @param reader
	 * @param option
	 * @param hotel
	 */
	private static void doAction(int option, MediaCenter player, FileType fileType) {
		String title;
		String duration;
		switch (option) {
		case 1:
			MediaFile file ;
			title = getTitle();
			duration = getDuration();
			if (fileType.equals(FileType.SONG)) {
				String author = getAuthor();	
				file = new Song(title, author, duration);
				file.FILE_TYPE = fileType;
			}
			else{
				String director = getDirector();
				String gender = getGender();
				file = new Film(title, duration, director, gender);
				file.FILE_TYPE = fileType;
			}		
			player.newFile(file);
			break;
		case 2:
			title = getTitle();
			player.removeFile(title);;
			break;
		case 3:
			title = getTitle();
			System.out.println(player.searchFile(title));
			break;
		case 4:
			player.showFiles();
			break;
		default:
			break;
		}
	}

	private static String getDirector() {
		reader = new Scanner(System.in);
		System.out.println("Enter director:");
		String duration = reader.nextLine();
		return duration;
	}

	private static String getGender() {
		reader = new Scanner(System.in);
		System.out.println("Enter gender:");
		String duration = reader.nextLine();
		return duration;
	}

	private static String getAuthor() {
		reader = new Scanner(System.in);
		System.out.println("Enter author:");
		String author = reader.nextLine();
		return author;
	}

	/**
	 * @param reader
	 * @return
	 */
	private static String getDuration() {
		reader = new Scanner(System.in);
		System.out.println("Enter duration:[HH:MM]");
		String duration = reader.nextLine();
		if(duration.split(":").length<2) duration += ":00";
		return duration;
	}

	/**
	 * @param reader
	 * @return
	 */
	private static String getTitle() {
		reader = new Scanner(System.in);
		System.out.println("Enter title:");
		return reader.nextLine();
	}

	/**
	 * @param reader
	 * @return
	 */
	private static int getOption() {
		reader = new Scanner(System.in);
		String line = reader.nextLine();
		return Integer.parseInt(line);
	}

	/**
	 * 
	 */
	private static void showMenu() {
		System.out.println("1. Add");
		System.out.println("2. Delete");
		System.out.println("3. Search");
		System.out.println("4. Show");
		System.out.println("5. Exit");
	}
	
	private static FileType choosePlayerType() {
		System.out.println("Do you want to play music or watch a film [m/f]: ");
		return reader.nextLine().equals("f") ? FileType.FILM : FileType.SONG ;
	}
}
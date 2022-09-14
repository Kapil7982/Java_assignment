package question2;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Song[] song = new Song[4];
		
		PlayList play = new PlayList();
		
		for(int i=0; i<4; i++)
		{
			System.out.println("Enter song name");
			String name = sc.nextLine();
			
			System.out.println("Enter movie name:");
			String movie = sc.nextLine();
			
			song[i] = new Song(movie, name);
			play.addSong(song[i]);
		}
		
		for(Song songs: play.songs)
		{
			songs.play();
		}
	}

}

package question2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PlayList {

	 public List<Song> songs = new ArrayList<>();
	 
	 public void addSong(Song song) 
	 {
		 
		 HashSet<Song> s = new HashSet<>(songs);
		 
		 if(s.add(song))
		 {
			 songs.add(song);
			 System.out.println("Song added to the playlist successfully.");
		 }
		 else
		 {
			 System.out.println("Song is already added in the playlist");

		 }
		 
		 
	 }
}

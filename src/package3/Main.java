package package3;

import package2.Song;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Song(String title, String artist, int year, String country)
		Song song = new Song("Dancing Queen", "abba", 1997, "Sweden");
		
		song.show();
	}

}

package package2;


public class Song {
	private String title, artist, country;
	private int year;

	public Song() {

	}

	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() {
		System.out.println(year + "년 " + country + "국적의 " + artist + "가 부른 " + title);
	}
}

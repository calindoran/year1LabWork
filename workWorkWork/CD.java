package workworkwork;

public class CD {
	
	String Title;
	String Artist;
	String Genre;
	String Label;
	int Track;
	int CurrentTrack;


	public CD(String Title, String Artist, String Genre, String Label, int Track, int CurrentTrack){
		
		this.Title = Title;
		this.Artist = Artist;
		this.Genre = Genre;
		this.Label = Label;
		this.Track = Track;
		this.CurrentTrack = CurrentTrack;
		
	}
	
	@Override
	public String toString(){
		
		return Title +" "+ Artist +" "+ Genre +" "+ Label +" "+ Track +" "+ CurrentTrack;
		
	}
	
}

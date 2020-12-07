package MayankNew;
public class Metadata implements Printing{
    private static int trackID = 1;
    private String trackTitle;
    private int trackLength;
    private int trackReleaseDate;
    private String genre;
    private String artist;
    private int trackQty;
    private int price;

	public int getTrackID() {
		return trackID;
	}
	
	public String getTrackTitle() {
		return trackTitle;
	}
	public void setTrackTitle(String trackTitle) {
		this.trackTitle = trackTitle;
	}
	public int getTrackLength() {
		return trackLength;
	}
	public void setTrackLength(int trackLength) {
		this.trackLength = trackLength;
	}
	public int getTrackReleaseDate() {
		return trackReleaseDate;
	}
	public void setTrackReleaseDate(int trackReleaseDate) {
		this.trackReleaseDate = trackReleaseDate;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getTrackQty() {
		return trackQty;
	}
	public void setTrackQty(int trackQty) {
		this.trackQty = trackQty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

    public Metadata(){
        ++Metadata.trackID;
        trackLength = trackReleaseDate = trackQty = price = 0;
        trackTitle = genre = artist = null;
    }

    public Metadata(String trackTitle, int trackLength, int trackReleaseDate, String genre, String artist, int trackQty, int price){
        ++Metadata.trackID;
        this.trackTitle = trackTitle;
        this.trackLength = trackLength;
        this.trackReleaseDate = trackReleaseDate;
        this.genre = genre;
        this.artist = artist;
        this.trackQty = trackQty;
		this.price = price;
		}
    
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
        sb.append(trackID).append("\t").append(trackTitle).append("\t").append(trackLength).append(trackReleaseDate).append("\t").append(genre).append("\t").append(artist).append("\t").append(trackQty).append("\t").append(price);
        System.out.println(sb.toString());
	}

	public void printDetails1(int i) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
        sb.append(trackID - i).append("\t").append(trackTitle).append("\t").append(trackLength).append(trackReleaseDate).append("\t").append(genre).append("\t").append(artist).append("\t").append(trackQty).append("\t").append(price);
        System.out.println(sb.toString());
	}
}

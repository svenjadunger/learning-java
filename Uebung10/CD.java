package Uebung10;

public class CD extends Medium{
    private String artist;
    private int tracks;


public CD(String title, int year, String artist, int tracks){
    super(title,year);
    this.artist = artist;
    this.tracks = tracks;
}
@Override
public void printInfo(){
   super.printInfo();
    System.out.println("Artist: " + this.artist);
    System.out.println("Tracks: " + this.tracks);

}
}
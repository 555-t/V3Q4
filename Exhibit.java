//1st class
public class Exhibit {
    private String title, artist,type, description;
    private int year;
    
    public Exhibit(String title, String artist, int year, String type, String description){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.type = type;
        this.description = description;
    }
    
    public void getDetails(){
        System.out.println("Title: "+title);
        System.out.println("Artist: "+artist);
        System.out.println("Year: "+year);
        System.out.println("Type: "+type);
        System.out.println("Description: "+description);
    }
    
    public String getArtist(){
        return artist;
    }
    public String getType(){
        return type;
    }
    public int getYear(){
        return year;
    }
    
}

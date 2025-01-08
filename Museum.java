//2nd class
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Museum {
    private ArrayList<Exhibit> listOfExhibits;
    
    public Museum(){
        this.listOfExhibits = new ArrayList<>() ;
    }
    
    public void loadExhibits(String filename){
        
            try {
                File file = new File(filename.toLowerCase());
                Scanner scanner = new Scanner(file);

                while(scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    String[] parts = line.split(",");
                    
                    if(parts.length == 5){
                        Exhibit exhibit = new Exhibit(parts[0],parts[1],Integer.parseInt(parts[2]),parts[3],parts[4]);
                        listOfExhibits.add(exhibit);
                    }
                }
                
            }catch(FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
            }
    }
    
    public void searchExhibitsByArtist(String artist){
        boolean find = false;
        for(Exhibit exhibit : listOfExhibits){
            if(exhibit.getArtist().equalsIgnoreCase(artist)){
                exhibit.getDetails();
                find = true;
            }
        }
        
        if(!find){
            System.out.println("Exhibit does not exist!");
        }
    }
    public void searchExhibitsByType(String type){
        boolean find = false;
        for(Exhibit exhibit : listOfExhibits){
            if(exhibit.getType().equalsIgnoreCase(type)){
                exhibit.getDetails();
                find = true;
            }
            System.out.println("");
        }
        
        if(!find){
            System.out.println("Exhibit does not exist!");
        }
        
    }
    public void searchExhibitsByYear(int year){
        boolean find = false;
        for(Exhibit exhibit : listOfExhibits){
            if(exhibit.getYear()==year){
                exhibit.getDetails();
                System.out.println("");
                find = true;
            }
        }
        
        if(!find){
            System.out.println("Exhibit does not exist!");
        }
               
    }

    public void viewAllExhibits(){
        for(Exhibit exhibit : listOfExhibits){
            exhibit.getDetails();
            System.out.println("");
        }
    }
    
}

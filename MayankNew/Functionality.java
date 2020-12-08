package MayankNew;
import java.util.Scanner;

public class Functionality extends Metadata {

    public Metadata getInputMetadata(int i){
        Metadata object = new Metadata();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Track Title: ");
        object.setTrackTitle(sc.nextLine());

        System.out.println("Enter Track Length: ");
        object.setTrackLength(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Release Date: ");
        object.setTrackReleaseDate(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Genre: ");
        object.setGenre(sc.nextLine());

        System.out.println("Enter Artist Name: ");
        object.setArtist(sc.nextLine());

        System.out.println("Enter Quantity: ");
        object.setTrackQty(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Price: ");
        object.setPrice(sc.nextInt());
        sc.nextLine();
        try {
            if(object.getPrice() == 0) {
                throw new ERRORammountException("ERROR");
            }
            else   
            {
                object.setPrice(sc.nextInt());
                sc.nextLine();
            }    
        } catch (ERRORammountException e) {
            System.out.println("Price cannot be zero");
            e.printStackTrace();
        }
        
        return object;
    }
}

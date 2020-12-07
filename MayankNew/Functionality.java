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
        if(getPrice() == 0) {
            
            System.out.println("error");
        }
        else   
        {
            object.setPrice(sc.nextInt());
            sc.nextLine();
            
        }
        return object;
    }
}

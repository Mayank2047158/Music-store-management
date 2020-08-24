import java.util.*;

public class Musicstore {

 static String storename="XYZ";

	public static void main(String args[]){
	 
 System.out.println("Welcome to our Music Store\n" +storename);

	 int trackId[];
	 String trackTitle[];
	 int trackLength[];
	 int trackReleaseDate[];
	 String genre[];
	 String artist[];
	 int trackQty[];
	 int price[];

       	 int num=0;
	Scanner sc=new Scanner(System.in);

		System.out.println("Enter 1 for adding Music Tracks");
		System.out.println("Enter 0 to exit");
		
		int option=sc.nextInt();
			
		if(option==1)
		{
			System.out.println("Enter the number of Music Track you are going to input: ");
			num=sc.nextInt();
			
			trackId = new int[num];
	 		trackTitle = new String[num];
	 		trackLength = new int[num];
	 		trackReleaseDate = new int[num];
	 		genre = new String[num];
	 		artist = new String[num];
	 		trackQty = new int[num];
	 		price = new int[num];

			for(int i = 0;i < num; i++)
			{
				System.out.println("Enter Track ID: ");
				trackId[i]=sc.nextInt();

				System.out.println("Enter Track Title: ");
				trackTitle[i]=sc.next();

				System.out.println("Enter Track Length: ");
				trackLength[i]=sc.nextInt();

				System.out.println("Enter Release Date: ");
				trackReleaseDate[i]=sc.nextInt();
				
				System.out.println("Enter Genre: ");
				genre[i]=sc.next();

				System.out.println("Enter Artist Name: ");
				artist[i]=sc.next();

				System.out.println("Enter Quantity: ");
				trackQty[i]=sc.nextInt();

				System.out.println("Enter Price: ");
				price[i]=sc.nextInt();
					if(price[i]<=0){
						System.out.println("Price cannot be zero or less. Enter the price of the "+trackTitle[i]+" again");
						price[i]=sc.nextInt(); }

			}	

			System.out.println("Track Id" + "Title" + "Length" + "Release Date" + "Genre" + "Artist" + "Quantity" + "Price");
			for(int i = 0;i < num;i++)
			{
				System.out.println(trackId[i] + "     " + trackTitle[i] + "     " + trackLength[i] + "     " + trackReleaseDate[i] + "     " + genre[i] + "     " + artist[i] + "     " + trackQty[i] + "     " + price[i]);
			}

		}	
		else
			System.exit(0);

	}

}

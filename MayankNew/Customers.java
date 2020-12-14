package MayankNew;       //package defined

public class Customers implements Printing{ //Implementing Interface Class method in Customers Class
	
	private String customerID = "0011001";
    private String customerName = "Mark";
	//Private access specifier to increase privacy
	
	@Override
	public void printDetails() {		//Interface class function
		System.out.println(customerID + "\t" + customerName);
	}
}
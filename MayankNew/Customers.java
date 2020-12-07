package MayankNew;
public class Customers implements Printing{
    private String customerID = "0011001";
    private String customerName = "Mark";

	@Override
	public void printDetails() {
		System.out.println(customerID + "\t" + customerName);
	}
}
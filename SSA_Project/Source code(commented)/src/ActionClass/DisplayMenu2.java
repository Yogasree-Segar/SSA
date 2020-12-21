package ActionClass;
//displaymenu2 for gp2
import DataStore.DataStore;
import DataStore.DataStore2;

public class DisplayMenu2 extends DisplayMenu{

	public DisplayMenu2(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		System.out.println("Credit Card Approved");
		System.out.println("Available gas types and prices:");
		System.out.println("Diesel" + d.Dprice);
		System.out.println("Regular" + d.Rprice);
		System.out.println("Super" + d.Sprice);
		System.out.println("Select the gas type");
		System.out.println("Enter 8 for Diesel \n 9 for Regular \n 10 for Super");
	}

}

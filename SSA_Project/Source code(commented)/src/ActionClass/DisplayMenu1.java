package ActionClass;
//displaymenu1 for gp1
import DataStore.DataStore;
import DataStore.DataStore1;

public class DisplayMenu1 extends DisplayMenu{

	public DisplayMenu1(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void displayMenu() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		System.out.println("Transaction accepted");
		System.out.println("Available gasoline's price:" + d.price);
		System.out.println("Select 4 to cancel");
		System.out.println("Select 7 to StartPump");
	}

}

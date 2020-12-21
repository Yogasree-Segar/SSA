package ActionClass;
//printreceipt1 for gp1 extends printreceipt
import DataStore.DataStore;
import DataStore.DataStore1;

public class PrintReceipt1 extends PrintReceipt{

	public PrintReceipt1(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		System.out.println("Total liters filled :" +d.L);
		System.out.println("Total cost is:" +d.total);
		
	}

}

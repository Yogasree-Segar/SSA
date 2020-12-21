package ActionClass;
//printreceipt2 for gp2 extends printreceipt
import DataStore.DataStore;
import DataStore.DataStore2;

public class PrintReceipt2 extends PrintReceipt {

	public PrintReceipt2(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void printReceipt() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		System.out.println("Total galloons of the selected gasoline filled:"+d.G);
		System.out.println("Total cost:"+d.total);
		
	}

}

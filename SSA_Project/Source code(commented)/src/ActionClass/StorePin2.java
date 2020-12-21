package ActionClass;
import DataStore.DataStore;
import DataStore.DataStore2;
import java.util.Scanner;

public class StorePin2 extends StorePin{
	String p;
	
	public StorePin2 (DataStore data) {
		super(data);
	}

	@Override
	public void storePin() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2)data;
		Scanner sc = new Scanner(System.in);
		p =sc.nextLine();
		d.settemp_p(p);
		d.pin = d.temp_p;
		
	}

}

package ActionClass;
import DataStore.DataStore;
import DataStore.DataStore1;
public class StoreCash1 extends StoreCash {
	
	public StoreCash1 (DataStore data) {
		super(data);
	}

	@Override
	public void storeCash() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		d.cash = d.temp_c;
		
	}

}

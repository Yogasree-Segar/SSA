package ActionClass;
import DataStore.DataStore;
import DataStore.DataStore1;
public class StorePrices1 extends StorePrices{
	
	public StorePrices1(DataStore data) {
		super(data);
	}

	@Override
	public void storePrices() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		d.price = d.temp_a;
		
	}

}

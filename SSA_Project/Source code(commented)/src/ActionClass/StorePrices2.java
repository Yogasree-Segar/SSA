package ActionClass;
import DataStore.DataStore;
import DataStore.DataStore2;
public class StorePrices2 extends StorePrices{
	
	public StorePrices2(DataStore data) {
		super(data);
	}

	@Override
	public void storePrices() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		d.Rprice = d.temp_a;
		d.Dprice = d.temp_b;
		d.Sprice = d.temp_c;
		
	}

}

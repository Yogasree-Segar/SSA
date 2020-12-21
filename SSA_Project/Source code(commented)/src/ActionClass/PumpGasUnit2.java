package ActionClass;
//pumpgasunit2 for gp2 extends pumpgasunit
import DataStore.DataStore;
import DataStore.DataStore2;


public class PumpGasUnit2 extends PumpGasUnit{

	public PumpGasUnit2(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void pumpGasUnit() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		d.G = d.G+1;
		d.total = d.price*d.G;
		
	}

}

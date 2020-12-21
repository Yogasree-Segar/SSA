package ActionClass;
//pumpgasunit1 for gp1 extends pumpgasunit
import DataStore.DataStore;
import DataStore.DataStore1;


public class PumpGasUnit1 extends PumpGasUnit{
	


	public PumpGasUnit1(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void pumpGasUnit() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		d.L = d.L+1;
		d.total = d.price * d.L;
		
	}

}

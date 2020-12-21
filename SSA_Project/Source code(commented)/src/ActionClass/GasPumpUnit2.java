package ActionClass;
//gaspumpunit1 for gp1 extending gaspumpunit
import DataStore.DataStore;
import DataStore.DataStore2;

public class GasPumpUnit2 extends GasPumpUnit{

	public GasPumpUnit2(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void gasPumpUnit() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		System.out.println("Pumped 1 gallon of selected gasoline");
		System.out.println("Total gallons pumped is:" +d.G);
		
	}

}

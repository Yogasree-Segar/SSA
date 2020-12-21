package ActionClass;
//gaspumpunit1 for gp1 extending gaspumpunit
import DataStore.DataStore;
import DataStore.DataStore1;

public class GasPumpUnit1 extends GasPumpUnit {

	public GasPumpUnit1(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void gasPumpUnit() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		System.out.println("Pumped 1 liter of gasoline");
		System.out.println("Total gas pumped is:" + d.L);
	 }

}

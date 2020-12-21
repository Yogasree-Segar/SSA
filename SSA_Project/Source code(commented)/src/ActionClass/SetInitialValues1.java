package ActionClass;

import DataStore.DataStore;
import DataStore.DataStore1;

public class SetInitialValues1 extends SetInitialValues {

	public SetInitialValues1(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void setInitialValues() {
		// TODO Auto-generated method stub
		DataStore1 d = (DataStore1) data;
		System.out.println("Pump started");
		d.L = 0;
		d.total = 0;
		
	}

}

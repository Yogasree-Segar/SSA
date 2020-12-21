package ActionClass;

import DataStore.DataStore;
import DataStore.DataStore2;

public class SetInitialValues2 extends SetInitialValues{

	public SetInitialValues2(DataStore data) {
		// TODO Auto-generated constructor stub
		super(data);
	}

	@Override
	public void setInitialValues() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		d.G = 0;
		d.total = 0;
		
	}

}

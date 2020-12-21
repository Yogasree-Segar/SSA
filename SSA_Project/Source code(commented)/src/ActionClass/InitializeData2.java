package ActionClass;
//initializedata2 for gp2 extending initializedata
import DataStore.DataStore;
import DataStore.DataStore2;

public class InitializeData2 extends InitializeData{
	public InitializeData2(DataStore data) {
		super(data);
	}

	@Override
	//@Override
	public void initializeData() {
		// TODO Auto-generated method stub
		DataStore2 d = (DataStore2) data;
		d.price = 0;
	}

}

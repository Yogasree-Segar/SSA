package ActionClass;
//super class for storepin extended by 2 classes for gp1 and gp2
import DataStore.DataStore;

public abstract class StorePin {
	DataStore data;
	public StorePin(DataStore data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public abstract void storePin();
}

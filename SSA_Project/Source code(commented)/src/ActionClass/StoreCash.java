package ActionClass;
//super class for storecash extended by 2 classes for gp1 and gp2
import DataStore.DataStore;

public abstract class StoreCash {
	DataStore data;
	public StoreCash(DataStore data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public abstract void storeCash();
}

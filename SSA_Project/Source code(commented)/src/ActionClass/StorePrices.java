package ActionClass;
import DataStore.DataStore;
//super class for storeprices extended by 2 classes for gp1 and gp2
public abstract class StorePrices {
	DataStore data;
	public StorePrices(DataStore data) {
		this.data = data;
	}
	public abstract void storePrices();
}

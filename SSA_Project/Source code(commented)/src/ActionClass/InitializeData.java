package ActionClass;
//initializedata super class
import DataStore.DataStore;

public abstract class InitializeData {
	DataStore data;
	public InitializeData(DataStore data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public abstract void initializeData();

}

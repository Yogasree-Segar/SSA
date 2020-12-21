package ActionClass;
//super displaymenu class
import DataStore.DataStore;

public abstract class DisplayMenu {
	DataStore data;
	public DisplayMenu(DataStore data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}

	public abstract void displayMenu();
}

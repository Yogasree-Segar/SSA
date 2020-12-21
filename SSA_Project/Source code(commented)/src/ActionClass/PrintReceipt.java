package ActionClass;
import DataStore.DataStore;
//printreceipt super class
public abstract class PrintReceipt {
	DataStore data;
	public PrintReceipt(DataStore data) {
		this.data = data;
	}
	public abstract void printReceipt();
}

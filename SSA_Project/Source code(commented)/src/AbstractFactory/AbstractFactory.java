package AbstractFactory;
//super abstract factory class connected to OP for the processes to be executed by the respective GPs. All func of OP are declared.
import ActionClass.CancelMsg;
import ActionClass.DisplayMenu;
import ActionClass.EjectCard;
import ActionClass.EnterPinMsg;
import ActionClass.GasPumpUnit;
import ActionClass.InitializeData;
import ActionClass.PayMsg;
import ActionClass.PrintReceipt;
import ActionClass.RejectMsg;
import ActionClass.PumpGasUnit;
import ActionClass.ReturnCash;
import ActionClass.SetInitialValues;
import ActionClass.SetPrice;
import ActionClass.SetW;
import ActionClass.StoreCash;
import ActionClass.StorePin;
import ActionClass.StorePrices;
import ActionClass.WrongPinMsg;
import DataStore.DataStore;

public abstract class AbstractFactory {
	
	public abstract DataStore getData();
	public abstract CancelMsg getcancelMsg();
	public abstract DisplayMenu getdisplayMenu();
	public abstract EjectCard getejectCard();
	public abstract EnterPinMsg getenterPinMsg();
	public abstract GasPumpUnit getgasPumpUnit();
	public abstract InitializeData getinitializeData();
	public abstract PayMsg getpayMsg();
	public abstract PrintReceipt getprintReceipt();
	public abstract RejectMsg getrejectMsg();
	public abstract PumpGasUnit getpumpGasUnit();
	public abstract ReturnCash getreturnCash();
	public abstract SetInitialValues getsetInitialValues();
	public abstract SetPrice getsetPrice();
	public abstract SetW getsetW();
	public abstract StoreCash getstoreCash();
	public abstract StorePin getstorePin();
	public abstract StorePrices getstorePrices();
	public abstract WrongPinMsg getwrongPinMsg();
}

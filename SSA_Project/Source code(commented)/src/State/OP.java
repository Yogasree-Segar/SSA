package State;

import AbstractFactory.AbstractFactory;
import ActionClass.StorePin;
import ActionClass.StorePrices;
import ActionClass.WrongPinMsg;
import ActionClass.ReturnCash;
import ActionClass.SetInitialValues;
import ActionClass.SetPrice;
import ActionClass.SetW;
import ActionClass.StoreCash;
import ActionClass.PayMsg;
import ActionClass.PrintReceipt;
import ActionClass.PumpGasUnit;
import ActionClass.RejectMsg;
import ActionClass.EjectCard;
import ActionClass.EnterPinMsg;
import ActionClass.GasPumpUnit;
import ActionClass.InitializeData;
import ActionClass.DisplayMenu;
import ActionClass.CancelMsg;
//OP state that contains all the output processes.
public class OP {
	private StorePin storepin;
	private StorePrices storeprices;
	private WrongPinMsg wrongpinmsg;
	private ReturnCash returncash;
	private SetInitialValues setinitialvalues;
	private SetPrice setprice;
	private SetW setw;
	private StoreCash storecash;
	private PayMsg paymsg;
	private PrintReceipt printreceipt;
	private PumpGasUnit pumpgasunit;
	private RejectMsg rejectmsg;
	private EjectCard ejectcard;
	private EnterPinMsg enterpinmsg;
	private GasPumpUnit gaspumpunit;
	private InitializeData initializedata;
	private CancelMsg cancelmsg;
	private DisplayMenu displaymenu;
	 
	public OP(AbstractFactory af) { //connected to af for specific gas pumps
		// TODO Auto-generated constructor stub
		cancelmsg = af.getcancelMsg();
		storepin = af.getstorePin();
		storeprices = af.getstorePrices();
		wrongpinmsg = af.getwrongPinMsg();
		returncash = af.getreturnCash();
		setinitialvalues = af.getsetInitialValues();
		setprice = af.getsetPrice();
		setw = af.getsetW();
		storecash = af.getstoreCash();
		paymsg = af.getpayMsg();
		printreceipt = af.getprintReceipt();
		pumpgasunit = af.getpumpGasUnit();
		rejectmsg = af.getrejectMsg();
		ejectcard = af.getejectCard();
		enterpinmsg = af.getenterPinMsg();
		gaspumpunit = af.getgasPumpUnit();
		initializedata = af.getinitializeData();
		displaymenu = af.getdisplayMenu();
		
	}
	//includes all OP that are extended in the Stratergy classes
	public void cancelMsg() {
		this.cancelmsg.cancelMsg();
	}
	public void storePin() {
		this.storepin.storePin();
	}
	public void storePrices() {
		this.storeprices.storePrices();
	}
	public void wrongPinMsg() {
		this.wrongpinmsg.wrongPinMsg();
	}
	public void returnCash() {
		this.returncash.returnCash();
	}
	public void setInitialValues() {
		this.setinitialvalues.setInitialValues();
	}
	public void setPrice(int a) {
		this.setprice.setPrice(a);
	}
	public void setW(int a) {
		this.setw.setW(a);
	}
	public void storeCash() {
		this.storecash.storeCash();
	}
	public void payMsg() {
		this.paymsg.payMsg();
	}
	public void printReceipt() {
		this.printreceipt.printReceipt();
	}
	public void pumpGasUnit() {
		this.pumpgasunit.pumpGasUnit();
	}
	public void rejectMsg() {
		this.rejectmsg.rejectMsg();
	}
	public void ejectCard() {
		this.ejectcard.ejectCard();
	}
	public void enterPinMsg() {
		this.enterpinmsg.enterPinMsg();
	}
	public void gasPumpUnit() {
		this.gaspumpunit.gasPumpUnit();
	}
	public void initializeData() {
		this.initializedata.initializeData();
	}
	public void displayMenu() {
		this.displaymenu.displayMenu();
	}
}

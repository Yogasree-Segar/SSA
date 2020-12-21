package DataStore;

public class DataStore2 extends DataStore {//DS2 for GP2 that extends DS
	//permanent variables
	public String pin;
	public float price;
	public int G;
	public float total;
	public float Rprice;
	public float Dprice;
	public float Sprice;
	
	//temporary variables
	
	public float temp_a;
	public float temp_b;
	public String temp_p;
	public float temp_c;
	
	//setters and getters
	public float price() {
		return price;
	}
	public void setprice(float Price) {
		price = Price;
	}
	public float Rprice() {
		return Rprice;
	}
	public void setRprice(float rPrice) {
		Rprice = rPrice;
	}
	public float Sprice() {
		return Sprice;
	}
	public void setSprice(float sPrice) {
		Sprice = sPrice;
	}
	public float Dprice() {
		return Dprice;
	}
	public void setDprice(float dPrice) {
		Dprice = dPrice;
	}
	public float getTemp_a() {
		return temp_a;
	}
	public void settemp_a(float a) {
		temp_a = a;
	}
	public float getTemp_c() {
		return temp_c;
	}
	public void settemp_c(float c) {
		temp_c = c;
	}
	public float getTemp_b() {
		return temp_b;
	}
	public void settemp_b(float b) {
		temp_b = b;
	}
	public String getTemp_p() {
		return temp_p;
	}
	public void settemp_p(String p) {
		temp_p = p;
	}
}

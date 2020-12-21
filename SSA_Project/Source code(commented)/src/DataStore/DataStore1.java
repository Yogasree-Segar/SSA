package DataStore;

public class DataStore1 extends DataStore {//DS1 for GP1 that extends DS
	//permanent variables
	public int price;
	public int cash;
	public int total;
	public int L;
	public int w;
	
	//temporary variables
	public int temp_c;
	public int temp_a;
	
	//setters and getters
	public int price() {
		return price;
	}
	public void setprice(int Price) {
		price = Price;
	}
	public int getcash() {
		return cash;
	}
	public int gettotal() {
		return total;
	}
	public void settotal(int Total)
	{
		total = Total;
	}
	public int getL() {
		return L;
	}
	public void setL(int l) {
		L = l;
	}
	public int getW() {
		return w;
	}
	public void setW(int W) {
		w = W;
	}
	public int getTemp_a() {
		return temp_a;
	}
	public void settemp_a(int a) {
		temp_a = a;
	}
	public int getTemp_c() {
		return temp_c;
	}
	public void settemp_c(int c) {
		temp_c = c;
	}
}

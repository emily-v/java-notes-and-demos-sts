package a;

public class Shape {

	// most visible
	public int pub_number = 0; // variable or method is able to be seen anywhere in the application
	
	// cannot be seen outside of the package, EXCEPT by classes that inherit it
	// look at package b Rectangle class - extends Shape in package a
	protected int pro_number = 3;
	
	public int getPub_number() {
		return pub_number;
	}


	public void setPub_number(int pub_number) {
		this.pub_number = pub_number;
	}


	public int getPro_number() {
		return pro_number;
	}


	public void setPro_number(int pro_number) {
		this.pro_number = pro_number;
	}


	public int getDef_number() {
		return def_number;
	}


	public void setDef_number(int def_number) {
		this.def_number = def_number;
	}


	public int getPriv_number() {
		return priv_number;
	}


	public void setPriv_number(int priv_number) {
		this.priv_number = priv_number;
	}


	// default means the variable cannot be seen outside of the package
	int def_number = 2;
	
	// private variables cannot be seen outside of the class
	private int priv_number = 1;
	// least visible
	
	
	@Override
	public String toString() {
		return "Shape [pub_number=" + pub_number + ", pro_number=" + pro_number + ", def_number=" + def_number
				+ ", priv_number=" + priv_number + "]";
	}
	
	
}

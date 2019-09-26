package lab2;

public class BuddyInfo {
	private String Name;
	private String address;
	private int phone_number;
	
	
	public BuddyInfo(String a, String b, String c) {
		//empty constructor 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		BuddyInfo name = new BuddyInfo("", "", "");
		System.out.println(name.getName("Homer"));
		
	}

	public String getName(String Name) {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address; //returns address that is given as new address
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}
	
	
	

}

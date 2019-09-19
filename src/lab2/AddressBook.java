package lab2;
import java.util.ArrayList;
public class AddressBook {
	
	private ArrayList <BuddyInfo> addressBook; //for my collection of BuddyInfo Objects
	
	public void addBuddy(BuddyInfo bud) {
		this.addressBook.add(bud); //to add bud to my collection
	}
	
	public void removeBuddy(BuddyInfo bud) {
		this.addressBook.remove(bud); //to remove bud from my collection
	}
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		System.out.println("Address Book");
	}
}


public class App {

	public static void main(String[] args) {
    //3a. Item Price
		double itemPrice = 10.00;
	//b. Amount of money in wallet
		double marshasMoneyInWallet = 25.00;
	//c. Number of friends= 18;
		int marshasNumOfFriends = 98;
	//d. Age in years (as a whole number)
		int marshasAge = 41;
	//e. First name
		String firstName = "Marsha";
	//f. Last name
		String lastName = "Greyeyes";
	//g. Middle initial
		char middleInitial = 'R';
	
	//a. Item Price 2
		double itemPrice2 = 6.00;
	//b. Amount of money in wallet 2
		double cameronsMoneyInWallet = 17.00;
	//c. Number of friends 2= 10;
		int cameronsNumOfFriends = 105;
	//d. Age in years 2 (as a whole number)
		int cameronsAge = 21;
	//e. First name 2
		String firstName2 = "Cameron";
	//f. Last name 2
		String lastName2 = "Dee";
	//g. Middle initial 2
		char middleInitial2 = 'E';
		
	//4 a. New amount of money in wallet after buying the item 
	double marshasMoneyInWalletAfterPurchase = marshasMoneyInWallet - itemPrice;
	double cameronsMoneyInWalletAfterPurchase = cameronsMoneyInWallet - itemPrice2;
	
	  //b. Number of friends made each year based on age variable
	    //and number of friends variable. 
	int customer1sNumberOfFriendsMadeYearly = marshasNumOfFriends / marshasAge;
	int customer2sNumberOfFriendsMadeYearly = cameronsNumOfFriends / cameronsAge;
	
	  //c. Full name based on First name, middle initial, and last name
	String fullname = firstName + " " + middleInitial + " " + lastName;
	String fullname2 = firstName2 + " " + middleInitial2 + " " + lastName2;
	
	
	//5.C1 = Customer 1, C2 = Customer 2
	System.out.println("Full Name of Customer 1 (C1):" + " " + fullname);
		System.out.println("C1's Item Price:" + " " + itemPrice);
		System.out.println("C1's Spending Money:" + " " + marshasMoneyInWallet);
		System.out.println("C1's friends:" + " " + marshasNumOfFriends);
		System.out.println("C1's Age" + " " + marshasAge);
		System.out.println("C1's Friends Made Per Year:" + " " + customer1sNumberOfFriendsMadeYearly);
		System.out.println("C1's First Name:" + " " + firstName);
		System.out.println("C1's Middle Name:" + " " + middleInitial);	
		System.out.println("C1's Last Name:" + " " + lastName);
		System.out.println("C1's Spending Money After Purchase of Item 1:" + " " + marshasMoneyInWalletAfterPurchase);
		System.out.println(" ");
	System.out.println("Full Name of Customer 2 (C2):" + " " + fullname2);
		System.out.println("C2's Item Price:" + " " + itemPrice2);
		System.out.println("C2's Spending Money:" + " " + cameronsMoneyInWallet);
		System.out.println("C2's friends:"+ " " + cameronsNumOfFriends);
		System.out.println("C2's Age:" + " " + cameronsAge);
		System.out.println("C2's Friends Made Per Year:" + " " + customer2sNumberOfFriendsMadeYearly);
		System.out.println("C2's First Name:" + " " + firstName2);
		System.out.println("C2's Middle Initial:" + " " + middleInitial2);
		System.out.println("C2's Last Name:" + " " + lastName2);
		System.out.println("C2's Spending Money After Purchase of Item 2:" + " " +cameronsMoneyInWalletAfterPurchase);
		
		}

}

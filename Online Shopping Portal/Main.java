public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers customerObj1 = new Customers(1001, "Saakshi", 9000000000L, "Bangalore", "16-Jul-1990", 'F', "Lakme Kajal, Salwar" );
      Customers customerObj2 = new Customers(1008, "Rahul", 9000000001L, "Chennai", "27-Jan-1992", 'M', "T-Shirt, Jeans");
      Suppliers supplierObj1 = new Suppliers(7901, "ABC Traders", 8000000000L, "Mumbai", 10, "Paid", 4.75f);
      Suppliers supplierObj2 = new Suppliers(7972, "XYZ Enterprises", 8000000900L, "kolkata", 7, "Unpaid", 4.35f);
      customerObj1.display();
      customerObj2.display();
      supplierObj1.display();
      supplierObj2.display();
      customerObj1.editAddress("Coimbatore");
      supplierObj1.editAddress("Delhi");
      customerObj1.placeOrder();
      supplierObj1.increaseStockLevel(5);
      supplierObj2.increaseStockLevel(10);
    }	
}

class Users {
		//write the logic for the class Users
  int id;
  String name;
  long mobileNumber;
  String address;
}

class Customers extends Users{
		//write the logic for the class Customers
  String dateOfBirth;
  char gender;
  String orderHistory;
  public Customers(int id, String name, long mobileNumber, String address,String dateOfBirth, char gender, String orderHistory)
  {
    this.id = id;
    this.name = name;
    this.mobileNumber = mobileNumber;
    this.address = address;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.orderHistory = orderHistory;
  }
  public void display()
  {
    System.out.println(name+ ", " + mobileNumber);
  }
  public void editAddress(String newaddress)
  {
    System.out.println(name + ", " + address);
    address = newaddress;
    System.out.println(name + ", " + address);
  }
  public void placeOrder()
  {
    System.out.println("Order placed successfully!");
  }
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  int itemsStock;
  String paymentStatus;
  float feedbackRating;
  public Suppliers(int id, String name, long mobileNumber, String address, int itemsStock, String paymentStatus, float feedbackRating)
  {
    this.id = id;
    this.name = name;
    this.mobileNumber = mobileNumber;
    this.address = address;
    this.itemsStock = itemsStock;
    this.paymentStatus = paymentStatus;
    this.feedbackRating = feedbackRating;
  }
  public void display()
  {
    System.out.println(name+ ", " + mobileNumber);
  }
  public void editAddress(String newaddress)
  {
    System.out.println(name + ", " + address);
    this.address = newaddress;
    System.out.println(name + ", " + address);
  }
  public void increaseStockLevel(int a)
  {
    System.out.println(name+", "+(itemsStock+a));
  }
}
public class Cashier {
public void checkOut(GroceryItem item) {
System.out.println("You have purchased " + item.name);
}
public void ShowItemPrice(GroceryItem item) {
System.out.println(item.name + "PHP " + item.price); 
}
}

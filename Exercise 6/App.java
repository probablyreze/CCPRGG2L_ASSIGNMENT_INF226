public class App {
 public static void main(String[] args) throws Exception {
//Polymorphic variables
GroceryItem item1 = new Shampoo();
item1.name = "Palmolive";
item1.showItemName();
item1.price = 120;

GroceryItem item2 = new Powder();
item2.name = "Johnson and Johnson"; 
item2.showItemName();
item2.price = 50;

// cashier
Cashier c1 = new Cashier();
c1.checkOut(item1);
c1.checkOut(item2);
c1.itemPrice(item1);
c1.itemPrice(item2);
//Polymorphic Array
GroceryItem[] itemArray = new GroceryItem[2];
itemArray[0] = item1;
itemArray[1] = item2;
double totalPrice = 0; 
for (int i = 0; i< itemArray.length; i++) {
itemArray[i].showItemName();
System.out.println(itemArray[i].price);
totalPrice += itemArray[i].price; 
}
System.out.println();
System.out.println("Total Price: " + totalPrice); 
Dog mydog = new Cat();
mydog.eat();
}        
}

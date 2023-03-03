public class Car {
String color;
String name;
Person owner;
 // constructor
Car(String carColor, String carName, Person carOwner){
this.color = carColor;
this.name = carName;
this.owner = carOwner;
}
// method
void showOwner(){
 System.out.println("My name is " + owner.name + ". My car is a " + this.name + " and its color is " + this.color);
}
}  

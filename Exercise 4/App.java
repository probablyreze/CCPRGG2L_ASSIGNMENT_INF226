public class App {
public static void main(String[] arge) throws Exception {
// Person Object
Person Me = new Person("Reze",  18);
// Person Object
Person Friend = new Person("Haerin",  16);
Me.addfriend(Friend);
// Pet Object
Pet Cat = new Pet( "Hanni",  18, Me);
Cat.showOwner();
// Classmate1 Object
Person Classmate1 = new Person ( Me",  18); 
Me.addClassmate1(Classmate1);
// Classmate2 Object
Person Classmate2 = new Person ( "Hyein",  14); 
Me.addClassmate1(Classmate2);
// Classmate3 Object
Person Classmate3 = new Person ( "Minji",  19); 
Me.addClassmate1(Classmate3);
// Pet Object
Car Cadillac = new Car("Cadillac Escalade ", Me);
Cadillac.showCar();
}
}

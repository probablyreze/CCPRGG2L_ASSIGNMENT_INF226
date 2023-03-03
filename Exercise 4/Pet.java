public class Pet {
//Attributes
String name;
int age;
Person owner;
//Constructor
Pet(String PetName, int PetAge, Person ownerName){
this.name = PetName;
this.age = PetAge;
this.owner = ownerName;
}
// Owner Method
void showOwner(){
System.out.println("My name is " + this.name +  " My owner name is " + owner.name);}
}

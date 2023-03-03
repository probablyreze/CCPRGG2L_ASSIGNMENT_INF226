public class Person {
String name;
int age;
Person(String personName, int personAge) {
this.name= personName;
this.age= personAge;
}
void addFriend(Person friend) {
System.out.println(this.name + " is friends with " + friend.name);
}
void addClassmate(Person classmate) {
System.out.println(this.name + " is classmates with " + classmate.name);
}
}

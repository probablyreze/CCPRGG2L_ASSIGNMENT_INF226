public class App {
public static void main(String[] args) throws Exception {
Person me = new Person();
//System.out.print(me.name);
 me.setName("Reze");
System.out.println(me.getName());
Daughter myself = new Daughter();
System.out.println(myself.surname);
myself.showSurname();
}
}

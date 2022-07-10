package addressBook;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class multipleContacts {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        List<Contacts> contactsArrayList = new ArrayList<Contacts>();
       // public void addContact () {
            Contacts contacts = new Contacts();
            System.out.println("FirstName: ");
            // @@ -18,21 +21,19 @@ public void addContact(){
            String address = null;
            contacts.setAddress(address);
            System.out.println("City: ");
            String city = scan.next();
            contacts.setState(city);
            contacts.setCity(city);
            System.out.println("State: ");
            String state = scan.next();
            contacts.setState(state);
            System.out.println("Zip: ");
            String zip = scan.next();
            contacts.setState(zip);
            contacts.setZip(zip);
            System.out.println("phone: ");
            String phone = scan.next();
            contacts.setState(phone);
            contacts.setPhone(phone);
            System.out.println("Email: ");
            String email = scan.next();
            contacts.setState(email);

            System.out.println(contacts.toString());

            contacts.setEmail(email);
            contactsArrayList.add(contacts);
        }


    }

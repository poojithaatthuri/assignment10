package addressBook;
import java.util.Scanner;
public class addressBook {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        {
            Contacts contacts = new Contacts();
            System.out.println("FirstName: ");
            String firstName = scan.next();
            contacts.setFirstName(firstName);
            System.out.println("LastName: ");
            String lastName = scan.next();
            contacts.setLastName(lastName);
            System.out.println("Address: ");
            String address = scan.next();
            contacts.setAddress(address);
            System.out.println("City: ");
            String city = scan.next();
            contacts.setState(city);
            System.out.println("State: ");
            String state = scan.next();
            contacts.setState(state);
            System.out.println("Zip: ");
            String zip = scan.next();
            contacts.setState(zip);
            System.out.println("phone: ");
            String phone = scan.next();
            contacts.setState(phone);
            System.out.println("Email: ");
            String email = scan.next();
            contacts.setState(email);

            System.out.println(contacts.toString());

        }

    }

    public void addContact() {

    }
}
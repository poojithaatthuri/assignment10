package addressBook;
import java.util.Scanner;
  public class addressBookMain {

    public static void main(String[] args) {
      boolean wantToAddContact = true;
      boolean wantToEditContact = true;
      boolean wantToDeleteContact = true;
      System.out.println("Welcome to Address Book System");
      /* AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.addContact();
        //UC2 add contacts
        for (Contacts contacts : addressBook.contactsArrayList) {
            System.out.println("The" + contacts);
        }
        //UC3 edit contacts
        addressBook.editContacts();
        System.out.println("After editing: ");
        System.out.println("*********************");
        for (Contacts contacts:addressBook.contactsArrayList) {
            System.out.println("the"+contacts);
        }
        System.out.println("*********************");
        //UC4 delete users
        addressBook.deleteContacts();
        for (Contacts contacts:addressBook.contactsArrayList) {
            System.out.println("the" + contacts);
        }*/


      boolean menuAgain = true;
      Scanner sc = new Scanner(System.in);

      addressBook addressBook = new addressBook();

      start:
      while (menuAgain) {
        System.out.println("Welcome to Address Book Program");
        System.out.println("Select options(1 to 5) below:");
        System.out.println("1. Add Contact");
        System.out.println("2. Edit Contact");
        System.out.println("3. Delete Contact");
        System.out.println("4. View Contacts");
        System.out.println("5. Exit Program");
        int choice = sc.nextInt();

        switch (choice) {
          case 1:
            while (wantToAddContact) {
              addressBook.addContact();

              System.out.println("Do you wish to add another contact? (Enter Y to add or any key as No)");
              char c = sc.next().charAt(0);

              if (c == 'y' || c == 'Y') {
                continue;
              } else {
                break;
              }
            }

            System.out.println("Your Contacts : ");

            for (Contacts contact : addressBook.contactsArrayList) {
              System.out.println(contact);
            }
            break;
          case 2:
            while (wantToEditContact) {
              addressBook.editContacts();

              System.out.println("Do you wish to edit another contact? (Enter Y to edit or any key as No)");
              char c2 = sc.next().charAt(0);

              if (c2 == 'y' || c2 == 'Y') {
                continue;
              } else {
                break;
              }
            }
            System.out.println("Your Updated Contacts : ");

            for (Contacts contact : addressBook.contactsArrayList) {
              System.out.println(contact);
            }

            break;
          case 3:
            while (wantToDeleteContact) {
              addressBook.deleteContacts();

              System.out.println("Do you wish to delete another contact? (Enter Y to delete or any key as No)");
              char c3 = sc.next().charAt(0);

              if (c3 == 'y' || c3 == 'Y') {
                continue;
              } else {
                break;
              }
            }
            System.out.println("Your Updated Contacts : ");

            for (Contacts contact : addressBook.contactsArrayList) {
              System.out.println(contact);
            }

            break;
          case 4:
            System.out.println("Your Contacts : ");

            for (Contacts contact : addressBook.contactsArrayList) {
              System.out.println(contact);
            }
            break;
          case 5:
            System.out.println("Exiting program");
            break;
          default:
            System.out.println("Incorrect Input. Please enter options between 1 to 5.");
            continue start;
        }

        if (choice == 5) {
          break;
        } else {
          System.out.println("Do you wish to return to menu? (Enter Y as Yes or any key as No)");
          char c = sc.next().charAt(0);

          if (c == 'y' || c == 'Y') {
            continue;
          } else {
            System.out.println("Exiting program");
            break;
          }

        }
      }
    }
  }

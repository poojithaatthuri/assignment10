package addressBook;

  public class addressBookMain {
      public static void main(String[] args)
      {
          System.out.println("Welcome to Address Book System");
          addressBook addressBook = new addressBook();
          addressBook.addContact();
          addressBook.addContact();
          //UC2 add contacts
          for (Contacts contacts : addressBook.contactsArrayList)

              System.out.println("The" + contacts);
          }

}

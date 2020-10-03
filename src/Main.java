
import java.util.Scanner;

public class Main {

    public static void main(String [] args){
     ContactsManager myContactmaneger = new ContactsManager();
     Contacts myfriend = new Contacts();
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter Name:");
       String continfo = sc.nextLine();
     myfriend.Name = continfo;
     System.out.println("Enter phone number:");
      continfo = sc.nextLine();
      myfriend.phoneNumber = continfo;

       myContactmaneger.addContact(myfriend);

       Contacts resulted = myContactmaneger.searchContact(myfriend.Name);

     System.out.println(resulted.Name);
     System.out.println(resulted.phoneNumber);

    }
}

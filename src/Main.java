public class Main {

    public static void main(String [] args){
     ContactsManager myContactmaneger = new ContactsManager();
     Contacts myfriendMarcos = new Contacts();
     myfriendMarcos.Name = "Marcos";
     myfriendMarcos.phoneNumber = "45636576";
       myContactmaneger.addContact(myfriendMarcos);

       Contacts resulted = myContactmaneger.searchContact("Marcos");
     System.out.println(resulted.phoneNumber);

    }
}

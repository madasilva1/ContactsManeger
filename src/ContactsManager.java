public class ContactsManager {
    Contacts Myfriends [];
    int friendsCount ;

    ContactsManager(){

        this.friendsCount = 0;
        this.Myfriends = new Contacts[500];

    }
     void addContact(Contacts contact){
        Myfriends[friendsCount] = contact;
        friendsCount++;
     }
    Contacts searchContact(String searchName){
        for(int i = 0;  i < friendsCount; i++){
            if(Myfriends[i].Name.equals(searchName) ){

                return Myfriends[i] ;

            }

        }
        return  null;
     }
}

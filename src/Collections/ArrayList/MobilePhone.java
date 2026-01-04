package Collections.ArrayList;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        boolean found = false;
        for (Contact c : myContacts) {
            if (c.getName().equals(contact.getName())) {
                return false;
            }
        }
       myContacts.add(contact);
        return true;
        }


    public boolean updateContact(Contact oldContact, Contact newContact){
        if(myContacts.contains(oldContact)){
            int index = myContacts.indexOf(oldContact);
            myContacts.remove(index);
            myContacts.add(index, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        if (myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    private int findContact(Contact contact){
        if (myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        }
        else return -1;
    }

    private int findContact(String name){
        int result=0;
        boolean found=false;
        for (Contact c : myContacts){
            if (c.getName().equals(name)){
                found=true;
                result = myContacts.indexOf(c);
            }
        }
        if (found==true) return result;
        else return -1;
    }

    public Contact queryContact(String name){
        int indexOfContact = findContact(name);

        if (indexOfContact>=0){
            return myContacts.get(indexOfContact);
        }
        else return null;
    }

    public void printContacts(){
        int i = 1;
        System.out.println("Contact List:");
        for (Contact c : myContacts){
            System.out.println(i+". "+c.getName()+" -> "+c.getPhoneNumber());
            i++;
        }
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class AddressBook {
    List<Contact> adBook=new ArrayList<>();
    public void display(){
        System.out.println(adBook);
    }
    public void createContact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String name=sc.next();
        System.out.println("Enter Last Name: ");
        String lname=sc.next();
        System.out.println("Enter City: ");
        String city=sc.next();
        System.out.println("Enter State: ");
        String state=sc.next();
        System.out.println("Enter Email: ");
        String email=sc.next();
        System.out.println("Enter Phone: ");
        int phone=sc.nextInt();
        System.out.println("Enter Zip: ");
        int zip=sc.nextInt();
        Contact c1=new Contact(name,lname,city,state,email,phone,zip);
        adBook.add(c1);
    }

    public void editContact()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name of the contact to edit: ");
        String firstname=sc.next();
        boolean found=false;
        for(Contact contact:adBook)
        {
            if(contact.firstname.equalsIgnoreCase(firstname)){
                found=true;
                System.out.println("Editing contact: "+contact);
                System.out.println("Enter new first name: ");
                contact.firstname=sc.next();
                System.out.println("Enter new last name: ");
                contact.lastname=sc.next();
                System.out.println("Enter new city: ");
                contact.city=sc.next();
                System.out.println("Enter new state: ");
                contact.state=sc.next();
                System.out.println("Enter new email: ");
                contact.email=sc.next();
                System.out.println("Enter new phone: ");
                contact.phone=sc.nextInt();
                System.out.println("Enter new zip: ");
                contact.zip=sc.nextInt();

                System.out.println("Contact updated Successfully!");
                System.out.println("Updated Contact: "+ contact);
                break;
            }
        }
        if(!found){
            System.out.println("Contact with the given first name not found.");
        }
    }
    public void deleteContact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name of the contact to delete: ");
        String firstname=sc.next();

        boolean removed=adBook.removeIf(contact->contact.firstname.equalsIgnoreCase(firstname));
        if(removed){
            System.out.println("Contact with first name '"+firstname + "'deleted successfully!");
        }
        else{
            System.out.println("No contact found with the given first name.");
        }
    }
}

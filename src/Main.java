import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AddressBook a1=new AddressBook();
        int i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Address Book");
        do{
            System.out.println("Enter 1 to create contact \n Enter 2 to display all contacts \n Enter 3 to edit details \n Enter 4 to delete a contact");
            int input=sc.nextInt();
            switch (input){
                case 1-> a1.createContact();
                case 2-> a1.display();
                case 3-> a1.editContact();
                case 4-> a1.deleteContact();
                default -> System.out.println("wrong input");
            }
            System.out.println("Enter 0 to exit");
            i=sc.nextInt();

        }while(i!=0);
        System.out.println("Thanks for visit!");
        sc.close();

    }

}
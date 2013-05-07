import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<Customer>();

        for(int i = 0; true; i++)
        {
            String name, address, telephone, number;
            boolean onMailingList;

            System.out.println("Customer #" + i + "\n" +
                               "------------");
            System.out.print("Name: ");
            name = scanner.next();

            System.out.print("Address: ");
            address = scanner.next();

            System.out.print("Telephone: ");
            telephone = scanner.next();

            System.out.print("Customer number: ");
            number = scanner.next();

            System.out.print("On mailing list (true or false): ");
            onMailingList = scanner.nextBoolean();

            customers.add(new Customer(name, address, telephone, number, onMailingList));

            System.out.print("Add another customer (true or false): ");

            if(!scanner.nextBoolean())
            {
                break;
            }

            System.out.println();
        }

        for(Customer customer : customers)
        {
            System.out.println("\nCustomer Number " + customer.getNumber() + "\n" +
                               "----------------------\n" +
                               "Name: " + customer.getName() + "\n" +
                               "Address: " + customer.getAddress() + "\n" +
                               "Telephone: " + customer.getTelephone() + "\n" +
                               "On mailing list: " + customer.isOnMailingList());
        }
    }
}

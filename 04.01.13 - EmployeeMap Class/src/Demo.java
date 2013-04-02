import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        EmployeeMap employeeMap = new EmployeeMap();

        employeeMap.add(new Employee("Bill", 1));
        employeeMap.add(new Employee("Lucy", 3));
        employeeMap.add(new Employee("CEO", 0));
        employeeMap.add(new Employee("George", 432));

        while(true)
        {
            try
            {
                System.out.print("Enter the id of the employee: ");
                int id = scanner.nextInt();

                String name = employeeMap.lookUp(id);

                if(name == null)
                {
                    throw new Exception();
                }

                System.out.println(name + " is the employee's name.");
            }
            catch(Exception e)
            {
                System.out.println("Please enter a valid employee id!");
            }
        }
    }
}

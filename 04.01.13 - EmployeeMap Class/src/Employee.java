public class Employee
{
    private String name;
    private int id;

    /**
     * Creates a new Employee
     * 
     * @param name Employee's name
     * @param id Employee's id
     */
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    /**
     * Returns the id of the employee.
     * 
     * @return Id of the employee.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Returns the name of the employee.
     * 
     * @return Name of the employee.
     */
    public String getName()
    {
        return name;
    }
}

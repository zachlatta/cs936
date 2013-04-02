import java.util.SortedMap;
import java.util.TreeMap;

public class EmployeeMap
{
    private SortedMap<Integer, String> map = new TreeMap<Integer, String>();

    /**
     * Adds an employee to the map.
     *
     * @param employee Employee to add.
     */
    public void add(Employee employee)
    {
        map.put(employee.getId(), employee.getName());
    }

    /**
     * Look up an employee in the map.
     *
     * @param id Employee id to look up.
     * @return Matching employee's name.
     */
    public String lookUp(int id)
    {
        return map.get(id);
    }
}

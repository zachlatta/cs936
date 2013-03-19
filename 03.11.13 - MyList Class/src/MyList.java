import java.util.ArrayList;

public class MyList<T extends Number>
{
    private ArrayList<T> innerList;

    public MyList()
    {
        innerList = new ArrayList<T>();
    }

    public void add(T item)
    {
        innerList.add(item);
    }

    public T largest()
    {
        sort(innerList);

        return innerList.get(innerList.size() - 1);
    }

    public T smallest()
    {
        sort(innerList);

        return innerList.get(0);
    }

    private void sort(ArrayList<T> array)
    {
        NumberSorter.sort(array);
    }
}

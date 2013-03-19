import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        Collections.sort(array, new Comparator<T>()
        {
            @Override
            public int compare(T o1, T o2)
            {
                return o1.byteValue() - o2.byteValue();
            }
        });
    }
}

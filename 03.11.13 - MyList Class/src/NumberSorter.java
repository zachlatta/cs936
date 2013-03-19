import java.util.ArrayList;
import java.util.Collections;

public class NumberSorter
{
    public static <T extends Number> void sort(ArrayList<T> array)
    {
        quicksort(array, 0, array.size() - 1);
    }

    private static <T extends Number> void quicksort(ArrayList<T> array, int start, int end)
    {
        int pivotPoint;

        if (start < end)
        {
            pivotPoint = partition(array, start, end);

            quicksort(array, start, pivotPoint - 1);
            quicksort(array, pivotPoint + 1, end); }
    }

    private static <T extends Number> int partition(ArrayList<T> array, int start, int end)
    {
        T pivotValue;
        int endOfLeftList;
        int mid;

        mid = (start + end) / 2;
        swap(array, start, mid);

        pivotValue = array.get(start);
        endOfLeftList = start;

        for (int scan = start + 1; scan <= end; scan++)
        {
            if (array.get(scan).doubleValue() < pivotValue.doubleValue())
            {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }

        swap(array, start, endOfLeftList);

        return endOfLeftList;
    }

    private static <T extends Number> void swap(ArrayList<T> array, int a, int b)
    {
        Collections.swap(array, a, b);
    }
}
